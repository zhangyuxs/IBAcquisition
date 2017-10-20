package com.airport.ais.ibacquisition.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import com.airport.ais.dao.parameter.QueryCondition;
import com.airport.ais.enums.aodb.FlightDirection;
import com.airport.ais.models.aodb.basic.Airport;
import com.airport.ais.models.aodb.flight.DynamicFlight;
import com.airport.ais.models.aodb.flight.DynamicFlight.EnsureService;
import com.airport.ais.models.aodb.flight.DynamicFlight.LoadFlight;
import com.airport.ais.models.nng.AommsDcsLegInfo;
import com.airport.ais.models.nng.AommsDcsLegInfoPK;
import com.airport.ais.models.nng.VAommsInfo;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.service.INNGAommsService;
import com.airport.ais.utils.DateTimeUtil;
import com.airport.ais.utils.ObjectMethodUtil;


/**
 * 
 * 
 * FileName      NNGAommsTimerService.java
 * @Description  TODO 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年10月19日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年10月19日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */


@Component
public class NNGAommsTimerService  {
	
	/**
	 * 南宁服务环节的Service
	 */
	@Resource
	private INNGAommsService<BigDecimal,VAommsInfo> vAommsInfoService;
	/**
	 * 南宁载量数据的Service
	 */
	@Resource
	private INNGAommsService<AommsDcsLegInfoPK, AommsDcsLegInfo> aommsDcsLegInfoService;
	/**
	 * 航班动态的Service
	 */
	@Resource
	private INNGAodbService<Integer, DynamicFlight> dynamicFlightService;
	/**
	 * 机场的Service
	 */
	@Resource
	private INNGAodbService<String, Airport> airportService;
	
	private static final String[] loadFields = new String[]{LoadFlight.LOADDEPARTUREAIRPORT,LoadFlight.LOADDEPARTUREAIRPORT,LoadFlight.ADULT,
			LoadFlight.CHD,LoadFlight.INF,LoadFlight.CARGO,LoadFlight.MAIL,LoadFlight.BAGGAGE};
	
	/**
	 * 
	 * @return 获取D-1到D+1的航班列表
	 * @throws Exception
	 */
	protected List<DynamicFlight> getDynamicFlight() throws Exception {
		QueryCondition condition = new QueryCondition();
		condition.setExpression(new Object[]{DynamicFlight.SCHEDULEDDATETIME,">=",DateTimeUtil.addToDay(new Date(), -1),"AND",DynamicFlight.SCHEDULEDDATETIME,
				"<=",DateTimeUtil.addToDay(new Date(), 1),"AND",DynamicFlight.LOCALAIRPOT,"=","NNG"});
		condition.setFetchOneToMany("ALL");
		return dynamicFlightService.findByConditionAll(condition, DynamicFlight.class); 
	}
	
	
	/**
	 * 
	 * @return 获取D-1到D+1的载量信息
	 * @throws Exception
	 */
	protected List<AommsDcsLegInfo> getDcsInfos() throws Exception {
		QueryCondition condition = new QueryCondition();
		condition.setExpression(new Object[]{AommsDcsLegInfo.OPERATIONDATE,">=",DateTimeUtil.addToDay(new Date(), -1),
				"AND",AommsDcsLegInfo.OPERATIONDATE,"<=",DateTimeUtil.addToDay(new Date(), 1)});
		return aommsDcsLegInfoService.findByConditionAll(condition, AommsDcsLegInfo.class);
	}
	
	
	/**
	 * 
	 * @return 获取D-1到D+1的服务信息
	 * @throws Exception
	 */
	protected List<VAommsInfo> getAommsInfos() throws Exception{
		/*  
		 *   条件：
		 *   区间：D-1到D+1
		 *   出港： 计划起飞时间小于现在时间后两小时
		 *   进港：实际进港时间大于现在时间前两小时
		 */
		Date arrivalLimitTime = DateTimeUtil.addMillisecond(new Date(), 120*60*1000);
		Date departureLimitTime   = DateTimeUtil.addMillisecond(new Date(), 120*60*1000);
		QueryCondition condition = new QueryCondition();
		condition.setExpression(new Object[]{VAommsInfo.OPERATIONDATE,">=",DateTimeUtil.addToDay(new Date(), -1),
				"AND",VAommsInfo.OPERATIONDATE,"<=",DateTimeUtil.addToDay(new Date(), 1),
				"AND","(",VAommsInfo.AORD,"=","D","AND",VAommsInfo.STD,"<=",departureLimitTime,")",
				"AND","(",VAommsInfo.AORD,"=","A","AND",VAommsInfo.ATA,">=",arrivalLimitTime,")"});
		return vAommsInfoService.findByConditionAll(condition, VAommsInfo.class);
		
	}
	

	/**
	 * 判断航班是否为同一个航班的方法
	 * @param flight               需要比较的航班动态
	 * @param flightNumber         航班号
	 * @param operationDate        运行日期
	 * @param aord                 进出标志
	 * @return                     是否一致
	 */
	protected boolean equalsByFlightId(DynamicFlight flight, String flightNumber,Date operationDate,String aord) {

		FlightDirection direction = null;
		if ("A".equals(aord)){
			direction = FlightDirection.ARRIVAL;
		}else if ("D".equals(aord)){
			direction = FlightDirection.DEPARTURE;
		}

		if (ObjectMethodUtil.equalsField(flight.getFlightNumber(), flightNumber) &&
				ObjectMethodUtil.equalsField(flight.getFlightDirection(),direction) &&
				ObjectMethodUtil.equalsField(flight.getScheduledDateTime(), operationDate)){
			return true;
		}else{
			return false;
		}
		
		
	}

	
	/**
	 * 根据服务动态更新航班
	 * @param flight
	 * @param vAommsInfo
	 * @return
	 * @throws Exception
	 */
	protected void updateByVAommsInfo(DynamicFlight flight,  List<VAommsInfo> vAommsInfos)
			throws Exception {
		Set<EnsureService> services = flight.getEnsuerServces();
		for (VAommsInfo vAommsInfo:vAommsInfos){
			EnsureService currentService = null;
			for (EnsureService service:services){
				if (service.getEnsureCode().equals(vAommsInfo.getDetailNo())){
					currentService = service;
					break;
				}
			}
			if (currentService == null){
				currentService = new EnsureService();
				currentService.setEnsureCode(vAommsInfo.getDetailNo());
				currentService.setEnsureName(vAommsInfo.getDetailName());
				flight.getEnsuerServces().add(currentService);
			}
			if (!ObjectMethodUtil.equalsField(currentService.getPlanStartTime(), vAommsInfo.getSchedStartTime())){
				currentService.setPlanStartTime(vAommsInfo.getSchedStartTime());
			}
			if (!ObjectMethodUtil.equalsField(currentService.getPlanEndTime(),vAommsInfo.getSchedEndTime())){
				currentService.setPlanEndTime(vAommsInfo.getSchedEndTime());
			}
			if (!ObjectMethodUtil.equalsField(currentService.getActualStartTime(), vAommsInfo.getActualStartTime())){
				currentService.setActualStartTime(vAommsInfo.getActualStartTime());
			}
			if (!ObjectMethodUtil.equalsField(currentService.getActualEndTime(), vAommsInfo.getActualEndTime())){
				currentService.setActualEndTime(vAommsInfo.getActualEndTime());
			}			
		}
		dynamicFlightService.update(flight);

	}

	
	protected void updateByDcsInfo(DynamicFlight flight,List<AommsDcsLegInfo> dcsLegs)
			throws Exception {
		/**
		 *  航班载量
		 */
		boolean isUpdate = false;
		Set<LoadFlight> loads = new HashSet<>();
		for(AommsDcsLegInfo dcsLeg:dcsLegs){
			if (equalsByFlightId(flight, dcsLeg.getFlightNo(),dcsLeg.getOperationDate(),dcsLeg.getAord())){
				LoadFlight localLoad    = new LoadFlight();
				LoadFlight transferLoad = null;
				localLoad.setAdult(dcsLeg.getAdultNum().intValue());
				localLoad.setChd(dcsLeg.getChildNum().intValue());
				localLoad.setInf(dcsLeg.getBabyNum().intValue());
				localLoad.setBaggage(dcsLeg.getBaggageWeight().intValue());
				localLoad.setCargo(dcsLeg.getCargoWeight().intValue());
				localLoad.setMail(dcsLeg.getMailWeight().intValue());
				if (dcsLeg.getFlightLeg() != null){
					String[] airports = dcsLeg.getFlightLeg().split("-");
					if (airports.length >= 2){
						localLoad.setLoadDepartureAirport(airportService.findByID(airports[0],Airport.class));
						localLoad.setLoadArrivalAirport(airportService.findByID(airports[1],Airport.class));
					}
				}
				if (dcsLeg.getPassAdultNum().intValue() > 0 || dcsLeg.getPassChildNum().intValue() > 0){
					transferLoad = new LoadFlight();
					transferLoad.setAdult(dcsLeg.getPassAdultNum().intValue());
					transferLoad.setChd(dcsLeg.getPassChildNum().intValue());
					transferLoad.setInf(dcsLeg.getPassBabyNum().intValue());
					transferLoad.setBaggage(0);
					transferLoad.setCargo(0);
					transferLoad.setMail(0);
					transferLoad.setLoadDepartureAirport(airportService.findByID("999", Airport.class));
					transferLoad.setLoadArrivalAirport(airportService.findByID("999", Airport.class));
				}
				if (dcsLeg.getFlightLegOrd().intValue() == 1) {
					
				}
				loads.add(localLoad);
				if (transferLoad != null){
					loads.add(transferLoad);
				}
			}
		}
		
		if (!isUpdate){
			for (LoadFlight dcsLoad:loads){
				boolean found = false;
				for(LoadFlight fltLoad:flight.getLoads()){
					LoadFlight load = new LoadFlight();
					 BeanUtils.copyProperties(load, fltLoad);
					 if (!ObjectMethodUtil.compareAndCopyFields(load, dcsLoad, loadFields, loadFields)){
						 found = true;
					 }
				}
				if(!found){
					isUpdate = true;
					break;
				}
				
			}
		}
		if (isUpdate){
			flight.getLoads().clear();
			flight.getLoads().addAll(loads);
			dynamicFlightService.update(flight);
		}
	}
	
	/**
	 * 定时更新服务环节
	 * @throws Exception
	 */
	public void timerUpdateByVAommsInfo() throws Exception{
		List<DynamicFlight> flights = getDynamicFlight();
		List<VAommsInfo> aommsInfos = getAommsInfos();
		for (DynamicFlight flight:flights){
			updateByVAommsInfo(flight, aommsInfos); 
			
		}
		
	}
	
	
	/**
	 * 定时更新航班的载量
	 * @throws Exception
	 */
	public void timerUpdateByDcsInfo() throws Exception{
		List<DynamicFlight> flights = getDynamicFlight();
		List<AommsDcsLegInfo> dcsInfos = getDcsInfos();
		for (DynamicFlight flight:flights){
			updateByDcsInfo(flight, dcsInfos);
		}
		
	}


}

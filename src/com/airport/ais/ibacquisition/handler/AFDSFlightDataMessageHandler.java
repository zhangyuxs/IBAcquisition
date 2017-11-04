package com.airport.ais.ibacquisition.handler;

import java.util.Date;

import javax.annotation.Resource;
import javax.xml.datatype.Duration;

import org.springframework.stereotype.Component;

import com.airport.ais.dao.parameter.QueryCondition;
import com.airport.ais.enums.aodb.BaggageMakeupPositionRole;
import com.airport.ais.enums.aodb.BaggageReclaimCarouselRole;
import com.airport.ais.enums.aodb.CheckinRole;
import com.airport.ais.enums.aodb.CheckinTypeCode;
import com.airport.ais.enums.aodb.FlightDirection;
import com.airport.ais.enums.aodb.GateBoardingStatus;
import com.airport.ais.enums.aodb.GateRole;
import com.airport.ais.enums.aodb.SectorCode;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.aodb.basic.Aircraft;
import com.airport.ais.models.aodb.basic.AircraftSubtype;
import com.airport.ais.models.aodb.basic.Airline;
import com.airport.ais.models.aodb.basic.Airport;
import com.airport.ais.models.aodb.basic.CAACDelayCategory;
import com.airport.ais.models.aodb.basic.CAACDelayCode;
import com.airport.ais.models.aodb.basic.Carrier;
import com.airport.ais.models.aodb.basic.FlightClassification;
import com.airport.ais.models.aodb.basic.FlightCode;
import com.airport.ais.models.aodb.basic.FlightNature;
import com.airport.ais.models.aodb.basic.FlightServiceType;
import com.airport.ais.models.aodb.basic.FlightStatus;
import com.airport.ais.models.aodb.basic.Runway;
import com.airport.ais.models.aodb.basic.Sector;
import com.airport.ais.models.aodb.basic.Stand;
import com.airport.ais.models.aodb.basic.Terminal;
import com.airport.ais.models.aodb.flight.DynamicFlight;
import com.airport.ais.models.aodb.flight.Flight;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.utils.DateTimeUtil;
import com.ultra_as.schema.AFDSFlightData;
import com.ultra_as.schema.AmendmentType;
import com.ultra_as.schema.FlightData;
import com.ultra_as.schema.FlightData.PortsOfCall;
import com.ultra_as.schema.IrregularityDetails;
import com.ultra_as.schema.OperationType;
import com.ultra_as.schema.OperationTypeRole;
import com.ultra_as.schema.Remark;

/**
 * 
 * 
 * FileName      AFDSFlightDataMessageHandler.java
 * @Description  TODO IB��AFDSFlightData���ݵĴ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��4��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��4��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class AFDSFlightDataMessageHandler implements IMessageHandler<AFDSFlightData> {
	
	@Resource
	protected  INNGAodbService<Integer, DynamicFlight> dynamicFlightService;
	
	@Resource
	protected INNGAodbService<String, Airline> airlineService;
	
	@Resource
	protected INNGAodbService<String, Aircraft> aircraftService;  
	
	@Resource
	protected INNGAodbService<String, AircraftSubtype> aircraftSubtypeService;
	
	@Resource
	protected INNGAodbService<String, Carrier> carrierService;
	
	@Resource
	protected INNGAodbService<String, Airport> airportService;
	
	@Resource
	protected INNGAodbService<String, Terminal> terminalService;
	
	@Resource
	protected INNGAodbService<String, Stand> standService;
	
	@Resource
	protected INNGAodbService<String, Runway> runwayService;
	
	@Resource
	protected INNGAodbService<String, CAACDelayCategory> caacDelayCategoryService;
	
	@Resource
	protected INNGAodbService<String, CAACDelayCode>  caacDelayCodeSerivce;
	
	@Resource
	protected INNGAodbService<String, FlightStatus> flightStatusService;
	
	@Resource
	protected INNGAodbService<String, FlightClassification> flightClassificationService;
	
	@Resource
	protected INNGAodbService<String, FlightNature> flightNatureService;
	
	@Resource
	protected INNGAodbService<String, FlightServiceType> flightServiceTypeService;
	
	@Resource
	protected INNGAodbService<SectorCode, Sector> sectorService;
	
	@Resource
	protected INNGAodbService<String, FlightCode> flightCodeService;
	
	private static final String  AUTOMATIC_CREATION = "Automatic_Creation";
	
	
	private void remove(DynamicFlight dynamicFlight){
		System.out.println(dynamicFlight);
		if (dynamicFlight != null){
			dynamicFlightService.remove(dynamicFlight);
		}
	}
	
	
	private boolean setFlightstatus(String code,DynamicFlight dynamicFlight) throws Exception{
		
		FlightStatus statusCode = flightStatusService.findByID(code, FlightStatus.class);
		if (statusCode  !=  null){
			dynamicFlight.setFlightStatus(statusCode);
			return true;
		}else{
			return false;
			
		}
	}
	
	
	private DynamicFlight findByFlightIdentification(String flightNumber, FlightDirection direction, Date date, int repeatCount,
			String carrierICAOCode, String oneToMany, String manyToOne) {
		QueryCondition condition = new QueryCondition();
		condition.setExpression(new Object[]{Flight.FLIGHTNUMBER,"=",flightNumber,"AND",Flight.FLIGHTDIRECTION,"=",direction,"AND",
				Flight.SCHEDULEDDATETIME,"=",date,"AND",Flight.AIRLINE,"=",carrierICAOCode});
		condition.setFetchManyToOne(manyToOne);
		condition.setFetchOneToMany(oneToMany);
		return dynamicFlightService.findByConditionSingle(condition,DynamicFlight.class);
	}
	
	
	private void update(FlightData ibFlight,DynamicFlight dynamicFlight) throws Exception{
		
		
		
		/*
		 * ����ɻ����ݲ�Ϊ�գ����¶�̬�ķɻ�����
		 */
		if (ibFlight.getAircraft() != null){
			FlightData.Aircraft aircraftData = ibFlight.getAircraft().getValue();
			if (ibFlight.getAircraft().getValue().getAircraftRegistration() != null){
				String aircraftRegistration = aircraftData.getAircraftRegistration().getValue();
				Aircraft aircraft = aircraftService.findByID(aircraftRegistration, Aircraft.class);
				if (aircraft != null){
					dynamicFlight.setAircraft(aircraft);
					dynamicFlight.setAircraftSubtype(aircraft.getAircraftSubtype());
					dynamicFlight.setCarrier(aircraft.getCarrier());
				}else if (aircraftRegistration != null) {
					/*
					 *  ���򴴽�һ���µ÷ɻ�����,�����붯̬�� 
					 */
					aircraft = new Aircraft();
					aircraft.setRegistrationDescription(AUTOMATIC_CREATION);
					aircraft.setRegistration(aircraftRegistration);
					if (aircraftData.getAircraftCallsign() != null){
						aircraft.setCallsign(aircraftData.getAircraftCallsign().getValue());
					}
					if (aircraftData.getAircraftPassengerCapacity() != null){
						aircraft.setPassengerCapacity(aircraftData.getAircraftPassengerCapacity().getValue());
					}
					if (aircraftData.getAircraftSubtypeIATACode() != null){
						aircraft.setAircraftSubtype(aircraftSubtypeService.findByFieldSingle(AircraftSubtype.TYPEIATACODE, 
								aircraftData.getAircraftSubtypeIATACode().getValue(), AircraftSubtype.class));
					}
					if (aircraftData.getAircraftOwnerIATACode() != null){
						aircraft.setCarrier(carrierService.findByFieldSingle(Carrier.CARRIERCODE, 
								aircraftData.getAircraftOwnerIATACode().getValue(), Carrier.class));
					}
					dynamicFlight.setAircraft(aircraftService.add(aircraft));
				}				
			}
			
			/*
			 * �ɻ����ݽ���
			 */
		}
	
		/*
		 *   ����������ݲ�Ϊ�գ����¶�̬�Ļ�������
		 */
		if(ibFlight.getAirport() != null){
			FlightData.Airport airportData = ibFlight.getAirport().getValue();
			Airport localAirport = null;
			/*
			 *  ���ػ���
			 */
			if (airportData.getAirportIATACode() != null){
				localAirport = airportService.findByID(airportData.getAirportIATACode(), Airport.class);
				dynamicFlight.setLocalAirpot(localAirport);
				/*
				 * ���ݽ��������뱾��
				 */
				if(FlightDirection.DEPARTURE.equals(dynamicFlight.getFlightDirection())){
					dynamicFlight.setDepartureAirport(localAirport);
				}else{
					dynamicFlight.setArrivalAirport(localAirport);
				}
			}
			/*
			 * ��վ¥
			 */
			if (airportData.getAircraftTerminalCode() != null){
				Terminal terminal = terminalService.findByID(airportData.getAircraftTerminalCode().getValue(),Terminal.class);
				if (terminal != null){
					dynamicFlight.setTerminal(terminal);
				}else if (localAirport != null){
					/*
					 *   ���򴴽�һ����վ¥�����붯̬ʵ����
					 */
					
					terminal = new Terminal();
					terminal.setTerminalCode(airportData.getAircraftTerminalCode().getValue());
					terminal.setDescription(AUTOMATIC_CREATION);
					terminal.setAirport(localAirport);
					dynamicFlight.setTerminal(terminalService.add(terminal));
				}
			}
			/*
			 * ��λ
			 */
			if(airportData.getStandPosition() != null  && dynamicFlight.getTerminal() != null){
			  String standPosition = Utils.LOCALAIRPORTIATACODE+"_"+dynamicFlight.getTerminal().getTerminalCode()+"_"
					  +airportData.getStandPosition().getValue();
			  Stand stand = standService.findByID(standPosition, Stand.class);
			  if (stand != null){
				  dynamicFlight.setStand(stand);
			  }else  {
				  /*  
				   *   ���򴴽���λ
				   */
				  stand = new Stand();
				  stand.setDescription(AUTOMATIC_CREATION);
				  stand.setStandPosition(standPosition);
			  }
			}
			/* 
			 *  �ܵ�
			 */
			if (airportData.getRunwayID() != null) {
				Runway runway = runwayService.findByID(airportData.getRunwayID().getValue(), Runway.class);
				if (runway != null){
					 /*
					   *   ����ܵ��ڻ��������д��ڣ�����ԭ��̬�ܵ���ͬ
					   */
					if (!runway.equals(dynamicFlight.getRunway())){
						dynamicFlight.setRunway(runway);
					}
				}else{
					/*
					 *  ���򴴽�һ�����ܵ� 
					 */
					runway = new Runway();
					runway.setDescription(AUTOMATIC_CREATION);
					runway.setRunwayID(airportData.getRunwayID().getValue());
				}
			}
			/*
			 *   ����װ��ת��
			 */
			if (airportData.getBaggageMakeupPosition().size() > 0){
				dynamicFlight.getBaggageMakeupPositions().clear();
				for (com.ultra_as.schema.BaggageMakeupPosition ibBaggageMakeupPosition:airportData.getBaggageMakeupPosition()){
					if (ibBaggageMakeupPosition != null && ibBaggageMakeupPosition.getBaggageMakeupPositionID() != null){
						DynamicFlight.BaggageMakeupPosition currentBaggageMakeupPosition = new DynamicFlight.BaggageMakeupPosition();
						currentBaggageMakeupPosition.setBaggageMakeupPositionID(ibBaggageMakeupPosition.getBaggageMakeupPositionID());
						dynamicFlight.getBaggageMakeupPositions().add(currentBaggageMakeupPosition);
						if (ibBaggageMakeupPosition.getBaggageMakeupPositionRole() != null){
							currentBaggageMakeupPosition.setBaggageMakeupPositionRole(
									BaggageMakeupPositionRole.valueOf(ibBaggageMakeupPosition.getBaggageMakeupPositionRole().toString()));
						}
						if (ibBaggageMakeupPosition.getBaggageMakeupOpenDateTime() != null){
							currentBaggageMakeupPosition.setBaggageMakeupOpenDateTime(DateTimeUtil.convertToDate(
									ibBaggageMakeupPosition.getBaggageMakeupOpenDateTime().getValue()));
						}
						if (ibBaggageMakeupPosition.getBaggageMakeupCloseDateTime() != null){
							currentBaggageMakeupPosition.setBaggageMakeupOpenDateTime(DateTimeUtil.convertToDate(
									ibBaggageMakeupPosition.getBaggageMakeupOpenDateTime().getValue()));
						}
					}
					
				}
			 }
			 /*
			  * ������ȡת��
			  */
			if (airportData.getBaggageReclaimCarousel().size() > 0){
				dynamicFlight.getBaggageReclaimCarousels().clear();
				for(com.ultra_as.schema.BaggageReclaimCarousel ibCarousel:airportData.getBaggageReclaimCarousel()){
					if (ibCarousel != null && ibCarousel.getBaggageReclaimCarouselID() != null){
						DynamicFlight.BaggageReclaimCarousel currentCarousel = new DynamicFlight.BaggageReclaimCarousel();
						currentCarousel.setBaggageReclaimCarouselID(ibCarousel.getBaggageReclaimCarouselID());
						dynamicFlight.getBaggageReclaimCarousels().add(currentCarousel);
						if (ibCarousel.getBaggageReclaimCarouselRole() != null){
							currentCarousel.setBaggageReclaimCarouselRole(
									BaggageReclaimCarouselRole.valueOf(ibCarousel.getBaggageReclaimCarouselRole().toString()));
						}
						if (ibCarousel.getBaggageReclaimOpenDateTime() != null){
							currentCarousel.setBaggageReclaimOpenDateTime(DateTimeUtil.convertToDate(
									ibCarousel.getBaggageReclaimOpenDateTime().getValue()));
						}
						if (ibCarousel.getBaggageReclaimCloseDateTime() != null){
							currentCarousel.setBaggageReclaimCloseDateTime(DateTimeUtil.convertToDate(
									ibCarousel.getBaggageReclaimCloseDateTime().getValue()));
						}
						if(ibCarousel.getExitDoorNumber() != null){
							currentCarousel.setExitDoorNumber(ibCarousel.getExitDoorNumber().getValue());
						}
						if(ibCarousel.getFirstBagDateTime() != null){
							currentCarousel.setFirstBagDateTime(DateTimeUtil.convertToDate(
									ibCarousel.getFirstBagDateTime().getValue()));
						}
						if(ibCarousel.getLastBagDateTime() != null){
							currentCarousel.setLastBagDateTime(DateTimeUtil.convertToDate(
									ibCarousel.getLastBagDateTime().getValue()));
						}
					}
				}
			}
			/*
			 *    �ǻ��� 
			 */
			if (airportData.getGate().size() >0){
				dynamicFlight.getGates().clear();
				for(com.ultra_as.schema.Gate ibGate:airportData.getGate()){
					if (ibGate != null && ibGate.getGateNumber() != null){
						DynamicFlight.Gate currentGate = new DynamicFlight.Gate();
						currentGate.setGateNumber(ibGate.getGateNumber());
						dynamicFlight.getGates().add(currentGate);
						if (ibGate.getGateBoardingStatus() != null){
							currentGate.setGateBoardingStatus(
									GateBoardingStatus.valueOf(ibGate.getGateBoardingStatus().getValue().toString()));
						}
						if (ibGate.getGateRole() != null){
							currentGate.setGateRole(GateRole.valueOf(ibGate.getGateRole().toString()));
						}
						if (ibGate.getGateOpenDateTime() != null){
							currentGate.setGateOpenDateTime(DateTimeUtil.convertToDate(
									ibGate.getGateOpenDateTime().getValue()));
						}
						if (ibGate.getGateCloseDateTime() != null && ibGate.getGateCloseDateTime().getValue() != null){
							currentGate.setGateCloseDateTime(DateTimeUtil.convertToDate(
									ibGate.getGateCloseDateTime().getValue()));
						}
					}
				}
			}
			/*
			 * ֵ����̨
			 */
			if (airportData.getCheckin().size()>0){
				dynamicFlight.getCheckins().clear();
				for(com.ultra_as.schema.Checkin ibCheckin:airportData.getCheckin()){
					if (ibCheckin != null && ibCheckin.getCheckinDeskRange() != null){
						DynamicFlight.Checkin currentCheckin = new DynamicFlight.Checkin();
						currentCheckin.setCheckinDeskRange(ibCheckin.getCheckinDeskRange());
						dynamicFlight.getCheckins().add(currentCheckin);
						if(ibCheckin.getCheckinTypeCode() != null){
							currentCheckin.setCheckinTypeCode(CheckinTypeCode.valueOf(
									ibCheckin.getCheckinTypeCode().getValue().toString()));
						}
						if(ibCheckin.getCheckinRole() != null){
							currentCheckin.setCheckinRole(CheckinRole.valueOf(
									ibCheckin.getCheckinRole().toString()));
						}
						if(ibCheckin.getCheckinOpenDateTime() != null){
							currentCheckin.setCheckinOpenDateTime(DateTimeUtil.convertToDate(
									ibCheckin.getCheckinOpenDateTime().getValue()));
						}
						if(ibCheckin.getCheckinCloseDateTime() != null){
							currentCheckin.setCheckinCloseDateTime(DateTimeUtil.convertToDate(
									ibCheckin.getCheckinCloseDateTime().getValue()));
						}
					}
				}
			}
			/*
			 * ����к���״̬���£�һ��ָDEP,ARR
			 */
			
			for(Remark remark:airportData.getRemark()){
				if (remark.getRemarkCode() != null){
					if (setFlightstatus(remark.getRemarkCode(), dynamicFlight)){
						/*
						 * ��������˺���������ѭ��
						 */
						break;
					}
				}
			}
			/*
			 *  �������ݽ��� 
			 */
		}
		/*
		 * �������ݲ�Ϊ�գ����º�������
		 */
		if(ibFlight.getFlight() != null){
			FlightData.Flight flightData = ibFlight.getFlight().getValue();
			/*
			 * ��������
			 */
			if (flightData.getDivertAirportIATACode() != null){
				dynamicFlight.setDivertAirport(airportService.findByID(
						flightData.getDivertAirportIATACode().getValue(), Airport.class));
			}
			/**
			 * ȷ���Ƿ���VIP
			 */
			if (flightData.getHasVIPs() != null){
				dynamicFlight.setHasVIPs(flightData.getHasVIPs().getValue());
			}
			/*
			 *   ����
			 */
			if (flightData.getCAACDelayDetails() != null){
				com.ultra_as.schema.CAACDelayDetails ibCaacDelayDetails = flightData.getCAACDelayDetails().getValue();
				
				if (ibCaacDelayDetails.getCAACDelayCategory() != null){
					dynamicFlight.setCaacDelayCategory(caacDelayCategoryService.findByID(
							ibCaacDelayDetails.getCAACDelayCategory().getValue(), CAACDelayCategory.class));
				}
				if (ibCaacDelayDetails.getCAACDelayCode() != null){
					dynamicFlight.setCaacDelayCode(caacDelayCodeSerivce.findByID(
							ibCaacDelayDetails.getCAACDelayCode().getValue(), CAACDelayCode.class));
				}
				if (ibCaacDelayDetails.getCAACDelayAirportOriginated() != null){
					dynamicFlight.setCaacDelayAirportOriginated(
							ibCaacDelayDetails.getCAACDelayAirportOriginated().getValue());
				}
				if (ibCaacDelayDetails.getCAACDelayDuration() != null){
					Duration duration = ibCaacDelayDetails.getCAACDelayDuration().getValue();
					dynamicFlight.setCaacDelayDuration(
							String.valueOf(duration.getHours())+String.valueOf(duration.getMinutes()));
				}
			}
			
			/**
			 *  IB���������Ĵ���ʽ����ԭ��
			 */
			for (IrregularityDetails details:flightData.getIrregularityDetails()){
				if (details != null && details.getIrregularityAlphaIATACode() != null){
					CAACDelayCode delayCode = caacDelayCodeSerivce.findByID(details.getIrregularityAlphaIATACode().getValue(),CAACDelayCode.class);
					if (delayCode != null){
						dynamicFlight.setCaacDelayCode(delayCode);
						dynamicFlight.setCaacDelayCategory(delayCode.getCaacDelayCategory());
					}
				}
			}
			
			/*
			 *  ����״̬
			 */
			if (flightData.getFlightStatusCode() != null){
				FlightCode flightCode = flightCodeService.findByID(flightData.getFlightStatusCode().getValue(), FlightCode.class);
				if (flightCode != null){
					dynamicFlight.setFlightCode(flightCode);
				}else{
					setFlightstatus(flightData.getFlightStatusCode().getValue(), dynamicFlight);
				}
			}
			/*
			 * �������޷���������Ϣ
			 */
			for(OperationType operationType:flightData.getOperationType()){
				if (operationType.getOperationTypeCode() != null && 
						OperationTypeRole.INTERNAL.equals(operationType.getOperationTypeRole())){
					if (setFlightstatus(operationType.getOperationTypeCode().getValue(), dynamicFlight)){
						break;
					}
				}
			}
			/*
			 *  ������࣬���� W/Z
			 */
			if(flightData.getFlightClassificationCode() != null){
				dynamicFlight.setFlightClassification(flightClassificationService.findByID(
						flightData.getFlightClassificationCode().getValue(), FlightClassification.class));
			}
			/*
			 * �������ʣ�����PAX 
			 */
			if(flightData.getFlightNatureCode() != null){
				dynamicFlight.setFlightNature(flightNatureService.findByID(
						flightData.getFlightNatureCode().getValue(), FlightNature.class));
			}
			/*
			 * ����������ʣ�����J
			 */
			if(flightData.getFlightServiceTypeIATACode() != null){
				dynamicFlight.setFlightServiceType(flightServiceTypeService.findByID(
						flightData.getFlightServiceTypeIATACode().getValue(), FlightServiceType.class));
			}
			/*
			 * ��������
			 */
			if(flightData.getFlightSectorCode()!=null){
				dynamicFlight.setSector(sectorService.findByID(
						SectorCode.valueOf(flightData.getFlightSectorCode().getValue().toString()), Sector.class));
			}
			/*
			 * ���Ӻ���
			 */
			if(flightData.getLinkedFlight() != null){
				com.ultra_as.schema.LinkedFlight ibLinkedFlight = flightData.getLinkedFlight().getValue();
				if (dynamicFlight.getLinkedFlight() == null){
					dynamicFlight.setLinkedFlight(new Flight.LinkedFlight());
				}
				if (ibLinkedFlight != null && ibLinkedFlight.getFlightIdentity() != null){
					dynamicFlight.getLinkedFlight().setLinkedFlightNumber(
							ibLinkedFlight.getFlightIdentity());
				}
				/*
				 *   �뺽�෽���෴
				 */
				if(FlightDirection.DEPARTURE.equals(dynamicFlight.getFlightDirection())){
					dynamicFlight.getLinkedFlight().setLinkedFlightDirection(
							FlightDirection.ARRIVAL);
				}else{
					dynamicFlight.getLinkedFlight().setLinkedFlightDirection(
							FlightDirection.DEPARTURE);
				}
				if(ibLinkedFlight.getScheduledDate() != null){
					dynamicFlight.getLinkedFlight().setLinkedscheduledDateTime(DateTimeUtil.convertToDate(
							ibLinkedFlight.getScheduledDate()));
				}
			}
			/*
			 *  �Ƿ��ҹ���� 
			 */
			if(flightData.getFlightOperatesOvernight() != null){
				dynamicFlight.setIsOperatesOvernight(flightData.getFlightOperatesOvernight().getValue());
			}
			/*
			 * �Ƿ���ͨ��
			 */
			if(flightData.getIsGeneralAviationFlight() != null){
				dynamicFlight.setIsGeneralAviationFlight(flightData.getIsGeneralAviationFlight().getValue());
			}
			/*
			 * �Ƿ�����ת����
			 */
			if(flightData.getIsTransferFlight() != null){
				dynamicFlight.setIsTransferFlight(flightData.getIsGeneralAviationFlight().getValue());
			}
			/*
			 * �Ƿ��Ƿ�������
			 */
			if(flightData.getIsReturnFlight() != null){
				dynamicFlight.setIsReturnFlight(flightData.getIsReturnFlight().getValue());
			}
			
			/*
			 * ������
			 */
			if(flightData.getShareFlight().size() > 0){
				dynamicFlight.getShareFlights().clear();
				for(com.ultra_as.schema.ShareFlight ibShareFlight:flightData.getShareFlight()){
					if (ibShareFlight != null){
						DynamicFlight.ShareFlight currentShareFlight = new DynamicFlight.ShareFlight();
						currentShareFlight.setShareFlightNumber(ibShareFlight.getFlightIdentity());
						dynamicFlight.getShareFlights().add(currentShareFlight);
						if (ibShareFlight.getIATAFlightIdentifier()!= null){
							currentShareFlight.setShareAirline(airlineService.findByFieldSingle(Airline.IATACODE,
									ibShareFlight.getIATAFlightIdentifier().getCarrierIATACode(), Airline.class));
						}
						
					}
				}
			}
			
			
			/*
			 * ����FlightData
			 */
		}
		/*
		 * ����ɻ�ʱ�����ݲ�Ϊ�գ����·ɻ�ʱ������
		 */
		if (ibFlight.getOperationalTimes() != null){
			FlightData.OperationalTimes operationalTimes = ibFlight.getOperationalTimes().getValue();
			if (operationalTimes.getActualOnBlocksDateTime() != null){
				dynamicFlight.setActualOnBlocksDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getActualOnBlocksDateTime().getValue()));
			}
			if (operationalTimes.getActualOffBlocksDateTime() != null){
				dynamicFlight.setActualOffBlocksDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getActualOffBlocksDateTime().getValue()));
			}
			if (operationalTimes.getWheelsUpDateTime() != null){
				/*
				 * ֻ�г��ۺ�ʵ�����ʱ��
				 */
				dynamicFlight.setActualAirborneDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getWheelsUpDateTime().getValue()));
			}
			if (operationalTimes.getWheelsDownDateTime() != null){
				/*
				 * ֻ�н��ۺ���ʵ�����ʱ��
				 */
				dynamicFlight.setActualLandDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getWheelsDownDateTime().getValue()));
			}
			if(operationalTimes.getPreviousStationAirborneDateTime() != null){
				/*
				 * ���ۺ������ʵ�����ʱ��
				 */
				dynamicFlight.setActualAirborneDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getPreviousStationAirborneDateTime().getValue()));
			}
			/*
			 * ���ݽ������жϼƻ�ʱ��
			 */
			if(operationalTimes.getScheduledDateTime() != null){
				if (FlightDirection.DEPARTURE.equals(dynamicFlight.getFlightDirection())){
					/*
					 * ���ۺ���ƻ�����ʱ��
					 */
					dynamicFlight.setScheduledDepartureDateTime(DateTimeUtil.convertToDate(
							operationalTimes.getScheduledDateTime()));
				}else{
					/*
					 * ���ۺ���ƻ�����ʱ��
					 */
					dynamicFlight.setScheduledArrivalDateTime(DateTimeUtil.convertToDate(
							operationalTimes.getScheduledDateTime()));
				}
			}
			/*
			 * ���ݽ������ж�Ԥ��ʱ��
			 */
			if(operationalTimes.getEstimatedDateTime() != null){
				if (FlightDirection.DEPARTURE.equals(dynamicFlight.getFlightDirection())){
					/*
					 * ���ۺ���Ԥ�Ƴ���ʱ��
					 */
					dynamicFlight.setEstimatedDepartureDateTime(DateTimeUtil.convertToDate(
							operationalTimes.getEstimatedDateTime().getValue()));
				}else{
					/*
					 * ���ۺ���Ԥ�ƽ���ʱ��
					 */
					dynamicFlight.setEstimatedArrivalDateTime(DateTimeUtil.convertToDate(
							operationalTimes.getEstimatedDateTime().getValue()));
				}
			}
			/*
			 * ���ۺ���ƻ�����ʱ��
			 */
			if(operationalTimes.getPreviousStationScheduledDateTime() != null){
				dynamicFlight.setScheduledDepartureDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getPreviousStationScheduledDateTime().getValue()));
			}
			/*
			 * ���ۺ���Ԥ�Ƴ���ʱ��
			 */
			if(operationalTimes.getPreviousStationEstimatedDateTime() != null){

				dynamicFlight.setEstimatedDepartureDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getPreviousStationEstimatedDateTime().getValue()));
				
			}
			/*
			 * ���ۺ���Ԥ�Ƶ���ʱ��
			 */
			if(operationalTimes.getNextStationScheduledDateTime() != null){
				dynamicFlight.setScheduledArrivalDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getNextStationScheduledDateTime().getValue()));
			}
			/*
			 * ���ۺ���Ԥ�Ƶ���ʱ��
			 */
			if(operationalTimes.getNextStationEstimatedDateTime() != null){
				dynamicFlight.setEstimatedArrivalDateTime(DateTimeUtil.convertToDate(
						operationalTimes.getNextStationEstimatedDateTime().getValue()));
			}
			if(operationalTimes.getEstimatedFlightDuration()!= null){
				Duration duration = operationalTimes.getEstimatedFlightDuration().getValue();
				dynamicFlight.setEstimatedFlightDuration(
						String.valueOf(duration.getHours())+"H"+String.valueOf(duration.getMinutes())+"M");
			}
			
		}
		/*
		 * �ն˻���
		 */
		if (ibFlight.getPortsOfCall() != null){
			PortsOfCall portsOfCall = ibFlight.getPortsOfCall().getValue();
			if (portsOfCall.getPortOfCallIATACode().size() >0){
				Airport airport = airportService.findByID( 
						portsOfCall.getPortOfCallIATACode().get(portsOfCall.getPortOfCallIATACode().size()-1), Airport.class);
				if (FlightDirection.DEPARTURE.equals(dynamicFlight.getFlightDirection())){
					/*
					 * ����ǳ��ۺ���
					 */
					dynamicFlight.setArrivalAirport(airport);
				}else{
					/*
					 * ����ǽ��ۺ���
					 */
					dynamicFlight.setDepartureAirport(airport);
				}
			}
		}	
		
		/*
		 *   ���º��ද̬ 
		 */
		dynamicFlightService.update(dynamicFlight);
		
		
	}

	@Override
	public void handle(AFDSFlightData afdsFlightData) throws Exception {
		
		FlightData ibFlight = afdsFlightData.getFlightData();
		/*
		 * ������Ӧ�Ķ�̬����
		 */
		String flightNumber             = afdsFlightData.getFlightIdentification().getFlightIdentity();
		FlightDirection direction = FlightDirection.valueOf(afdsFlightData.getFlightIdentification().getFlightDirection().toString());
		Date date                       = DateTimeUtil.convertToDate(afdsFlightData.getFlightIdentification().getScheduledDate());
		int repeatCount                 = afdsFlightData.getFlightIdentification().getFlightRepeatCount().getValue();
		String carrierICAOCode =  null;
		Airline airline = null;
		if (afdsFlightData.getFlightIdentification().getICAOFlightIdentifier() != null){
			carrierICAOCode = afdsFlightData.getFlightIdentification().getICAOFlightIdentifier().getCarrierICAOCode();  
			airline = airlineService.findByID(carrierICAOCode, Airline.class);
		}else if (afdsFlightData.getFlightIdentification().getIATAFlightIdentifier() != null){
			String carrierIATACode = afdsFlightData.getFlightIdentification().getIATAFlightIdentifier().getCarrierIATACode();  
			airline = airlineService.findByFieldSingle(Airline.IATACODE, carrierIATACode, Airline.class);
			if (airline != null){
				carrierICAOCode = airline.getICAOCode();
			}
		}
		 
		 
		DynamicFlight dynamicFlight = findByFlightIdentification(flightNumber, direction, date, 
				repeatCount, carrierICAOCode, "ALL", "ALL");
		/*
		 * ��������ѡ����»���ɾ������
		 */
		if (AmendmentType.DELETE.equals(afdsFlightData.getAmendmentType())){
			remove(dynamicFlight);
		}else{
			/*
			 * ���û���ҵ����򴴽�һ���µĺ��ද̬
			 */
			if (dynamicFlight == null){
				/*
				 * �½�һ����̬����
				 */
				dynamicFlight = new DynamicFlight();
				dynamicFlight.setFlightNumber(flightNumber);
				dynamicFlight.setAirline(airline);
				dynamicFlight.setFlightDirection(direction);
				dynamicFlight.setScheduledDateTime(date);
				dynamicFlight.setFlightRepeatCount(repeatCount);
				dynamicFlight = dynamicFlightService.update(dynamicFlight);
				/**
				 * ��պ����oneToMany����
				 */
				dynamicFlight.getCheckins().clear();
				dynamicFlight.getGates().clear();
				dynamicFlight.getBaggageMakeupPositions().clear();
				dynamicFlight.getStopFlights().clear();
				dynamicFlight.getLoads().clear();
				dynamicFlight.getPassengers().clear();
				dynamicFlight.getBaggageReclaimCarousels().clear();
				dynamicFlight.getShareFlights().clear();
				dynamicFlight.getEnsuerServces().clear();
			}
			update(ibFlight, dynamicFlight);
		}
		
	}

}

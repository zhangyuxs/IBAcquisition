//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.01 ʱ�� 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Collection of extended flight data common to extended flight data messages.
 * 
 * <p>ExtendedFlightData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExtendedFlightData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="VIPData" type="{http://schema.ultra-as.com}VIPData" minOccurs="0"/>
 *         &lt;element name="FlightTask" type="{http://schema.ultra-as.com}FlightTask" minOccurs="0"/>
 *         &lt;element name="VehicleUsage" type="{http://schema.ultra-as.com}VehicleUsage" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedFlightData", propOrder = {
    "vipData",
    "flightTask",
    "vehicleUsage"
})
public class ExtendedFlightData {

    @XmlElement(name = "VIPData")
    protected VIPData vipData;
    @XmlElement(name = "FlightTask")
    protected FlightTask flightTask;
    @XmlElement(name = "VehicleUsage")
    protected VehicleUsage vehicleUsage;

    /**
     * ��ȡvipData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VIPData }
     *     
     */
    public VIPData getVIPData() {
        return vipData;
    }

    /**
     * ����vipData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VIPData }
     *     
     */
    public void setVIPData(VIPData value) {
        this.vipData = value;
    }

    /**
     * ��ȡflightTask���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FlightTask }
     *     
     */
    public FlightTask getFlightTask() {
        return flightTask;
    }

    /**
     * ����flightTask���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTask }
     *     
     */
    public void setFlightTask(FlightTask value) {
        this.flightTask = value;
    }

    /**
     * ��ȡvehicleUsage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VehicleUsage }
     *     
     */
    public VehicleUsage getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * ����vehicleUsage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUsage }
     *     
     */
    public void setVehicleUsage(VehicleUsage value) {
        this.vehicleUsage = value;
    }

}

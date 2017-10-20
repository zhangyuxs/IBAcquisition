//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Collection of extended flight data common to extended flight data messages.
 * 
 * <p>ExtendedFlightData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取vipData属性的值。
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
     * 设置vipData属性的值。
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
     * 获取flightTask属性的值。
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
     * 设置flightTask属性的值。
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
     * 获取vehicleUsage属性的值。
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
     * 设置vehicleUsage属性的值。
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

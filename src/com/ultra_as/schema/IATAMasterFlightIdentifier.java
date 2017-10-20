//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight identifier consisting of IATA carrier, flight number and an optional suffix. These components are typically concatenated into a single string when presented for display.
 * 
 * <p>IATAMasterFlightIdentifier complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IATAMasterFlightIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierIATACode" type="{http://schema.ultra-as.com}CarrierIATACode"/>
 *         &lt;element name="FlightNumber" type="{http://schema.ultra-as.com}FlightNumber"/>
 *         &lt;element name="FlightSuffix" type="{http://schema.ultra-as.com}FlightSuffix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATAMasterFlightIdentifier", propOrder = {
    "carrierIATACode",
    "flightNumber",
    "flightSuffix"
})
public class IATAMasterFlightIdentifier {

    @XmlElement(name = "CarrierIATACode", required = true, nillable = true)
    protected String carrierIATACode;
    @XmlElement(name = "FlightNumber", required = true, nillable = true)
    protected String flightNumber;
    @XmlElementRef(name = "FlightSuffix", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightSuffix> flightSuffix;

    /**
     * 获取carrierIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierIATACode() {
        return carrierIATACode;
    }

    /**
     * 设置carrierIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierIATACode(String value) {
        this.carrierIATACode = value;
    }

    /**
     * 获取flightNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * 设置flightNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * 获取flightSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightSuffix }{@code >}
     *     
     */
    public JAXBElement<FlightSuffix> getFlightSuffix() {
        return flightSuffix;
    }

    /**
     * 设置flightSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightSuffix }{@code >}
     *     
     */
    public void setFlightSuffix(JAXBElement<FlightSuffix> value) {
        this.flightSuffix = value;
    }

}

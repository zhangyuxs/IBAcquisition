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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Unique identification of a flight is determined by flight identity, flight direction, flight repeat count and scheduled date. For scheduled flights, the identification can be supplemented by an IATA flight identifier and/or an ICAO flight identifier. The flight repeat count is used to determine flights that operate more than one time on a single day.
 * 
 * <p>FlightIdentification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *         &lt;element name="FlightDirection" type="{http://schema.ultra-as.com}FlightDirection"/>
 *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *         &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
 *         &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
 *         &lt;element name="ICAOFlightIdentifier" type="{http://schema.ultra-as.com}ICAOFlightIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightIdentification", propOrder = {
    "flightIdentity",
    "flightDirection",
    "flightRepeatCount",
    "scheduledDate",
    "iataFlightIdentifier",
    "icaoFlightIdentifier"
})
public class FlightIdentification {

    @XmlElement(name = "FlightIdentity", required = true)
    protected String flightIdentity;
    @XmlElement(name = "FlightDirection", required = true)
    @XmlSchemaType(name = "string")
    protected FlightDirection flightDirection;
    @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> flightRepeatCount;
    @XmlElement(name = "ScheduledDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduledDate;
    @XmlElement(name = "IATAFlightIdentifier")
    protected IATAFlightIdentifier iataFlightIdentifier;
    @XmlElement(name = "ICAOFlightIdentifier")
    protected ICAOFlightIdentifier icaoFlightIdentifier;

    /**
     * 获取flightIdentity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightIdentity() {
        return flightIdentity;
    }

    /**
     * 设置flightIdentity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightIdentity(String value) {
        this.flightIdentity = value;
    }

    /**
     * 获取flightDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightDirection }
     *     
     */
    public FlightDirection getFlightDirection() {
        return flightDirection;
    }

    /**
     * 设置flightDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDirection }
     *     
     */
    public void setFlightDirection(FlightDirection value) {
        this.flightDirection = value;
    }

    /**
     * 获取flightRepeatCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFlightRepeatCount() {
        return flightRepeatCount;
    }

    /**
     * 设置flightRepeatCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFlightRepeatCount(JAXBElement<Integer> value) {
        this.flightRepeatCount = value;
    }

    /**
     * 获取scheduledDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDate() {
        return scheduledDate;
    }

    /**
     * 设置scheduledDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDate(XMLGregorianCalendar value) {
        this.scheduledDate = value;
    }

    /**
     * 获取iataFlightIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IATAFlightIdentifier }
     *     
     */
    public IATAFlightIdentifier getIATAFlightIdentifier() {
        return iataFlightIdentifier;
    }

    /**
     * 设置iataFlightIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IATAFlightIdentifier }
     *     
     */
    public void setIATAFlightIdentifier(IATAFlightIdentifier value) {
        this.iataFlightIdentifier = value;
    }

    /**
     * 获取icaoFlightIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ICAOFlightIdentifier }
     *     
     */
    public ICAOFlightIdentifier getICAOFlightIdentifier() {
        return icaoFlightIdentifier;
    }

    /**
     * 设置icaoFlightIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ICAOFlightIdentifier }
     *     
     */
    public void setICAOFlightIdentifier(ICAOFlightIdentifier value) {
        this.icaoFlightIdentifier = value;
    }

}

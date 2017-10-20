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
 * Identification details for a related master flight.
 * 
 * <p>MasterFlight complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MasterFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IATAMasterFlightIdentifier" type="{http://schema.ultra-as.com}IATAMasterFlightIdentifier" minOccurs="0"/>
 *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterFlight", propOrder = {
    "iataMasterFlightIdentifier",
    "flightIdentity",
    "flightRepeatCount"
})
public class MasterFlight {

    @XmlElement(name = "IATAMasterFlightIdentifier")
    protected IATAMasterFlightIdentifier iataMasterFlightIdentifier;
    @XmlElement(name = "FlightIdentity", required = true, nillable = true)
    protected String flightIdentity;
    @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> flightRepeatCount;

    /**
     * 获取iataMasterFlightIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IATAMasterFlightIdentifier }
     *     
     */
    public IATAMasterFlightIdentifier getIATAMasterFlightIdentifier() {
        return iataMasterFlightIdentifier;
    }

    /**
     * 设置iataMasterFlightIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IATAMasterFlightIdentifier }
     *     
     */
    public void setIATAMasterFlightIdentifier(IATAMasterFlightIdentifier value) {
        this.iataMasterFlightIdentifier = value;
    }

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

}

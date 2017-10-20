//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.28 时间 06:35:34 PM CST 
//


package com.ultra_as.schema;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmendmentType" type="{http://schema.ultra-as.com}AmendmentType"/>
 *         &lt;element name="FlightIdentification" type="{http://schema.ultra-as.com}FlightIdentification"/>
 *         &lt;element name="FlightData" type="{http://schema.ultra-as.com}FlightData"/>
 *         &lt;element name="FlightFilterData" type="{http://schema.ultra-as.com}FlightFilterData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isCompleteRecord" use="required" type="{http://schema.ultra-as.com}IsCompleteRecord" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amendmentType",
    "flightIdentification",
    "flightData",
    "flightFilterData"
})
@XmlRootElement(name = "AFDSFlightData")
public class AFDSFlightData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "AmendmentType", required = true)
    @XmlSchemaType(name = "string")
    protected AmendmentType amendmentType;
    @XmlElement(name = "FlightIdentification", required = true)
    protected FlightIdentification flightIdentification;
    @XmlElement(name = "FlightData", required = true)
    protected FlightData flightData;
    @XmlElement(name = "FlightFilterData")
    protected FlightFilterData flightFilterData;
    @XmlAttribute(name = "isCompleteRecord", required = true)
    protected boolean isCompleteRecord;

    /**
     * 获取amendmentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmendmentType }
     *     
     */
    public AmendmentType getAmendmentType() {
        return amendmentType;
    }

    /**
     * 设置amendmentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentType }
     *     
     */
    public void setAmendmentType(AmendmentType value) {
        this.amendmentType = value;
    }

    /**
     * 获取flightIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentification }
     *     
     */
    public FlightIdentification getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * 设置flightIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentification }
     *     
     */
    public void setFlightIdentification(FlightIdentification value) {
        this.flightIdentification = value;
    }

    /**
     * 获取flightData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightData }
     *     
     */
    public FlightData getFlightData() {
        return flightData;
    }

    /**
     * 设置flightData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightData }
     *     
     */
    public void setFlightData(FlightData value) {
        this.flightData = value;
    }

    /**
     * 获取flightFilterData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightFilterData }
     *     
     */
    public FlightFilterData getFlightFilterData() {
        return flightFilterData;
    }

    /**
     * 设置flightFilterData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightFilterData }
     *     
     */
    public void setFlightFilterData(FlightFilterData value) {
        this.flightFilterData = value;
    }

    /**
     * 获取isCompleteRecord属性的值。
     * 
     */
    public boolean isIsCompleteRecord() {
        return isCompleteRecord;
    }

    /**
     * 设置isCompleteRecord属性的值。
     * 
     */
    public void setIsCompleteRecord(boolean value) {
        this.isCompleteRecord = value;
    }

}

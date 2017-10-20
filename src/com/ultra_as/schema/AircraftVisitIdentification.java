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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AircraftVisitIdentification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AircraftVisitIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftVisitSequence" type="{http://schema.ultra-as.com}AircraftVisitSequence"/>
 *         &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration"/>
 *         &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftVisitIdentification", propOrder = {
    "aircraftVisitSequence",
    "aircraftRegistration",
    "scheduledDate"
})
public class AircraftVisitIdentification {

    @XmlElement(name = "AircraftVisitSequence")
    protected long aircraftVisitSequence;
    @XmlElement(name = "AircraftRegistration", required = true)
    protected String aircraftRegistration;
    @XmlElement(name = "ScheduledDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduledDate;

    /**
     * 获取aircraftVisitSequence属性的值。
     * 
     */
    public long getAircraftVisitSequence() {
        return aircraftVisitSequence;
    }

    /**
     * 设置aircraftVisitSequence属性的值。
     * 
     */
    public void setAircraftVisitSequence(long value) {
        this.aircraftVisitSequence = value;
    }

    /**
     * 获取aircraftRegistration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    /**
     * 设置aircraftRegistration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftRegistration(String value) {
        this.aircraftRegistration = value;
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

}

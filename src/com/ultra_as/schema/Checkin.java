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
 * Full description of a flight's check-in data.
 * 
 * <p>Checkin complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Checkin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckinCloseDateTime" type="{http://schema.ultra-as.com}CheckinCloseDateTime" minOccurs="0"/>
 *         &lt;element name="CheckinClusterID" type="{http://schema.ultra-as.com}CheckinClusterID" minOccurs="0"/>
 *         &lt;element name="CheckinDeskRange" type="{http://schema.ultra-as.com}CheckinDeskRange"/>
 *         &lt;element name="CheckinOpenDateTime" type="{http://schema.ultra-as.com}CheckinOpenDateTime" minOccurs="0"/>
 *         &lt;element name="CheckinRole" type="{http://schema.ultra-as.com}CheckinRole"/>
 *         &lt;element name="CheckinTypeCode" type="{http://schema.ultra-as.com}CheckinTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Checkin", propOrder = {
    "checkinCloseDateTime",
    "checkinClusterID",
    "checkinDeskRange",
    "checkinOpenDateTime",
    "checkinRole",
    "checkinTypeCode"
})
public class Checkin {

    @XmlElementRef(name = "CheckinCloseDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> checkinCloseDateTime;
    @XmlElementRef(name = "CheckinClusterID", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> checkinClusterID;
    @XmlElement(name = "CheckinDeskRange", required = true, nillable = true)
    protected String checkinDeskRange;
    @XmlElementRef(name = "CheckinOpenDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> checkinOpenDateTime;
    @XmlElement(name = "CheckinRole", required = true)
    @XmlSchemaType(name = "string")
    protected CheckinRole checkinRole;
    @XmlElementRef(name = "CheckinTypeCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CheckinTypeCode> checkinTypeCode;

    /**
     * 获取checkinCloseDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCheckinCloseDateTime() {
        return checkinCloseDateTime;
    }

    /**
     * 设置checkinCloseDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCheckinCloseDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.checkinCloseDateTime = value;
    }

    /**
     * 获取checkinClusterID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCheckinClusterID() {
        return checkinClusterID;
    }

    /**
     * 设置checkinClusterID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCheckinClusterID(JAXBElement<Long> value) {
        this.checkinClusterID = value;
    }

    /**
     * 获取checkinDeskRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinDeskRange() {
        return checkinDeskRange;
    }

    /**
     * 设置checkinDeskRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinDeskRange(String value) {
        this.checkinDeskRange = value;
    }

    /**
     * 获取checkinOpenDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCheckinOpenDateTime() {
        return checkinOpenDateTime;
    }

    /**
     * 设置checkinOpenDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCheckinOpenDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.checkinOpenDateTime = value;
    }

    /**
     * 获取checkinRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckinRole }
     *     
     */
    public CheckinRole getCheckinRole() {
        return checkinRole;
    }

    /**
     * 设置checkinRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckinRole }
     *     
     */
    public void setCheckinRole(CheckinRole value) {
        this.checkinRole = value;
    }

    /**
     * 获取checkinTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CheckinTypeCode }{@code >}
     *     
     */
    public JAXBElement<CheckinTypeCode> getCheckinTypeCode() {
        return checkinTypeCode;
    }

    /**
     * 设置checkinTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CheckinTypeCode }{@code >}
     *     
     */
    public void setCheckinTypeCode(JAXBElement<CheckinTypeCode> value) {
        this.checkinTypeCode = value;
    }

}

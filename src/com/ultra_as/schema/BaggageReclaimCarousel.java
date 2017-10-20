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
 * Full description of a flight's baggage reclaim allocation.
 * 
 * <p>BaggageReclaimCarousel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaggageReclaimCarousel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageReclaimCarouselID" type="{http://schema.ultra-as.com}BaggageReclaimCarouselID"/>
 *         &lt;element name="BaggageReclaimCarouselRole" type="{http://schema.ultra-as.com}BaggageReclaimCarouselRole"/>
 *         &lt;element name="BaggageReclaimCloseDateTime" type="{http://schema.ultra-as.com}BaggageReclaimCloseDateTime" minOccurs="0"/>
 *         &lt;element name="BaggageReclaimOpenDateTime" type="{http://schema.ultra-as.com}BaggageReclaimOpenDateTime" minOccurs="0"/>
 *         &lt;element name="ExitDoorNumber" type="{http://schema.ultra-as.com}ExitDoorNumber" minOccurs="0"/>
 *         &lt;element name="FirstBagDateTime" type="{http://schema.ultra-as.com}FirstBagDateTime" minOccurs="0"/>
 *         &lt;element name="LastBagDateTime" type="{http://schema.ultra-as.com}LastBagDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageReclaimCarousel", propOrder = {
    "baggageReclaimCarouselID",
    "baggageReclaimCarouselRole",
    "baggageReclaimCloseDateTime",
    "baggageReclaimOpenDateTime",
    "exitDoorNumber",
    "firstBagDateTime",
    "lastBagDateTime"
})
public class BaggageReclaimCarousel {

    @XmlElement(name = "BaggageReclaimCarouselID", required = true, nillable = true)
    protected String baggageReclaimCarouselID;
    @XmlElement(name = "BaggageReclaimCarouselRole", required = true)
    @XmlSchemaType(name = "string")
    protected BaggageReclaimCarouselRole baggageReclaimCarouselRole;
    @XmlElementRef(name = "BaggageReclaimCloseDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> baggageReclaimCloseDateTime;
    @XmlElementRef(name = "BaggageReclaimOpenDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> baggageReclaimOpenDateTime;
    @XmlElementRef(name = "ExitDoorNumber", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exitDoorNumber;
    @XmlElementRef(name = "FirstBagDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstBagDateTime;
    @XmlElementRef(name = "LastBagDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastBagDateTime;

    /**
     * 获取baggageReclaimCarouselID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageReclaimCarouselID() {
        return baggageReclaimCarouselID;
    }

    /**
     * 设置baggageReclaimCarouselID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageReclaimCarouselID(String value) {
        this.baggageReclaimCarouselID = value;
    }

    /**
     * 获取baggageReclaimCarouselRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaggageReclaimCarouselRole }
     *     
     */
    public BaggageReclaimCarouselRole getBaggageReclaimCarouselRole() {
        return baggageReclaimCarouselRole;
    }

    /**
     * 设置baggageReclaimCarouselRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageReclaimCarouselRole }
     *     
     */
    public void setBaggageReclaimCarouselRole(BaggageReclaimCarouselRole value) {
        this.baggageReclaimCarouselRole = value;
    }

    /**
     * 获取baggageReclaimCloseDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaggageReclaimCloseDateTime() {
        return baggageReclaimCloseDateTime;
    }

    /**
     * 设置baggageReclaimCloseDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaggageReclaimCloseDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.baggageReclaimCloseDateTime = value;
    }

    /**
     * 获取baggageReclaimOpenDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaggageReclaimOpenDateTime() {
        return baggageReclaimOpenDateTime;
    }

    /**
     * 设置baggageReclaimOpenDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaggageReclaimOpenDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.baggageReclaimOpenDateTime = value;
    }

    /**
     * 获取exitDoorNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExitDoorNumber() {
        return exitDoorNumber;
    }

    /**
     * 设置exitDoorNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExitDoorNumber(JAXBElement<String> value) {
        this.exitDoorNumber = value;
    }

    /**
     * 获取firstBagDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstBagDateTime() {
        return firstBagDateTime;
    }

    /**
     * 设置firstBagDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstBagDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.firstBagDateTime = value;
    }

    /**
     * 获取lastBagDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastBagDateTime() {
        return lastBagDateTime;
    }

    /**
     * 设置lastBagDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastBagDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastBagDateTime = value;
    }

}

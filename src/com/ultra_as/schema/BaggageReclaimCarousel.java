//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.01 ʱ�� 09:59:39 PM CST 
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
 * <p>BaggageReclaimCarousel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbaggageReclaimCarouselID���Ե�ֵ��
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
     * ����baggageReclaimCarouselID���Ե�ֵ��
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
     * ��ȡbaggageReclaimCarouselRole���Ե�ֵ��
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
     * ����baggageReclaimCarouselRole���Ե�ֵ��
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
     * ��ȡbaggageReclaimCloseDateTime���Ե�ֵ��
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
     * ����baggageReclaimCloseDateTime���Ե�ֵ��
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
     * ��ȡbaggageReclaimOpenDateTime���Ե�ֵ��
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
     * ����baggageReclaimOpenDateTime���Ե�ֵ��
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
     * ��ȡexitDoorNumber���Ե�ֵ��
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
     * ����exitDoorNumber���Ե�ֵ��
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
     * ��ȡfirstBagDateTime���Ե�ֵ��
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
     * ����firstBagDateTime���Ե�ֵ��
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
     * ��ȡlastBagDateTime���Ե�ֵ��
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
     * ����lastBagDateTime���Ե�ֵ��
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

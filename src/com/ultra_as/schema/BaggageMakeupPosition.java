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
 * Full description of a flight's baggage make-up position allocation.
 * 
 * <p>BaggageMakeupPosition complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BaggageMakeupPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageMakeupCloseDateTime" type="{http://schema.ultra-as.com}BaggageMakeupCloseDateTime" minOccurs="0"/>
 *         &lt;element name="BaggageMakeupOpenDateTime" type="{http://schema.ultra-as.com}BaggageMakeupOpenDateTime" minOccurs="0"/>
 *         &lt;element name="BaggageMakeupPositionID" type="{http://schema.ultra-as.com}BaggageMakeupPositionID"/>
 *         &lt;element name="BaggageMakeupPositionRole" type="{http://schema.ultra-as.com}BaggageMakeupPositionRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageMakeupPosition", propOrder = {
    "baggageMakeupCloseDateTime",
    "baggageMakeupOpenDateTime",
    "baggageMakeupPositionID",
    "baggageMakeupPositionRole"
})
public class BaggageMakeupPosition {

    @XmlElementRef(name = "BaggageMakeupCloseDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> baggageMakeupCloseDateTime;
    @XmlElementRef(name = "BaggageMakeupOpenDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> baggageMakeupOpenDateTime;
    @XmlElement(name = "BaggageMakeupPositionID", required = true, nillable = true)
    protected String baggageMakeupPositionID;
    @XmlElement(name = "BaggageMakeupPositionRole", required = true)
    @XmlSchemaType(name = "string")
    protected BaggageMakeupPositionRole baggageMakeupPositionRole;

    /**
     * ��ȡbaggageMakeupCloseDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaggageMakeupCloseDateTime() {
        return baggageMakeupCloseDateTime;
    }

    /**
     * ����baggageMakeupCloseDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaggageMakeupCloseDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.baggageMakeupCloseDateTime = value;
    }

    /**
     * ��ȡbaggageMakeupOpenDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaggageMakeupOpenDateTime() {
        return baggageMakeupOpenDateTime;
    }

    /**
     * ����baggageMakeupOpenDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaggageMakeupOpenDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.baggageMakeupOpenDateTime = value;
    }

    /**
     * ��ȡbaggageMakeupPositionID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageMakeupPositionID() {
        return baggageMakeupPositionID;
    }

    /**
     * ����baggageMakeupPositionID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageMakeupPositionID(String value) {
        this.baggageMakeupPositionID = value;
    }

    /**
     * ��ȡbaggageMakeupPositionRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaggageMakeupPositionRole }
     *     
     */
    public BaggageMakeupPositionRole getBaggageMakeupPositionRole() {
        return baggageMakeupPositionRole;
    }

    /**
     * ����baggageMakeupPositionRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageMakeupPositionRole }
     *     
     */
    public void setBaggageMakeupPositionRole(BaggageMakeupPositionRole value) {
        this.baggageMakeupPositionRole = value;
    }

}

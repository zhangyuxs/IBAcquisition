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
 * Full description of a flight's check-in data.
 * 
 * <p>Checkin complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcheckinCloseDateTime���Ե�ֵ��
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
     * ����checkinCloseDateTime���Ե�ֵ��
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
     * ��ȡcheckinClusterID���Ե�ֵ��
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
     * ����checkinClusterID���Ե�ֵ��
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
     * ��ȡcheckinDeskRange���Ե�ֵ��
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
     * ����checkinDeskRange���Ե�ֵ��
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
     * ��ȡcheckinOpenDateTime���Ե�ֵ��
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
     * ����checkinOpenDateTime���Ե�ֵ��
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
     * ��ȡcheckinRole���Ե�ֵ��
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
     * ����checkinRole���Ե�ֵ��
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
     * ��ȡcheckinTypeCode���Ե�ֵ��
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
     * ����checkinTypeCode���Ե�ֵ��
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

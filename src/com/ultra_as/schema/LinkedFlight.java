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
 * Identification details for linked (by registration or scheduled turn) flight.
 * 
 * <p>LinkedFlight complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="LinkedFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IATALinkFlightIdentifier" type="{http://schema.ultra-as.com}IATALinkFlightIdentifier" minOccurs="0"/>
 *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
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
@XmlType(name = "LinkedFlight", propOrder = {
    "iataLinkFlightIdentifier",
    "flightIdentity",
    "flightRepeatCount",
    "scheduledDate"
})
public class LinkedFlight {

    @XmlElement(name = "IATALinkFlightIdentifier")
    protected IATALinkFlightIdentifier iataLinkFlightIdentifier;
    @XmlElement(name = "FlightIdentity", required = true, nillable = true)
    protected String flightIdentity;
    @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> flightRepeatCount;
    @XmlElement(name = "ScheduledDate", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduledDate;

    /**
     * ��ȡiataLinkFlightIdentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IATALinkFlightIdentifier }
     *     
     */
    public IATALinkFlightIdentifier getIATALinkFlightIdentifier() {
        return iataLinkFlightIdentifier;
    }

    /**
     * ����iataLinkFlightIdentifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IATALinkFlightIdentifier }
     *     
     */
    public void setIATALinkFlightIdentifier(IATALinkFlightIdentifier value) {
        this.iataLinkFlightIdentifier = value;
    }

    /**
     * ��ȡflightIdentity���Ե�ֵ��
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
     * ����flightIdentity���Ե�ֵ��
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
     * ��ȡflightRepeatCount���Ե�ֵ��
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
     * ����flightRepeatCount���Ե�ֵ��
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
     * ��ȡscheduledDate���Ե�ֵ��
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
     * ����scheduledDate���Ե�ֵ��
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

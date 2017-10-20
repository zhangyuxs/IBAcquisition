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
 * Unique identification of a flight is determined by flight identity, flight direction, flight repeat count and scheduled date. For scheduled flights, the identification can be supplemented by an IATA flight identifier and/or an ICAO flight identifier. The flight repeat count is used to determine flights that operate more than one time on a single day.
 * 
 * <p>FlightIdentification complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡflightDirection���Ե�ֵ��
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
     * ����flightDirection���Ե�ֵ��
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

    /**
     * ��ȡiataFlightIdentifier���Ե�ֵ��
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
     * ����iataFlightIdentifier���Ե�ֵ��
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
     * ��ȡicaoFlightIdentifier���Ե�ֵ��
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
     * ����icaoFlightIdentifier���Ե�ֵ��
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

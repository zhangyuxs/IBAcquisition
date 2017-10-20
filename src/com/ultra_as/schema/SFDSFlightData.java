//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.05.28 ʱ�� 06:39:14 PM CST 
//


package com.ultra_as.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestID" type="{http://schema.ultra-as.com}RequestID"/>
 *         &lt;element name="Identification">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *                   &lt;element name="DaysOfOperation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OperationalDay" type="{http://schema.ultra-as.com}OperationalDay" maxOccurs="7"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlightDirection" type="{http://schema.ultra-as.com}FlightDirection"/>
 *                   &lt;element name="FlightFirstDateTime" type="{http://schema.ultra-as.com}FlightFirstDateTime"/>
 *                   &lt;element name="FlightLastDateTime" type="{http://schema.ultra-as.com}FlightLastDateTime"/>
 *                   &lt;element name="SeasonalFlightCancelCode" type="{http://schema.ultra-as.com}SeasonalFlightCancelCode" minOccurs="0"/>
 *                   &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
 *                   &lt;element name="ICAOFlightIdentifier" type="{http://schema.ultra-as.com}ICAOFlightIdentifier" minOccurs="0"/>
 *                   &lt;element name="FlightID" type="{http://schema.ultra-as.com}FlightID" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Aircraft" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Airport" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode"/>
 *                   &lt;element name="BaggageReclaimCarousel" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BaggageReclaimCarouselID" type="{http://schema.ultra-as.com}BaggageReclaimCarouselID" minOccurs="0"/>
 *                             &lt;element name="BaggageReclaimCarouselRole" type="{http://schema.ultra-as.com}BaggageReclaimCarouselRole"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BaggageMakeupPosition" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BaggageMakeupPositionID" type="{http://schema.ultra-as.com}BaggageMakeupPositionID" minOccurs="0"/>
 *                             &lt;element name="BaggageMakeupPositionRole" type="{http://schema.ultra-as.com}BaggageMakeupPositionRole"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Checkin" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CheckinDeskRange" type="{http://schema.ultra-as.com}CheckinDeskRange" minOccurs="0"/>
 *                             &lt;element name="CheckinRole" type="{http://schema.ultra-as.com}CheckinRole"/>
 *                             &lt;element name="CheckinTypeCode" type="{http://schema.ultra-as.com}CheckinTypeCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Gate" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber" minOccurs="0"/>
 *                             &lt;element name="GateRole" type="{http://schema.ultra-as.com}GateRole"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PassengerTerminalCode" type="{http://schema.ultra-as.com}PassengerTerminalCode" minOccurs="0"/>
 *                   &lt;element name="SecureStandIsRequired" type="{http://schema.ultra-as.com}SecureStandIsRequired" minOccurs="0"/>
 *                   &lt;element name="StandPosition" type="{http://schema.ultra-as.com}StandPosition" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Flight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="CodeShareStatus" type="{http://schema.ultra-as.com}CodeShareStatus" minOccurs="0"/>
 *                   &lt;element name="FlightClassificationCode" type="{http://schema.ultra-as.com}FlightClassificationCode" minOccurs="0"/>
 *                   &lt;element name="FlightFrequency" type="{http://schema.ultra-as.com}FlightFrequency"/>
 *                   &lt;element name="FlightOperatesOvernight" type="{http://schema.ultra-as.com}FlightOperatesOvernight" minOccurs="0"/>
 *                   &lt;element name="FlightSeason" type="{http://schema.ultra-as.com}FlightSeason" minOccurs="0"/>
 *                   &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" minOccurs="0"/>
 *                   &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" minOccurs="0"/>
 *                   &lt;element name="FlightTransitCode" type="{http://schema.ultra-as.com}FlightTransitCode" minOccurs="0"/>
 *                   &lt;element name="HandlingAgent" type="{http://schema.ultra-as.com}HandlingAgent" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="IsGeneralAviationFlight" type="{http://schema.ultra-as.com}IsGeneralAviationFlight" minOccurs="0"/>
 *                   &lt;element name="IsTransferFlight" type="{http://schema.ultra-as.com}IsTransferFlight" minOccurs="0"/>
 *                   &lt;element name="LinkedFlight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *                             &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
 *                             &lt;element name="LinkDay" type="{http://schema.ultra-as.com}LinkDay" minOccurs="0"/>
 *                             &lt;element name="LinkedFlightID" type="{http://schema.ultra-as.com}LinkedFlightID" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MasterFlight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *                             &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
 *                             &lt;element name="MasterFlightID" type="{http://schema.ultra-as.com}MasterFlightID" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperationalTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="EstimatedFlightDuration" type="{http://schema.ultra-as.com}EstimatedFlightDuration" minOccurs="0"/>
 *                   &lt;element name="NextStationScheduledDateTime" type="{http://schema.ultra-as.com}NextStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="PreviousStationScheduledDateTime" type="{http://schema.ultra-as.com}PreviousStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="FirstStationScheduledDateTime" type="{http://schema.ultra-as.com}FirstStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="SecondStationScheduledDateTime" type="{http://schema.ultra-as.com}SecondStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="ThirdStationScheduledDateTime" type="{http://schema.ultra-as.com}ThirdStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="FourthStationScheduledDateTime" type="{http://schema.ultra-as.com}FourthStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="FifthStationScheduledDateTime" type="{http://schema.ultra-as.com}FifthStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="SixthStationScheduledDateTime" type="{http://schema.ultra-as.com}SixthStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="OriginStationScheduledDateTime" type="{http://schema.ultra-as.com}OriginStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="DestinationStationScheduledDateTime" type="{http://schema.ultra-as.com}DestinationStationScheduledDateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PortsOfCall" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PortOfCallIATACode" type="{http://schema.ultra-as.com}PortOfCallIATACode" maxOccurs="7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Public" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="CarrierIATACode" type="{http://schema.ultra-as.com}CarrierIATACode" minOccurs="0"/>
 *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestID",
    "identification",
    "aircraft",
    "airport",
    "flight",
    "operationalTimes",
    "portsOfCall",
    "_public"
})
@XmlRootElement(name = "SFDSFlightData")
public class SFDSFlightData {

    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "integer")
    protected int requestID;
    @XmlElement(name = "Identification", required = true)
    protected SFDSFlightData.Identification identification;
    @XmlElementRef(name = "Aircraft", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SFDSFlightData.Aircraft> aircraft;
    @XmlElementRef(name = "Airport", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SFDSFlightData.Airport> airport;
    @XmlElementRef(name = "Flight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SFDSFlightData.Flight> flight;
    @XmlElementRef(name = "OperationalTimes", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SFDSFlightData.OperationalTimes> operationalTimes;
    @XmlElementRef(name = "PortsOfCall", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SFDSFlightData.PortsOfCall> portsOfCall;
    @XmlElementRef(name = "Public", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SFDSFlightData.Public> _public;

    /**
     * ��ȡrequestID���Ե�ֵ��
     * 
     */
    public int getRequestID() {
        return requestID;
    }

    /**
     * ����requestID���Ե�ֵ��
     * 
     */
    public void setRequestID(int value) {
        this.requestID = value;
    }

    /**
     * ��ȡidentification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SFDSFlightData.Identification }
     *     
     */
    public SFDSFlightData.Identification getIdentification() {
        return identification;
    }

    /**
     * ����identification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SFDSFlightData.Identification }
     *     
     */
    public void setIdentification(SFDSFlightData.Identification value) {
        this.identification = value;
    }

    /**
     * ��ȡaircraft���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Aircraft }{@code >}
     *     
     */
    public JAXBElement<SFDSFlightData.Aircraft> getAircraft() {
        return aircraft;
    }

    /**
     * ����aircraft���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Aircraft }{@code >}
     *     
     */
    public void setAircraft(JAXBElement<SFDSFlightData.Aircraft> value) {
        this.aircraft = value;
    }

    /**
     * ��ȡairport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Airport }{@code >}
     *     
     */
    public JAXBElement<SFDSFlightData.Airport> getAirport() {
        return airport;
    }

    /**
     * ����airport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Airport }{@code >}
     *     
     */
    public void setAirport(JAXBElement<SFDSFlightData.Airport> value) {
        this.airport = value;
    }

    /**
     * ��ȡflight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight }{@code >}
     *     
     */
    public JAXBElement<SFDSFlightData.Flight> getFlight() {
        return flight;
    }

    /**
     * ����flight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight }{@code >}
     *     
     */
    public void setFlight(JAXBElement<SFDSFlightData.Flight> value) {
        this.flight = value;
    }

    /**
     * ��ȡoperationalTimes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.OperationalTimes }{@code >}
     *     
     */
    public JAXBElement<SFDSFlightData.OperationalTimes> getOperationalTimes() {
        return operationalTimes;
    }

    /**
     * ����operationalTimes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.OperationalTimes }{@code >}
     *     
     */
    public void setOperationalTimes(JAXBElement<SFDSFlightData.OperationalTimes> value) {
        this.operationalTimes = value;
    }

    /**
     * ��ȡportsOfCall���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.PortsOfCall }{@code >}
     *     
     */
    public JAXBElement<SFDSFlightData.PortsOfCall> getPortsOfCall() {
        return portsOfCall;
    }

    /**
     * ����portsOfCall���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.PortsOfCall }{@code >}
     *     
     */
    public void setPortsOfCall(JAXBElement<SFDSFlightData.PortsOfCall> value) {
        this.portsOfCall = value;
    }

    /**
     * ��ȡpublic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Public }{@code >}
     *     
     */
    public JAXBElement<SFDSFlightData.Public> getPublic() {
        return _public;
    }

    /**
     * ����public���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Public }{@code >}
     *     
     */
    public void setPublic(JAXBElement<SFDSFlightData.Public> value) {
        this._public = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aircraftSubtypeIATACode"
    })
    public static class Aircraft {

        @XmlElementRef(name = "AircraftSubtypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftSubtypeIATACode;

        /**
         * ��ȡaircraftSubtypeIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftSubtypeIATACode() {
            return aircraftSubtypeIATACode;
        }

        /**
         * ����aircraftSubtypeIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftSubtypeIATACode(JAXBElement<String> value) {
            this.aircraftSubtypeIATACode = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode"/>
     *         &lt;element name="BaggageReclaimCarousel" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BaggageReclaimCarouselID" type="{http://schema.ultra-as.com}BaggageReclaimCarouselID" minOccurs="0"/>
     *                   &lt;element name="BaggageReclaimCarouselRole" type="{http://schema.ultra-as.com}BaggageReclaimCarouselRole"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BaggageMakeupPosition" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BaggageMakeupPositionID" type="{http://schema.ultra-as.com}BaggageMakeupPositionID" minOccurs="0"/>
     *                   &lt;element name="BaggageMakeupPositionRole" type="{http://schema.ultra-as.com}BaggageMakeupPositionRole"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Checkin" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CheckinDeskRange" type="{http://schema.ultra-as.com}CheckinDeskRange" minOccurs="0"/>
     *                   &lt;element name="CheckinRole" type="{http://schema.ultra-as.com}CheckinRole"/>
     *                   &lt;element name="CheckinTypeCode" type="{http://schema.ultra-as.com}CheckinTypeCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Gate" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber" minOccurs="0"/>
     *                   &lt;element name="GateRole" type="{http://schema.ultra-as.com}GateRole"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PassengerTerminalCode" type="{http://schema.ultra-as.com}PassengerTerminalCode" minOccurs="0"/>
     *         &lt;element name="SecureStandIsRequired" type="{http://schema.ultra-as.com}SecureStandIsRequired" minOccurs="0"/>
     *         &lt;element name="StandPosition" type="{http://schema.ultra-as.com}StandPosition" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airportIATACode",
        "baggageReclaimCarousel",
        "baggageMakeupPosition",
        "checkin",
        "gate",
        "passengerTerminalCode",
        "secureStandIsRequired",
        "standPosition"
    })
    public static class Airport {

        @XmlElement(name = "AirportIATACode")
        protected String airportIATACode;
        @XmlElement(name = "BaggageReclaimCarousel", nillable = true)
        protected List<SFDSFlightData.Airport.BaggageReclaimCarousel> baggageReclaimCarousel;
        @XmlElement(name = "BaggageMakeupPosition", nillable = true)
        protected List<SFDSFlightData.Airport.BaggageMakeupPosition> baggageMakeupPosition;
        @XmlElement(name = "Checkin", nillable = true)
        protected List<SFDSFlightData.Airport.Checkin> checkin;
        @XmlElement(name = "Gate", nillable = true)
        protected List<SFDSFlightData.Airport.Gate> gate;
        @XmlElementRef(name = "PassengerTerminalCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> passengerTerminalCode;
        @XmlElementRef(name = "SecureStandIsRequired", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> secureStandIsRequired;
        @XmlElementRef(name = "StandPosition", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> standPosition;

        /**
         * ��ȡairportIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirportIATACode() {
            return airportIATACode;
        }

        /**
         * ����airportIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirportIATACode(String value) {
            this.airportIATACode = value;
        }

        /**
         * Gets the value of the baggageReclaimCarousel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baggageReclaimCarousel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaggageReclaimCarousel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SFDSFlightData.Airport.BaggageReclaimCarousel }
         * 
         * 
         */
        public List<SFDSFlightData.Airport.BaggageReclaimCarousel> getBaggageReclaimCarousel() {
            if (baggageReclaimCarousel == null) {
                baggageReclaimCarousel = new ArrayList<SFDSFlightData.Airport.BaggageReclaimCarousel>();
            }
            return this.baggageReclaimCarousel;
        }

        /**
         * Gets the value of the baggageMakeupPosition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baggageMakeupPosition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaggageMakeupPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SFDSFlightData.Airport.BaggageMakeupPosition }
         * 
         * 
         */
        public List<SFDSFlightData.Airport.BaggageMakeupPosition> getBaggageMakeupPosition() {
            if (baggageMakeupPosition == null) {
                baggageMakeupPosition = new ArrayList<SFDSFlightData.Airport.BaggageMakeupPosition>();
            }
            return this.baggageMakeupPosition;
        }

        /**
         * Gets the value of the checkin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SFDSFlightData.Airport.Checkin }
         * 
         * 
         */
        public List<SFDSFlightData.Airport.Checkin> getCheckin() {
            if (checkin == null) {
                checkin = new ArrayList<SFDSFlightData.Airport.Checkin>();
            }
            return this.checkin;
        }

        /**
         * Gets the value of the gate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SFDSFlightData.Airport.Gate }
         * 
         * 
         */
        public List<SFDSFlightData.Airport.Gate> getGate() {
            if (gate == null) {
                gate = new ArrayList<SFDSFlightData.Airport.Gate>();
            }
            return this.gate;
        }

        /**
         * ��ȡpassengerTerminalCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPassengerTerminalCode() {
            return passengerTerminalCode;
        }

        /**
         * ����passengerTerminalCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPassengerTerminalCode(JAXBElement<String> value) {
            this.passengerTerminalCode = value;
        }

        /**
         * ��ȡsecureStandIsRequired���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getSecureStandIsRequired() {
            return secureStandIsRequired;
        }

        /**
         * ����secureStandIsRequired���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setSecureStandIsRequired(JAXBElement<Boolean> value) {
            this.secureStandIsRequired = value;
        }

        /**
         * ��ȡstandPosition���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStandPosition() {
            return standPosition;
        }

        /**
         * ����standPosition���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStandPosition(JAXBElement<String> value) {
            this.standPosition = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="BaggageMakeupPositionID" type="{http://schema.ultra-as.com}BaggageMakeupPositionID" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "baggageMakeupPositionID",
            "baggageMakeupPositionRole"
        })
        public static class BaggageMakeupPosition {

            @XmlElementRef(name = "BaggageMakeupPositionID", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<String> baggageMakeupPositionID;
            @XmlElement(name = "BaggageMakeupPositionRole", required = true)
            @XmlSchemaType(name = "string")
            protected BaggageMakeupPositionRole baggageMakeupPositionRole;

            /**
             * ��ȡbaggageMakeupPositionID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getBaggageMakeupPositionID() {
                return baggageMakeupPositionID;
            }

            /**
             * ����baggageMakeupPositionID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setBaggageMakeupPositionID(JAXBElement<String> value) {
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


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="BaggageReclaimCarouselID" type="{http://schema.ultra-as.com}BaggageReclaimCarouselID" minOccurs="0"/>
         *         &lt;element name="BaggageReclaimCarouselRole" type="{http://schema.ultra-as.com}BaggageReclaimCarouselRole"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "baggageReclaimCarouselID",
            "baggageReclaimCarouselRole"
        })
        public static class BaggageReclaimCarousel {

            @XmlElementRef(name = "BaggageReclaimCarouselID", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<String> baggageReclaimCarouselID;
            @XmlElement(name = "BaggageReclaimCarouselRole", required = true)
            @XmlSchemaType(name = "string")
            protected BaggageReclaimCarouselRole baggageReclaimCarouselRole;

            /**
             * ��ȡbaggageReclaimCarouselID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getBaggageReclaimCarouselID() {
                return baggageReclaimCarouselID;
            }

            /**
             * ����baggageReclaimCarouselID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setBaggageReclaimCarouselID(JAXBElement<String> value) {
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

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CheckinDeskRange" type="{http://schema.ultra-as.com}CheckinDeskRange" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "checkinDeskRange",
            "checkinRole",
            "checkinTypeCode"
        })
        public static class Checkin {

            @XmlElementRef(name = "CheckinDeskRange", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<String> checkinDeskRange;
            @XmlElement(name = "CheckinRole", required = true)
            @XmlSchemaType(name = "string")
            protected CheckinRole checkinRole;
            @XmlElementRef(name = "CheckinTypeCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<CheckinTypeCode> checkinTypeCode;

            /**
             * ��ȡcheckinDeskRange���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCheckinDeskRange() {
                return checkinDeskRange;
            }

            /**
             * ����checkinDeskRange���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCheckinDeskRange(JAXBElement<String> value) {
                this.checkinDeskRange = value;
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


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber" minOccurs="0"/>
         *         &lt;element name="GateRole" type="{http://schema.ultra-as.com}GateRole"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gateNumber",
            "gateRole"
        })
        public static class Gate {

            @XmlElementRef(name = "GateNumber", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<String> gateNumber;
            @XmlElement(name = "GateRole", required = true)
            @XmlSchemaType(name = "string")
            protected GateRole gateRole;

            /**
             * ��ȡgateNumber���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getGateNumber() {
                return gateNumber;
            }

            /**
             * ����gateNumber���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setGateNumber(JAXBElement<String> value) {
                this.gateNumber = value;
            }

            /**
             * ��ȡgateRole���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link GateRole }
             *     
             */
            public GateRole getGateRole() {
                return gateRole;
            }

            /**
             * ����gateRole���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link GateRole }
             *     
             */
            public void setGateRole(GateRole value) {
                this.gateRole = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="CodeShareStatus" type="{http://schema.ultra-as.com}CodeShareStatus" minOccurs="0"/>
     *         &lt;element name="FlightClassificationCode" type="{http://schema.ultra-as.com}FlightClassificationCode" minOccurs="0"/>
     *         &lt;element name="FlightFrequency" type="{http://schema.ultra-as.com}FlightFrequency"/>
     *         &lt;element name="FlightOperatesOvernight" type="{http://schema.ultra-as.com}FlightOperatesOvernight" minOccurs="0"/>
     *         &lt;element name="FlightSeason" type="{http://schema.ultra-as.com}FlightSeason" minOccurs="0"/>
     *         &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" minOccurs="0"/>
     *         &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" minOccurs="0"/>
     *         &lt;element name="FlightTransitCode" type="{http://schema.ultra-as.com}FlightTransitCode" minOccurs="0"/>
     *         &lt;element name="HandlingAgent" type="{http://schema.ultra-as.com}HandlingAgent" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="IsGeneralAviationFlight" type="{http://schema.ultra-as.com}IsGeneralAviationFlight" minOccurs="0"/>
     *         &lt;element name="IsTransferFlight" type="{http://schema.ultra-as.com}IsTransferFlight" minOccurs="0"/>
     *         &lt;element name="LinkedFlight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
     *                   &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
     *                   &lt;element name="LinkDay" type="{http://schema.ultra-as.com}LinkDay" minOccurs="0"/>
     *                   &lt;element name="LinkedFlightID" type="{http://schema.ultra-as.com}LinkedFlightID" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MasterFlight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
     *                   &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
     *                   &lt;element name="MasterFlightID" type="{http://schema.ultra-as.com}MasterFlightID" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codeShareStatus",
        "flightClassificationCode",
        "flightFrequency",
        "flightOperatesOvernight",
        "flightSeason",
        "flightSectorCode",
        "flightServiceTypeIATACode",
        "flightTransitCode",
        "handlingAgent",
        "isGeneralAviationFlight",
        "isTransferFlight",
        "linkedFlight",
        "masterFlight"
    })
    public static class Flight {

        @XmlElementRef(name = "CodeShareStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> codeShareStatus;
        @XmlElementRef(name = "FlightClassificationCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightClassificationCode;
        @XmlElement(name = "FlightFrequency")
        @XmlSchemaType(name = "integer")
        protected Integer flightFrequency;
        @XmlElementRef(name = "FlightOperatesOvernight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> flightOperatesOvernight;
        @XmlElementRef(name = "FlightSeason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightSeason;
        @XmlElementRef(name = "FlightSectorCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightSectorCode> flightSectorCode;
        @XmlElementRef(name = "FlightServiceTypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightServiceTypeIATACode;
        @XmlElementRef(name = "FlightTransitCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightTransitCode> flightTransitCode;
        @XmlElement(name = "HandlingAgent", nillable = true)
        protected List<HandlingAgent> handlingAgent;
        @XmlElementRef(name = "IsGeneralAviationFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> isGeneralAviationFlight;
        @XmlElementRef(name = "IsTransferFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> isTransferFlight;
        @XmlElementRef(name = "LinkedFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<SFDSFlightData.Flight.LinkedFlight> linkedFlight;
        @XmlElementRef(name = "MasterFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<SFDSFlightData.Flight.MasterFlight> masterFlight;

        /**
         * ��ȡcodeShareStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCodeShareStatus() {
            return codeShareStatus;
        }

        /**
         * ����codeShareStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCodeShareStatus(JAXBElement<String> value) {
            this.codeShareStatus = value;
        }

        /**
         * ��ȡflightClassificationCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightClassificationCode() {
            return flightClassificationCode;
        }

        /**
         * ����flightClassificationCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightClassificationCode(JAXBElement<String> value) {
            this.flightClassificationCode = value;
        }

        /**
         * ��ȡflightFrequency���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFlightFrequency() {
            return flightFrequency;
        }

        /**
         * ����flightFrequency���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFlightFrequency(Integer value) {
            this.flightFrequency = value;
        }

        /**
         * ��ȡflightOperatesOvernight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getFlightOperatesOvernight() {
            return flightOperatesOvernight;
        }

        /**
         * ����flightOperatesOvernight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setFlightOperatesOvernight(JAXBElement<Boolean> value) {
            this.flightOperatesOvernight = value;
        }

        /**
         * ��ȡflightSeason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightSeason() {
            return flightSeason;
        }

        /**
         * ����flightSeason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightSeason(JAXBElement<String> value) {
            this.flightSeason = value;
        }

        /**
         * ��ȡflightSectorCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FlightSectorCode }{@code >}
         *     
         */
        public JAXBElement<FlightSectorCode> getFlightSectorCode() {
            return flightSectorCode;
        }

        /**
         * ����flightSectorCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FlightSectorCode }{@code >}
         *     
         */
        public void setFlightSectorCode(JAXBElement<FlightSectorCode> value) {
            this.flightSectorCode = value;
        }

        /**
         * ��ȡflightServiceTypeIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightServiceTypeIATACode() {
            return flightServiceTypeIATACode;
        }

        /**
         * ����flightServiceTypeIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightServiceTypeIATACode(JAXBElement<String> value) {
            this.flightServiceTypeIATACode = value;
        }

        /**
         * ��ȡflightTransitCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FlightTransitCode }{@code >}
         *     
         */
        public JAXBElement<FlightTransitCode> getFlightTransitCode() {
            return flightTransitCode;
        }

        /**
         * ����flightTransitCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FlightTransitCode }{@code >}
         *     
         */
        public void setFlightTransitCode(JAXBElement<FlightTransitCode> value) {
            this.flightTransitCode = value;
        }

        /**
         * Gets the value of the handlingAgent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the handlingAgent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHandlingAgent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HandlingAgent }
         * 
         * 
         */
        public List<HandlingAgent> getHandlingAgent() {
            if (handlingAgent == null) {
                handlingAgent = new ArrayList<HandlingAgent>();
            }
            return this.handlingAgent;
        }

        /**
         * ��ȡisGeneralAviationFlight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getIsGeneralAviationFlight() {
            return isGeneralAviationFlight;
        }

        /**
         * ����isGeneralAviationFlight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setIsGeneralAviationFlight(JAXBElement<Boolean> value) {
            this.isGeneralAviationFlight = value;
        }

        /**
         * ��ȡisTransferFlight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getIsTransferFlight() {
            return isTransferFlight;
        }

        /**
         * ����isTransferFlight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setIsTransferFlight(JAXBElement<Boolean> value) {
            this.isTransferFlight = value;
        }

        /**
         * ��ȡlinkedFlight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight.LinkedFlight }{@code >}
         *     
         */
        public JAXBElement<SFDSFlightData.Flight.LinkedFlight> getLinkedFlight() {
            return linkedFlight;
        }

        /**
         * ����linkedFlight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight.LinkedFlight }{@code >}
         *     
         */
        public void setLinkedFlight(JAXBElement<SFDSFlightData.Flight.LinkedFlight> value) {
            this.linkedFlight = value;
        }

        /**
         * ��ȡmasterFlight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight.MasterFlight }{@code >}
         *     
         */
        public JAXBElement<SFDSFlightData.Flight.MasterFlight> getMasterFlight() {
            return masterFlight;
        }

        /**
         * ����masterFlight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight.MasterFlight }{@code >}
         *     
         */
        public void setMasterFlight(JAXBElement<SFDSFlightData.Flight.MasterFlight> value) {
            this.masterFlight = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
         *         &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
         *         &lt;element name="LinkDay" type="{http://schema.ultra-as.com}LinkDay" minOccurs="0"/>
         *         &lt;element name="LinkedFlightID" type="{http://schema.ultra-as.com}LinkedFlightID" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightIdentity",
            "iataFlightIdentifier",
            "linkDay",
            "linkedFlightID"
        })
        public static class LinkedFlight {

            @XmlElement(name = "FlightIdentity", required = true)
            protected String flightIdentity;
            @XmlElement(name = "IATAFlightIdentifier")
            protected IATAFlightIdentifier iataFlightIdentifier;
            @XmlElementRef(name = "LinkDay", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> linkDay;
            @XmlElementRef(name = "LinkedFlightID", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> linkedFlightID;

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
             * ��ȡlinkDay���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getLinkDay() {
                return linkDay;
            }

            /**
             * ����linkDay���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setLinkDay(JAXBElement<Integer> value) {
                this.linkDay = value;
            }

            /**
             * ��ȡlinkedFlightID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getLinkedFlightID() {
                return linkedFlightID;
            }

            /**
             * ����linkedFlightID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setLinkedFlightID(JAXBElement<Long> value) {
                this.linkedFlightID = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
         *         &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
         *         &lt;element name="MasterFlightID" type="{http://schema.ultra-as.com}MasterFlightID" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightIdentity",
            "iataFlightIdentifier",
            "masterFlightID"
        })
        public static class MasterFlight {

            @XmlElement(name = "FlightIdentity", required = true)
            protected String flightIdentity;
            @XmlElement(name = "IATAFlightIdentifier")
            protected IATAFlightIdentifier iataFlightIdentifier;
            @XmlElementRef(name = "MasterFlightID", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> masterFlightID;

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
             * ��ȡmasterFlightID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getMasterFlightID() {
                return masterFlightID;
            }

            /**
             * ����masterFlightID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setMasterFlightID(JAXBElement<Long> value) {
                this.masterFlightID = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
     *         &lt;element name="DaysOfOperation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OperationalDay" type="{http://schema.ultra-as.com}OperationalDay" maxOccurs="7"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlightDirection" type="{http://schema.ultra-as.com}FlightDirection"/>
     *         &lt;element name="FlightFirstDateTime" type="{http://schema.ultra-as.com}FlightFirstDateTime"/>
     *         &lt;element name="FlightLastDateTime" type="{http://schema.ultra-as.com}FlightLastDateTime"/>
     *         &lt;element name="SeasonalFlightCancelCode" type="{http://schema.ultra-as.com}SeasonalFlightCancelCode" minOccurs="0"/>
     *         &lt;element name="IATAFlightIdentifier" type="{http://schema.ultra-as.com}IATAFlightIdentifier" minOccurs="0"/>
     *         &lt;element name="ICAOFlightIdentifier" type="{http://schema.ultra-as.com}ICAOFlightIdentifier" minOccurs="0"/>
     *         &lt;element name="FlightID" type="{http://schema.ultra-as.com}FlightID" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightIdentity",
        "daysOfOperation",
        "flightDirection",
        "flightFirstDateTime",
        "flightLastDateTime",
        "seasonalFlightCancelCode",
        "iataFlightIdentifier",
        "icaoFlightIdentifier",
        "flightID"
    })
    public static class Identification {

        @XmlElement(name = "FlightIdentity", required = true)
        protected String flightIdentity;
        @XmlElement(name = "DaysOfOperation", required = true)
        protected SFDSFlightData.Identification.DaysOfOperation daysOfOperation;
        @XmlElement(name = "FlightDirection", required = true)
        @XmlSchemaType(name = "string")
        protected FlightDirection flightDirection;
        @XmlElement(name = "FlightFirstDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar flightFirstDateTime;
        @XmlElement(name = "FlightLastDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar flightLastDateTime;
        @XmlElementRef(name = "SeasonalFlightCancelCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<SeasonalFlightCancelCode> seasonalFlightCancelCode;
        @XmlElement(name = "IATAFlightIdentifier")
        protected IATAFlightIdentifier iataFlightIdentifier;
        @XmlElement(name = "ICAOFlightIdentifier")
        protected ICAOFlightIdentifier icaoFlightIdentifier;
        @XmlElementRef(name = "FlightID", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> flightID;

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
         * ��ȡdaysOfOperation���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link SFDSFlightData.Identification.DaysOfOperation }
         *     
         */
        public SFDSFlightData.Identification.DaysOfOperation getDaysOfOperation() {
            return daysOfOperation;
        }

        /**
         * ����daysOfOperation���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link SFDSFlightData.Identification.DaysOfOperation }
         *     
         */
        public void setDaysOfOperation(SFDSFlightData.Identification.DaysOfOperation value) {
            this.daysOfOperation = value;
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
         * ��ȡflightFirstDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFlightFirstDateTime() {
            return flightFirstDateTime;
        }

        /**
         * ����flightFirstDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFlightFirstDateTime(XMLGregorianCalendar value) {
            this.flightFirstDateTime = value;
        }

        /**
         * ��ȡflightLastDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFlightLastDateTime() {
            return flightLastDateTime;
        }

        /**
         * ����flightLastDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFlightLastDateTime(XMLGregorianCalendar value) {
            this.flightLastDateTime = value;
        }

        /**
         * ��ȡseasonalFlightCancelCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SeasonalFlightCancelCode }{@code >}
         *     
         */
        public JAXBElement<SeasonalFlightCancelCode> getSeasonalFlightCancelCode() {
            return seasonalFlightCancelCode;
        }

        /**
         * ����seasonalFlightCancelCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SeasonalFlightCancelCode }{@code >}
         *     
         */
        public void setSeasonalFlightCancelCode(JAXBElement<SeasonalFlightCancelCode> value) {
            this.seasonalFlightCancelCode = value;
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

        /**
         * ��ȡflightID���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getFlightID() {
            return flightID;
        }

        /**
         * ����flightID���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setFlightID(JAXBElement<Long> value) {
            this.flightID = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OperationalDay" type="{http://schema.ultra-as.com}OperationalDay" maxOccurs="7"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "operationalDay"
        })
        public static class DaysOfOperation {

            @XmlElement(name = "OperationalDay", required = true, nillable = true)
            @XmlSchemaType(name = "string")
            protected List<OperationalDay> operationalDay;

            /**
             * Gets the value of the operationalDay property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the operationalDay property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOperationalDay().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OperationalDay }
             * 
             * 
             */
            public List<OperationalDay> getOperationalDay() {
                if (operationalDay == null) {
                    operationalDay = new ArrayList<OperationalDay>();
                }
                return this.operationalDay;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="EstimatedFlightDuration" type="{http://schema.ultra-as.com}EstimatedFlightDuration" minOccurs="0"/>
     *         &lt;element name="NextStationScheduledDateTime" type="{http://schema.ultra-as.com}NextStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="PreviousStationScheduledDateTime" type="{http://schema.ultra-as.com}PreviousStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="FirstStationScheduledDateTime" type="{http://schema.ultra-as.com}FirstStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="SecondStationScheduledDateTime" type="{http://schema.ultra-as.com}SecondStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="ThirdStationScheduledDateTime" type="{http://schema.ultra-as.com}ThirdStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="FourthStationScheduledDateTime" type="{http://schema.ultra-as.com}FourthStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="FifthStationScheduledDateTime" type="{http://schema.ultra-as.com}FifthStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="SixthStationScheduledDateTime" type="{http://schema.ultra-as.com}SixthStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="OriginStationScheduledDateTime" type="{http://schema.ultra-as.com}OriginStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="DestinationStationScheduledDateTime" type="{http://schema.ultra-as.com}DestinationStationScheduledDateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "estimatedFlightDuration",
        "nextStationScheduledDateTime",
        "previousStationScheduledDateTime",
        "firstStationScheduledDateTime",
        "secondStationScheduledDateTime",
        "thirdStationScheduledDateTime",
        "fourthStationScheduledDateTime",
        "fifthStationScheduledDateTime",
        "sixthStationScheduledDateTime",
        "originStationScheduledDateTime",
        "destinationStationScheduledDateTime"
    })
    public static class OperationalTimes {

        @XmlElementRef(name = "EstimatedFlightDuration", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Duration> estimatedFlightDuration;
        @XmlElementRef(name = "NextStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> nextStationScheduledDateTime;
        @XmlElementRef(name = "PreviousStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> previousStationScheduledDateTime;
        @XmlElementRef(name = "FirstStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> firstStationScheduledDateTime;
        @XmlElementRef(name = "SecondStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> secondStationScheduledDateTime;
        @XmlElementRef(name = "ThirdStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> thirdStationScheduledDateTime;
        @XmlElementRef(name = "FourthStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> fourthStationScheduledDateTime;
        @XmlElementRef(name = "FifthStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> fifthStationScheduledDateTime;
        @XmlElementRef(name = "SixthStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> sixthStationScheduledDateTime;
        @XmlElementRef(name = "OriginStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> originStationScheduledDateTime;
        @XmlElementRef(name = "DestinationStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> destinationStationScheduledDateTime;

        /**
         * ��ȡestimatedFlightDuration���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
         *     
         */
        public JAXBElement<Duration> getEstimatedFlightDuration() {
            return estimatedFlightDuration;
        }

        /**
         * ����estimatedFlightDuration���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
         *     
         */
        public void setEstimatedFlightDuration(JAXBElement<Duration> value) {
            this.estimatedFlightDuration = value;
        }

        /**
         * ��ȡnextStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getNextStationScheduledDateTime() {
            return nextStationScheduledDateTime;
        }

        /**
         * ����nextStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setNextStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.nextStationScheduledDateTime = value;
        }

        /**
         * ��ȡpreviousStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getPreviousStationScheduledDateTime() {
            return previousStationScheduledDateTime;
        }

        /**
         * ����previousStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setPreviousStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.previousStationScheduledDateTime = value;
        }

        /**
         * ��ȡfirstStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getFirstStationScheduledDateTime() {
            return firstStationScheduledDateTime;
        }

        /**
         * ����firstStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setFirstStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.firstStationScheduledDateTime = value;
        }

        /**
         * ��ȡsecondStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getSecondStationScheduledDateTime() {
            return secondStationScheduledDateTime;
        }

        /**
         * ����secondStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setSecondStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.secondStationScheduledDateTime = value;
        }

        /**
         * ��ȡthirdStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getThirdStationScheduledDateTime() {
            return thirdStationScheduledDateTime;
        }

        /**
         * ����thirdStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setThirdStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.thirdStationScheduledDateTime = value;
        }

        /**
         * ��ȡfourthStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getFourthStationScheduledDateTime() {
            return fourthStationScheduledDateTime;
        }

        /**
         * ����fourthStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setFourthStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.fourthStationScheduledDateTime = value;
        }

        /**
         * ��ȡfifthStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getFifthStationScheduledDateTime() {
            return fifthStationScheduledDateTime;
        }

        /**
         * ����fifthStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setFifthStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.fifthStationScheduledDateTime = value;
        }

        /**
         * ��ȡsixthStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getSixthStationScheduledDateTime() {
            return sixthStationScheduledDateTime;
        }

        /**
         * ����sixthStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setSixthStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.sixthStationScheduledDateTime = value;
        }

        /**
         * ��ȡoriginStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getOriginStationScheduledDateTime() {
            return originStationScheduledDateTime;
        }

        /**
         * ����originStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setOriginStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.originStationScheduledDateTime = value;
        }

        /**
         * ��ȡdestinationStationScheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getDestinationStationScheduledDateTime() {
            return destinationStationScheduledDateTime;
        }

        /**
         * ����destinationStationScheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setDestinationStationScheduledDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.destinationStationScheduledDateTime = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PortOfCallIATACode" type="{http://schema.ultra-as.com}PortOfCallIATACode" maxOccurs="7"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "portOfCallIATACode"
    })
    public static class PortsOfCall {

        @XmlElement(name = "PortOfCallIATACode", required = true, nillable = true)
        protected List<String> portOfCallIATACode;

        /**
         * Gets the value of the portOfCallIATACode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the portOfCallIATACode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPortOfCallIATACode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPortOfCallIATACode() {
            if (portOfCallIATACode == null) {
                portOfCallIATACode = new ArrayList<String>();
            }
            return this.portOfCallIATACode;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="CarrierIATACode" type="{http://schema.ultra-as.com}CarrierIATACode" minOccurs="0"/>
     *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carrierIATACode",
        "flightIdentity"
    })
    public static class Public {

        @XmlElementRef(name = "CarrierIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> carrierIATACode;
        @XmlElementRef(name = "FlightIdentity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightIdentity;

        /**
         * ��ȡcarrierIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCarrierIATACode() {
            return carrierIATACode;
        }

        /**
         * ����carrierIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCarrierIATACode(JAXBElement<String> value) {
            this.carrierIATACode = value;
        }

        /**
         * ��ȡflightIdentity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightIdentity() {
            return flightIdentity;
        }

        /**
         * ����flightIdentity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightIdentity(JAXBElement<String> value) {
            this.flightIdentity = value;
        }

    }

}

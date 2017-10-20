//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.01 ʱ�� 09:59:39 PM CST 
//


package com.ultra_as.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Collection of flight data common to multiple flight messages.
 * 
 * <p>FlightData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FlightData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aircraft" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="AircraftCallsign" type="{http://schema.ultra-as.com}AircraftCallsign" minOccurs="0"/>
 *                   &lt;element name="AircraftOwnerIATACode" type="{http://schema.ultra-as.com}AircraftOwnerIATACode" minOccurs="0"/>
 *                   &lt;element name="AircraftPassengerCapacity" type="{http://schema.ultra-as.com}AircraftPassengerCapacity" minOccurs="0"/>
 *                   &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration" minOccurs="0"/>
 *                   &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode" minOccurs="0"/>
 *                   &lt;element name="AircraftTypeICAOCode" type="{http://schema.ultra-as.com}AircraftTypeICAOCode" minOccurs="0"/>
 *                   &lt;element name="AircraftOperator" type="{http://schema.ultra-as.com}AircraftOperator" minOccurs="0"/>
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
 *                   &lt;element name="AircraftTerminalCode" type="{http://schema.ultra-as.com}AircraftTerminalCode" minOccurs="0"/>
 *                   &lt;element name="AirlineTerminalCode" type="{http://schema.ultra-as.com}AirlineTerminalCode" minOccurs="0"/>
 *                   &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode" minOccurs="0"/>
 *                   &lt;element name="BaggageMakeupPosition" type="{http://schema.ultra-as.com}BaggageMakeupPosition" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="BaggageReclaimCarousel" type="{http://schema.ultra-as.com}BaggageReclaimCarousel" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="BaggageTerminalCode" type="{http://schema.ultra-as.com}BaggageTerminalCode" minOccurs="0"/>
 *                   &lt;element name="BusIsRequired" type="{http://schema.ultra-as.com}BusIsRequired" minOccurs="0"/>
 *                   &lt;element name="Checkin" type="{http://schema.ultra-as.com}Checkin" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="Gate" type="{http://schema.ultra-as.com}Gate" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="PassengerTerminalCode" type="{http://schema.ultra-as.com}PassengerTerminalCode" minOccurs="0"/>
 *                   &lt;element name="Remark" type="{http://schema.ultra-as.com}Remark" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="RunwayID" type="{http://schema.ultra-as.com}RunwayID" minOccurs="0"/>
 *                   &lt;element name="SecureStandIsRequired" type="{http://schema.ultra-as.com}SecureStandIsRequired" minOccurs="0"/>
 *                   &lt;element name="StandPosition" type="{http://schema.ultra-as.com}StandPosition" minOccurs="0"/>
 *                   &lt;element name="SupplementaryInformation" type="{http://schema.ultra-as.com}SupplementaryInformation" minOccurs="0"/>
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
 *                   &lt;element name="AccountCode" type="{http://schema.ultra-as.com}AccountCode" minOccurs="0"/>
 *                   &lt;element name="CAACDelayDetails" type="{http://schema.ultra-as.com}CAACDelayDetails" minOccurs="0"/>
 *                   &lt;element name="CodeShareStatus" type="{http://schema.ultra-as.com}CodeShareStatus" minOccurs="0"/>
 *                   &lt;element name="DivertAirportIATACode" type="{http://schema.ultra-as.com}DivertAirportIATACode" minOccurs="0"/>
 *                   &lt;element name="FlightCancelCode" type="{http://schema.ultra-as.com}FlightCancelCode" minOccurs="0"/>
 *                   &lt;element name="FlightClassificationCode" type="{http://schema.ultra-as.com}FlightClassificationCode" minOccurs="0"/>
 *                   &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode" minOccurs="0"/>
 *                   &lt;element name="FlightOperatesOvernight" type="{http://schema.ultra-as.com}FlightOperatesOvernight" minOccurs="0"/>
 *                   &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" minOccurs="0"/>
 *                   &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" minOccurs="0"/>
 *                   &lt;element name="FlightStatusCode" type="{http://schema.ultra-as.com}FlightStatusCode" minOccurs="0"/>
 *                   &lt;element name="FlightTransitCode" type="{http://schema.ultra-as.com}FlightTransitCode" minOccurs="0"/>
 *                   &lt;element name="HandlingAgent" type="{http://schema.ultra-as.com}HandlingAgent" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="IrregularityDetails" type="{http://schema.ultra-as.com}IrregularityDetails" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="IsGeneralAviationFlight" type="{http://schema.ultra-as.com}IsGeneralAviationFlight" minOccurs="0"/>
 *                   &lt;element name="IsReturnFlight" type="{http://schema.ultra-as.com}IsReturnFlight" minOccurs="0"/>
 *                   &lt;element name="IsTransferFlight" type="{http://schema.ultra-as.com}IsTransferFlight" minOccurs="0"/>
 *                   &lt;element name="HasVIPs" type="{http://schema.ultra-as.com}HasVIPs" minOccurs="0"/>
 *                   &lt;element name="LinkedFlight" type="{http://schema.ultra-as.com}LinkedFlight" minOccurs="0"/>
 *                   &lt;element name="MasterFlight" type="{http://schema.ultra-as.com}MasterFlight" minOccurs="0"/>
 *                   &lt;element name="NewFlightReason" type="{http://schema.ultra-as.com}NewFlightReason" minOccurs="0"/>
 *                   &lt;element name="OperationType" type="{http://schema.ultra-as.com}OperationType" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="ShareFlight" type="{http://schema.ultra-as.com}ShareFlight" maxOccurs="6" minOccurs="0"/>
 *                   &lt;element name="TransferFlight" type="{http://schema.ultra-as.com}TransferFlight" maxOccurs="20" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Load" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="Cargo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TotalBaggageCount" type="{http://schema.ultra-as.com}TotalBaggageCount" minOccurs="0"/>
 *                             &lt;element name="TotalBaggageWeight" type="{http://schema.ultra-as.com}TotalBaggageWeight" minOccurs="0"/>
 *                             &lt;element name="TotalFreightWeight" type="{http://schema.ultra-as.com}TotalFreightWeight" minOccurs="0"/>
 *                             &lt;element name="TotalLoadWeight" type="{http://schema.ultra-as.com}TotalLoadWeight" minOccurs="0"/>
 *                             &lt;element name="TotalMailWeight" type="{http://schema.ultra-as.com}TotalMailWeight" minOccurs="0"/>
 *                             &lt;element name="TransferBaggageCount" type="{http://schema.ultra-as.com}TransferBaggageCount" minOccurs="0"/>
 *                             &lt;element name="TransferBaggageWeight" type="{http://schema.ultra-as.com}TransferBaggageWeight" minOccurs="0"/>
 *                             &lt;element name="TransferCargoWeight" type="{http://schema.ultra-as.com}TransferCargoWeight" minOccurs="0"/>
 *                             &lt;element name="TransferMailWeight" type="{http://schema.ultra-as.com}TransferMailWeight" minOccurs="0"/>
 *                             &lt;element name="TransitBaggageCount" type="{http://schema.ultra-as.com}TransitBaggageCount" minOccurs="0"/>
 *                             &lt;element name="TransitBaggageWeight" type="{http://schema.ultra-as.com}TransitBaggageWeight" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PassengerCounts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AdultPassengerCount" type="{http://schema.ultra-as.com}AdultPassengerCount" minOccurs="0"/>
 *                             &lt;element name="BusinessClassPassengerCount" type="{http://schema.ultra-as.com}BusinessClassPassengerCount" minOccurs="0"/>
 *                             &lt;element name="ChildPassengerCount" type="{http://schema.ultra-as.com}ChildPassengerCount" minOccurs="0"/>
 *                             &lt;element name="DomesticPassengerCount" type="{http://schema.ultra-as.com}DomesticPassengerCount" minOccurs="0"/>
 *                             &lt;element name="EconomyClassPassengerCount" type="{http://schema.ultra-as.com}EconomyClassPassengerCount" minOccurs="0"/>
 *                             &lt;element name="FirstClassPassengerCount" type="{http://schema.ultra-as.com}FirstClassPassengerCount" minOccurs="0"/>
 *                             &lt;element name="InfantPassengerCount" type="{http://schema.ultra-as.com}InfantPassengerCount" minOccurs="0"/>
 *                             &lt;element name="InternationalPassengerCount" type="{http://schema.ultra-as.com}InternationalPassengerCount" minOccurs="0"/>
 *                             &lt;element name="LocalPassengerCount" type="{http://schema.ultra-as.com}LocalPassengerCount" minOccurs="0"/>
 *                             &lt;element name="NonTransferPassengerCount" type="{http://schema.ultra-as.com}NonTransferPassengerCount" minOccurs="0"/>
 *                             &lt;element name="TotalPassengerCount" type="{http://schema.ultra-as.com}TotalPassengerCount" minOccurs="0"/>
 *                             &lt;element name="TransferPassengerCount" type="{http://schema.ultra-as.com}TransferPassengerCount" minOccurs="0"/>
 *                             &lt;element name="TransitPassengerCount" type="{http://schema.ultra-as.com}TransitPassengerCount" minOccurs="0"/>
 *                             &lt;element name="WheelchairPassengerCount" type="{http://schema.ultra-as.com}WheelchairPassengerCount" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TotalCrewCount" type="{http://schema.ultra-as.com}TotalCrewCount" minOccurs="0"/>
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
 *                   &lt;element name="ActualOffBlocksDateTime" type="{http://schema.ultra-as.com}ActualOffBlocksDateTime" minOccurs="0"/>
 *                   &lt;element name="ActualOnBlocksDateTime" type="{http://schema.ultra-as.com}ActualOnBlocksDateTime" minOccurs="0"/>
 *                   &lt;element name="EstimatedDateTime" type="{http://schema.ultra-as.com}EstimatedDateTime" minOccurs="0"/>
 *                   &lt;element name="EstimatedFlightDuration" type="{http://schema.ultra-as.com}EstimatedFlightDuration" minOccurs="0"/>
 *                   &lt;element name="FinalApproachDateTime" type="{http://schema.ultra-as.com}FinalApproachDateTime" minOccurs="0"/>
 *                   &lt;element name="LatestKnownDateTime" type="{http://schema.ultra-as.com}LatestKnownDateTime" minOccurs="0"/>
 *                   &lt;element name="LatestKnownDateTimeSource" type="{http://schema.ultra-as.com}LatestKnownDateTimeSource" minOccurs="0"/>
 *                   &lt;element name="NextInformationDateTime" type="{http://schema.ultra-as.com}NextInformationDateTime" minOccurs="0"/>
 *                   &lt;element name="NextStationActualDateTime" type="{http://schema.ultra-as.com}NextStationActualDateTime" minOccurs="0"/>
 *                   &lt;element name="NextStationEstimatedDateTime" type="{http://schema.ultra-as.com}NextStationEstimatedDateTime" minOccurs="0"/>
 *                   &lt;element name="NextStationScheduledDateTime" type="{http://schema.ultra-as.com}NextStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="PreviousStationAirborneDateTime" type="{http://schema.ultra-as.com}PreviousStationAirborneDateTime" minOccurs="0"/>
 *                   &lt;element name="PreviousStationEstimatedDateTime" type="{http://schema.ultra-as.com}PreviousStationEstimatedDateTime" minOccurs="0"/>
 *                   &lt;element name="PreviousStationScheduledDateTime" type="{http://schema.ultra-as.com}PreviousStationScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="ScheduledDateTime" type="{http://schema.ultra-as.com}ScheduledDateTime" minOccurs="0"/>
 *                   &lt;element name="TenMileOutDateTime" type="{http://schema.ultra-as.com}TenMileOutDateTime" minOccurs="0"/>
 *                   &lt;element name="WheelsDownDateTime" type="{http://schema.ultra-as.com}WheelsDownDateTime" minOccurs="0"/>
 *                   &lt;element name="WheelsUpDateTime" type="{http://schema.ultra-as.com}WheelsUpDateTime" minOccurs="0"/>
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
 *                   &lt;element name="PortOfCallICAOCode" type="{http://schema.ultra-as.com}PortOfCallICAOCode" maxOccurs="7" minOccurs="0"/>
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
 *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
 *                   &lt;element name="PublicCarrierCode" type="{http://schema.ultra-as.com}PublicCarrierCode" minOccurs="0"/>
 *                   &lt;element name="PublicDateTime" type="{http://schema.ultra-as.com}PublicDateTime" minOccurs="0"/>
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
@XmlType(name = "FlightData", propOrder = {
    "aircraft",
    "airport",
    "flight",
    "load",
    "operationalTimes",
    "portsOfCall",
    "_public"
})
public class FlightData {

    @XmlElementRef(name = "Aircraft", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightData.Aircraft> aircraft;
    @XmlElementRef(name = "Airport", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightData.Airport> airport;
    @XmlElementRef(name = "Flight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightData.Flight> flight;
    @XmlElementRef(name = "Load", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightData.Load> load;
    @XmlElementRef(name = "OperationalTimes", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightData.OperationalTimes> operationalTimes;
    @XmlElementRef(name = "PortsOfCall", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightData.PortsOfCall> portsOfCall;
    @XmlElementRef(name = "Public", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightData.Public> _public;

    /**
     * ��ȡaircraft���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Aircraft }{@code >}
     *     
     */
    public JAXBElement<FlightData.Aircraft> getAircraft() {
        return aircraft;
    }

    /**
     * ����aircraft���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Aircraft }{@code >}
     *     
     */
    public void setAircraft(JAXBElement<FlightData.Aircraft> value) {
        this.aircraft = value;
    }

    /**
     * ��ȡairport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Airport }{@code >}
     *     
     */
    public JAXBElement<FlightData.Airport> getAirport() {
        return airport;
    }

    /**
     * ����airport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Airport }{@code >}
     *     
     */
    public void setAirport(JAXBElement<FlightData.Airport> value) {
        this.airport = value;
    }

    /**
     * ��ȡflight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Flight }{@code >}
     *     
     */
    public JAXBElement<FlightData.Flight> getFlight() {
        return flight;
    }

    /**
     * ����flight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Flight }{@code >}
     *     
     */
    public void setFlight(JAXBElement<FlightData.Flight> value) {
        this.flight = value;
    }

    /**
     * ��ȡload���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Load }{@code >}
     *     
     */
    public JAXBElement<FlightData.Load> getLoad() {
        return load;
    }

    /**
     * ����load���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Load }{@code >}
     *     
     */
    public void setLoad(JAXBElement<FlightData.Load> value) {
        this.load = value;
    }

    /**
     * ��ȡoperationalTimes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightData.OperationalTimes }{@code >}
     *     
     */
    public JAXBElement<FlightData.OperationalTimes> getOperationalTimes() {
        return operationalTimes;
    }

    /**
     * ����operationalTimes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightData.OperationalTimes }{@code >}
     *     
     */
    public void setOperationalTimes(JAXBElement<FlightData.OperationalTimes> value) {
        this.operationalTimes = value;
    }

    /**
     * ��ȡportsOfCall���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightData.PortsOfCall }{@code >}
     *     
     */
    public JAXBElement<FlightData.PortsOfCall> getPortsOfCall() {
        return portsOfCall;
    }

    /**
     * ����portsOfCall���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightData.PortsOfCall }{@code >}
     *     
     */
    public void setPortsOfCall(JAXBElement<FlightData.PortsOfCall> value) {
        this.portsOfCall = value;
    }

    /**
     * ��ȡpublic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Public }{@code >}
     *     
     */
    public JAXBElement<FlightData.Public> getPublic() {
        return _public;
    }

    /**
     * ����public���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightData.Public }{@code >}
     *     
     */
    public void setPublic(JAXBElement<FlightData.Public> value) {
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
     *         &lt;element name="AircraftCallsign" type="{http://schema.ultra-as.com}AircraftCallsign" minOccurs="0"/>
     *         &lt;element name="AircraftOwnerIATACode" type="{http://schema.ultra-as.com}AircraftOwnerIATACode" minOccurs="0"/>
     *         &lt;element name="AircraftPassengerCapacity" type="{http://schema.ultra-as.com}AircraftPassengerCapacity" minOccurs="0"/>
     *         &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration" minOccurs="0"/>
     *         &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode" minOccurs="0"/>
     *         &lt;element name="AircraftTypeICAOCode" type="{http://schema.ultra-as.com}AircraftTypeICAOCode" minOccurs="0"/>
     *         &lt;element name="AircraftOperator" type="{http://schema.ultra-as.com}AircraftOperator" minOccurs="0"/>
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
        "aircraftCallsign",
        "aircraftOwnerIATACode",
        "aircraftPassengerCapacity",
        "aircraftRegistration",
        "aircraftSubtypeIATACode",
        "aircraftTypeICAOCode",
        "aircraftOperator"
    })
    public static class Aircraft {

        @XmlElementRef(name = "AircraftCallsign", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftCallsign;
        @XmlElementRef(name = "AircraftOwnerIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftOwnerIATACode;
        @XmlElementRef(name = "AircraftPassengerCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> aircraftPassengerCapacity;
        @XmlElementRef(name = "AircraftRegistration", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftRegistration;
        @XmlElementRef(name = "AircraftSubtypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftSubtypeIATACode;
        @XmlElementRef(name = "AircraftTypeICAOCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftTypeICAOCode;
        @XmlElementRef(name = "AircraftOperator", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftOperator;

        /**
         * ��ȡaircraftCallsign���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftCallsign() {
            return aircraftCallsign;
        }

        /**
         * ����aircraftCallsign���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftCallsign(JAXBElement<String> value) {
            this.aircraftCallsign = value;
        }

        /**
         * ��ȡaircraftOwnerIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftOwnerIATACode() {
            return aircraftOwnerIATACode;
        }

        /**
         * ����aircraftOwnerIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftOwnerIATACode(JAXBElement<String> value) {
            this.aircraftOwnerIATACode = value;
        }

        /**
         * ��ȡaircraftPassengerCapacity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getAircraftPassengerCapacity() {
            return aircraftPassengerCapacity;
        }

        /**
         * ����aircraftPassengerCapacity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setAircraftPassengerCapacity(JAXBElement<Integer> value) {
            this.aircraftPassengerCapacity = value;
        }

        /**
         * ��ȡaircraftRegistration���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftRegistration() {
            return aircraftRegistration;
        }

        /**
         * ����aircraftRegistration���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftRegistration(JAXBElement<String> value) {
            this.aircraftRegistration = value;
        }

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

        /**
         * ��ȡaircraftTypeICAOCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftTypeICAOCode() {
            return aircraftTypeICAOCode;
        }

        /**
         * ����aircraftTypeICAOCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftTypeICAOCode(JAXBElement<String> value) {
            this.aircraftTypeICAOCode = value;
        }

        /**
         * ��ȡaircraftOperator���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftOperator() {
            return aircraftOperator;
        }

        /**
         * ����aircraftOperator���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftOperator(JAXBElement<String> value) {
            this.aircraftOperator = value;
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
     *         &lt;element name="AircraftTerminalCode" type="{http://schema.ultra-as.com}AircraftTerminalCode" minOccurs="0"/>
     *         &lt;element name="AirlineTerminalCode" type="{http://schema.ultra-as.com}AirlineTerminalCode" minOccurs="0"/>
     *         &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode" minOccurs="0"/>
     *         &lt;element name="BaggageMakeupPosition" type="{http://schema.ultra-as.com}BaggageMakeupPosition" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="BaggageReclaimCarousel" type="{http://schema.ultra-as.com}BaggageReclaimCarousel" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="BaggageTerminalCode" type="{http://schema.ultra-as.com}BaggageTerminalCode" minOccurs="0"/>
     *         &lt;element name="BusIsRequired" type="{http://schema.ultra-as.com}BusIsRequired" minOccurs="0"/>
     *         &lt;element name="Checkin" type="{http://schema.ultra-as.com}Checkin" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="Gate" type="{http://schema.ultra-as.com}Gate" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="PassengerTerminalCode" type="{http://schema.ultra-as.com}PassengerTerminalCode" minOccurs="0"/>
     *         &lt;element name="Remark" type="{http://schema.ultra-as.com}Remark" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="RunwayID" type="{http://schema.ultra-as.com}RunwayID" minOccurs="0"/>
     *         &lt;element name="SecureStandIsRequired" type="{http://schema.ultra-as.com}SecureStandIsRequired" minOccurs="0"/>
     *         &lt;element name="StandPosition" type="{http://schema.ultra-as.com}StandPosition" minOccurs="0"/>
     *         &lt;element name="SupplementaryInformation" type="{http://schema.ultra-as.com}SupplementaryInformation" minOccurs="0"/>
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
        "aircraftTerminalCode",
        "airlineTerminalCode",
        "airportIATACode",
        "baggageMakeupPosition",
        "baggageReclaimCarousel",
        "baggageTerminalCode",
        "busIsRequired",
        "checkin",
        "gate",
        "passengerTerminalCode",
        "remark",
        "runwayID",
        "secureStandIsRequired",
        "standPosition",
        "supplementaryInformation"
    })
    public static class Airport {

        @XmlElementRef(name = "AircraftTerminalCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftTerminalCode;
        @XmlElementRef(name = "AirlineTerminalCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> airlineTerminalCode;
        @XmlElement(name = "AirportIATACode")
        protected String airportIATACode;
        @XmlElement(name = "BaggageMakeupPosition", nillable = true)
        protected List<BaggageMakeupPosition> baggageMakeupPosition;
        @XmlElement(name = "BaggageReclaimCarousel", nillable = true)
        protected List<BaggageReclaimCarousel> baggageReclaimCarousel;
        @XmlElementRef(name = "BaggageTerminalCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> baggageTerminalCode;
        @XmlElementRef(name = "BusIsRequired", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> busIsRequired;
        @XmlElement(name = "Checkin", nillable = true)
        protected List<Checkin> checkin;
        @XmlElement(name = "Gate", nillable = true)
        protected List<Gate> gate;
        @XmlElementRef(name = "PassengerTerminalCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> passengerTerminalCode;
        @XmlElement(name = "Remark", nillable = true)
        protected List<Remark> remark;
        @XmlElementRef(name = "RunwayID", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> runwayID;
        @XmlElementRef(name = "SecureStandIsRequired", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> secureStandIsRequired;
        @XmlElementRef(name = "StandPosition", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> standPosition;
        @XmlElementRef(name = "SupplementaryInformation", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<SupplementaryInformation> supplementaryInformation;

        /**
         * ��ȡaircraftTerminalCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftTerminalCode() {
            return aircraftTerminalCode;
        }

        /**
         * ����aircraftTerminalCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftTerminalCode(JAXBElement<String> value) {
            this.aircraftTerminalCode = value;
        }

        /**
         * ��ȡairlineTerminalCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAirlineTerminalCode() {
            return airlineTerminalCode;
        }

        /**
         * ����airlineTerminalCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAirlineTerminalCode(JAXBElement<String> value) {
            this.airlineTerminalCode = value;
        }

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
         * {@link BaggageMakeupPosition }
         * 
         * 
         */
        public List<BaggageMakeupPosition> getBaggageMakeupPosition() {
            if (baggageMakeupPosition == null) {
                baggageMakeupPosition = new ArrayList<BaggageMakeupPosition>();
            }
            return this.baggageMakeupPosition;
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
         * {@link BaggageReclaimCarousel }
         * 
         * 
         */
        public List<BaggageReclaimCarousel> getBaggageReclaimCarousel() {
            if (baggageReclaimCarousel == null) {
                baggageReclaimCarousel = new ArrayList<BaggageReclaimCarousel>();
            }
            return this.baggageReclaimCarousel;
        }

        /**
         * ��ȡbaggageTerminalCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBaggageTerminalCode() {
            return baggageTerminalCode;
        }

        /**
         * ����baggageTerminalCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBaggageTerminalCode(JAXBElement<String> value) {
            this.baggageTerminalCode = value;
        }

        /**
         * ��ȡbusIsRequired���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getBusIsRequired() {
            return busIsRequired;
        }

        /**
         * ����busIsRequired���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setBusIsRequired(JAXBElement<Boolean> value) {
            this.busIsRequired = value;
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
         * {@link Checkin }
         * 
         * 
         */
        public List<Checkin> getCheckin() {
            if (checkin == null) {
                checkin = new ArrayList<Checkin>();
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
         * {@link Gate }
         * 
         * 
         */
        public List<Gate> getGate() {
            if (gate == null) {
                gate = new ArrayList<Gate>();
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
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Remark }
         * 
         * 
         */
        public List<Remark> getRemark() {
            if (remark == null) {
                remark = new ArrayList<Remark>();
            }
            return this.remark;
        }

        /**
         * ��ȡrunwayID���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRunwayID() {
            return runwayID;
        }

        /**
         * ����runwayID���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRunwayID(JAXBElement<String> value) {
            this.runwayID = value;
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
         * ��ȡsupplementaryInformation���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SupplementaryInformation }{@code >}
         *     
         */
        public JAXBElement<SupplementaryInformation> getSupplementaryInformation() {
            return supplementaryInformation;
        }

        /**
         * ����supplementaryInformation���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SupplementaryInformation }{@code >}
         *     
         */
        public void setSupplementaryInformation(JAXBElement<SupplementaryInformation> value) {
            this.supplementaryInformation = value;
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
     *         &lt;element name="AccountCode" type="{http://schema.ultra-as.com}AccountCode" minOccurs="0"/>
     *         &lt;element name="CAACDelayDetails" type="{http://schema.ultra-as.com}CAACDelayDetails" minOccurs="0"/>
     *         &lt;element name="CodeShareStatus" type="{http://schema.ultra-as.com}CodeShareStatus" minOccurs="0"/>
     *         &lt;element name="DivertAirportIATACode" type="{http://schema.ultra-as.com}DivertAirportIATACode" minOccurs="0"/>
     *         &lt;element name="FlightCancelCode" type="{http://schema.ultra-as.com}FlightCancelCode" minOccurs="0"/>
     *         &lt;element name="FlightClassificationCode" type="{http://schema.ultra-as.com}FlightClassificationCode" minOccurs="0"/>
     *         &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode" minOccurs="0"/>
     *         &lt;element name="FlightOperatesOvernight" type="{http://schema.ultra-as.com}FlightOperatesOvernight" minOccurs="0"/>
     *         &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" minOccurs="0"/>
     *         &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" minOccurs="0"/>
     *         &lt;element name="FlightStatusCode" type="{http://schema.ultra-as.com}FlightStatusCode" minOccurs="0"/>
     *         &lt;element name="FlightTransitCode" type="{http://schema.ultra-as.com}FlightTransitCode" minOccurs="0"/>
     *         &lt;element name="HandlingAgent" type="{http://schema.ultra-as.com}HandlingAgent" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="IrregularityDetails" type="{http://schema.ultra-as.com}IrregularityDetails" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="IsGeneralAviationFlight" type="{http://schema.ultra-as.com}IsGeneralAviationFlight" minOccurs="0"/>
     *         &lt;element name="IsReturnFlight" type="{http://schema.ultra-as.com}IsReturnFlight" minOccurs="0"/>
     *         &lt;element name="IsTransferFlight" type="{http://schema.ultra-as.com}IsTransferFlight" minOccurs="0"/>
     *         &lt;element name="HasVIPs" type="{http://schema.ultra-as.com}HasVIPs" minOccurs="0"/>
     *         &lt;element name="LinkedFlight" type="{http://schema.ultra-as.com}LinkedFlight" minOccurs="0"/>
     *         &lt;element name="MasterFlight" type="{http://schema.ultra-as.com}MasterFlight" minOccurs="0"/>
     *         &lt;element name="NewFlightReason" type="{http://schema.ultra-as.com}NewFlightReason" minOccurs="0"/>
     *         &lt;element name="OperationType" type="{http://schema.ultra-as.com}OperationType" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="ShareFlight" type="{http://schema.ultra-as.com}ShareFlight" maxOccurs="6" minOccurs="0"/>
     *         &lt;element name="TransferFlight" type="{http://schema.ultra-as.com}TransferFlight" maxOccurs="20" minOccurs="0"/>
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
        "accountCode",
        "caacDelayDetails",
        "codeShareStatus",
        "divertAirportIATACode",
        "flightCancelCode",
        "flightClassificationCode",
        "flightNatureCode",
        "flightOperatesOvernight",
        "flightSectorCode",
        "flightServiceTypeIATACode",
        "flightStatusCode",
        "flightTransitCode",
        "handlingAgent",
        "irregularityDetails",
        "isGeneralAviationFlight",
        "isReturnFlight",
        "isTransferFlight",
        "hasVIPs",
        "linkedFlight",
        "masterFlight",
        "newFlightReason",
        "operationType",
        "shareFlight",
        "transferFlight"
    })
    public static class Flight {

        @XmlElementRef(name = "AccountCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> accountCode;
        @XmlElementRef(name = "CAACDelayDetails", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<CAACDelayDetails> caacDelayDetails;
        @XmlElementRef(name = "CodeShareStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> codeShareStatus;
        @XmlElementRef(name = "DivertAirportIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> divertAirportIATACode;
        @XmlElementRef(name = "FlightCancelCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightCancelCode> flightCancelCode;
        @XmlElementRef(name = "FlightClassificationCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightClassificationCode;
        @XmlElementRef(name = "FlightNatureCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightNatureCode;
        @XmlElementRef(name = "FlightOperatesOvernight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> flightOperatesOvernight;
        @XmlElementRef(name = "FlightSectorCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightSectorCode> flightSectorCode;
        @XmlElementRef(name = "FlightServiceTypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightServiceTypeIATACode;
        @XmlElementRef(name = "FlightStatusCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightStatusCode;
        @XmlElementRef(name = "FlightTransitCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightTransitCode> flightTransitCode;
        @XmlElement(name = "HandlingAgent", nillable = true)
        protected List<HandlingAgent> handlingAgent;
        @XmlElement(name = "IrregularityDetails", nillable = true)
        protected List<IrregularityDetails> irregularityDetails;
        @XmlElementRef(name = "IsGeneralAviationFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> isGeneralAviationFlight;
        @XmlElementRef(name = "IsReturnFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> isReturnFlight;
        @XmlElementRef(name = "IsTransferFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> isTransferFlight;
        @XmlElementRef(name = "HasVIPs", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> hasVIPs;
        @XmlElementRef(name = "LinkedFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<LinkedFlight> linkedFlight;
        @XmlElementRef(name = "MasterFlight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<MasterFlight> masterFlight;
        
        @XmlElementRef(name = "NewFlightReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> newFlightReason;
        @XmlElement(name = "OperationType", nillable = true)
        protected List<OperationType> operationType;
        @XmlElement(name = "ShareFlight", nillable = true)
        protected List<ShareFlight> shareFlight;
        @XmlElement(name = "TransferFlight")
        protected List<TransferFlight> transferFlight;

        /**
         * ��ȡaccountCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAccountCode() {
            return accountCode;
        }

        /**
         * ����accountCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAccountCode(JAXBElement<String> value) {
            this.accountCode = value;
        }

        /**
         * ��ȡcaacDelayDetails���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link CAACDelayDetails }{@code >}
         *     
         */
        public JAXBElement<CAACDelayDetails> getCAACDelayDetails() {
            return caacDelayDetails;
        }

        /**
         * ����caacDelayDetails���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link CAACDelayDetails }{@code >}
         *     
         */
        public void setCAACDelayDetails(JAXBElement<CAACDelayDetails> value) {
            this.caacDelayDetails = value;
        }

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
         * ��ȡdivertAirportIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDivertAirportIATACode() {
            return divertAirportIATACode;
        }

        /**
         * ����divertAirportIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDivertAirportIATACode(JAXBElement<String> value) {
            this.divertAirportIATACode = value;
        }

        /**
         * ��ȡflightCancelCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FlightCancelCode }{@code >}
         *     
         */
        public JAXBElement<FlightCancelCode> getFlightCancelCode() {
            return flightCancelCode;
        }

        /**
         * ����flightCancelCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FlightCancelCode }{@code >}
         *     
         */
        public void setFlightCancelCode(JAXBElement<FlightCancelCode> value) {
            this.flightCancelCode = value;
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
         * ��ȡflightNatureCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightNatureCode() {
            return flightNatureCode;
        }

        /**
         * ����flightNatureCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightNatureCode(JAXBElement<String> value) {
            this.flightNatureCode = value;
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
         * ��ȡflightStatusCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightStatusCode() {
            return flightStatusCode;
        }

        /**
         * ����flightStatusCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightStatusCode(JAXBElement<String> value) {
            this.flightStatusCode = value;
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
         * Gets the value of the irregularityDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the irregularityDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIrregularityDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IrregularityDetails }
         * 
         * 
         */
        public List<IrregularityDetails> getIrregularityDetails() {
            if (irregularityDetails == null) {
                irregularityDetails = new ArrayList<IrregularityDetails>();
            }
            return this.irregularityDetails;
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
         * ��ȡisReturnFlight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getIsReturnFlight() {
            return isReturnFlight;
        }

        /**
         * ����isReturnFlight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setIsReturnFlight(JAXBElement<Boolean> value) {
            this.isReturnFlight = value;
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
         * ��ȡhasVIPs���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getHasVIPs() {
            return hasVIPs;
        }

        /**
         * ����hasVIPs���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setHasVIPs(JAXBElement<Boolean> value) {
            this.hasVIPs = value;
        }

        /**
         * ��ȡlinkedFlight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link LinkedFlight }{@code >}
         *     
         */
        public JAXBElement<LinkedFlight> getLinkedFlight() {
            return linkedFlight;
        }

        /**
         * ����linkedFlight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link LinkedFlight }{@code >}
         *     
         */
        public void setLinkedFlight(JAXBElement<LinkedFlight> value) {
            this.linkedFlight = value;
        }

        /**
         * ��ȡmasterFlight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link MasterFlight }{@code >}
         *     
         */
        public JAXBElement<MasterFlight> getMasterFlight() {
            return masterFlight;
        }

        /**
         * ����masterFlight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link MasterFlight }{@code >}
         *     
         */
        public void setMasterFlight(JAXBElement<MasterFlight> value) {
            this.masterFlight = value;
        }

        /**
         * ��ȡnewFlightReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNewFlightReason() {
            return newFlightReason;
        }

        /**
         * ����newFlightReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNewFlightReason(JAXBElement<String> value) {
            this.newFlightReason = value;
        }

        /**
         * Gets the value of the operationType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationType }
         * 
         * 
         */
        public List<OperationType> getOperationType() {
            if (operationType == null) {
                operationType = new ArrayList<OperationType>();
            }
            return this.operationType;
        }

        /**
         * Gets the value of the shareFlight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shareFlight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShareFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ShareFlight }
         * 
         * 
         */
        public List<ShareFlight> getShareFlight() {
            if (shareFlight == null) {
                shareFlight = new ArrayList<ShareFlight>();
            }
            return this.shareFlight;
        }

        /**
         * Gets the value of the transferFlight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transferFlight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransferFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TransferFlight }
         * 
         * 
         */
        public List<TransferFlight> getTransferFlight() {
            if (transferFlight == null) {
                transferFlight = new ArrayList<TransferFlight>();
            }
            return this.transferFlight;
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
     *         &lt;element name="Cargo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TotalBaggageCount" type="{http://schema.ultra-as.com}TotalBaggageCount" minOccurs="0"/>
     *                   &lt;element name="TotalBaggageWeight" type="{http://schema.ultra-as.com}TotalBaggageWeight" minOccurs="0"/>
     *                   &lt;element name="TotalFreightWeight" type="{http://schema.ultra-as.com}TotalFreightWeight" minOccurs="0"/>
     *                   &lt;element name="TotalLoadWeight" type="{http://schema.ultra-as.com}TotalLoadWeight" minOccurs="0"/>
     *                   &lt;element name="TotalMailWeight" type="{http://schema.ultra-as.com}TotalMailWeight" minOccurs="0"/>
     *                   &lt;element name="TransferBaggageCount" type="{http://schema.ultra-as.com}TransferBaggageCount" minOccurs="0"/>
     *                   &lt;element name="TransferBaggageWeight" type="{http://schema.ultra-as.com}TransferBaggageWeight" minOccurs="0"/>
     *                   &lt;element name="TransferCargoWeight" type="{http://schema.ultra-as.com}TransferCargoWeight" minOccurs="0"/>
     *                   &lt;element name="TransferMailWeight" type="{http://schema.ultra-as.com}TransferMailWeight" minOccurs="0"/>
     *                   &lt;element name="TransitBaggageCount" type="{http://schema.ultra-as.com}TransitBaggageCount" minOccurs="0"/>
     *                   &lt;element name="TransitBaggageWeight" type="{http://schema.ultra-as.com}TransitBaggageWeight" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PassengerCounts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AdultPassengerCount" type="{http://schema.ultra-as.com}AdultPassengerCount" minOccurs="0"/>
     *                   &lt;element name="BusinessClassPassengerCount" type="{http://schema.ultra-as.com}BusinessClassPassengerCount" minOccurs="0"/>
     *                   &lt;element name="ChildPassengerCount" type="{http://schema.ultra-as.com}ChildPassengerCount" minOccurs="0"/>
     *                   &lt;element name="DomesticPassengerCount" type="{http://schema.ultra-as.com}DomesticPassengerCount" minOccurs="0"/>
     *                   &lt;element name="EconomyClassPassengerCount" type="{http://schema.ultra-as.com}EconomyClassPassengerCount" minOccurs="0"/>
     *                   &lt;element name="FirstClassPassengerCount" type="{http://schema.ultra-as.com}FirstClassPassengerCount" minOccurs="0"/>
     *                   &lt;element name="InfantPassengerCount" type="{http://schema.ultra-as.com}InfantPassengerCount" minOccurs="0"/>
     *                   &lt;element name="InternationalPassengerCount" type="{http://schema.ultra-as.com}InternationalPassengerCount" minOccurs="0"/>
     *                   &lt;element name="LocalPassengerCount" type="{http://schema.ultra-as.com}LocalPassengerCount" minOccurs="0"/>
     *                   &lt;element name="NonTransferPassengerCount" type="{http://schema.ultra-as.com}NonTransferPassengerCount" minOccurs="0"/>
     *                   &lt;element name="TotalPassengerCount" type="{http://schema.ultra-as.com}TotalPassengerCount" minOccurs="0"/>
     *                   &lt;element name="TransferPassengerCount" type="{http://schema.ultra-as.com}TransferPassengerCount" minOccurs="0"/>
     *                   &lt;element name="TransitPassengerCount" type="{http://schema.ultra-as.com}TransitPassengerCount" minOccurs="0"/>
     *                   &lt;element name="WheelchairPassengerCount" type="{http://schema.ultra-as.com}WheelchairPassengerCount" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TotalCrewCount" type="{http://schema.ultra-as.com}TotalCrewCount" minOccurs="0"/>
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
        "cargo",
        "passengerCounts",
        "totalCrewCount"
    })
    public static class Load {

        @XmlElementRef(name = "Cargo", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightData.Load.Cargo> cargo;
        @XmlElementRef(name = "PassengerCounts", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightData.Load.PassengerCounts> passengerCounts;
        @XmlElementRef(name = "TotalCrewCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> totalCrewCount;

        /**
         * ��ȡcargo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FlightData.Load.Cargo }{@code >}
         *     
         */
        public JAXBElement<FlightData.Load.Cargo> getCargo() {
            return cargo;
        }

        /**
         * ����cargo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FlightData.Load.Cargo }{@code >}
         *     
         */
        public void setCargo(JAXBElement<FlightData.Load.Cargo> value) {
            this.cargo = value;
        }

        /**
         * ��ȡpassengerCounts���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FlightData.Load.PassengerCounts }{@code >}
         *     
         */
        public JAXBElement<FlightData.Load.PassengerCounts> getPassengerCounts() {
            return passengerCounts;
        }

        /**
         * ����passengerCounts���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FlightData.Load.PassengerCounts }{@code >}
         *     
         */
        public void setPassengerCounts(JAXBElement<FlightData.Load.PassengerCounts> value) {
            this.passengerCounts = value;
        }

        /**
         * ��ȡtotalCrewCount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getTotalCrewCount() {
            return totalCrewCount;
        }

        /**
         * ����totalCrewCount���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setTotalCrewCount(JAXBElement<Integer> value) {
            this.totalCrewCount = value;
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
         *         &lt;element name="TotalBaggageCount" type="{http://schema.ultra-as.com}TotalBaggageCount" minOccurs="0"/>
         *         &lt;element name="TotalBaggageWeight" type="{http://schema.ultra-as.com}TotalBaggageWeight" minOccurs="0"/>
         *         &lt;element name="TotalFreightWeight" type="{http://schema.ultra-as.com}TotalFreightWeight" minOccurs="0"/>
         *         &lt;element name="TotalLoadWeight" type="{http://schema.ultra-as.com}TotalLoadWeight" minOccurs="0"/>
         *         &lt;element name="TotalMailWeight" type="{http://schema.ultra-as.com}TotalMailWeight" minOccurs="0"/>
         *         &lt;element name="TransferBaggageCount" type="{http://schema.ultra-as.com}TransferBaggageCount" minOccurs="0"/>
         *         &lt;element name="TransferBaggageWeight" type="{http://schema.ultra-as.com}TransferBaggageWeight" minOccurs="0"/>
         *         &lt;element name="TransferCargoWeight" type="{http://schema.ultra-as.com}TransferCargoWeight" minOccurs="0"/>
         *         &lt;element name="TransferMailWeight" type="{http://schema.ultra-as.com}TransferMailWeight" minOccurs="0"/>
         *         &lt;element name="TransitBaggageCount" type="{http://schema.ultra-as.com}TransitBaggageCount" minOccurs="0"/>
         *         &lt;element name="TransitBaggageWeight" type="{http://schema.ultra-as.com}TransitBaggageWeight" minOccurs="0"/>
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
            "totalBaggageCount",
            "totalBaggageWeight",
            "totalFreightWeight",
            "totalLoadWeight",
            "totalMailWeight",
            "transferBaggageCount",
            "transferBaggageWeight",
            "transferCargoWeight",
            "transferMailWeight",
            "transitBaggageCount",
            "transitBaggageWeight"
        })
        public static class Cargo {

            @XmlElementRef(name = "TotalBaggageCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> totalBaggageCount;
            @XmlElementRef(name = "TotalBaggageWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> totalBaggageWeight;
            @XmlElementRef(name = "TotalFreightWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<BigInteger> totalFreightWeight;
            @XmlElementRef(name = "TotalLoadWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<BigInteger> totalLoadWeight;
            @XmlElementRef(name = "TotalMailWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> totalMailWeight;
            @XmlElementRef(name = "TransferBaggageCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> transferBaggageCount;
            @XmlElementRef(name = "TransferBaggageWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> transferBaggageWeight;
            @XmlElementRef(name = "TransferCargoWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> transferCargoWeight;
            @XmlElementRef(name = "TransferMailWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> transferMailWeight;
            @XmlElementRef(name = "TransitBaggageCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> transitBaggageCount;
            @XmlElementRef(name = "TransitBaggageWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> transitBaggageWeight;

            /**
             * ��ȡtotalBaggageCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTotalBaggageCount() {
                return totalBaggageCount;
            }

            /**
             * ����totalBaggageCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTotalBaggageCount(JAXBElement<Integer> value) {
                this.totalBaggageCount = value;
            }

            /**
             * ��ȡtotalBaggageWeight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTotalBaggageWeight() {
                return totalBaggageWeight;
            }

            /**
             * ����totalBaggageWeight���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTotalBaggageWeight(JAXBElement<Integer> value) {
                this.totalBaggageWeight = value;
            }

            /**
             * ��ȡtotalFreightWeight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             *     
             */
            public JAXBElement<BigInteger> getTotalFreightWeight() {
                return totalFreightWeight;
            }

            /**
             * ����totalFreightWeight���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             *     
             */
            public void setTotalFreightWeight(JAXBElement<BigInteger> value) {
                this.totalFreightWeight = value;
            }

            /**
             * ��ȡtotalLoadWeight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             *     
             */
            public JAXBElement<BigInteger> getTotalLoadWeight() {
                return totalLoadWeight;
            }

            /**
             * ����totalLoadWeight���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             *     
             */
            public void setTotalLoadWeight(JAXBElement<BigInteger> value) {
                this.totalLoadWeight = value;
            }

            /**
             * ��ȡtotalMailWeight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTotalMailWeight() {
                return totalMailWeight;
            }

            /**
             * ����totalMailWeight���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTotalMailWeight(JAXBElement<Integer> value) {
                this.totalMailWeight = value;
            }

            /**
             * ��ȡtransferBaggageCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTransferBaggageCount() {
                return transferBaggageCount;
            }

            /**
             * ����transferBaggageCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTransferBaggageCount(JAXBElement<Integer> value) {
                this.transferBaggageCount = value;
            }

            /**
             * ��ȡtransferBaggageWeight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTransferBaggageWeight() {
                return transferBaggageWeight;
            }

            /**
             * ����transferBaggageWeight���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTransferBaggageWeight(JAXBElement<Integer> value) {
                this.transferBaggageWeight = value;
            }

            /**
             * ��ȡtransferCargoWeight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTransferCargoWeight() {
                return transferCargoWeight;
            }

            /**
             * ����transferCargoWeight���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTransferCargoWeight(JAXBElement<Integer> value) {
                this.transferCargoWeight = value;
            }

            /**
             * ��ȡtransferMailWeight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTransferMailWeight() {
                return transferMailWeight;
            }

            /**
             * ����transferMailWeight���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTransferMailWeight(JAXBElement<Integer> value) {
                this.transferMailWeight = value;
            }

            /**
             * ��ȡtransitBaggageCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTransitBaggageCount() {
                return transitBaggageCount;
            }

            /**
             * ����transitBaggageCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTransitBaggageCount(JAXBElement<Integer> value) {
                this.transitBaggageCount = value;
            }

            /**
             * ��ȡtransitBaggageWeight���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTransitBaggageWeight() {
                return transitBaggageWeight;
            }

            /**
             * ����transitBaggageWeight���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTransitBaggageWeight(JAXBElement<Integer> value) {
                this.transitBaggageWeight = value;
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
         *         &lt;element name="AdultPassengerCount" type="{http://schema.ultra-as.com}AdultPassengerCount" minOccurs="0"/>
         *         &lt;element name="BusinessClassPassengerCount" type="{http://schema.ultra-as.com}BusinessClassPassengerCount" minOccurs="0"/>
         *         &lt;element name="ChildPassengerCount" type="{http://schema.ultra-as.com}ChildPassengerCount" minOccurs="0"/>
         *         &lt;element name="DomesticPassengerCount" type="{http://schema.ultra-as.com}DomesticPassengerCount" minOccurs="0"/>
         *         &lt;element name="EconomyClassPassengerCount" type="{http://schema.ultra-as.com}EconomyClassPassengerCount" minOccurs="0"/>
         *         &lt;element name="FirstClassPassengerCount" type="{http://schema.ultra-as.com}FirstClassPassengerCount" minOccurs="0"/>
         *         &lt;element name="InfantPassengerCount" type="{http://schema.ultra-as.com}InfantPassengerCount" minOccurs="0"/>
         *         &lt;element name="InternationalPassengerCount" type="{http://schema.ultra-as.com}InternationalPassengerCount" minOccurs="0"/>
         *         &lt;element name="LocalPassengerCount" type="{http://schema.ultra-as.com}LocalPassengerCount" minOccurs="0"/>
         *         &lt;element name="NonTransferPassengerCount" type="{http://schema.ultra-as.com}NonTransferPassengerCount" minOccurs="0"/>
         *         &lt;element name="TotalPassengerCount" type="{http://schema.ultra-as.com}TotalPassengerCount" minOccurs="0"/>
         *         &lt;element name="TransferPassengerCount" type="{http://schema.ultra-as.com}TransferPassengerCount" minOccurs="0"/>
         *         &lt;element name="TransitPassengerCount" type="{http://schema.ultra-as.com}TransitPassengerCount" minOccurs="0"/>
         *         &lt;element name="WheelchairPassengerCount" type="{http://schema.ultra-as.com}WheelchairPassengerCount" minOccurs="0"/>
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
            "adultPassengerCount",
            "businessClassPassengerCount",
            "childPassengerCount",
            "domesticPassengerCount",
            "economyClassPassengerCount",
            "firstClassPassengerCount",
            "infantPassengerCount",
            "internationalPassengerCount",
            "localPassengerCount",
            "nonTransferPassengerCount",
            "totalPassengerCount",
            "transferPassengerCount",
            "transitPassengerCount",
            "wheelchairPassengerCount"
        })
        public static class PassengerCounts {

            @XmlElementRef(name = "AdultPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> adultPassengerCount;
            @XmlElementRef(name = "BusinessClassPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> businessClassPassengerCount;
            @XmlElementRef(name = "ChildPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> childPassengerCount;
            @XmlElementRef(name = "DomesticPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> domesticPassengerCount;
            @XmlElementRef(name = "EconomyClassPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> economyClassPassengerCount;
            @XmlElementRef(name = "FirstClassPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> firstClassPassengerCount;
            @XmlElementRef(name = "InfantPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> infantPassengerCount;
            @XmlElementRef(name = "InternationalPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> internationalPassengerCount;
            @XmlElementRef(name = "LocalPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> localPassengerCount;
            @XmlElementRef(name = "NonTransferPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> nonTransferPassengerCount;
            @XmlElementRef(name = "TotalPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> totalPassengerCount;
            @XmlElementRef(name = "TransferPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> transferPassengerCount;
            @XmlElementRef(name = "TransitPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> transitPassengerCount;
            @XmlElementRef(name = "WheelchairPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> wheelchairPassengerCount;

            /**
             * ��ȡadultPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getAdultPassengerCount() {
                return adultPassengerCount;
            }

            /**
             * ����adultPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setAdultPassengerCount(JAXBElement<Integer> value) {
                this.adultPassengerCount = value;
            }

            /**
             * ��ȡbusinessClassPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getBusinessClassPassengerCount() {
                return businessClassPassengerCount;
            }

            /**
             * ����businessClassPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setBusinessClassPassengerCount(JAXBElement<Integer> value) {
                this.businessClassPassengerCount = value;
            }

            /**
             * ��ȡchildPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getChildPassengerCount() {
                return childPassengerCount;
            }

            /**
             * ����childPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setChildPassengerCount(JAXBElement<Integer> value) {
                this.childPassengerCount = value;
            }

            /**
             * ��ȡdomesticPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getDomesticPassengerCount() {
                return domesticPassengerCount;
            }

            /**
             * ����domesticPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setDomesticPassengerCount(JAXBElement<Integer> value) {
                this.domesticPassengerCount = value;
            }

            /**
             * ��ȡeconomyClassPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getEconomyClassPassengerCount() {
                return economyClassPassengerCount;
            }

            /**
             * ����economyClassPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setEconomyClassPassengerCount(JAXBElement<Integer> value) {
                this.economyClassPassengerCount = value;
            }

            /**
             * ��ȡfirstClassPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getFirstClassPassengerCount() {
                return firstClassPassengerCount;
            }

            /**
             * ����firstClassPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setFirstClassPassengerCount(JAXBElement<Integer> value) {
                this.firstClassPassengerCount = value;
            }

            /**
             * ��ȡinfantPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getInfantPassengerCount() {
                return infantPassengerCount;
            }

            /**
             * ����infantPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setInfantPassengerCount(JAXBElement<Integer> value) {
                this.infantPassengerCount = value;
            }

            /**
             * ��ȡinternationalPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getInternationalPassengerCount() {
                return internationalPassengerCount;
            }

            /**
             * ����internationalPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setInternationalPassengerCount(JAXBElement<Integer> value) {
                this.internationalPassengerCount = value;
            }

            /**
             * ��ȡlocalPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getLocalPassengerCount() {
                return localPassengerCount;
            }

            /**
             * ����localPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setLocalPassengerCount(JAXBElement<Integer> value) {
                this.localPassengerCount = value;
            }

            /**
             * ��ȡnonTransferPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getNonTransferPassengerCount() {
                return nonTransferPassengerCount;
            }

            /**
             * ����nonTransferPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setNonTransferPassengerCount(JAXBElement<Integer> value) {
                this.nonTransferPassengerCount = value;
            }

            /**
             * ��ȡtotalPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTotalPassengerCount() {
                return totalPassengerCount;
            }

            /**
             * ����totalPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTotalPassengerCount(JAXBElement<Integer> value) {
                this.totalPassengerCount = value;
            }

            /**
             * ��ȡtransferPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTransferPassengerCount() {
                return transferPassengerCount;
            }

            /**
             * ����transferPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTransferPassengerCount(JAXBElement<Integer> value) {
                this.transferPassengerCount = value;
            }

            /**
             * ��ȡtransitPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getTransitPassengerCount() {
                return transitPassengerCount;
            }

            /**
             * ����transitPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setTransitPassengerCount(JAXBElement<Integer> value) {
                this.transitPassengerCount = value;
            }

            /**
             * ��ȡwheelchairPassengerCount���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getWheelchairPassengerCount() {
                return wheelchairPassengerCount;
            }

            /**
             * ����wheelchairPassengerCount���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setWheelchairPassengerCount(JAXBElement<Integer> value) {
                this.wheelchairPassengerCount = value;
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
     *         &lt;element name="ActualOffBlocksDateTime" type="{http://schema.ultra-as.com}ActualOffBlocksDateTime" minOccurs="0"/>
     *         &lt;element name="ActualOnBlocksDateTime" type="{http://schema.ultra-as.com}ActualOnBlocksDateTime" minOccurs="0"/>
     *         &lt;element name="EstimatedDateTime" type="{http://schema.ultra-as.com}EstimatedDateTime" minOccurs="0"/>
     *         &lt;element name="EstimatedFlightDuration" type="{http://schema.ultra-as.com}EstimatedFlightDuration" minOccurs="0"/>
     *         &lt;element name="FinalApproachDateTime" type="{http://schema.ultra-as.com}FinalApproachDateTime" minOccurs="0"/>
     *         &lt;element name="LatestKnownDateTime" type="{http://schema.ultra-as.com}LatestKnownDateTime" minOccurs="0"/>
     *         &lt;element name="LatestKnownDateTimeSource" type="{http://schema.ultra-as.com}LatestKnownDateTimeSource" minOccurs="0"/>
     *         &lt;element name="NextInformationDateTime" type="{http://schema.ultra-as.com}NextInformationDateTime" minOccurs="0"/>
     *         &lt;element name="NextStationActualDateTime" type="{http://schema.ultra-as.com}NextStationActualDateTime" minOccurs="0"/>
     *         &lt;element name="NextStationEstimatedDateTime" type="{http://schema.ultra-as.com}NextStationEstimatedDateTime" minOccurs="0"/>
     *         &lt;element name="NextStationScheduledDateTime" type="{http://schema.ultra-as.com}NextStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="PreviousStationAirborneDateTime" type="{http://schema.ultra-as.com}PreviousStationAirborneDateTime" minOccurs="0"/>
     *         &lt;element name="PreviousStationEstimatedDateTime" type="{http://schema.ultra-as.com}PreviousStationEstimatedDateTime" minOccurs="0"/>
     *         &lt;element name="PreviousStationScheduledDateTime" type="{http://schema.ultra-as.com}PreviousStationScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="ScheduledDateTime" type="{http://schema.ultra-as.com}ScheduledDateTime" minOccurs="0"/>
     *         &lt;element name="TenMileOutDateTime" type="{http://schema.ultra-as.com}TenMileOutDateTime" minOccurs="0"/>
     *         &lt;element name="WheelsDownDateTime" type="{http://schema.ultra-as.com}WheelsDownDateTime" minOccurs="0"/>
     *         &lt;element name="WheelsUpDateTime" type="{http://schema.ultra-as.com}WheelsUpDateTime" minOccurs="0"/>
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
        "actualOffBlocksDateTime",
        "actualOnBlocksDateTime",
        "estimatedDateTime",
        "estimatedFlightDuration",
        "finalApproachDateTime",
        "latestKnownDateTime",
        "latestKnownDateTimeSource",
        "nextInformationDateTime",
        "nextStationActualDateTime",
        "nextStationEstimatedDateTime",
        "nextStationScheduledDateTime",
        "previousStationAirborneDateTime",
        "previousStationEstimatedDateTime",
        "previousStationScheduledDateTime",
        "scheduledDateTime",
        "tenMileOutDateTime",
        "wheelsDownDateTime",
        "wheelsUpDateTime",
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

        @XmlElementRef(name = "ActualOffBlocksDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> actualOffBlocksDateTime;
        @XmlElementRef(name = "ActualOnBlocksDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> actualOnBlocksDateTime;
        @XmlElementRef(name = "EstimatedDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> estimatedDateTime;
        @XmlElementRef(name = "EstimatedFlightDuration", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Duration> estimatedFlightDuration;
        @XmlElementRef(name = "FinalApproachDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> finalApproachDateTime;
        @XmlElementRef(name = "LatestKnownDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> latestKnownDateTime;
        @XmlElementRef(name = "LatestKnownDateTimeSource", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<LatestKnownDateTimeSource> latestKnownDateTimeSource;
        @XmlElementRef(name = "NextInformationDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> nextInformationDateTime;
        @XmlElementRef(name = "NextStationActualDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> nextStationActualDateTime;
        @XmlElementRef(name = "NextStationEstimatedDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> nextStationEstimatedDateTime;
        @XmlElementRef(name = "NextStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> nextStationScheduledDateTime;
        @XmlElementRef(name = "PreviousStationAirborneDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> previousStationAirborneDateTime;
        @XmlElementRef(name = "PreviousStationEstimatedDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> previousStationEstimatedDateTime;
        @XmlElementRef(name = "PreviousStationScheduledDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> previousStationScheduledDateTime;
        @XmlElement(name = "ScheduledDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar scheduledDateTime;
        @XmlElementRef(name = "TenMileOutDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> tenMileOutDateTime;
        @XmlElementRef(name = "WheelsDownDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> wheelsDownDateTime;
        @XmlElementRef(name = "WheelsUpDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> wheelsUpDateTime;
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
         * ��ȡactualOffBlocksDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getActualOffBlocksDateTime() {
            return actualOffBlocksDateTime;
        }

        /**
         * ����actualOffBlocksDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setActualOffBlocksDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.actualOffBlocksDateTime = value;
        }

        /**
         * ��ȡactualOnBlocksDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getActualOnBlocksDateTime() {
            return actualOnBlocksDateTime;
        }

        /**
         * ����actualOnBlocksDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setActualOnBlocksDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.actualOnBlocksDateTime = value;
        }

        /**
         * ��ȡestimatedDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getEstimatedDateTime() {
            return estimatedDateTime;
        }

        /**
         * ����estimatedDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setEstimatedDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.estimatedDateTime = value;
        }

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
         * ��ȡfinalApproachDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getFinalApproachDateTime() {
            return finalApproachDateTime;
        }

        /**
         * ����finalApproachDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setFinalApproachDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.finalApproachDateTime = value;
        }

        /**
         * ��ȡlatestKnownDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getLatestKnownDateTime() {
            return latestKnownDateTime;
        }

        /**
         * ����latestKnownDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setLatestKnownDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.latestKnownDateTime = value;
        }

        /**
         * ��ȡlatestKnownDateTimeSource���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link LatestKnownDateTimeSource }{@code >}
         *     
         */
        public JAXBElement<LatestKnownDateTimeSource> getLatestKnownDateTimeSource() {
            return latestKnownDateTimeSource;
        }

        /**
         * ����latestKnownDateTimeSource���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link LatestKnownDateTimeSource }{@code >}
         *     
         */
        public void setLatestKnownDateTimeSource(JAXBElement<LatestKnownDateTimeSource> value) {
            this.latestKnownDateTimeSource = value;
        }

        /**
         * ��ȡnextInformationDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getNextInformationDateTime() {
            return nextInformationDateTime;
        }

        /**
         * ����nextInformationDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setNextInformationDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.nextInformationDateTime = value;
        }

        /**
         * ��ȡnextStationActualDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getNextStationActualDateTime() {
            return nextStationActualDateTime;
        }

        /**
         * ����nextStationActualDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setNextStationActualDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.nextStationActualDateTime = value;
        }

        /**
         * ��ȡnextStationEstimatedDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getNextStationEstimatedDateTime() {
            return nextStationEstimatedDateTime;
        }

        /**
         * ����nextStationEstimatedDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setNextStationEstimatedDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.nextStationEstimatedDateTime = value;
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
         * ��ȡpreviousStationAirborneDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getPreviousStationAirborneDateTime() {
            return previousStationAirborneDateTime;
        }

        /**
         * ����previousStationAirborneDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setPreviousStationAirborneDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.previousStationAirborneDateTime = value;
        }

        /**
         * ��ȡpreviousStationEstimatedDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getPreviousStationEstimatedDateTime() {
            return previousStationEstimatedDateTime;
        }

        /**
         * ����previousStationEstimatedDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setPreviousStationEstimatedDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.previousStationEstimatedDateTime = value;
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
         * ��ȡscheduledDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getScheduledDateTime() {
            return scheduledDateTime;
        }

        /**
         * ����scheduledDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setScheduledDateTime(XMLGregorianCalendar value) {
            this.scheduledDateTime = value;
        }

        /**
         * ��ȡtenMileOutDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getTenMileOutDateTime() {
            return tenMileOutDateTime;
        }

        /**
         * ����tenMileOutDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setTenMileOutDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.tenMileOutDateTime = value;
        }

        /**
         * ��ȡwheelsDownDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getWheelsDownDateTime() {
            return wheelsDownDateTime;
        }

        /**
         * ����wheelsDownDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setWheelsDownDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.wheelsDownDateTime = value;
        }

        /**
         * ��ȡwheelsUpDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getWheelsUpDateTime() {
            return wheelsUpDateTime;
        }

        /**
         * ����wheelsUpDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setWheelsUpDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.wheelsUpDateTime = value;
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
     *         &lt;element name="PortOfCallICAOCode" type="{http://schema.ultra-as.com}PortOfCallICAOCode" maxOccurs="7" minOccurs="0"/>
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
        "portOfCallIATACode",
        "portOfCallICAOCode"
    })
    public static class PortsOfCall {

        @XmlElement(name = "PortOfCallIATACode", required = true, nillable = true)
        protected List<String> portOfCallIATACode;
        @XmlElement(name = "PortOfCallICAOCode", nillable = true)
        protected List<String> portOfCallICAOCode;

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

        /**
         * Gets the value of the portOfCallICAOCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the portOfCallICAOCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPortOfCallICAOCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPortOfCallICAOCode() {
            if (portOfCallICAOCode == null) {
                portOfCallICAOCode = new ArrayList<String>();
            }
            return this.portOfCallICAOCode;
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
     *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
     *         &lt;element name="PublicCarrierCode" type="{http://schema.ultra-as.com}PublicCarrierCode" minOccurs="0"/>
     *         &lt;element name="PublicDateTime" type="{http://schema.ultra-as.com}PublicDateTime" minOccurs="0"/>
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
        "publicCarrierCode",
        "publicDateTime"
    })
    public static class Public {

        @XmlElementRef(name = "FlightIdentity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightIdentity;
        @XmlElementRef(name = "PublicCarrierCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> publicCarrierCode;
        @XmlElementRef(name = "PublicDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> publicDateTime;

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

        /**
         * ��ȡpublicCarrierCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPublicCarrierCode() {
            return publicCarrierCode;
        }

        /**
         * ����publicCarrierCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPublicCarrierCode(JAXBElement<String> value) {
            this.publicCarrierCode = value;
        }

        /**
         * ��ȡpublicDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getPublicDateTime() {
            return publicDateTime;
        }

        /**
         * ����publicDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setPublicDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.publicDateTime = value;
        }

    }

}

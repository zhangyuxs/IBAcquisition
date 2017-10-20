//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
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
 * <p>FlightData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取aircraft属性的值。
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
     * 设置aircraft属性的值。
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
     * 获取airport属性的值。
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
     * 设置airport属性的值。
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
     * 获取flight属性的值。
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
     * 设置flight属性的值。
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
     * 获取load属性的值。
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
     * 设置load属性的值。
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
     * 获取operationalTimes属性的值。
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
     * 设置operationalTimes属性的值。
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
     * 获取portsOfCall属性的值。
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
     * 设置portsOfCall属性的值。
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
     * 获取public属性的值。
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
     * 设置public属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取aircraftCallsign属性的值。
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
         * 设置aircraftCallsign属性的值。
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
         * 获取aircraftOwnerIATACode属性的值。
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
         * 设置aircraftOwnerIATACode属性的值。
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
         * 获取aircraftPassengerCapacity属性的值。
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
         * 设置aircraftPassengerCapacity属性的值。
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
         * 获取aircraftRegistration属性的值。
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
         * 设置aircraftRegistration属性的值。
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
         * 获取aircraftSubtypeIATACode属性的值。
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
         * 设置aircraftSubtypeIATACode属性的值。
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
         * 获取aircraftTypeICAOCode属性的值。
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
         * 设置aircraftTypeICAOCode属性的值。
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
         * 获取aircraftOperator属性的值。
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
         * 设置aircraftOperator属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取aircraftTerminalCode属性的值。
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
         * 设置aircraftTerminalCode属性的值。
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
         * 获取airlineTerminalCode属性的值。
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
         * 设置airlineTerminalCode属性的值。
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
         * 获取airportIATACode属性的值。
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
         * 设置airportIATACode属性的值。
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
         * 获取baggageTerminalCode属性的值。
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
         * 设置baggageTerminalCode属性的值。
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
         * 获取busIsRequired属性的值。
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
         * 设置busIsRequired属性的值。
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
         * 获取passengerTerminalCode属性的值。
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
         * 设置passengerTerminalCode属性的值。
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
         * 获取runwayID属性的值。
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
         * 设置runwayID属性的值。
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
         * 获取secureStandIsRequired属性的值。
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
         * 设置secureStandIsRequired属性的值。
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
         * 获取standPosition属性的值。
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
         * 设置standPosition属性的值。
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
         * 获取supplementaryInformation属性的值。
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
         * 设置supplementaryInformation属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取accountCode属性的值。
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
         * 设置accountCode属性的值。
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
         * 获取caacDelayDetails属性的值。
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
         * 设置caacDelayDetails属性的值。
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
         * 获取codeShareStatus属性的值。
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
         * 设置codeShareStatus属性的值。
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
         * 获取divertAirportIATACode属性的值。
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
         * 设置divertAirportIATACode属性的值。
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
         * 获取flightCancelCode属性的值。
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
         * 设置flightCancelCode属性的值。
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
         * 获取flightClassificationCode属性的值。
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
         * 设置flightClassificationCode属性的值。
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
         * 获取flightNatureCode属性的值。
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
         * 设置flightNatureCode属性的值。
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
         * 获取flightOperatesOvernight属性的值。
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
         * 设置flightOperatesOvernight属性的值。
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
         * 获取flightSectorCode属性的值。
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
         * 设置flightSectorCode属性的值。
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
         * 获取flightServiceTypeIATACode属性的值。
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
         * 设置flightServiceTypeIATACode属性的值。
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
         * 获取flightStatusCode属性的值。
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
         * 设置flightStatusCode属性的值。
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
         * 获取flightTransitCode属性的值。
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
         * 设置flightTransitCode属性的值。
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
         * 获取isGeneralAviationFlight属性的值。
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
         * 设置isGeneralAviationFlight属性的值。
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
         * 获取isReturnFlight属性的值。
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
         * 设置isReturnFlight属性的值。
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
         * 获取isTransferFlight属性的值。
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
         * 设置isTransferFlight属性的值。
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
         * 获取hasVIPs属性的值。
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
         * 设置hasVIPs属性的值。
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
         * 获取linkedFlight属性的值。
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
         * 设置linkedFlight属性的值。
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
         * 获取masterFlight属性的值。
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
         * 设置masterFlight属性的值。
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
         * 获取newFlightReason属性的值。
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
         * 设置newFlightReason属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取cargo属性的值。
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
         * 设置cargo属性的值。
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
         * 获取passengerCounts属性的值。
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
         * 设置passengerCounts属性的值。
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
         * 获取totalCrewCount属性的值。
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
         * 设置totalCrewCount属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取totalBaggageCount属性的值。
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
             * 设置totalBaggageCount属性的值。
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
             * 获取totalBaggageWeight属性的值。
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
             * 设置totalBaggageWeight属性的值。
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
             * 获取totalFreightWeight属性的值。
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
             * 设置totalFreightWeight属性的值。
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
             * 获取totalLoadWeight属性的值。
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
             * 设置totalLoadWeight属性的值。
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
             * 获取totalMailWeight属性的值。
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
             * 设置totalMailWeight属性的值。
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
             * 获取transferBaggageCount属性的值。
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
             * 设置transferBaggageCount属性的值。
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
             * 获取transferBaggageWeight属性的值。
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
             * 设置transferBaggageWeight属性的值。
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
             * 获取transferCargoWeight属性的值。
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
             * 设置transferCargoWeight属性的值。
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
             * 获取transferMailWeight属性的值。
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
             * 设置transferMailWeight属性的值。
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
             * 获取transitBaggageCount属性的值。
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
             * 设置transitBaggageCount属性的值。
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
             * 获取transitBaggageWeight属性的值。
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
             * 设置transitBaggageWeight属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取adultPassengerCount属性的值。
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
             * 设置adultPassengerCount属性的值。
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
             * 获取businessClassPassengerCount属性的值。
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
             * 设置businessClassPassengerCount属性的值。
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
             * 获取childPassengerCount属性的值。
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
             * 设置childPassengerCount属性的值。
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
             * 获取domesticPassengerCount属性的值。
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
             * 设置domesticPassengerCount属性的值。
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
             * 获取economyClassPassengerCount属性的值。
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
             * 设置economyClassPassengerCount属性的值。
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
             * 获取firstClassPassengerCount属性的值。
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
             * 设置firstClassPassengerCount属性的值。
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
             * 获取infantPassengerCount属性的值。
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
             * 设置infantPassengerCount属性的值。
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
             * 获取internationalPassengerCount属性的值。
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
             * 设置internationalPassengerCount属性的值。
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
             * 获取localPassengerCount属性的值。
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
             * 设置localPassengerCount属性的值。
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
             * 获取nonTransferPassengerCount属性的值。
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
             * 设置nonTransferPassengerCount属性的值。
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
             * 获取totalPassengerCount属性的值。
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
             * 设置totalPassengerCount属性的值。
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
             * 获取transferPassengerCount属性的值。
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
             * 设置transferPassengerCount属性的值。
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
             * 获取transitPassengerCount属性的值。
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
             * 设置transitPassengerCount属性的值。
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
             * 获取wheelchairPassengerCount属性的值。
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
             * 设置wheelchairPassengerCount属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取actualOffBlocksDateTime属性的值。
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
         * 设置actualOffBlocksDateTime属性的值。
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
         * 获取actualOnBlocksDateTime属性的值。
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
         * 设置actualOnBlocksDateTime属性的值。
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
         * 获取estimatedDateTime属性的值。
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
         * 设置estimatedDateTime属性的值。
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
         * 获取estimatedFlightDuration属性的值。
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
         * 设置estimatedFlightDuration属性的值。
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
         * 获取finalApproachDateTime属性的值。
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
         * 设置finalApproachDateTime属性的值。
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
         * 获取latestKnownDateTime属性的值。
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
         * 设置latestKnownDateTime属性的值。
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
         * 获取latestKnownDateTimeSource属性的值。
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
         * 设置latestKnownDateTimeSource属性的值。
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
         * 获取nextInformationDateTime属性的值。
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
         * 设置nextInformationDateTime属性的值。
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
         * 获取nextStationActualDateTime属性的值。
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
         * 设置nextStationActualDateTime属性的值。
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
         * 获取nextStationEstimatedDateTime属性的值。
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
         * 设置nextStationEstimatedDateTime属性的值。
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
         * 获取nextStationScheduledDateTime属性的值。
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
         * 设置nextStationScheduledDateTime属性的值。
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
         * 获取previousStationAirborneDateTime属性的值。
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
         * 设置previousStationAirborneDateTime属性的值。
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
         * 获取previousStationEstimatedDateTime属性的值。
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
         * 设置previousStationEstimatedDateTime属性的值。
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
         * 获取previousStationScheduledDateTime属性的值。
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
         * 设置previousStationScheduledDateTime属性的值。
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
         * 获取scheduledDateTime属性的值。
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
         * 设置scheduledDateTime属性的值。
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
         * 获取tenMileOutDateTime属性的值。
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
         * 设置tenMileOutDateTime属性的值。
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
         * 获取wheelsDownDateTime属性的值。
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
         * 设置wheelsDownDateTime属性的值。
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
         * 获取wheelsUpDateTime属性的值。
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
         * 设置wheelsUpDateTime属性的值。
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
         * 获取firstStationScheduledDateTime属性的值。
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
         * 设置firstStationScheduledDateTime属性的值。
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
         * 获取secondStationScheduledDateTime属性的值。
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
         * 设置secondStationScheduledDateTime属性的值。
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
         * 获取thirdStationScheduledDateTime属性的值。
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
         * 设置thirdStationScheduledDateTime属性的值。
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
         * 获取fourthStationScheduledDateTime属性的值。
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
         * 设置fourthStationScheduledDateTime属性的值。
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
         * 获取fifthStationScheduledDateTime属性的值。
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
         * 设置fifthStationScheduledDateTime属性的值。
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
         * 获取sixthStationScheduledDateTime属性的值。
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
         * 设置sixthStationScheduledDateTime属性的值。
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
         * 获取originStationScheduledDateTime属性的值。
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
         * 设置originStationScheduledDateTime属性的值。
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
         * 获取destinationStationScheduledDateTime属性的值。
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
         * 设置destinationStationScheduledDateTime属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取flightIdentity属性的值。
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
         * 设置flightIdentity属性的值。
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
         * 获取publicCarrierCode属性的值。
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
         * 设置publicCarrierCode属性的值。
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
         * 获取publicDateTime属性的值。
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
         * 设置publicDateTime属性的值。
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

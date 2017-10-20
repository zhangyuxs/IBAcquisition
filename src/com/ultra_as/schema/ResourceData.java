//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.01 ʱ�� 09:59:39 PM CST 
//


package com.ultra_as.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Collection of resource data common to resource data messages.
 * 
 * <p>ResourceData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResourceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AircraftTow" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AircraftMovementSequence" type="{http://schema.ultra-as.com}AircraftMovementSequence"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalIdentification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
 *                             &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *                             &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DepartureIdentification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
 *                             &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *                             &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode" minOccurs="0"/>
 *                   &lt;element name="AircraftMovementDateTime" type="{http://schema.ultra-as.com}AircraftMovementDateTime" minOccurs="0"/>
 *                   &lt;element name="AircraftMovementDirection" type="{http://schema.ultra-as.com}AircraftMovementDirection" minOccurs="0"/>
 *                   &lt;element name="AircraftMovementConfirmStatus" type="{http://schema.ultra-as.com}AircraftMovementConfirmStatus" minOccurs="0"/>
 *                   &lt;element name="AircraftMovementTypeCode" type="{http://schema.ultra-as.com}AircraftMovementTypeCode" minOccurs="0"/>
 *                   &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration" minOccurs="0"/>
 *                   &lt;element name="StandPosition" type="{http://schema.ultra-as.com}StandPosition" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BaggageReclaimOperation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BaggageReclaimCarouselID" type="{http://schema.ultra-as.com}BaggageReclaimCarouselID"/>
 *                             &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *                             &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *                             &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FirstBagDateTime" type="{http://schema.ultra-as.com}FirstBagDateTime" minOccurs="0"/>
 *                   &lt;element name="LastBagDateTime" type="{http://schema.ultra-as.com}LastBagDateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckinOperation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CheckinDeskID" type="{http://schema.ultra-as.com}CheckinDeskID"/>
 *                             &lt;element name="CheckinPlanCloseDateTime" type="{http://schema.ultra-as.com}CheckinPlanCloseDateTime"/>
 *                             &lt;element name="CheckinPlanOpenDateTime" type="{http://schema.ultra-as.com}CheckinPlanOpenDateTime"/>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode" maxOccurs="30"/>
 *                               &lt;sequence>
 *                                 &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *                                 &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *                                 &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
 *                               &lt;/sequence>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="CheckinCloseDateTime" type="{http://schema.ultra-as.com}CheckinCloseDateTime" minOccurs="0"/>
 *                   &lt;element name="CheckinOpenDateTime" type="{http://schema.ultra-as.com}CheckinOpenDateTime" minOccurs="0"/>
 *                   &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode" minOccurs="0"/>
 *                   &lt;element name="InformationRemark" type="{http://schema.ultra-as.com}InformationRemark" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckinSlot" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CheckinDeskID" type="{http://schema.ultra-as.com}CheckinDeskID"/>
 *                             &lt;element name="CheckinPlanCloseDateTime" type="{http://schema.ultra-as.com}CheckinPlanCloseDateTime"/>
 *                             &lt;element name="CheckinPlanOpenDateTime" type="{http://schema.ultra-as.com}CheckinPlanOpenDateTime"/>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="CheckinClusterID" type="{http://schema.ultra-as.com}CheckinClusterID"/>
 *                   &lt;element name="CheckinFlightIdentity" type="{http://schema.ultra-as.com}CheckinFlightIdentity" maxOccurs="7" minOccurs="0"/>
 *                   &lt;element name="CheckinSlotSequence" type="{http://schema.ultra-as.com}CheckinSlotSequence" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode" maxOccurs="30"/>
 *                     &lt;sequence>
 *                       &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *                       &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *                       &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GateOperation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber"/>
 *                             &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *                             &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *                             &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GateCloseDateTime" type="{http://schema.ultra-as.com}GateCloseDateTime" minOccurs="0"/>
 *                   &lt;element name="GateLastCallDateTime" type="{http://schema.ultra-as.com}GateLastCallDateTime" minOccurs="0"/>
 *                   &lt;element name="GateOpenDateTime" type="{http://schema.ultra-as.com}GateOpenDateTime" minOccurs="0"/>
 *                   &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode" minOccurs="0"/>
 *                   &lt;element name="InformationRemark" type="{http://schema.ultra-as.com}InformationRemark" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResourceImpairment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ResourceID" type="{http://schema.ultra-as.com}ResourceID"/>
 *                             &lt;element name="ResourceRole" type="{http://schema.ultra-as.com}ResourceRole"/>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ImpairmentEndDateTime" type="{http://schema.ultra-as.com}ImpairmentEndDateTime" minOccurs="0"/>
 *                   &lt;element name="ImpairmentStartDateTime" type="{http://schema.ultra-as.com}ImpairmentStartDateTime"/>
 *                   &lt;element name="ImpairmentDescription" type="{http://schema.ultra-as.com}ImpairmentDescription"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StandPositionOperation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="StandPosition" type="{http://schema.ultra-as.com}StandPosition"/>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration" minOccurs="0"/>
 *                   &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode" minOccurs="0"/>
 *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
 *                   &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *                   &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate" minOccurs="0"/>
 *                   &lt;element name="OffBlocksDateTime" type="{http://schema.ultra-as.com}OffBlocksDateTime" minOccurs="0"/>
 *                   &lt;element name="OnBlocksDateTime" type="{http://schema.ultra-as.com}OnBlocksDateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceData", propOrder = {
    "aircraftTow",
    "baggageReclaimOperation",
    "checkinOperation",
    "checkinSlot",
    "gateOperation",
    "resourceImpairment",
    "standPositionOperation"
})
public class ResourceData {

    @XmlElement(name = "AircraftTow")
    protected ResourceData.AircraftTow aircraftTow;
    @XmlElement(name = "BaggageReclaimOperation")
    protected ResourceData.BaggageReclaimOperation baggageReclaimOperation;
    @XmlElement(name = "CheckinOperation")
    protected ResourceData.CheckinOperation checkinOperation;
    @XmlElement(name = "CheckinSlot")
    protected ResourceData.CheckinSlot checkinSlot;
    @XmlElement(name = "GateOperation")
    protected ResourceData.GateOperation gateOperation;
    @XmlElement(name = "ResourceImpairment")
    protected ResourceData.ResourceImpairment resourceImpairment;
    @XmlElement(name = "StandPositionOperation")
    protected ResourceData.StandPositionOperation standPositionOperation;

    /**
     * ��ȡaircraftTow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceData.AircraftTow }
     *     
     */
    public ResourceData.AircraftTow getAircraftTow() {
        return aircraftTow;
    }

    /**
     * ����aircraftTow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData.AircraftTow }
     *     
     */
    public void setAircraftTow(ResourceData.AircraftTow value) {
        this.aircraftTow = value;
    }

    /**
     * ��ȡbaggageReclaimOperation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceData.BaggageReclaimOperation }
     *     
     */
    public ResourceData.BaggageReclaimOperation getBaggageReclaimOperation() {
        return baggageReclaimOperation;
    }

    /**
     * ����baggageReclaimOperation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData.BaggageReclaimOperation }
     *     
     */
    public void setBaggageReclaimOperation(ResourceData.BaggageReclaimOperation value) {
        this.baggageReclaimOperation = value;
    }

    /**
     * ��ȡcheckinOperation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceData.CheckinOperation }
     *     
     */
    public ResourceData.CheckinOperation getCheckinOperation() {
        return checkinOperation;
    }

    /**
     * ����checkinOperation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData.CheckinOperation }
     *     
     */
    public void setCheckinOperation(ResourceData.CheckinOperation value) {
        this.checkinOperation = value;
    }

    /**
     * ��ȡcheckinSlot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceData.CheckinSlot }
     *     
     */
    public ResourceData.CheckinSlot getCheckinSlot() {
        return checkinSlot;
    }

    /**
     * ����checkinSlot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData.CheckinSlot }
     *     
     */
    public void setCheckinSlot(ResourceData.CheckinSlot value) {
        this.checkinSlot = value;
    }

    /**
     * ��ȡgateOperation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceData.GateOperation }
     *     
     */
    public ResourceData.GateOperation getGateOperation() {
        return gateOperation;
    }

    /**
     * ����gateOperation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData.GateOperation }
     *     
     */
    public void setGateOperation(ResourceData.GateOperation value) {
        this.gateOperation = value;
    }

    /**
     * ��ȡresourceImpairment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceData.ResourceImpairment }
     *     
     */
    public ResourceData.ResourceImpairment getResourceImpairment() {
        return resourceImpairment;
    }

    /**
     * ����resourceImpairment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData.ResourceImpairment }
     *     
     */
    public void setResourceImpairment(ResourceData.ResourceImpairment value) {
        this.resourceImpairment = value;
    }

    /**
     * ��ȡstandPositionOperation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceData.StandPositionOperation }
     *     
     */
    public ResourceData.StandPositionOperation getStandPositionOperation() {
        return standPositionOperation;
    }

    /**
     * ����standPositionOperation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData.StandPositionOperation }
     *     
     */
    public void setStandPositionOperation(ResourceData.StandPositionOperation value) {
        this.standPositionOperation = value;
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
     *         &lt;element name="Identification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AircraftMovementSequence" type="{http://schema.ultra-as.com}AircraftMovementSequence"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ArrivalIdentification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
     *                   &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
     *                   &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DepartureIdentification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
     *                   &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
     *                   &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode" minOccurs="0"/>
     *         &lt;element name="AircraftMovementDateTime" type="{http://schema.ultra-as.com}AircraftMovementDateTime" minOccurs="0"/>
     *         &lt;element name="AircraftMovementDirection" type="{http://schema.ultra-as.com}AircraftMovementDirection" minOccurs="0"/>
     *         &lt;element name="AircraftMovementConfirmStatus" type="{http://schema.ultra-as.com}AircraftMovementConfirmStatus" minOccurs="0"/>
     *         &lt;element name="AircraftMovementTypeCode" type="{http://schema.ultra-as.com}AircraftMovementTypeCode" minOccurs="0"/>
     *         &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration" minOccurs="0"/>
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
        "identification",
        "arrivalIdentification",
        "departureIdentification",
        "airportIATACode",
        "aircraftMovementDateTime",
        "aircraftMovementDirection",
        "aircraftMovementConfirmStatus",
        "aircraftMovementTypeCode",
        "aircraftRegistration",
        "standPosition"
    })
    public static class AircraftTow {

        @XmlElement(name = "Identification", required = true)
        protected ResourceData.AircraftTow.Identification identification;
        @XmlElementRef(name = "ArrivalIdentification", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<ResourceData.AircraftTow.ArrivalIdentification> arrivalIdentification;
        @XmlElementRef(name = "DepartureIdentification", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<ResourceData.AircraftTow.DepartureIdentification> departureIdentification;
        @XmlElement(name = "AirportIATACode")
        protected String airportIATACode;
        @XmlElement(name = "AircraftMovementDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar aircraftMovementDateTime;
        @XmlElement(name = "AircraftMovementDirection")
        @XmlSchemaType(name = "string")
        protected FlightDirection aircraftMovementDirection;
        @XmlElementRef(name = "AircraftMovementConfirmStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<AircraftMovementConfirmStatus> aircraftMovementConfirmStatus;
        @XmlElementRef(name = "AircraftMovementTypeCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<AircraftMovementTypeCode> aircraftMovementTypeCode;
        @XmlElementRef(name = "AircraftRegistration", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftRegistration;
        @XmlElement(name = "StandPosition")
        protected String standPosition;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ResourceData.AircraftTow.Identification }
         *     
         */
        public ResourceData.AircraftTow.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ResourceData.AircraftTow.Identification }
         *     
         */
        public void setIdentification(ResourceData.AircraftTow.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡarrivalIdentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ResourceData.AircraftTow.ArrivalIdentification }{@code >}
         *     
         */
        public JAXBElement<ResourceData.AircraftTow.ArrivalIdentification> getArrivalIdentification() {
            return arrivalIdentification;
        }

        /**
         * ����arrivalIdentification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ResourceData.AircraftTow.ArrivalIdentification }{@code >}
         *     
         */
        public void setArrivalIdentification(JAXBElement<ResourceData.AircraftTow.ArrivalIdentification> value) {
            this.arrivalIdentification = value;
        }

        /**
         * ��ȡdepartureIdentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ResourceData.AircraftTow.DepartureIdentification }{@code >}
         *     
         */
        public JAXBElement<ResourceData.AircraftTow.DepartureIdentification> getDepartureIdentification() {
            return departureIdentification;
        }

        /**
         * ����departureIdentification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ResourceData.AircraftTow.DepartureIdentification }{@code >}
         *     
         */
        public void setDepartureIdentification(JAXBElement<ResourceData.AircraftTow.DepartureIdentification> value) {
            this.departureIdentification = value;
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
         * ��ȡaircraftMovementDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAircraftMovementDateTime() {
            return aircraftMovementDateTime;
        }

        /**
         * ����aircraftMovementDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAircraftMovementDateTime(XMLGregorianCalendar value) {
            this.aircraftMovementDateTime = value;
        }

        /**
         * ��ȡaircraftMovementDirection���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link FlightDirection }
         *     
         */
        public FlightDirection getAircraftMovementDirection() {
            return aircraftMovementDirection;
        }

        /**
         * ����aircraftMovementDirection���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDirection }
         *     
         */
        public void setAircraftMovementDirection(FlightDirection value) {
            this.aircraftMovementDirection = value;
        }

        /**
         * ��ȡaircraftMovementConfirmStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AircraftMovementConfirmStatus }{@code >}
         *     
         */
        public JAXBElement<AircraftMovementConfirmStatus> getAircraftMovementConfirmStatus() {
            return aircraftMovementConfirmStatus;
        }

        /**
         * ����aircraftMovementConfirmStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AircraftMovementConfirmStatus }{@code >}
         *     
         */
        public void setAircraftMovementConfirmStatus(JAXBElement<AircraftMovementConfirmStatus> value) {
            this.aircraftMovementConfirmStatus = value;
        }

        /**
         * ��ȡaircraftMovementTypeCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AircraftMovementTypeCode }{@code >}
         *     
         */
        public JAXBElement<AircraftMovementTypeCode> getAircraftMovementTypeCode() {
            return aircraftMovementTypeCode;
        }

        /**
         * ����aircraftMovementTypeCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AircraftMovementTypeCode }{@code >}
         *     
         */
        public void setAircraftMovementTypeCode(JAXBElement<AircraftMovementTypeCode> value) {
            this.aircraftMovementTypeCode = value;
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
         * ��ȡstandPosition���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStandPosition() {
            return standPosition;
        }

        /**
         * ����standPosition���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStandPosition(String value) {
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
         *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
         *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
         *         &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate" minOccurs="0"/>
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
            "flightRepeatCount",
            "scheduledDate"
        })
        public static class ArrivalIdentification {

            @XmlElementRef(name = "FlightIdentity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<String> flightIdentity;
            @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> flightRepeatCount;
            @XmlElementRef(name = "ScheduledDate", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> scheduledDate;

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
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getScheduledDate() {
                return scheduledDate;
            }

            /**
             * ����scheduledDate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setScheduledDate(JAXBElement<XMLGregorianCalendar> value) {
                this.scheduledDate = value;
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
         *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
         *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
         *         &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate" minOccurs="0"/>
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
            "flightRepeatCount",
            "scheduledDate"
        })
        public static class DepartureIdentification {

            @XmlElementRef(name = "FlightIdentity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<String> flightIdentity;
            @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> flightRepeatCount;
            @XmlElementRef(name = "ScheduledDate", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> scheduledDate;

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
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getScheduledDate() {
                return scheduledDate;
            }

            /**
             * ����scheduledDate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setScheduledDate(JAXBElement<XMLGregorianCalendar> value) {
                this.scheduledDate = value;
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
         *         &lt;element name="AircraftMovementSequence" type="{http://schema.ultra-as.com}AircraftMovementSequence"/>
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
            "aircraftMovementSequence"
        })
        public static class Identification {

            @XmlElement(name = "AircraftMovementSequence")
            protected long aircraftMovementSequence;

            /**
             * ��ȡaircraftMovementSequence���Ե�ֵ��
             * 
             */
            public long getAircraftMovementSequence() {
                return aircraftMovementSequence;
            }

            /**
             * ����aircraftMovementSequence���Ե�ֵ��
             * 
             */
            public void setAircraftMovementSequence(long value) {
                this.aircraftMovementSequence = value;
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
     *         &lt;element name="Identification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BaggageReclaimCarouselID" type="{http://schema.ultra-as.com}BaggageReclaimCarouselID"/>
     *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
     *                   &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
     *                   &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "identification",
        "firstBagDateTime",
        "lastBagDateTime"
    })
    public static class BaggageReclaimOperation {

        @XmlElement(name = "Identification", required = true, nillable = true)
        protected ResourceData.BaggageReclaimOperation.Identification identification;
        @XmlElementRef(name = "FirstBagDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> firstBagDateTime;
        @XmlElementRef(name = "LastBagDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> lastBagDateTime;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ResourceData.BaggageReclaimOperation.Identification }
         *     
         */
        public ResourceData.BaggageReclaimOperation.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ResourceData.BaggageReclaimOperation.Identification }
         *     
         */
        public void setIdentification(ResourceData.BaggageReclaimOperation.Identification value) {
            this.identification = value;
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
         *         &lt;element name="BaggageReclaimCarouselID" type="{http://schema.ultra-as.com}BaggageReclaimCarouselID"/>
         *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
         *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
         *         &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
         *         &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
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
            "flightIdentity",
            "flightRepeatCount",
            "scheduledDate",
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "BaggageReclaimCarouselID", required = true)
            protected String baggageReclaimCarouselID;
            @XmlElement(name = "FlightIdentity", required = true)
            protected String flightIdentity;
            @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> flightRepeatCount;
            @XmlElement(name = "ScheduledDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar scheduledDate;
            @XmlElement(name = "TerminalCode")
            protected String terminalCode;

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

            /**
             * ��ȡterminalCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminalCode() {
                return terminalCode;
            }

            /**
             * ����terminalCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminalCode(String value) {
                this.terminalCode = value;
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
     *         &lt;element name="Identification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CheckinDeskID" type="{http://schema.ultra-as.com}CheckinDeskID"/>
     *                   &lt;element name="CheckinPlanCloseDateTime" type="{http://schema.ultra-as.com}CheckinPlanCloseDateTime"/>
     *                   &lt;element name="CheckinPlanOpenDateTime" type="{http://schema.ultra-as.com}CheckinPlanOpenDateTime"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode" maxOccurs="30"/>
     *                     &lt;sequence>
     *                       &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
     *                       &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
     *                       &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
     *                     &lt;/sequence>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="CheckinCloseDateTime" type="{http://schema.ultra-as.com}CheckinCloseDateTime" minOccurs="0"/>
     *         &lt;element name="CheckinOpenDateTime" type="{http://schema.ultra-as.com}CheckinOpenDateTime" minOccurs="0"/>
     *         &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode" minOccurs="0"/>
     *         &lt;element name="InformationRemark" type="{http://schema.ultra-as.com}InformationRemark" maxOccurs="2" minOccurs="0"/>
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
        "identification",
        "checkinClassCode",
        "checkinCloseDateTime",
        "checkinOpenDateTime",
        "handlingAgentIATACode",
        "informationRemark"
    })
    public static class CheckinOperation {

        @XmlElement(name = "Identification", required = true)
        protected ResourceData.CheckinOperation.Identification identification;
        @XmlElement(name = "CheckinClassCode", nillable = true)
        protected List<String> checkinClassCode;
        @XmlElementRef(name = "CheckinCloseDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> checkinCloseDateTime;
        @XmlElementRef(name = "CheckinOpenDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> checkinOpenDateTime;
        @XmlElementRef(name = "HandlingAgentIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> handlingAgentIATACode;
        @XmlElement(name = "InformationRemark", nillable = true)
        protected List<InformationRemark> informationRemark;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ResourceData.CheckinOperation.Identification }
         *     
         */
        public ResourceData.CheckinOperation.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ResourceData.CheckinOperation.Identification }
         *     
         */
        public void setIdentification(ResourceData.CheckinOperation.Identification value) {
            this.identification = value;
        }

        /**
         * Gets the value of the checkinClassCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkinClassCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckinClassCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCheckinClassCode() {
            if (checkinClassCode == null) {
                checkinClassCode = new ArrayList<String>();
            }
            return this.checkinClassCode;
        }

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
         * ��ȡhandlingAgentIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getHandlingAgentIATACode() {
            return handlingAgentIATACode;
        }

        /**
         * ����handlingAgentIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setHandlingAgentIATACode(JAXBElement<String> value) {
            this.handlingAgentIATACode = value;
        }

        /**
         * Gets the value of the informationRemark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informationRemark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformationRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InformationRemark }
         * 
         * 
         */
        public List<InformationRemark> getInformationRemark() {
            if (informationRemark == null) {
                informationRemark = new ArrayList<InformationRemark>();
            }
            return this.informationRemark;
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
         *         &lt;element name="CheckinDeskID" type="{http://schema.ultra-as.com}CheckinDeskID"/>
         *         &lt;element name="CheckinPlanCloseDateTime" type="{http://schema.ultra-as.com}CheckinPlanCloseDateTime"/>
         *         &lt;element name="CheckinPlanOpenDateTime" type="{http://schema.ultra-as.com}CheckinPlanOpenDateTime"/>
         *         &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode" maxOccurs="30"/>
         *           &lt;sequence>
         *             &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
         *             &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
         *             &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
         *           &lt;/sequence>
         *         &lt;/choice>
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
            "checkinDeskID",
            "checkinPlanCloseDateTime",
            "checkinPlanOpenDateTime",
            "terminalCode",
            "airlineIATACode",
            "flightIdentity",
            "flightRepeatCount",
            "scheduledDate"
        })
        public static class Identification {

            @XmlElement(name = "CheckinDeskID", required = true)
            protected String checkinDeskID;
            @XmlElement(name = "CheckinPlanCloseDateTime", required = true, nillable = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar checkinPlanCloseDateTime;
            @XmlElement(name = "CheckinPlanOpenDateTime", required = true, nillable = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar checkinPlanOpenDateTime;
            @XmlElement(name = "TerminalCode")
            protected String terminalCode;
            @XmlElement(name = "AirlineIATACode", nillable = true)
            protected List<String> airlineIATACode;
            @XmlElementRef(name = "FlightIdentity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<String> flightIdentity;
            @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> flightRepeatCount;
            @XmlElementRef(name = "ScheduledDate", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> scheduledDate;

            /**
             * ��ȡcheckinDeskID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckinDeskID() {
                return checkinDeskID;
            }

            /**
             * ����checkinDeskID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckinDeskID(String value) {
                this.checkinDeskID = value;
            }

            /**
             * ��ȡcheckinPlanCloseDateTime���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckinPlanCloseDateTime() {
                return checkinPlanCloseDateTime;
            }

            /**
             * ����checkinPlanCloseDateTime���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckinPlanCloseDateTime(XMLGregorianCalendar value) {
                this.checkinPlanCloseDateTime = value;
            }

            /**
             * ��ȡcheckinPlanOpenDateTime���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckinPlanOpenDateTime() {
                return checkinPlanOpenDateTime;
            }

            /**
             * ����checkinPlanOpenDateTime���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckinPlanOpenDateTime(XMLGregorianCalendar value) {
                this.checkinPlanOpenDateTime = value;
            }

            /**
             * ��ȡterminalCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminalCode() {
                return terminalCode;
            }

            /**
             * ����terminalCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminalCode(String value) {
                this.terminalCode = value;
            }

            /**
             * Gets the value of the airlineIATACode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airlineIATACode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirlineIATACode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAirlineIATACode() {
                if (airlineIATACode == null) {
                    airlineIATACode = new ArrayList<String>();
                }
                return this.airlineIATACode;
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
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getScheduledDate() {
                return scheduledDate;
            }

            /**
             * ����scheduledDate���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setScheduledDate(JAXBElement<XMLGregorianCalendar> value) {
                this.scheduledDate = value;
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
     *         &lt;element name="Identification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CheckinDeskID" type="{http://schema.ultra-as.com}CheckinDeskID"/>
     *                   &lt;element name="CheckinPlanCloseDateTime" type="{http://schema.ultra-as.com}CheckinPlanCloseDateTime"/>
     *                   &lt;element name="CheckinPlanOpenDateTime" type="{http://schema.ultra-as.com}CheckinPlanOpenDateTime"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="CheckinClusterID" type="{http://schema.ultra-as.com}CheckinClusterID"/>
     *         &lt;element name="CheckinFlightIdentity" type="{http://schema.ultra-as.com}CheckinFlightIdentity" maxOccurs="7" minOccurs="0"/>
     *         &lt;element name="CheckinSlotSequence" type="{http://schema.ultra-as.com}CheckinSlotSequence" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode" maxOccurs="30"/>
     *           &lt;sequence>
     *             &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
     *             &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
     *             &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
     *           &lt;/sequence>
     *         &lt;/choice>
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
        "identification",
        "checkinClassCode",
        "checkinClusterID",
        "checkinFlightIdentity",
        "checkinSlotSequence",
        "airlineIATACode",
        "flightIdentity",
        "flightRepeatCount",
        "scheduledDate"
    })
    public static class CheckinSlot {

        @XmlElement(name = "Identification", required = true)
        protected ResourceData.CheckinSlot.Identification identification;
        @XmlElement(name = "CheckinClassCode", nillable = true)
        protected List<String> checkinClassCode;
        @XmlElement(name = "CheckinClusterID")
        protected long checkinClusterID;
        @XmlElement(name = "CheckinFlightIdentity", nillable = true)
        protected List<String> checkinFlightIdentity;
        @XmlElementRef(name = "CheckinSlotSequence", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> checkinSlotSequence;
        @XmlElement(name = "AirlineIATACode", nillable = true)
        protected List<String> airlineIATACode;
        @XmlElementRef(name = "FlightIdentity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightIdentity;
        @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> flightRepeatCount;
        @XmlElementRef(name = "ScheduledDate", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> scheduledDate;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ResourceData.CheckinSlot.Identification }
         *     
         */
        public ResourceData.CheckinSlot.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ResourceData.CheckinSlot.Identification }
         *     
         */
        public void setIdentification(ResourceData.CheckinSlot.Identification value) {
            this.identification = value;
        }

        /**
         * Gets the value of the checkinClassCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkinClassCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckinClassCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCheckinClassCode() {
            if (checkinClassCode == null) {
                checkinClassCode = new ArrayList<String>();
            }
            return this.checkinClassCode;
        }

        /**
         * ��ȡcheckinClusterID���Ե�ֵ��
         * 
         */
        public long getCheckinClusterID() {
            return checkinClusterID;
        }

        /**
         * ����checkinClusterID���Ե�ֵ��
         * 
         */
        public void setCheckinClusterID(long value) {
            this.checkinClusterID = value;
        }

        /**
         * Gets the value of the checkinFlightIdentity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkinFlightIdentity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckinFlightIdentity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCheckinFlightIdentity() {
            if (checkinFlightIdentity == null) {
                checkinFlightIdentity = new ArrayList<String>();
            }
            return this.checkinFlightIdentity;
        }

        /**
         * ��ȡcheckinSlotSequence���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCheckinSlotSequence() {
            return checkinSlotSequence;
        }

        /**
         * ����checkinSlotSequence���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCheckinSlotSequence(JAXBElement<Long> value) {
            this.checkinSlotSequence = value;
        }

        /**
         * Gets the value of the airlineIATACode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineIATACode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineIATACode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirlineIATACode() {
            if (airlineIATACode == null) {
                airlineIATACode = new ArrayList<String>();
            }
            return this.airlineIATACode;
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
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getScheduledDate() {
            return scheduledDate;
        }

        /**
         * ����scheduledDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setScheduledDate(JAXBElement<XMLGregorianCalendar> value) {
            this.scheduledDate = value;
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
         *         &lt;element name="CheckinDeskID" type="{http://schema.ultra-as.com}CheckinDeskID"/>
         *         &lt;element name="CheckinPlanCloseDateTime" type="{http://schema.ultra-as.com}CheckinPlanCloseDateTime"/>
         *         &lt;element name="CheckinPlanOpenDateTime" type="{http://schema.ultra-as.com}CheckinPlanOpenDateTime"/>
         *         &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
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
            "checkinDeskID",
            "checkinPlanCloseDateTime",
            "checkinPlanOpenDateTime",
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "CheckinDeskID", required = true)
            protected String checkinDeskID;
            @XmlElement(name = "CheckinPlanCloseDateTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar checkinPlanCloseDateTime;
            @XmlElement(name = "CheckinPlanOpenDateTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar checkinPlanOpenDateTime;
            @XmlElement(name = "TerminalCode", required = true)
            protected String terminalCode;

            /**
             * ��ȡcheckinDeskID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckinDeskID() {
                return checkinDeskID;
            }

            /**
             * ����checkinDeskID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckinDeskID(String value) {
                this.checkinDeskID = value;
            }

            /**
             * ��ȡcheckinPlanCloseDateTime���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckinPlanCloseDateTime() {
                return checkinPlanCloseDateTime;
            }

            /**
             * ����checkinPlanCloseDateTime���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckinPlanCloseDateTime(XMLGregorianCalendar value) {
                this.checkinPlanCloseDateTime = value;
            }

            /**
             * ��ȡcheckinPlanOpenDateTime���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckinPlanOpenDateTime() {
                return checkinPlanOpenDateTime;
            }

            /**
             * ����checkinPlanOpenDateTime���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckinPlanOpenDateTime(XMLGregorianCalendar value) {
                this.checkinPlanOpenDateTime = value;
            }

            /**
             * ��ȡterminalCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminalCode() {
                return terminalCode;
            }

            /**
             * ����terminalCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminalCode(String value) {
                this.terminalCode = value;
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
     *         &lt;element name="Identification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber"/>
     *                   &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
     *                   &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
     *                   &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GateCloseDateTime" type="{http://schema.ultra-as.com}GateCloseDateTime" minOccurs="0"/>
     *         &lt;element name="GateLastCallDateTime" type="{http://schema.ultra-as.com}GateLastCallDateTime" minOccurs="0"/>
     *         &lt;element name="GateOpenDateTime" type="{http://schema.ultra-as.com}GateOpenDateTime" minOccurs="0"/>
     *         &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode" minOccurs="0"/>
     *         &lt;element name="InformationRemark" type="{http://schema.ultra-as.com}InformationRemark" maxOccurs="2" minOccurs="0"/>
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
        "identification",
        "gateCloseDateTime",
        "gateLastCallDateTime",
        "gateOpenDateTime",
        "handlingAgentIATACode",
        "informationRemark"
    })
    public static class GateOperation {

        @XmlElement(name = "Identification", required = true)
        protected ResourceData.GateOperation.Identification identification;
        @XmlElementRef(name = "GateCloseDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> gateCloseDateTime;
        @XmlElementRef(name = "GateLastCallDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> gateLastCallDateTime;
        @XmlElementRef(name = "GateOpenDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> gateOpenDateTime;
        @XmlElementRef(name = "HandlingAgentIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> handlingAgentIATACode;
        @XmlElement(name = "InformationRemark", nillable = true)
        protected List<InformationRemark> informationRemark;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ResourceData.GateOperation.Identification }
         *     
         */
        public ResourceData.GateOperation.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ResourceData.GateOperation.Identification }
         *     
         */
        public void setIdentification(ResourceData.GateOperation.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡgateCloseDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getGateCloseDateTime() {
            return gateCloseDateTime;
        }

        /**
         * ����gateCloseDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setGateCloseDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.gateCloseDateTime = value;
        }

        /**
         * ��ȡgateLastCallDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getGateLastCallDateTime() {
            return gateLastCallDateTime;
        }

        /**
         * ����gateLastCallDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setGateLastCallDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.gateLastCallDateTime = value;
        }

        /**
         * ��ȡgateOpenDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getGateOpenDateTime() {
            return gateOpenDateTime;
        }

        /**
         * ����gateOpenDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setGateOpenDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.gateOpenDateTime = value;
        }

        /**
         * ��ȡhandlingAgentIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getHandlingAgentIATACode() {
            return handlingAgentIATACode;
        }

        /**
         * ����handlingAgentIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setHandlingAgentIATACode(JAXBElement<String> value) {
            this.handlingAgentIATACode = value;
        }

        /**
         * Gets the value of the informationRemark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informationRemark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformationRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InformationRemark }
         * 
         * 
         */
        public List<InformationRemark> getInformationRemark() {
            if (informationRemark == null) {
                informationRemark = new ArrayList<InformationRemark>();
            }
            return this.informationRemark;
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
         *         &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber"/>
         *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
         *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
         *         &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
         *         &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
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
            "flightIdentity",
            "flightRepeatCount",
            "scheduledDate",
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "GateNumber", required = true)
            protected String gateNumber;
            @XmlElement(name = "FlightIdentity", required = true)
            protected String flightIdentity;
            @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> flightRepeatCount;
            @XmlElement(name = "ScheduledDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar scheduledDate;
            @XmlElement(name = "TerminalCode")
            protected String terminalCode;

            /**
             * ��ȡgateNumber���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGateNumber() {
                return gateNumber;
            }

            /**
             * ����gateNumber���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGateNumber(String value) {
                this.gateNumber = value;
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

            /**
             * ��ȡterminalCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminalCode() {
                return terminalCode;
            }

            /**
             * ����terminalCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminalCode(String value) {
                this.terminalCode = value;
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
     *         &lt;element name="Identification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ResourceID" type="{http://schema.ultra-as.com}ResourceID"/>
     *                   &lt;element name="ResourceRole" type="{http://schema.ultra-as.com}ResourceRole"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ImpairmentEndDateTime" type="{http://schema.ultra-as.com}ImpairmentEndDateTime" minOccurs="0"/>
     *         &lt;element name="ImpairmentStartDateTime" type="{http://schema.ultra-as.com}ImpairmentStartDateTime"/>
     *         &lt;element name="ImpairmentDescription" type="{http://schema.ultra-as.com}ImpairmentDescription"/>
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
        "identification",
        "impairmentEndDateTime",
        "impairmentStartDateTime",
        "impairmentDescription"
    })
    public static class ResourceImpairment {

        @XmlElement(name = "Identification", required = true)
        protected ResourceData.ResourceImpairment.Identification identification;
        @XmlElementRef(name = "ImpairmentEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> impairmentEndDateTime;
        @XmlElement(name = "ImpairmentStartDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar impairmentStartDateTime;
        @XmlElement(name = "ImpairmentDescription", required = true)
        protected String impairmentDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ResourceData.ResourceImpairment.Identification }
         *     
         */
        public ResourceData.ResourceImpairment.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ResourceData.ResourceImpairment.Identification }
         *     
         */
        public void setIdentification(ResourceData.ResourceImpairment.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡimpairmentEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getImpairmentEndDateTime() {
            return impairmentEndDateTime;
        }

        /**
         * ����impairmentEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setImpairmentEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.impairmentEndDateTime = value;
        }

        /**
         * ��ȡimpairmentStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getImpairmentStartDateTime() {
            return impairmentStartDateTime;
        }

        /**
         * ����impairmentStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setImpairmentStartDateTime(XMLGregorianCalendar value) {
            this.impairmentStartDateTime = value;
        }

        /**
         * ��ȡimpairmentDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpairmentDescription() {
            return impairmentDescription;
        }

        /**
         * ����impairmentDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImpairmentDescription(String value) {
            this.impairmentDescription = value;
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
         *         &lt;element name="ResourceID" type="{http://schema.ultra-as.com}ResourceID"/>
         *         &lt;element name="ResourceRole" type="{http://schema.ultra-as.com}ResourceRole"/>
         *         &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
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
            "resourceID",
            "resourceRole",
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "ResourceID", required = true)
            protected String resourceID;
            @XmlElement(name = "ResourceRole", required = true)
            @XmlSchemaType(name = "string")
            protected ResourceRole resourceRole;
            @XmlElementRef(name = "TerminalCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
            protected JAXBElement<String> terminalCode;

            /**
             * ��ȡresourceID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResourceID() {
                return resourceID;
            }

            /**
             * ����resourceID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResourceID(String value) {
                this.resourceID = value;
            }

            /**
             * ��ȡresourceRole���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link ResourceRole }
             *     
             */
            public ResourceRole getResourceRole() {
                return resourceRole;
            }

            /**
             * ����resourceRole���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link ResourceRole }
             *     
             */
            public void setResourceRole(ResourceRole value) {
                this.resourceRole = value;
            }

            /**
             * ��ȡterminalCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTerminalCode() {
                return terminalCode;
            }

            /**
             * ����terminalCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTerminalCode(JAXBElement<String> value) {
                this.terminalCode = value;
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
     *         &lt;element name="Identification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="StandPosition" type="{http://schema.ultra-as.com}StandPosition"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration" minOccurs="0"/>
     *         &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode" minOccurs="0"/>
     *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity" minOccurs="0"/>
     *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
     *         &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate" minOccurs="0"/>
     *         &lt;element name="OffBlocksDateTime" type="{http://schema.ultra-as.com}OffBlocksDateTime" minOccurs="0"/>
     *         &lt;element name="OnBlocksDateTime" type="{http://schema.ultra-as.com}OnBlocksDateTime" minOccurs="0"/>
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
        "identification",
        "aircraftRegistration",
        "aircraftSubtypeIATACode",
        "flightIdentity",
        "flightRepeatCount",
        "scheduledDate",
        "offBlocksDateTime",
        "onBlocksDateTime"
    })
    public static class StandPositionOperation {

        @XmlElement(name = "Identification", required = true)
        protected ResourceData.StandPositionOperation.Identification identification;
        @XmlElementRef(name = "AircraftRegistration", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftRegistration;
        @XmlElementRef(name = "AircraftSubtypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftSubtypeIATACode;
        @XmlElementRef(name = "FlightIdentity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightIdentity;
        @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> flightRepeatCount;
        @XmlElementRef(name = "ScheduledDate", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> scheduledDate;
        @XmlElementRef(name = "OffBlocksDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> offBlocksDateTime;
        @XmlElementRef(name = "OnBlocksDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> onBlocksDateTime;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ResourceData.StandPositionOperation.Identification }
         *     
         */
        public ResourceData.StandPositionOperation.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ResourceData.StandPositionOperation.Identification }
         *     
         */
        public void setIdentification(ResourceData.StandPositionOperation.Identification value) {
            this.identification = value;
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
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getScheduledDate() {
            return scheduledDate;
        }

        /**
         * ����scheduledDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setScheduledDate(JAXBElement<XMLGregorianCalendar> value) {
            this.scheduledDate = value;
        }

        /**
         * ��ȡoffBlocksDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getOffBlocksDateTime() {
            return offBlocksDateTime;
        }

        /**
         * ����offBlocksDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setOffBlocksDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.offBlocksDateTime = value;
        }

        /**
         * ��ȡonBlocksDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getOnBlocksDateTime() {
            return onBlocksDateTime;
        }

        /**
         * ����onBlocksDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setOnBlocksDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.onBlocksDateTime = value;
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
         *         &lt;element name="StandPosition" type="{http://schema.ultra-as.com}StandPosition"/>
         *         &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
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
            "standPosition",
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "StandPosition", required = true)
            protected String standPosition;
            @XmlElement(name = "TerminalCode")
            protected String terminalCode;

            /**
             * ��ȡstandPosition���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStandPosition() {
                return standPosition;
            }

            /**
             * ����standPosition���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStandPosition(String value) {
                this.standPosition = value;
            }

            /**
             * ��ȡterminalCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminalCode() {
                return terminalCode;
            }

            /**
             * ����terminalCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminalCode(String value) {
                this.terminalCode = value;
            }

        }

    }

}

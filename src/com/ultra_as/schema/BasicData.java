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
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Collection of reference data common to basic data messages.
 * 
 * <p>BasicData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BasicData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AircraftRegistration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AircraftOwnerIATACode" type="{http://schema.ultra-as.com}AircraftOwnerIATACode" minOccurs="0"/>
 *                   &lt;element name="AircraftPassengerCapacity" type="{http://schema.ultra-as.com}AircraftPassengerCapacity" minOccurs="0"/>
 *                   &lt;element name="AircraftNoseNumber" type="{http://schema.ultra-as.com}AircraftNoseNumber" minOccurs="0"/>
 *                   &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode" minOccurs="0"/>
 *                   &lt;element name="AircraftTailNumber" type="{http://schema.ultra-as.com}AircraftTailNumber" minOccurs="0"/>
 *                   &lt;element name="AircraftRegistrationDescription" type="{http://schema.ultra-as.com}AircraftRegistrationDescription" minOccurs="0"/>
 *                   &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AircraftSubtype" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AircraftCategoryIATACode" type="{http://schema.ultra-as.com}AircraftCategoryIATACode" minOccurs="0"/>
 *                   &lt;element name="AircraftHeight" type="{http://schema.ultra-as.com}AircraftHeight" minOccurs="0"/>
 *                   &lt;element name="AircraftLength" type="{http://schema.ultra-as.com}AircraftLength" minOccurs="0"/>
 *                   &lt;element name="AircraftNoiseLevel" type="{http://schema.ultra-as.com}AircraftNoiseLevel" minOccurs="0"/>
 *                   &lt;element name="AircraftPassengerCapacity" type="{http://schema.ultra-as.com}AircraftPassengerCapacity" minOccurs="0"/>
 *                   &lt;element name="AircraftSubtypeDescription" type="{http://schema.ultra-as.com}AircraftSubtypeDescription" minOccurs="0"/>
 *                   &lt;element name="AircraftTypeIATACode" type="{http://schema.ultra-as.com}AircraftTypeIATACode" minOccurs="0"/>
 *                   &lt;element name="AircraftTypeICAOCode" type="{http://schema.ultra-as.com}AircraftTypeICAOCode" minOccurs="0"/>
 *                   &lt;element name="AircraftWeight" type="{http://schema.ultra-as.com}AircraftWeight" minOccurs="0"/>
 *                   &lt;element name="AircraftWidth" type="{http://schema.ultra-as.com}AircraftWidth" minOccurs="0"/>
 *                   &lt;element name="BusinessClassPassengerCapacity" type="{http://schema.ultra-as.com}BusinessClassPassengerCapacity" minOccurs="0"/>
 *                   &lt;element name="EconomyClassPassengerCapacity" type="{http://schema.ultra-as.com}EconomyClassPassengerCapacity" minOccurs="0"/>
 *                   &lt;element name="FirstClassPassengerCapacity" type="{http://schema.ultra-as.com}FirstClassPassengerCapacity" minOccurs="0"/>
 *                   &lt;element name="FreightCapacity" type="{http://schema.ultra-as.com}FreightCapacity" minOccurs="0"/>
 *                   &lt;element name="MaximumPayload" type="{http://schema.ultra-as.com}MaximumPayload" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Airline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AirlineICAOCode" type="{http://schema.ultra-as.com}AirlineICAOCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AirlineDescription" type="{http://schema.ultra-as.com}AirlineDescription" minOccurs="0"/>
 *                   &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode"/>
 *                   &lt;element name="AirlineName" type="{http://schema.ultra-as.com}AirlineName" minOccurs="0"/>
 *                   &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" minOccurs="0"/>
 *                   &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" minOccurs="0"/>
 *                   &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode" minOccurs="0"/>
 *                   &lt;element name="PublicCarrierCode" type="{http://schema.ultra-as.com}PublicCarrierCode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BaggageMakeupPosition" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BaggageMakeupPositionID" type="{http://schema.ultra-as.com}BaggageMakeupPositionID"/>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MakeupPositionCapacity" type="{http://schema.ultra-as.com}MakeupPositionCapacity" minOccurs="0"/>
 *                   &lt;element name="MakeupPositionDescription" type="{http://schema.ultra-as.com}MakeupPositionDescription" minOccurs="0"/>
 *                   &lt;element name="MakeupPositionStatus" type="{http://schema.ultra-as.com}MakeupPositionStatus" minOccurs="0"/>
 *                   &lt;element name="MakeupPositionStatusStartDateTime" type="{http://schema.ultra-as.com}MakeupPositionStatusStartDateTime" minOccurs="0"/>
 *                   &lt;element name="MakeupPositionStatusEndDateTime" type="{http://schema.ultra-as.com}MakeupPositionStatusEndDateTime" minOccurs="0"/>
 *                   &lt;element name="MakeupPositionStatusReason" type="{http://schema.ultra-as.com}MakeupPositionStatusReason" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BaggageReclaimCarousel" minOccurs="0">
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
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReclaimCarouselCapacity" type="{http://schema.ultra-as.com}ReclaimCarouselCapacity" minOccurs="0"/>
 *                   &lt;element name="ReclaimCarouselDescription" type="{http://schema.ultra-as.com}ReclaimCarouselDescription" minOccurs="0"/>
 *                   &lt;element name="ReclaimCarouselExitDoor" type="{http://schema.ultra-as.com}ReclaimCarouselExitDoor" minOccurs="0"/>
 *                   &lt;element name="ReclaimCarouselStatus" type="{http://schema.ultra-as.com}ReclaimCarouselStatus" minOccurs="0"/>
 *                   &lt;element name="ReclaimCarouselStatusStartDateTime" type="{http://schema.ultra-as.com}ReclaimCarouselStatusStartDateTime" minOccurs="0"/>
 *                   &lt;element name="ReclaimCarouselStatusEndDateTime" type="{http://schema.ultra-as.com}ReclaimCarouselStatusEndDateTime" minOccurs="0"/>
 *                   &lt;element name="ReclaimCarouselStatusReason" type="{http://schema.ultra-as.com}ReclaimCarouselStatusReason" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BoardingBridge" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BridgeID" type="{http://schema.ultra-as.com}BridgeID"/>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BridgeDescription" type="{http://schema.ultra-as.com}BridgeDescription" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusGeneral" type="{http://schema.ultra-as.com}BridgeStatusGeneral" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusGeneralEndDateTime" type="{http://schema.ultra-as.com}BridgeStatusGeneralEndDateTime" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusGeneralReason" type="{http://schema.ultra-as.com}BridgeStatusGeneralReason" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusGeneralStartDateTime" type="{http://schema.ultra-as.com}BridgeStatusGeneralStartDateTime" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusPCA" type="{http://schema.ultra-as.com}BridgeStatusPCA" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusPCAEndDateTime" type="{http://schema.ultra-as.com}BridgeStatusPCAEndDateTime" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusPCAReason" type="{http://schema.ultra-as.com}BridgeStatusPCAReason" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusPCAStartDateTime" type="{http://schema.ultra-as.com}BridgeStatusPCAStartDateTime" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusPower" type="{http://schema.ultra-as.com}BridgeStatusPower" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusPowerEndDateTime" type="{http://schema.ultra-as.com}BridgeStatusPowerEndDateTime" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusPowerReason" type="{http://schema.ultra-as.com}BridgeStatusPowerReason" minOccurs="0"/>
 *                   &lt;element name="BridgeStatusPowerStartDateTime" type="{http://schema.ultra-as.com}BridgeStatusPowerStartDateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CAACDelayCategory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CAACDelayCategory" type="{http://schema.ultra-as.com}CAACDelayCategory"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CAACDelayCategoryDescription" type="{http://schema.ultra-as.com}CAACDelayCategoryDescription" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CAACDelayCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CAACDelayCode" type="{http://schema.ultra-as.com}CAACDelayCode"/>
 *                             &lt;element name="CAACDelayCategory" type="{http://schema.ultra-as.com}CAACDelayCategory"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CAACDelayCodeDescription" type="{http://schema.ultra-as.com}CAACDelayCodeDescription" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckinAirlineClass" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode"/>
 *                             &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CheckinClassDescription" type="{http://schema.ultra-as.com}CheckinClassDescription" minOccurs="0"/>
 *                   &lt;element name="InformationRemark" type="{http://schema.ultra-as.com}InformationRemark" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckinClass" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CheckinClassDescription" type="{http://schema.ultra-as.com}CheckinClassDescription" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckinDesk" minOccurs="0">
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
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CheckinDeskDescription" type="{http://schema.ultra-as.com}CheckinDeskDescription" minOccurs="0"/>
 *                   &lt;element name="CheckinDeskStatus" type="{http://schema.ultra-as.com}CheckinDeskStatus" minOccurs="0"/>
 *                   &lt;element name="CheckinDeskStatusEndDateTime" type="{http://schema.ultra-as.com}CheckinDeskStatusEndDateTime" minOccurs="0"/>
 *                   &lt;element name="CheckinDeskStatusReason" type="{http://schema.ultra-as.com}CheckinDeskStatusReason" minOccurs="0"/>
 *                   &lt;element name="CheckinDeskStatusStartDateTime" type="{http://schema.ultra-as.com}CheckinDeskStatusStartDateTime" minOccurs="0"/>
 *                   &lt;element name="CheckinGroup" type="{http://schema.ultra-as.com}CheckinGroup" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DelayCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IrregularityIATACode" type="{http://schema.ultra-as.com}IrregularityIATACode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DelayCodeDescription" type="{http://schema.ultra-as.com}DelayCodeDescription" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightClassification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightClassificationCode" type="{http://schema.ultra-as.com}FlightClassificationCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClassificationCodeDescription" type="{http://schema.ultra-as.com}ClassificationCodeDescription" minOccurs="0"/>
 *                   &lt;element name="IsFlightClassificationDefault" type="{http://schema.ultra-as.com}IsFlightClassificationDefault" minOccurs="0"/>
 *                   &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightNature" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlightNatureDescription" type="{http://schema.ultra-as.com}FlightNatureDescription" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightSector" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlightSectorDescription" type="{http://schema.ultra-as.com}FlightSectorDescription" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightServiceType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode"/>
 *                   &lt;element name="FlightServiceTypeDescription" type="{http://schema.ultra-as.com}FlightServiceTypeDescription" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Gate" minOccurs="0">
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AssociatedGateNumber" type="{http://schema.ultra-as.com}AssociatedGateNumber" minOccurs="0"/>
 *                   &lt;element name="BridgeID" type="{http://schema.ultra-as.com}BridgeID" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="GateDescription" type="{http://schema.ultra-as.com}GateDescription" minOccurs="0"/>
 *                   &lt;element name="GateStatus" type="{http://schema.ultra-as.com}GateStatus" minOccurs="0"/>
 *                   &lt;element name="GateStatusEndDateTime" type="{http://schema.ultra-as.com}GateStatusEndDateTime" minOccurs="0"/>
 *                   &lt;element name="GateStatusReason" type="{http://schema.ultra-as.com}GateStatusReason" minOccurs="0"/>
 *                   &lt;element name="GateStatusStartDateTime" type="{http://schema.ultra-as.com}GateStatusStartDateTime" minOccurs="0"/>
 *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Handler" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HandlingAgentDescription" type="{http://schema.ultra-as.com}HandlingAgentDescription" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LocalisationText" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TextCategoryCode" type="{http://schema.ultra-as.com}TextCategoryCode"/>
 *                             &lt;element name="TextCode" type="{http://schema.ultra-as.com}TextCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ChineseLanguageText" type="{http://schema.ultra-as.com}ChineseLanguageText" minOccurs="0"/>
 *                   &lt;element name="EnglishLanguageText" type="{http://schema.ultra-as.com}EnglishLanguageText" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LocationIATACode" type="{http://schema.ultra-as.com}LocationIATACode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AbbreviatedChinese" type="{http://schema.ultra-as.com}AbbreviatedChinese" minOccurs="0"/>
 *                   &lt;element name="CountryCode" type="{http://schema.ultra-as.com}CountryCode" minOccurs="0"/>
 *                   &lt;element name="CountryName" type="{http://schema.ultra-as.com}CountryName" minOccurs="0"/>
 *                   &lt;element name="FlightElapsedJetTime" type="{http://schema.ultra-as.com}FlightElapsedJetTime" minOccurs="0"/>
 *                   &lt;element name="FlightElapsedPropellerTime" type="{http://schema.ultra-as.com}FlightElapsedPropellerTime" minOccurs="0"/>
 *                   &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" minOccurs="0"/>
 *                   &lt;element name="LocationDescription" type="{http://schema.ultra-as.com}LocationDescription" minOccurs="0"/>
 *                   &lt;element name="LocationICAOCode" type="{http://schema.ultra-as.com}LocationICAOCode" minOccurs="0"/>
 *                   &lt;element name="LocationName" type="{http://schema.ultra-as.com}LocationName" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Runway" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RunwayID" type="{http://schema.ultra-as.com}RunwayID"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RunwayDescription" type="{http://schema.ultra-as.com}RunwayDescription" minOccurs="0"/>
 *                   &lt;element name="RunwayStatus" type="{http://schema.ultra-as.com}RunwayStatus" minOccurs="0"/>
 *                   &lt;element name="RunwayStatusEndDateTime" type="{http://schema.ultra-as.com}RunwayStatusEndDateTime" minOccurs="0"/>
 *                   &lt;element name="RunwayStatusReason" type="{http://schema.ultra-as.com}RunwayStatusReason" minOccurs="0"/>
 *                   &lt;element name="RunwayStatusStartDateTime" type="{http://schema.ultra-as.com}RunwayStatusStartDateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Stand" minOccurs="0">
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber" minOccurs="0"/>
 *                   &lt;element name="StandDescription" type="{http://schema.ultra-as.com}StandDescription" minOccurs="0"/>
 *                   &lt;element name="StandIsSecure" type="{http://schema.ultra-as.com}StandIsSecure" minOccurs="0"/>
 *                   &lt;element name="StandStatus" type="{http://schema.ultra-as.com}StandStatus" minOccurs="0"/>
 *                   &lt;element name="StandStatusEndDateTime" type="{http://schema.ultra-as.com}StandStatusEndDateTime" minOccurs="0"/>
 *                   &lt;element name="StandStatusReason" type="{http://schema.ultra-as.com}StandStatusReason" minOccurs="0"/>
 *                   &lt;element name="StandStatusStartDateTime" type="{http://schema.ultra-as.com}StandStatusStartDateTime" minOccurs="0"/>
 *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Terminal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode"/>
 *                   &lt;element name="TerminalDescription" type="{http://schema.ultra-as.com}TerminalDescription" minOccurs="0"/>
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
@XmlType(name = "BasicData", propOrder = {
    "aircraftRegistration",
    "aircraftSubtype",
    "airline",
    "baggageMakeupPosition",
    "baggageReclaimCarousel",
    "boardingBridge",
    "caacDelayCategory",
    "caacDelayCode",
    "checkinAirlineClass",
    "checkinClass",
    "checkinDesk",
    "delayCode",
    "flightClassification",
    "flightNature",
    "flightSector",
    "flightServiceType",
    "gate",
    "handler",
    "localisationText",
    "location",
    "runway",
    "stand",
    "terminal"
})
public class BasicData {

    @XmlElement(name = "AircraftRegistration")
    protected BasicData.AircraftRegistration aircraftRegistration;
    @XmlElement(name = "AircraftSubtype")
    protected BasicData.AircraftSubtype aircraftSubtype;
    @XmlElement(name = "Airline")
    protected BasicData.Airline airline;
    @XmlElement(name = "BaggageMakeupPosition")
    protected BasicData.BaggageMakeupPosition baggageMakeupPosition;
    @XmlElement(name = "BaggageReclaimCarousel")
    protected BasicData.BaggageReclaimCarousel baggageReclaimCarousel;
    @XmlElement(name = "BoardingBridge")
    protected BasicData.BoardingBridge boardingBridge;
    @XmlElement(name = "CAACDelayCategory")
    protected BasicData.CAACDelayCategory caacDelayCategory;
    @XmlElement(name = "CAACDelayCode")
    protected BasicData.CAACDelayCode caacDelayCode;
    @XmlElement(name = "CheckinAirlineClass")
    protected BasicData.CheckinAirlineClass checkinAirlineClass;
    @XmlElement(name = "CheckinClass")
    protected BasicData.CheckinClass checkinClass;
    @XmlElement(name = "CheckinDesk")
    protected BasicData.CheckinDesk checkinDesk;
    @XmlElement(name = "DelayCode")
    protected BasicData.DelayCode delayCode;
    @XmlElement(name = "FlightClassification")
    protected BasicData.FlightClassification flightClassification;
    @XmlElement(name = "FlightNature")
    protected BasicData.FlightNature flightNature;
    @XmlElement(name = "FlightSector")
    protected BasicData.FlightSector flightSector;
    @XmlElement(name = "FlightServiceType")
    protected BasicData.FlightServiceType flightServiceType;
    @XmlElement(name = "Gate")
    protected BasicData.Gate gate;
    @XmlElement(name = "Handler")
    protected BasicData.Handler handler;
    @XmlElement(name = "LocalisationText")
    protected BasicData.LocalisationText localisationText;
    @XmlElement(name = "Location")
    protected BasicData.Location location;
    @XmlElement(name = "Runway")
    protected BasicData.Runway runway;
    @XmlElement(name = "Stand")
    protected BasicData.Stand stand;
    @XmlElement(name = "Terminal")
    protected BasicData.Terminal terminal;

    /**
     * ��ȡaircraftRegistration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.AircraftRegistration }
     *     
     */
    public BasicData.AircraftRegistration getAircraftRegistration() {
        return aircraftRegistration;
    }

    /**
     * ����aircraftRegistration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.AircraftRegistration }
     *     
     */
    public void setAircraftRegistration(BasicData.AircraftRegistration value) {
        this.aircraftRegistration = value;
    }

    /**
     * ��ȡaircraftSubtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.AircraftSubtype }
     *     
     */
    public BasicData.AircraftSubtype getAircraftSubtype() {
        return aircraftSubtype;
    }

    /**
     * ����aircraftSubtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.AircraftSubtype }
     *     
     */
    public void setAircraftSubtype(BasicData.AircraftSubtype value) {
        this.aircraftSubtype = value;
    }

    /**
     * ��ȡairline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.Airline }
     *     
     */
    public BasicData.Airline getAirline() {
        return airline;
    }

    /**
     * ����airline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.Airline }
     *     
     */
    public void setAirline(BasicData.Airline value) {
        this.airline = value;
    }

    /**
     * ��ȡbaggageMakeupPosition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.BaggageMakeupPosition }
     *     
     */
    public BasicData.BaggageMakeupPosition getBaggageMakeupPosition() {
        return baggageMakeupPosition;
    }

    /**
     * ����baggageMakeupPosition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.BaggageMakeupPosition }
     *     
     */
    public void setBaggageMakeupPosition(BasicData.BaggageMakeupPosition value) {
        this.baggageMakeupPosition = value;
    }

    /**
     * ��ȡbaggageReclaimCarousel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.BaggageReclaimCarousel }
     *     
     */
    public BasicData.BaggageReclaimCarousel getBaggageReclaimCarousel() {
        return baggageReclaimCarousel;
    }

    /**
     * ����baggageReclaimCarousel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.BaggageReclaimCarousel }
     *     
     */
    public void setBaggageReclaimCarousel(BasicData.BaggageReclaimCarousel value) {
        this.baggageReclaimCarousel = value;
    }

    /**
     * ��ȡboardingBridge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.BoardingBridge }
     *     
     */
    public BasicData.BoardingBridge getBoardingBridge() {
        return boardingBridge;
    }

    /**
     * ����boardingBridge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.BoardingBridge }
     *     
     */
    public void setBoardingBridge(BasicData.BoardingBridge value) {
        this.boardingBridge = value;
    }

    /**
     * ��ȡcaacDelayCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.CAACDelayCategory }
     *     
     */
    public BasicData.CAACDelayCategory getCAACDelayCategory() {
        return caacDelayCategory;
    }

    /**
     * ����caacDelayCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.CAACDelayCategory }
     *     
     */
    public void setCAACDelayCategory(BasicData.CAACDelayCategory value) {
        this.caacDelayCategory = value;
    }

    /**
     * ��ȡcaacDelayCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.CAACDelayCode }
     *     
     */
    public BasicData.CAACDelayCode getCAACDelayCode() {
        return caacDelayCode;
    }

    /**
     * ����caacDelayCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.CAACDelayCode }
     *     
     */
    public void setCAACDelayCode(BasicData.CAACDelayCode value) {
        this.caacDelayCode = value;
    }

    /**
     * ��ȡcheckinAirlineClass���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.CheckinAirlineClass }
     *     
     */
    public BasicData.CheckinAirlineClass getCheckinAirlineClass() {
        return checkinAirlineClass;
    }

    /**
     * ����checkinAirlineClass���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.CheckinAirlineClass }
     *     
     */
    public void setCheckinAirlineClass(BasicData.CheckinAirlineClass value) {
        this.checkinAirlineClass = value;
    }

    /**
     * ��ȡcheckinClass���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.CheckinClass }
     *     
     */
    public BasicData.CheckinClass getCheckinClass() {
        return checkinClass;
    }

    /**
     * ����checkinClass���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.CheckinClass }
     *     
     */
    public void setCheckinClass(BasicData.CheckinClass value) {
        this.checkinClass = value;
    }

    /**
     * ��ȡcheckinDesk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.CheckinDesk }
     *     
     */
    public BasicData.CheckinDesk getCheckinDesk() {
        return checkinDesk;
    }

    /**
     * ����checkinDesk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.CheckinDesk }
     *     
     */
    public void setCheckinDesk(BasicData.CheckinDesk value) {
        this.checkinDesk = value;
    }

    /**
     * ��ȡdelayCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.DelayCode }
     *     
     */
    public BasicData.DelayCode getDelayCode() {
        return delayCode;
    }

    /**
     * ����delayCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.DelayCode }
     *     
     */
    public void setDelayCode(BasicData.DelayCode value) {
        this.delayCode = value;
    }

    /**
     * ��ȡflightClassification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.FlightClassification }
     *     
     */
    public BasicData.FlightClassification getFlightClassification() {
        return flightClassification;
    }

    /**
     * ����flightClassification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.FlightClassification }
     *     
     */
    public void setFlightClassification(BasicData.FlightClassification value) {
        this.flightClassification = value;
    }

    /**
     * ��ȡflightNature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.FlightNature }
     *     
     */
    public BasicData.FlightNature getFlightNature() {
        return flightNature;
    }

    /**
     * ����flightNature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.FlightNature }
     *     
     */
    public void setFlightNature(BasicData.FlightNature value) {
        this.flightNature = value;
    }

    /**
     * ��ȡflightSector���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.FlightSector }
     *     
     */
    public BasicData.FlightSector getFlightSector() {
        return flightSector;
    }

    /**
     * ����flightSector���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.FlightSector }
     *     
     */
    public void setFlightSector(BasicData.FlightSector value) {
        this.flightSector = value;
    }

    /**
     * ��ȡflightServiceType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.FlightServiceType }
     *     
     */
    public BasicData.FlightServiceType getFlightServiceType() {
        return flightServiceType;
    }

    /**
     * ����flightServiceType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.FlightServiceType }
     *     
     */
    public void setFlightServiceType(BasicData.FlightServiceType value) {
        this.flightServiceType = value;
    }

    /**
     * ��ȡgate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.Gate }
     *     
     */
    public BasicData.Gate getGate() {
        return gate;
    }

    /**
     * ����gate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.Gate }
     *     
     */
    public void setGate(BasicData.Gate value) {
        this.gate = value;
    }

    /**
     * ��ȡhandler���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.Handler }
     *     
     */
    public BasicData.Handler getHandler() {
        return handler;
    }

    /**
     * ����handler���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.Handler }
     *     
     */
    public void setHandler(BasicData.Handler value) {
        this.handler = value;
    }

    /**
     * ��ȡlocalisationText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.LocalisationText }
     *     
     */
    public BasicData.LocalisationText getLocalisationText() {
        return localisationText;
    }

    /**
     * ����localisationText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.LocalisationText }
     *     
     */
    public void setLocalisationText(BasicData.LocalisationText value) {
        this.localisationText = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.Location }
     *     
     */
    public BasicData.Location getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.Location }
     *     
     */
    public void setLocation(BasicData.Location value) {
        this.location = value;
    }

    /**
     * ��ȡrunway���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.Runway }
     *     
     */
    public BasicData.Runway getRunway() {
        return runway;
    }

    /**
     * ����runway���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.Runway }
     *     
     */
    public void setRunway(BasicData.Runway value) {
        this.runway = value;
    }

    /**
     * ��ȡstand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.Stand }
     *     
     */
    public BasicData.Stand getStand() {
        return stand;
    }

    /**
     * ����stand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.Stand }
     *     
     */
    public void setStand(BasicData.Stand value) {
        this.stand = value;
    }

    /**
     * ��ȡterminal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicData.Terminal }
     *     
     */
    public BasicData.Terminal getTerminal() {
        return terminal;
    }

    /**
     * ����terminal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData.Terminal }
     *     
     */
    public void setTerminal(BasicData.Terminal value) {
        this.terminal = value;
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
     *                   &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AircraftOwnerIATACode" type="{http://schema.ultra-as.com}AircraftOwnerIATACode" minOccurs="0"/>
     *         &lt;element name="AircraftPassengerCapacity" type="{http://schema.ultra-as.com}AircraftPassengerCapacity" minOccurs="0"/>
     *         &lt;element name="AircraftNoseNumber" type="{http://schema.ultra-as.com}AircraftNoseNumber" minOccurs="0"/>
     *         &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode" minOccurs="0"/>
     *         &lt;element name="AircraftTailNumber" type="{http://schema.ultra-as.com}AircraftTailNumber" minOccurs="0"/>
     *         &lt;element name="AircraftRegistrationDescription" type="{http://schema.ultra-as.com}AircraftRegistrationDescription" minOccurs="0"/>
     *         &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode" minOccurs="0"/>
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
        "aircraftOwnerIATACode",
        "aircraftPassengerCapacity",
        "aircraftNoseNumber",
        "aircraftSubtypeIATACode",
        "aircraftTailNumber",
        "aircraftRegistrationDescription",
        "airlineIATACode"
    })
    public static class AircraftRegistration {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.AircraftRegistration.Identification identification;
        @XmlElementRef(name = "AircraftOwnerIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftOwnerIATACode;
        @XmlElementRef(name = "AircraftPassengerCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> aircraftPassengerCapacity;
        @XmlElementRef(name = "AircraftNoseNumber", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftNoseNumber;
        @XmlElementRef(name = "AircraftSubtypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftSubtypeIATACode;
        @XmlElementRef(name = "AircraftTailNumber", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftTailNumber;
        @XmlElementRef(name = "AircraftRegistrationDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftRegistrationDescription;
        @XmlElementRef(name = "AirlineIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> airlineIATACode;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.AircraftRegistration.Identification }
         *     
         */
        public BasicData.AircraftRegistration.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.AircraftRegistration.Identification }
         *     
         */
        public void setIdentification(BasicData.AircraftRegistration.Identification value) {
            this.identification = value;
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
         * ��ȡaircraftNoseNumber���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftNoseNumber() {
            return aircraftNoseNumber;
        }

        /**
         * ����aircraftNoseNumber���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftNoseNumber(JAXBElement<String> value) {
            this.aircraftNoseNumber = value;
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
         * ��ȡaircraftTailNumber���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftTailNumber() {
            return aircraftTailNumber;
        }

        /**
         * ����aircraftTailNumber���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftTailNumber(JAXBElement<String> value) {
            this.aircraftTailNumber = value;
        }

        /**
         * ��ȡaircraftRegistrationDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftRegistrationDescription() {
            return aircraftRegistrationDescription;
        }

        /**
         * ����aircraftRegistrationDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftRegistrationDescription(JAXBElement<String> value) {
            this.aircraftRegistrationDescription = value;
        }

        /**
         * ��ȡairlineIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAirlineIATACode() {
            return airlineIATACode;
        }

        /**
         * ����airlineIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAirlineIATACode(JAXBElement<String> value) {
            this.airlineIATACode = value;
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
         *         &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration"/>
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
            "aircraftRegistration"
        })
        public static class Identification {

            @XmlElement(name = "AircraftRegistration", required = true)
            protected String aircraftRegistration;

            /**
             * ��ȡaircraftRegistration���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAircraftRegistration() {
                return aircraftRegistration;
            }

            /**
             * ����aircraftRegistration���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAircraftRegistration(String value) {
                this.aircraftRegistration = value;
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
     *                   &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AircraftCategoryIATACode" type="{http://schema.ultra-as.com}AircraftCategoryIATACode" minOccurs="0"/>
     *         &lt;element name="AircraftHeight" type="{http://schema.ultra-as.com}AircraftHeight" minOccurs="0"/>
     *         &lt;element name="AircraftLength" type="{http://schema.ultra-as.com}AircraftLength" minOccurs="0"/>
     *         &lt;element name="AircraftNoiseLevel" type="{http://schema.ultra-as.com}AircraftNoiseLevel" minOccurs="0"/>
     *         &lt;element name="AircraftPassengerCapacity" type="{http://schema.ultra-as.com}AircraftPassengerCapacity" minOccurs="0"/>
     *         &lt;element name="AircraftSubtypeDescription" type="{http://schema.ultra-as.com}AircraftSubtypeDescription" minOccurs="0"/>
     *         &lt;element name="AircraftTypeIATACode" type="{http://schema.ultra-as.com}AircraftTypeIATACode" minOccurs="0"/>
     *         &lt;element name="AircraftTypeICAOCode" type="{http://schema.ultra-as.com}AircraftTypeICAOCode" minOccurs="0"/>
     *         &lt;element name="AircraftWeight" type="{http://schema.ultra-as.com}AircraftWeight" minOccurs="0"/>
     *         &lt;element name="AircraftWidth" type="{http://schema.ultra-as.com}AircraftWidth" minOccurs="0"/>
     *         &lt;element name="BusinessClassPassengerCapacity" type="{http://schema.ultra-as.com}BusinessClassPassengerCapacity" minOccurs="0"/>
     *         &lt;element name="EconomyClassPassengerCapacity" type="{http://schema.ultra-as.com}EconomyClassPassengerCapacity" minOccurs="0"/>
     *         &lt;element name="FirstClassPassengerCapacity" type="{http://schema.ultra-as.com}FirstClassPassengerCapacity" minOccurs="0"/>
     *         &lt;element name="FreightCapacity" type="{http://schema.ultra-as.com}FreightCapacity" minOccurs="0"/>
     *         &lt;element name="MaximumPayload" type="{http://schema.ultra-as.com}MaximumPayload" minOccurs="0"/>
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
        "aircraftCategoryIATACode",
        "aircraftHeight",
        "aircraftLength",
        "aircraftNoiseLevel",
        "aircraftPassengerCapacity",
        "aircraftSubtypeDescription",
        "aircraftTypeIATACode",
        "aircraftTypeICAOCode",
        "aircraftWeight",
        "aircraftWidth",
        "businessClassPassengerCapacity",
        "economyClassPassengerCapacity",
        "firstClassPassengerCapacity",
        "freightCapacity",
        "maximumPayload"
    })
    public static class AircraftSubtype {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.AircraftSubtype.Identification identification;
        @XmlElementRef(name = "AircraftCategoryIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftCategoryIATACode;
        @XmlElementRef(name = "AircraftHeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> aircraftHeight;
        @XmlElementRef(name = "AircraftLength", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> aircraftLength;
        @XmlElementRef(name = "AircraftNoiseLevel", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftNoiseLevel;
        @XmlElementRef(name = "AircraftPassengerCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> aircraftPassengerCapacity;
        @XmlElementRef(name = "AircraftSubtypeDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftSubtypeDescription;
        @XmlElementRef(name = "AircraftTypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftTypeIATACode;
        @XmlElementRef(name = "AircraftTypeICAOCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> aircraftTypeICAOCode;
        @XmlElementRef(name = "AircraftWeight", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> aircraftWeight;
        @XmlElementRef(name = "AircraftWidth", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> aircraftWidth;
        @XmlElementRef(name = "BusinessClassPassengerCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> businessClassPassengerCapacity;
        @XmlElementRef(name = "EconomyClassPassengerCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> economyClassPassengerCapacity;
        @XmlElementRef(name = "FirstClassPassengerCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> firstClassPassengerCapacity;
        @XmlElementRef(name = "FreightCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> freightCapacity;
        @XmlElementRef(name = "MaximumPayload", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> maximumPayload;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.AircraftSubtype.Identification }
         *     
         */
        public BasicData.AircraftSubtype.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.AircraftSubtype.Identification }
         *     
         */
        public void setIdentification(BasicData.AircraftSubtype.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡaircraftCategoryIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftCategoryIATACode() {
            return aircraftCategoryIATACode;
        }

        /**
         * ����aircraftCategoryIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftCategoryIATACode(JAXBElement<String> value) {
            this.aircraftCategoryIATACode = value;
        }

        /**
         * ��ȡaircraftHeight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getAircraftHeight() {
            return aircraftHeight;
        }

        /**
         * ����aircraftHeight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setAircraftHeight(JAXBElement<Integer> value) {
            this.aircraftHeight = value;
        }

        /**
         * ��ȡaircraftLength���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getAircraftLength() {
            return aircraftLength;
        }

        /**
         * ����aircraftLength���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setAircraftLength(JAXBElement<Integer> value) {
            this.aircraftLength = value;
        }

        /**
         * ��ȡaircraftNoiseLevel���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftNoiseLevel() {
            return aircraftNoiseLevel;
        }

        /**
         * ����aircraftNoiseLevel���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftNoiseLevel(JAXBElement<String> value) {
            this.aircraftNoiseLevel = value;
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
         * ��ȡaircraftSubtypeDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftSubtypeDescription() {
            return aircraftSubtypeDescription;
        }

        /**
         * ����aircraftSubtypeDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftSubtypeDescription(JAXBElement<String> value) {
            this.aircraftSubtypeDescription = value;
        }

        /**
         * ��ȡaircraftTypeIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAircraftTypeIATACode() {
            return aircraftTypeIATACode;
        }

        /**
         * ����aircraftTypeIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAircraftTypeIATACode(JAXBElement<String> value) {
            this.aircraftTypeIATACode = value;
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
         * ��ȡaircraftWeight���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getAircraftWeight() {
            return aircraftWeight;
        }

        /**
         * ����aircraftWeight���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setAircraftWeight(JAXBElement<Integer> value) {
            this.aircraftWeight = value;
        }

        /**
         * ��ȡaircraftWidth���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getAircraftWidth() {
            return aircraftWidth;
        }

        /**
         * ����aircraftWidth���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setAircraftWidth(JAXBElement<Integer> value) {
            this.aircraftWidth = value;
        }

        /**
         * ��ȡbusinessClassPassengerCapacity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getBusinessClassPassengerCapacity() {
            return businessClassPassengerCapacity;
        }

        /**
         * ����businessClassPassengerCapacity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setBusinessClassPassengerCapacity(JAXBElement<Integer> value) {
            this.businessClassPassengerCapacity = value;
        }

        /**
         * ��ȡeconomyClassPassengerCapacity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getEconomyClassPassengerCapacity() {
            return economyClassPassengerCapacity;
        }

        /**
         * ����economyClassPassengerCapacity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setEconomyClassPassengerCapacity(JAXBElement<Integer> value) {
            this.economyClassPassengerCapacity = value;
        }

        /**
         * ��ȡfirstClassPassengerCapacity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getFirstClassPassengerCapacity() {
            return firstClassPassengerCapacity;
        }

        /**
         * ����firstClassPassengerCapacity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setFirstClassPassengerCapacity(JAXBElement<Integer> value) {
            this.firstClassPassengerCapacity = value;
        }

        /**
         * ��ȡfreightCapacity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getFreightCapacity() {
            return freightCapacity;
        }

        /**
         * ����freightCapacity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setFreightCapacity(JAXBElement<Integer> value) {
            this.freightCapacity = value;
        }

        /**
         * ��ȡmaximumPayload���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getMaximumPayload() {
            return maximumPayload;
        }

        /**
         * ����maximumPayload���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setMaximumPayload(JAXBElement<Integer> value) {
            this.maximumPayload = value;
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
         *         &lt;element name="AircraftSubtypeIATACode" type="{http://schema.ultra-as.com}AircraftSubtypeIATACode"/>
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
        public static class Identification {

            @XmlElement(name = "AircraftSubtypeIATACode", required = true)
            protected String aircraftSubtypeIATACode;

            /**
             * ��ȡaircraftSubtypeIATACode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAircraftSubtypeIATACode() {
                return aircraftSubtypeIATACode;
            }

            /**
             * ����aircraftSubtypeIATACode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAircraftSubtypeIATACode(String value) {
                this.aircraftSubtypeIATACode = value;
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
     *                   &lt;element name="AirlineICAOCode" type="{http://schema.ultra-as.com}AirlineICAOCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AirlineDescription" type="{http://schema.ultra-as.com}AirlineDescription" minOccurs="0"/>
     *         &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode"/>
     *         &lt;element name="AirlineName" type="{http://schema.ultra-as.com}AirlineName" minOccurs="0"/>
     *         &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" minOccurs="0"/>
     *         &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" minOccurs="0"/>
     *         &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode" minOccurs="0"/>
     *         &lt;element name="PublicCarrierCode" type="{http://schema.ultra-as.com}PublicCarrierCode" minOccurs="0"/>
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
        "airlineDescription",
        "airlineIATACode",
        "airlineName",
        "flightSectorCode",
        "flightServiceTypeIATACode",
        "handlingAgentIATACode",
        "publicCarrierCode"
    })
    public static class Airline {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.Airline.Identification identification;
        @XmlElementRef(name = "AirlineDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> airlineDescription;
        @XmlElement(name = "AirlineIATACode", required = true)
        protected String airlineIATACode;
        @XmlElementRef(name = "AirlineName", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> airlineName;
        @XmlElementRef(name = "FlightSectorCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightSectorCode> flightSectorCode;
        @XmlElementRef(name = "FlightServiceTypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightServiceTypeIATACode;
        @XmlElementRef(name = "HandlingAgentIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> handlingAgentIATACode;
        @XmlElementRef(name = "PublicCarrierCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> publicCarrierCode;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.Airline.Identification }
         *     
         */
        public BasicData.Airline.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.Airline.Identification }
         *     
         */
        public void setIdentification(BasicData.Airline.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡairlineDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAirlineDescription() {
            return airlineDescription;
        }

        /**
         * ����airlineDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAirlineDescription(JAXBElement<String> value) {
            this.airlineDescription = value;
        }

        /**
         * ��ȡairlineIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirlineIATACode() {
            return airlineIATACode;
        }

        /**
         * ����airlineIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirlineIATACode(String value) {
            this.airlineIATACode = value;
        }

        /**
         * ��ȡairlineName���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAirlineName() {
            return airlineName;
        }

        /**
         * ����airlineName���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAirlineName(JAXBElement<String> value) {
            this.airlineName = value;
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
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AirlineICAOCode" type="{http://schema.ultra-as.com}AirlineICAOCode"/>
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
            "airlineICAOCode"
        })
        public static class Identification {

            @XmlElement(name = "AirlineICAOCode", required = true)
            protected String airlineICAOCode;

            /**
             * ��ȡairlineICAOCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirlineICAOCode() {
                return airlineICAOCode;
            }

            /**
             * ����airlineICAOCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirlineICAOCode(String value) {
                this.airlineICAOCode = value;
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
     *                   &lt;element name="BaggageMakeupPositionID" type="{http://schema.ultra-as.com}BaggageMakeupPositionID"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MakeupPositionCapacity" type="{http://schema.ultra-as.com}MakeupPositionCapacity" minOccurs="0"/>
     *         &lt;element name="MakeupPositionDescription" type="{http://schema.ultra-as.com}MakeupPositionDescription" minOccurs="0"/>
     *         &lt;element name="MakeupPositionStatus" type="{http://schema.ultra-as.com}MakeupPositionStatus" minOccurs="0"/>
     *         &lt;element name="MakeupPositionStatusStartDateTime" type="{http://schema.ultra-as.com}MakeupPositionStatusStartDateTime" minOccurs="0"/>
     *         &lt;element name="MakeupPositionStatusEndDateTime" type="{http://schema.ultra-as.com}MakeupPositionStatusEndDateTime" minOccurs="0"/>
     *         &lt;element name="MakeupPositionStatusReason" type="{http://schema.ultra-as.com}MakeupPositionStatusReason" minOccurs="0"/>
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
        "makeupPositionCapacity",
        "makeupPositionDescription",
        "makeupPositionStatus",
        "makeupPositionStatusStartDateTime",
        "makeupPositionStatusEndDateTime",
        "makeupPositionStatusReason"
    })
    public static class BaggageMakeupPosition {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.BaggageMakeupPosition.Identification identification;
        @XmlElementRef(name = "MakeupPositionCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> makeupPositionCapacity;
        @XmlElementRef(name = "MakeupPositionDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> makeupPositionDescription;
        @XmlElementRef(name = "MakeupPositionStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<MakeupPositionStatus> makeupPositionStatus;
        @XmlElementRef(name = "MakeupPositionStatusStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> makeupPositionStatusStartDateTime;
        @XmlElementRef(name = "MakeupPositionStatusEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> makeupPositionStatusEndDateTime;
        @XmlElementRef(name = "MakeupPositionStatusReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> makeupPositionStatusReason;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.BaggageMakeupPosition.Identification }
         *     
         */
        public BasicData.BaggageMakeupPosition.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.BaggageMakeupPosition.Identification }
         *     
         */
        public void setIdentification(BasicData.BaggageMakeupPosition.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡmakeupPositionCapacity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getMakeupPositionCapacity() {
            return makeupPositionCapacity;
        }

        /**
         * ����makeupPositionCapacity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setMakeupPositionCapacity(JAXBElement<Integer> value) {
            this.makeupPositionCapacity = value;
        }

        /**
         * ��ȡmakeupPositionDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMakeupPositionDescription() {
            return makeupPositionDescription;
        }

        /**
         * ����makeupPositionDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMakeupPositionDescription(JAXBElement<String> value) {
            this.makeupPositionDescription = value;
        }

        /**
         * ��ȡmakeupPositionStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link MakeupPositionStatus }{@code >}
         *     
         */
        public JAXBElement<MakeupPositionStatus> getMakeupPositionStatus() {
            return makeupPositionStatus;
        }

        /**
         * ����makeupPositionStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link MakeupPositionStatus }{@code >}
         *     
         */
        public void setMakeupPositionStatus(JAXBElement<MakeupPositionStatus> value) {
            this.makeupPositionStatus = value;
        }

        /**
         * ��ȡmakeupPositionStatusStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getMakeupPositionStatusStartDateTime() {
            return makeupPositionStatusStartDateTime;
        }

        /**
         * ����makeupPositionStatusStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setMakeupPositionStatusStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.makeupPositionStatusStartDateTime = value;
        }

        /**
         * ��ȡmakeupPositionStatusEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getMakeupPositionStatusEndDateTime() {
            return makeupPositionStatusEndDateTime;
        }

        /**
         * ����makeupPositionStatusEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setMakeupPositionStatusEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.makeupPositionStatusEndDateTime = value;
        }

        /**
         * ��ȡmakeupPositionStatusReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMakeupPositionStatusReason() {
            return makeupPositionStatusReason;
        }

        /**
         * ����makeupPositionStatusReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMakeupPositionStatusReason(JAXBElement<String> value) {
            this.makeupPositionStatusReason = value;
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
         *         &lt;element name="BaggageMakeupPositionID" type="{http://schema.ultra-as.com}BaggageMakeupPositionID"/>
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
            "baggageMakeupPositionID",
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "BaggageMakeupPositionID", required = true)
            protected String baggageMakeupPositionID;
            @XmlElement(name = "TerminalCode", required = true)
            protected String terminalCode;

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
     *                   &lt;element name="BaggageReclaimCarouselID" type="{http://schema.ultra-as.com}BaggageReclaimCarouselID"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReclaimCarouselCapacity" type="{http://schema.ultra-as.com}ReclaimCarouselCapacity" minOccurs="0"/>
     *         &lt;element name="ReclaimCarouselDescription" type="{http://schema.ultra-as.com}ReclaimCarouselDescription" minOccurs="0"/>
     *         &lt;element name="ReclaimCarouselExitDoor" type="{http://schema.ultra-as.com}ReclaimCarouselExitDoor" minOccurs="0"/>
     *         &lt;element name="ReclaimCarouselStatus" type="{http://schema.ultra-as.com}ReclaimCarouselStatus" minOccurs="0"/>
     *         &lt;element name="ReclaimCarouselStatusStartDateTime" type="{http://schema.ultra-as.com}ReclaimCarouselStatusStartDateTime" minOccurs="0"/>
     *         &lt;element name="ReclaimCarouselStatusEndDateTime" type="{http://schema.ultra-as.com}ReclaimCarouselStatusEndDateTime" minOccurs="0"/>
     *         &lt;element name="ReclaimCarouselStatusReason" type="{http://schema.ultra-as.com}ReclaimCarouselStatusReason" minOccurs="0"/>
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
        "reclaimCarouselCapacity",
        "reclaimCarouselDescription",
        "reclaimCarouselExitDoor",
        "reclaimCarouselStatus",
        "reclaimCarouselStatusStartDateTime",
        "reclaimCarouselStatusEndDateTime",
        "reclaimCarouselStatusReason"
    })
    public static class BaggageReclaimCarousel {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.BaggageReclaimCarousel.Identification identification;
        @XmlElementRef(name = "ReclaimCarouselCapacity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> reclaimCarouselCapacity;
        @XmlElementRef(name = "ReclaimCarouselDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reclaimCarouselDescription;
        @XmlElementRef(name = "ReclaimCarouselExitDoor", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reclaimCarouselExitDoor;
        @XmlElementRef(name = "ReclaimCarouselStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<ReclaimCarouselStatus> reclaimCarouselStatus;
        @XmlElementRef(name = "ReclaimCarouselStatusStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> reclaimCarouselStatusStartDateTime;
        @XmlElementRef(name = "ReclaimCarouselStatusEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> reclaimCarouselStatusEndDateTime;
        @XmlElementRef(name = "ReclaimCarouselStatusReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reclaimCarouselStatusReason;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.BaggageReclaimCarousel.Identification }
         *     
         */
        public BasicData.BaggageReclaimCarousel.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.BaggageReclaimCarousel.Identification }
         *     
         */
        public void setIdentification(BasicData.BaggageReclaimCarousel.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡreclaimCarouselCapacity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getReclaimCarouselCapacity() {
            return reclaimCarouselCapacity;
        }

        /**
         * ����reclaimCarouselCapacity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setReclaimCarouselCapacity(JAXBElement<Integer> value) {
            this.reclaimCarouselCapacity = value;
        }

        /**
         * ��ȡreclaimCarouselDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReclaimCarouselDescription() {
            return reclaimCarouselDescription;
        }

        /**
         * ����reclaimCarouselDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReclaimCarouselDescription(JAXBElement<String> value) {
            this.reclaimCarouselDescription = value;
        }

        /**
         * ��ȡreclaimCarouselExitDoor���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReclaimCarouselExitDoor() {
            return reclaimCarouselExitDoor;
        }

        /**
         * ����reclaimCarouselExitDoor���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReclaimCarouselExitDoor(JAXBElement<String> value) {
            this.reclaimCarouselExitDoor = value;
        }

        /**
         * ��ȡreclaimCarouselStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ReclaimCarouselStatus }{@code >}
         *     
         */
        public JAXBElement<ReclaimCarouselStatus> getReclaimCarouselStatus() {
            return reclaimCarouselStatus;
        }

        /**
         * ����reclaimCarouselStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ReclaimCarouselStatus }{@code >}
         *     
         */
        public void setReclaimCarouselStatus(JAXBElement<ReclaimCarouselStatus> value) {
            this.reclaimCarouselStatus = value;
        }

        /**
         * ��ȡreclaimCarouselStatusStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getReclaimCarouselStatusStartDateTime() {
            return reclaimCarouselStatusStartDateTime;
        }

        /**
         * ����reclaimCarouselStatusStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setReclaimCarouselStatusStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.reclaimCarouselStatusStartDateTime = value;
        }

        /**
         * ��ȡreclaimCarouselStatusEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getReclaimCarouselStatusEndDateTime() {
            return reclaimCarouselStatusEndDateTime;
        }

        /**
         * ����reclaimCarouselStatusEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setReclaimCarouselStatusEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.reclaimCarouselStatusEndDateTime = value;
        }

        /**
         * ��ȡreclaimCarouselStatusReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReclaimCarouselStatusReason() {
            return reclaimCarouselStatusReason;
        }

        /**
         * ����reclaimCarouselStatusReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReclaimCarouselStatusReason(JAXBElement<String> value) {
            this.reclaimCarouselStatusReason = value;
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
            "baggageReclaimCarouselID",
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "BaggageReclaimCarouselID", required = true)
            protected String baggageReclaimCarouselID;
            @XmlElement(name = "TerminalCode", required = true)
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
     *                   &lt;element name="BridgeID" type="{http://schema.ultra-as.com}BridgeID"/>
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BridgeDescription" type="{http://schema.ultra-as.com}BridgeDescription" minOccurs="0"/>
     *         &lt;element name="BridgeStatusGeneral" type="{http://schema.ultra-as.com}BridgeStatusGeneral" minOccurs="0"/>
     *         &lt;element name="BridgeStatusGeneralEndDateTime" type="{http://schema.ultra-as.com}BridgeStatusGeneralEndDateTime" minOccurs="0"/>
     *         &lt;element name="BridgeStatusGeneralReason" type="{http://schema.ultra-as.com}BridgeStatusGeneralReason" minOccurs="0"/>
     *         &lt;element name="BridgeStatusGeneralStartDateTime" type="{http://schema.ultra-as.com}BridgeStatusGeneralStartDateTime" minOccurs="0"/>
     *         &lt;element name="BridgeStatusPCA" type="{http://schema.ultra-as.com}BridgeStatusPCA" minOccurs="0"/>
     *         &lt;element name="BridgeStatusPCAEndDateTime" type="{http://schema.ultra-as.com}BridgeStatusPCAEndDateTime" minOccurs="0"/>
     *         &lt;element name="BridgeStatusPCAReason" type="{http://schema.ultra-as.com}BridgeStatusPCAReason" minOccurs="0"/>
     *         &lt;element name="BridgeStatusPCAStartDateTime" type="{http://schema.ultra-as.com}BridgeStatusPCAStartDateTime" minOccurs="0"/>
     *         &lt;element name="BridgeStatusPower" type="{http://schema.ultra-as.com}BridgeStatusPower" minOccurs="0"/>
     *         &lt;element name="BridgeStatusPowerEndDateTime" type="{http://schema.ultra-as.com}BridgeStatusPowerEndDateTime" minOccurs="0"/>
     *         &lt;element name="BridgeStatusPowerReason" type="{http://schema.ultra-as.com}BridgeStatusPowerReason" minOccurs="0"/>
     *         &lt;element name="BridgeStatusPowerStartDateTime" type="{http://schema.ultra-as.com}BridgeStatusPowerStartDateTime" minOccurs="0"/>
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
        "bridgeDescription",
        "bridgeStatusGeneral",
        "bridgeStatusGeneralEndDateTime",
        "bridgeStatusGeneralReason",
        "bridgeStatusGeneralStartDateTime",
        "bridgeStatusPCA",
        "bridgeStatusPCAEndDateTime",
        "bridgeStatusPCAReason",
        "bridgeStatusPCAStartDateTime",
        "bridgeStatusPower",
        "bridgeStatusPowerEndDateTime",
        "bridgeStatusPowerReason",
        "bridgeStatusPowerStartDateTime"
    })
    public static class BoardingBridge {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.BoardingBridge.Identification identification;
        @XmlElementRef(name = "BridgeDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bridgeDescription;
        @XmlElementRef(name = "BridgeStatusGeneral", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<BridgeStatusGeneral> bridgeStatusGeneral;
        @XmlElementRef(name = "BridgeStatusGeneralEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> bridgeStatusGeneralEndDateTime;
        @XmlElementRef(name = "BridgeStatusGeneralReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bridgeStatusGeneralReason;
        @XmlElementRef(name = "BridgeStatusGeneralStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> bridgeStatusGeneralStartDateTime;
        @XmlElementRef(name = "BridgeStatusPCA", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<BridgeStatusPCA> bridgeStatusPCA;
        @XmlElementRef(name = "BridgeStatusPCAEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> bridgeStatusPCAEndDateTime;
        @XmlElementRef(name = "BridgeStatusPCAReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bridgeStatusPCAReason;
        @XmlElementRef(name = "BridgeStatusPCAStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> bridgeStatusPCAStartDateTime;
        @XmlElementRef(name = "BridgeStatusPower", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<BridgeStatusPower> bridgeStatusPower;
        @XmlElementRef(name = "BridgeStatusPowerEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> bridgeStatusPowerEndDateTime;
        @XmlElementRef(name = "BridgeStatusPowerReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bridgeStatusPowerReason;
        @XmlElementRef(name = "BridgeStatusPowerStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> bridgeStatusPowerStartDateTime;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.BoardingBridge.Identification }
         *     
         */
        public BasicData.BoardingBridge.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.BoardingBridge.Identification }
         *     
         */
        public void setIdentification(BasicData.BoardingBridge.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡbridgeDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBridgeDescription() {
            return bridgeDescription;
        }

        /**
         * ����bridgeDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBridgeDescription(JAXBElement<String> value) {
            this.bridgeDescription = value;
        }

        /**
         * ��ȡbridgeStatusGeneral���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BridgeStatusGeneral }{@code >}
         *     
         */
        public JAXBElement<BridgeStatusGeneral> getBridgeStatusGeneral() {
            return bridgeStatusGeneral;
        }

        /**
         * ����bridgeStatusGeneral���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BridgeStatusGeneral }{@code >}
         *     
         */
        public void setBridgeStatusGeneral(JAXBElement<BridgeStatusGeneral> value) {
            this.bridgeStatusGeneral = value;
        }

        /**
         * ��ȡbridgeStatusGeneralEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getBridgeStatusGeneralEndDateTime() {
            return bridgeStatusGeneralEndDateTime;
        }

        /**
         * ����bridgeStatusGeneralEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setBridgeStatusGeneralEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.bridgeStatusGeneralEndDateTime = value;
        }

        /**
         * ��ȡbridgeStatusGeneralReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBridgeStatusGeneralReason() {
            return bridgeStatusGeneralReason;
        }

        /**
         * ����bridgeStatusGeneralReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBridgeStatusGeneralReason(JAXBElement<String> value) {
            this.bridgeStatusGeneralReason = value;
        }

        /**
         * ��ȡbridgeStatusGeneralStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getBridgeStatusGeneralStartDateTime() {
            return bridgeStatusGeneralStartDateTime;
        }

        /**
         * ����bridgeStatusGeneralStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setBridgeStatusGeneralStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.bridgeStatusGeneralStartDateTime = value;
        }

        /**
         * ��ȡbridgeStatusPCA���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BridgeStatusPCA }{@code >}
         *     
         */
        public JAXBElement<BridgeStatusPCA> getBridgeStatusPCA() {
            return bridgeStatusPCA;
        }

        /**
         * ����bridgeStatusPCA���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BridgeStatusPCA }{@code >}
         *     
         */
        public void setBridgeStatusPCA(JAXBElement<BridgeStatusPCA> value) {
            this.bridgeStatusPCA = value;
        }

        /**
         * ��ȡbridgeStatusPCAEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getBridgeStatusPCAEndDateTime() {
            return bridgeStatusPCAEndDateTime;
        }

        /**
         * ����bridgeStatusPCAEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setBridgeStatusPCAEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.bridgeStatusPCAEndDateTime = value;
        }

        /**
         * ��ȡbridgeStatusPCAReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBridgeStatusPCAReason() {
            return bridgeStatusPCAReason;
        }

        /**
         * ����bridgeStatusPCAReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBridgeStatusPCAReason(JAXBElement<String> value) {
            this.bridgeStatusPCAReason = value;
        }

        /**
         * ��ȡbridgeStatusPCAStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getBridgeStatusPCAStartDateTime() {
            return bridgeStatusPCAStartDateTime;
        }

        /**
         * ����bridgeStatusPCAStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setBridgeStatusPCAStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.bridgeStatusPCAStartDateTime = value;
        }

        /**
         * ��ȡbridgeStatusPower���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BridgeStatusPower }{@code >}
         *     
         */
        public JAXBElement<BridgeStatusPower> getBridgeStatusPower() {
            return bridgeStatusPower;
        }

        /**
         * ����bridgeStatusPower���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BridgeStatusPower }{@code >}
         *     
         */
        public void setBridgeStatusPower(JAXBElement<BridgeStatusPower> value) {
            this.bridgeStatusPower = value;
        }

        /**
         * ��ȡbridgeStatusPowerEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getBridgeStatusPowerEndDateTime() {
            return bridgeStatusPowerEndDateTime;
        }

        /**
         * ����bridgeStatusPowerEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setBridgeStatusPowerEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.bridgeStatusPowerEndDateTime = value;
        }

        /**
         * ��ȡbridgeStatusPowerReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBridgeStatusPowerReason() {
            return bridgeStatusPowerReason;
        }

        /**
         * ����bridgeStatusPowerReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBridgeStatusPowerReason(JAXBElement<String> value) {
            this.bridgeStatusPowerReason = value;
        }

        /**
         * ��ȡbridgeStatusPowerStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getBridgeStatusPowerStartDateTime() {
            return bridgeStatusPowerStartDateTime;
        }

        /**
         * ����bridgeStatusPowerStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setBridgeStatusPowerStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.bridgeStatusPowerStartDateTime = value;
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
         *         &lt;element name="BridgeID" type="{http://schema.ultra-as.com}BridgeID"/>
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
            "bridgeID",
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "BridgeID", required = true)
            protected String bridgeID;
            @XmlElement(name = "TerminalCode", required = true)
            protected String terminalCode;

            /**
             * ��ȡbridgeID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBridgeID() {
                return bridgeID;
            }

            /**
             * ����bridgeID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBridgeID(String value) {
                this.bridgeID = value;
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
     *                   &lt;element name="CAACDelayCategory" type="{http://schema.ultra-as.com}CAACDelayCategory"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CAACDelayCategoryDescription" type="{http://schema.ultra-as.com}CAACDelayCategoryDescription" minOccurs="0"/>
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
        "caacDelayCategoryDescription"
    })
    public static class CAACDelayCategory {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.CAACDelayCategory.Identification identification;
        @XmlElementRef(name = "CAACDelayCategoryDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> caacDelayCategoryDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.CAACDelayCategory.Identification }
         *     
         */
        public BasicData.CAACDelayCategory.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.CAACDelayCategory.Identification }
         *     
         */
        public void setIdentification(BasicData.CAACDelayCategory.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡcaacDelayCategoryDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCAACDelayCategoryDescription() {
            return caacDelayCategoryDescription;
        }

        /**
         * ����caacDelayCategoryDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCAACDelayCategoryDescription(JAXBElement<String> value) {
            this.caacDelayCategoryDescription = value;
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
         *         &lt;element name="CAACDelayCategory" type="{http://schema.ultra-as.com}CAACDelayCategory"/>
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
            "caacDelayCategory"
        })
        public static class Identification {

            @XmlElement(name = "CAACDelayCategory", required = true)
            protected String caacDelayCategory;

            /**
             * ��ȡcaacDelayCategory���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAACDelayCategory() {
                return caacDelayCategory;
            }

            /**
             * ����caacDelayCategory���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAACDelayCategory(String value) {
                this.caacDelayCategory = value;
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
     *                   &lt;element name="CAACDelayCode" type="{http://schema.ultra-as.com}CAACDelayCode"/>
     *                   &lt;element name="CAACDelayCategory" type="{http://schema.ultra-as.com}CAACDelayCategory"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CAACDelayCodeDescription" type="{http://schema.ultra-as.com}CAACDelayCodeDescription" minOccurs="0"/>
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
        "caacDelayCodeDescription"
    })
    public static class CAACDelayCode {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.CAACDelayCode.Identification identification;
        @XmlElementRef(name = "CAACDelayCodeDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> caacDelayCodeDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.CAACDelayCode.Identification }
         *     
         */
        public BasicData.CAACDelayCode.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.CAACDelayCode.Identification }
         *     
         */
        public void setIdentification(BasicData.CAACDelayCode.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡcaacDelayCodeDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCAACDelayCodeDescription() {
            return caacDelayCodeDescription;
        }

        /**
         * ����caacDelayCodeDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCAACDelayCodeDescription(JAXBElement<String> value) {
            this.caacDelayCodeDescription = value;
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
         *         &lt;element name="CAACDelayCode" type="{http://schema.ultra-as.com}CAACDelayCode"/>
         *         &lt;element name="CAACDelayCategory" type="{http://schema.ultra-as.com}CAACDelayCategory"/>
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
            "caacDelayCode",
            "caacDelayCategory"
        })
        public static class Identification {

            @XmlElement(name = "CAACDelayCode", required = true)
            protected String caacDelayCode;
            @XmlElement(name = "CAACDelayCategory", required = true)
            protected String caacDelayCategory;

            /**
             * ��ȡcaacDelayCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAACDelayCode() {
                return caacDelayCode;
            }

            /**
             * ����caacDelayCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAACDelayCode(String value) {
                this.caacDelayCode = value;
            }

            /**
             * ��ȡcaacDelayCategory���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAACDelayCategory() {
                return caacDelayCategory;
            }

            /**
             * ����caacDelayCategory���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAACDelayCategory(String value) {
                this.caacDelayCategory = value;
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
     *                   &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode"/>
     *                   &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CheckinClassDescription" type="{http://schema.ultra-as.com}CheckinClassDescription" minOccurs="0"/>
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
        "checkinClassDescription",
        "informationRemark"
    })
    public static class CheckinAirlineClass {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.CheckinAirlineClass.Identification identification;
        @XmlElementRef(name = "CheckinClassDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> checkinClassDescription;
        @XmlElement(name = "InformationRemark", nillable = true)
        protected List<InformationRemark> informationRemark;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.CheckinAirlineClass.Identification }
         *     
         */
        public BasicData.CheckinAirlineClass.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.CheckinAirlineClass.Identification }
         *     
         */
        public void setIdentification(BasicData.CheckinAirlineClass.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡcheckinClassDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCheckinClassDescription() {
            return checkinClassDescription;
        }

        /**
         * ����checkinClassDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCheckinClassDescription(JAXBElement<String> value) {
            this.checkinClassDescription = value;
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
         *         &lt;element name="AirlineIATACode" type="{http://schema.ultra-as.com}AirlineIATACode"/>
         *         &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode"/>
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
            "airlineIATACode",
            "checkinClassCode"
        })
        public static class Identification {

            @XmlElement(name = "AirlineIATACode", required = true)
            protected String airlineIATACode;
            @XmlElement(name = "CheckinClassCode", required = true)
            protected String checkinClassCode;

            /**
             * ��ȡairlineIATACode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirlineIATACode() {
                return airlineIATACode;
            }

            /**
             * ����airlineIATACode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirlineIATACode(String value) {
                this.airlineIATACode = value;
            }

            /**
             * ��ȡcheckinClassCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckinClassCode() {
                return checkinClassCode;
            }

            /**
             * ����checkinClassCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckinClassCode(String value) {
                this.checkinClassCode = value;
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
     *                   &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CheckinClassDescription" type="{http://schema.ultra-as.com}CheckinClassDescription" minOccurs="0"/>
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
        "checkinClassDescription"
    })
    public static class CheckinClass {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.CheckinClass.Identification identification;
        @XmlElementRef(name = "CheckinClassDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> checkinClassDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.CheckinClass.Identification }
         *     
         */
        public BasicData.CheckinClass.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.CheckinClass.Identification }
         *     
         */
        public void setIdentification(BasicData.CheckinClass.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡcheckinClassDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCheckinClassDescription() {
            return checkinClassDescription;
        }

        /**
         * ����checkinClassDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCheckinClassDescription(JAXBElement<String> value) {
            this.checkinClassDescription = value;
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
         *         &lt;element name="CheckinClassCode" type="{http://schema.ultra-as.com}CheckinClassCode"/>
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
            "checkinClassCode"
        })
        public static class Identification {

            @XmlElement(name = "CheckinClassCode", required = true)
            protected String checkinClassCode;

            /**
             * ��ȡcheckinClassCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckinClassCode() {
                return checkinClassCode;
            }

            /**
             * ����checkinClassCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckinClassCode(String value) {
                this.checkinClassCode = value;
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
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CheckinDeskDescription" type="{http://schema.ultra-as.com}CheckinDeskDescription" minOccurs="0"/>
     *         &lt;element name="CheckinDeskStatus" type="{http://schema.ultra-as.com}CheckinDeskStatus" minOccurs="0"/>
     *         &lt;element name="CheckinDeskStatusEndDateTime" type="{http://schema.ultra-as.com}CheckinDeskStatusEndDateTime" minOccurs="0"/>
     *         &lt;element name="CheckinDeskStatusReason" type="{http://schema.ultra-as.com}CheckinDeskStatusReason" minOccurs="0"/>
     *         &lt;element name="CheckinDeskStatusStartDateTime" type="{http://schema.ultra-as.com}CheckinDeskStatusStartDateTime" minOccurs="0"/>
     *         &lt;element name="CheckinGroup" type="{http://schema.ultra-as.com}CheckinGroup" minOccurs="0"/>
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
        "checkinDeskDescription",
        "checkinDeskStatus",
        "checkinDeskStatusEndDateTime",
        "checkinDeskStatusReason",
        "checkinDeskStatusStartDateTime",
        "checkinGroup"
    })
    public static class CheckinDesk {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.CheckinDesk.Identification identification;
        @XmlElementRef(name = "CheckinDeskDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> checkinDeskDescription;
        @XmlElementRef(name = "CheckinDeskStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<CheckinDeskStatus> checkinDeskStatus;
        @XmlElementRef(name = "CheckinDeskStatusEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> checkinDeskStatusEndDateTime;
        @XmlElementRef(name = "CheckinDeskStatusReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> checkinDeskStatusReason;
        @XmlElementRef(name = "CheckinDeskStatusStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> checkinDeskStatusStartDateTime;
        @XmlElementRef(name = "CheckinGroup", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> checkinGroup;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.CheckinDesk.Identification }
         *     
         */
        public BasicData.CheckinDesk.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.CheckinDesk.Identification }
         *     
         */
        public void setIdentification(BasicData.CheckinDesk.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡcheckinDeskDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCheckinDeskDescription() {
            return checkinDeskDescription;
        }

        /**
         * ����checkinDeskDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCheckinDeskDescription(JAXBElement<String> value) {
            this.checkinDeskDescription = value;
        }

        /**
         * ��ȡcheckinDeskStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link CheckinDeskStatus }{@code >}
         *     
         */
        public JAXBElement<CheckinDeskStatus> getCheckinDeskStatus() {
            return checkinDeskStatus;
        }

        /**
         * ����checkinDeskStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link CheckinDeskStatus }{@code >}
         *     
         */
        public void setCheckinDeskStatus(JAXBElement<CheckinDeskStatus> value) {
            this.checkinDeskStatus = value;
        }

        /**
         * ��ȡcheckinDeskStatusEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getCheckinDeskStatusEndDateTime() {
            return checkinDeskStatusEndDateTime;
        }

        /**
         * ����checkinDeskStatusEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setCheckinDeskStatusEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.checkinDeskStatusEndDateTime = value;
        }

        /**
         * ��ȡcheckinDeskStatusReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCheckinDeskStatusReason() {
            return checkinDeskStatusReason;
        }

        /**
         * ����checkinDeskStatusReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCheckinDeskStatusReason(JAXBElement<String> value) {
            this.checkinDeskStatusReason = value;
        }

        /**
         * ��ȡcheckinDeskStatusStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getCheckinDeskStatusStartDateTime() {
            return checkinDeskStatusStartDateTime;
        }

        /**
         * ����checkinDeskStatusStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setCheckinDeskStatusStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.checkinDeskStatusStartDateTime = value;
        }

        /**
         * ��ȡcheckinGroup���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCheckinGroup() {
            return checkinGroup;
        }

        /**
         * ����checkinGroup���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCheckinGroup(JAXBElement<String> value) {
            this.checkinGroup = value;
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
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "CheckinDeskID", required = true)
            protected String checkinDeskID;
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
     *                   &lt;element name="IrregularityIATACode" type="{http://schema.ultra-as.com}IrregularityIATACode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DelayCodeDescription" type="{http://schema.ultra-as.com}DelayCodeDescription" minOccurs="0"/>
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
        "delayCodeDescription"
    })
    public static class DelayCode {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.DelayCode.Identification identification;
        @XmlElementRef(name = "DelayCodeDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> delayCodeDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.DelayCode.Identification }
         *     
         */
        public BasicData.DelayCode.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.DelayCode.Identification }
         *     
         */
        public void setIdentification(BasicData.DelayCode.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡdelayCodeDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDelayCodeDescription() {
            return delayCodeDescription;
        }

        /**
         * ����delayCodeDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDelayCodeDescription(JAXBElement<String> value) {
            this.delayCodeDescription = value;
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
         *         &lt;element name="IrregularityIATACode" type="{http://schema.ultra-as.com}IrregularityIATACode"/>
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
            "irregularityIATACode"
        })
        public static class Identification {

            @XmlElement(name = "IrregularityIATACode", required = true)
            protected String irregularityIATACode;

            /**
             * ��ȡirregularityIATACode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIrregularityIATACode() {
                return irregularityIATACode;
            }

            /**
             * ����irregularityIATACode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIrregularityIATACode(String value) {
                this.irregularityIATACode = value;
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
     *                   &lt;element name="FlightClassificationCode" type="{http://schema.ultra-as.com}FlightClassificationCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClassificationCodeDescription" type="{http://schema.ultra-as.com}ClassificationCodeDescription" minOccurs="0"/>
     *         &lt;element name="IsFlightClassificationDefault" type="{http://schema.ultra-as.com}IsFlightClassificationDefault" minOccurs="0"/>
     *         &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode"/>
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
        "classificationCodeDescription",
        "isFlightClassificationDefault",
        "flightServiceTypeIATACode"
    })
    public static class FlightClassification {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.FlightClassification.Identification identification;
        @XmlElementRef(name = "ClassificationCodeDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> classificationCodeDescription;
        @XmlElementRef(name = "IsFlightClassificationDefault", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> isFlightClassificationDefault;
        @XmlElement(name = "FlightServiceTypeIATACode", required = true)
        protected String flightServiceTypeIATACode;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.FlightClassification.Identification }
         *     
         */
        public BasicData.FlightClassification.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.FlightClassification.Identification }
         *     
         */
        public void setIdentification(BasicData.FlightClassification.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡclassificationCodeDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getClassificationCodeDescription() {
            return classificationCodeDescription;
        }

        /**
         * ����classificationCodeDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setClassificationCodeDescription(JAXBElement<String> value) {
            this.classificationCodeDescription = value;
        }

        /**
         * ��ȡisFlightClassificationDefault���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getIsFlightClassificationDefault() {
            return isFlightClassificationDefault;
        }

        /**
         * ����isFlightClassificationDefault���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setIsFlightClassificationDefault(JAXBElement<Boolean> value) {
            this.isFlightClassificationDefault = value;
        }

        /**
         * ��ȡflightServiceTypeIATACode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightServiceTypeIATACode() {
            return flightServiceTypeIATACode;
        }

        /**
         * ����flightServiceTypeIATACode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightServiceTypeIATACode(String value) {
            this.flightServiceTypeIATACode = value;
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
         *         &lt;element name="FlightClassificationCode" type="{http://schema.ultra-as.com}FlightClassificationCode"/>
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
            "flightClassificationCode"
        })
        public static class Identification {

            @XmlElement(name = "FlightClassificationCode", required = true)
            protected String flightClassificationCode;

            /**
             * ��ȡflightClassificationCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightClassificationCode() {
                return flightClassificationCode;
            }

            /**
             * ����flightClassificationCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightClassificationCode(String value) {
                this.flightClassificationCode = value;
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
     *                   &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlightNatureDescription" type="{http://schema.ultra-as.com}FlightNatureDescription" minOccurs="0"/>
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
        "flightNatureDescription"
    })
    public static class FlightNature {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.FlightNature.Identification identification;
        @XmlElementRef(name = "FlightNatureDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightNatureDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.FlightNature.Identification }
         *     
         */
        public BasicData.FlightNature.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.FlightNature.Identification }
         *     
         */
        public void setIdentification(BasicData.FlightNature.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡflightNatureDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightNatureDescription() {
            return flightNatureDescription;
        }

        /**
         * ����flightNatureDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightNatureDescription(JAXBElement<String> value) {
            this.flightNatureDescription = value;
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
         *         &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode"/>
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
            "flightNatureCode"
        })
        public static class Identification {

            @XmlElement(name = "FlightNatureCode", required = true)
            protected String flightNatureCode;

            /**
             * ��ȡflightNatureCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNatureCode() {
                return flightNatureCode;
            }

            /**
             * ����flightNatureCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNatureCode(String value) {
                this.flightNatureCode = value;
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
     *                   &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlightSectorDescription" type="{http://schema.ultra-as.com}FlightSectorDescription" minOccurs="0"/>
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
        "flightSectorDescription"
    })
    public static class FlightSector {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.FlightSector.Identification identification;
        @XmlElementRef(name = "FlightSectorDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightSectorDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.FlightSector.Identification }
         *     
         */
        public BasicData.FlightSector.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.FlightSector.Identification }
         *     
         */
        public void setIdentification(BasicData.FlightSector.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡflightSectorDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightSectorDescription() {
            return flightSectorDescription;
        }

        /**
         * ����flightSectorDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightSectorDescription(JAXBElement<String> value) {
            this.flightSectorDescription = value;
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
         *         &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode"/>
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
            "flightSectorCode"
        })
        public static class Identification {

            @XmlElement(name = "FlightSectorCode", required = true)
            @XmlSchemaType(name = "string")
            protected FlightSectorCode flightSectorCode;

            /**
             * ��ȡflightSectorCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link FlightSectorCode }
             *     
             */
            public FlightSectorCode getFlightSectorCode() {
                return flightSectorCode;
            }

            /**
             * ����flightSectorCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link FlightSectorCode }
             *     
             */
            public void setFlightSectorCode(FlightSectorCode value) {
                this.flightSectorCode = value;
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
     *                   &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode"/>
     *         &lt;element name="FlightServiceTypeDescription" type="{http://schema.ultra-as.com}FlightServiceTypeDescription" minOccurs="0"/>
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
        "flightNatureCode",
        "flightServiceTypeDescription"
    })
    public static class FlightServiceType {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.FlightServiceType.Identification identification;
        @XmlElement(name = "FlightNatureCode", required = true)
        protected String flightNatureCode;
        @XmlElementRef(name = "FlightServiceTypeDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> flightServiceTypeDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.FlightServiceType.Identification }
         *     
         */
        public BasicData.FlightServiceType.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.FlightServiceType.Identification }
         *     
         */
        public void setIdentification(BasicData.FlightServiceType.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡflightNatureCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightNatureCode() {
            return flightNatureCode;
        }

        /**
         * ����flightNatureCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightNatureCode(String value) {
            this.flightNatureCode = value;
        }

        /**
         * ��ȡflightServiceTypeDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFlightServiceTypeDescription() {
            return flightServiceTypeDescription;
        }

        /**
         * ����flightServiceTypeDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFlightServiceTypeDescription(JAXBElement<String> value) {
            this.flightServiceTypeDescription = value;
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
         *         &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode"/>
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
            "flightServiceTypeIATACode"
        })
        public static class Identification {

            @XmlElement(name = "FlightServiceTypeIATACode", required = true)
            protected String flightServiceTypeIATACode;

            /**
             * ��ȡflightServiceTypeIATACode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightServiceTypeIATACode() {
                return flightServiceTypeIATACode;
            }

            /**
             * ����flightServiceTypeIATACode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightServiceTypeIATACode(String value) {
                this.flightServiceTypeIATACode = value;
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AssociatedGateNumber" type="{http://schema.ultra-as.com}AssociatedGateNumber" minOccurs="0"/>
     *         &lt;element name="BridgeID" type="{http://schema.ultra-as.com}BridgeID" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="GateDescription" type="{http://schema.ultra-as.com}GateDescription" minOccurs="0"/>
     *         &lt;element name="GateStatus" type="{http://schema.ultra-as.com}GateStatus" minOccurs="0"/>
     *         &lt;element name="GateStatusEndDateTime" type="{http://schema.ultra-as.com}GateStatusEndDateTime" minOccurs="0"/>
     *         &lt;element name="GateStatusReason" type="{http://schema.ultra-as.com}GateStatusReason" minOccurs="0"/>
     *         &lt;element name="GateStatusStartDateTime" type="{http://schema.ultra-as.com}GateStatusStartDateTime" minOccurs="0"/>
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
        "identification",
        "associatedGateNumber",
        "bridgeID",
        "gateDescription",
        "gateStatus",
        "gateStatusEndDateTime",
        "gateStatusReason",
        "gateStatusStartDateTime",
        "terminalCode"
    })
    public static class Gate {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.Gate.Identification identification;
        @XmlElement(name = "AssociatedGateNumber")
        protected String associatedGateNumber;
        @XmlElement(name = "BridgeID", nillable = true)
        protected List<String> bridgeID;
        @XmlElementRef(name = "GateDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> gateDescription;
        @XmlElementRef(name = "GateStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<GateStatus> gateStatus;
        @XmlElementRef(name = "GateStatusEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> gateStatusEndDateTime;
        @XmlElementRef(name = "GateStatusReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> gateStatusReason;
        @XmlElementRef(name = "GateStatusStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> gateStatusStartDateTime;
        @XmlElement(name = "TerminalCode", required = true)
        protected String terminalCode;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.Gate.Identification }
         *     
         */
        public BasicData.Gate.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.Gate.Identification }
         *     
         */
        public void setIdentification(BasicData.Gate.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡassociatedGateNumber���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssociatedGateNumber() {
            return associatedGateNumber;
        }

        /**
         * ����associatedGateNumber���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssociatedGateNumber(String value) {
            this.associatedGateNumber = value;
        }

        /**
         * Gets the value of the bridgeID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bridgeID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBridgeID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBridgeID() {
            if (bridgeID == null) {
                bridgeID = new ArrayList<String>();
            }
            return this.bridgeID;
        }

        /**
         * ��ȡgateDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getGateDescription() {
            return gateDescription;
        }

        /**
         * ����gateDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setGateDescription(JAXBElement<String> value) {
            this.gateDescription = value;
        }

        /**
         * ��ȡgateStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link GateStatus }{@code >}
         *     
         */
        public JAXBElement<GateStatus> getGateStatus() {
            return gateStatus;
        }

        /**
         * ����gateStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link GateStatus }{@code >}
         *     
         */
        public void setGateStatus(JAXBElement<GateStatus> value) {
            this.gateStatus = value;
        }

        /**
         * ��ȡgateStatusEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getGateStatusEndDateTime() {
            return gateStatusEndDateTime;
        }

        /**
         * ����gateStatusEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setGateStatusEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.gateStatusEndDateTime = value;
        }

        /**
         * ��ȡgateStatusReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getGateStatusReason() {
            return gateStatusReason;
        }

        /**
         * ����gateStatusReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setGateStatusReason(JAXBElement<String> value) {
            this.gateStatusReason = value;
        }

        /**
         * ��ȡgateStatusStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getGateStatusStartDateTime() {
            return gateStatusStartDateTime;
        }

        /**
         * ����gateStatusStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setGateStatusStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.gateStatusStartDateTime = value;
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
            "gateNumber"
        })
        public static class Identification {

            @XmlElement(name = "GateNumber", required = true)
            protected String gateNumber;

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
     *                   &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HandlingAgentDescription" type="{http://schema.ultra-as.com}HandlingAgentDescription" minOccurs="0"/>
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
        "handlingAgentDescription"
    })
    public static class Handler {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.Handler.Identification identification;
        @XmlElementRef(name = "HandlingAgentDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> handlingAgentDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.Handler.Identification }
         *     
         */
        public BasicData.Handler.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.Handler.Identification }
         *     
         */
        public void setIdentification(BasicData.Handler.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡhandlingAgentDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getHandlingAgentDescription() {
            return handlingAgentDescription;
        }

        /**
         * ����handlingAgentDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setHandlingAgentDescription(JAXBElement<String> value) {
            this.handlingAgentDescription = value;
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
         *         &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode"/>
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
            "handlingAgentIATACode"
        })
        public static class Identification {

            @XmlElement(name = "HandlingAgentIATACode", required = true)
            protected String handlingAgentIATACode;

            /**
             * ��ȡhandlingAgentIATACode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHandlingAgentIATACode() {
                return handlingAgentIATACode;
            }

            /**
             * ����handlingAgentIATACode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHandlingAgentIATACode(String value) {
                this.handlingAgentIATACode = value;
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
     *                   &lt;element name="TextCategoryCode" type="{http://schema.ultra-as.com}TextCategoryCode"/>
     *                   &lt;element name="TextCode" type="{http://schema.ultra-as.com}TextCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ChineseLanguageText" type="{http://schema.ultra-as.com}ChineseLanguageText" minOccurs="0"/>
     *         &lt;element name="EnglishLanguageText" type="{http://schema.ultra-as.com}EnglishLanguageText" minOccurs="0"/>
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
        "chineseLanguageText",
        "englishLanguageText"
    })
    public static class LocalisationText {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.LocalisationText.Identification identification;
        @XmlElementRef(name = "ChineseLanguageText", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> chineseLanguageText;
        @XmlElementRef(name = "EnglishLanguageText", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> englishLanguageText;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.LocalisationText.Identification }
         *     
         */
        public BasicData.LocalisationText.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.LocalisationText.Identification }
         *     
         */
        public void setIdentification(BasicData.LocalisationText.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡchineseLanguageText���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getChineseLanguageText() {
            return chineseLanguageText;
        }

        /**
         * ����chineseLanguageText���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setChineseLanguageText(JAXBElement<String> value) {
            this.chineseLanguageText = value;
        }

        /**
         * ��ȡenglishLanguageText���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEnglishLanguageText() {
            return englishLanguageText;
        }

        /**
         * ����englishLanguageText���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEnglishLanguageText(JAXBElement<String> value) {
            this.englishLanguageText = value;
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
         *         &lt;element name="TextCategoryCode" type="{http://schema.ultra-as.com}TextCategoryCode"/>
         *         &lt;element name="TextCode" type="{http://schema.ultra-as.com}TextCode"/>
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
            "textCategoryCode",
            "textCode"
        })
        public static class Identification {

            @XmlElement(name = "TextCategoryCode", required = true)
            protected String textCategoryCode;
            @XmlElement(name = "TextCode", required = true)
            protected String textCode;

            /**
             * ��ȡtextCategoryCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextCategoryCode() {
                return textCategoryCode;
            }

            /**
             * ����textCategoryCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextCategoryCode(String value) {
                this.textCategoryCode = value;
            }

            /**
             * ��ȡtextCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextCode() {
                return textCode;
            }

            /**
             * ����textCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextCode(String value) {
                this.textCode = value;
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
     *                   &lt;element name="LocationIATACode" type="{http://schema.ultra-as.com}LocationIATACode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AbbreviatedChinese" type="{http://schema.ultra-as.com}AbbreviatedChinese" minOccurs="0"/>
     *         &lt;element name="CountryCode" type="{http://schema.ultra-as.com}CountryCode" minOccurs="0"/>
     *         &lt;element name="CountryName" type="{http://schema.ultra-as.com}CountryName" minOccurs="0"/>
     *         &lt;element name="FlightElapsedJetTime" type="{http://schema.ultra-as.com}FlightElapsedJetTime" minOccurs="0"/>
     *         &lt;element name="FlightElapsedPropellerTime" type="{http://schema.ultra-as.com}FlightElapsedPropellerTime" minOccurs="0"/>
     *         &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" minOccurs="0"/>
     *         &lt;element name="LocationDescription" type="{http://schema.ultra-as.com}LocationDescription" minOccurs="0"/>
     *         &lt;element name="LocationICAOCode" type="{http://schema.ultra-as.com}LocationICAOCode" minOccurs="0"/>
     *         &lt;element name="LocationName" type="{http://schema.ultra-as.com}LocationName" minOccurs="0"/>
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
        "abbreviatedChinese",
        "countryCode",
        "countryName",
        "flightElapsedJetTime",
        "flightElapsedPropellerTime",
        "flightSectorCode",
        "locationDescription",
        "locationICAOCode",
        "locationName"
    })
    public static class Location {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.Location.Identification identification;
        @XmlElementRef(name = "AbbreviatedChinese", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> abbreviatedChinese;
        @XmlElementRef(name = "CountryCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> countryCode;
        @XmlElementRef(name = "CountryName", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> countryName;
        @XmlElementRef(name = "FlightElapsedJetTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Duration> flightElapsedJetTime;
        @XmlElementRef(name = "FlightElapsedPropellerTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Duration> flightElapsedPropellerTime;
        @XmlElementRef(name = "FlightSectorCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightSectorCode> flightSectorCode;
        @XmlElementRef(name = "LocationDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> locationDescription;
        @XmlElementRef(name = "LocationICAOCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> locationICAOCode;
        @XmlElementRef(name = "LocationName", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> locationName;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.Location.Identification }
         *     
         */
        public BasicData.Location.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.Location.Identification }
         *     
         */
        public void setIdentification(BasicData.Location.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡabbreviatedChinese���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAbbreviatedChinese() {
            return abbreviatedChinese;
        }

        /**
         * ����abbreviatedChinese���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAbbreviatedChinese(JAXBElement<String> value) {
            this.abbreviatedChinese = value;
        }

        /**
         * ��ȡcountryCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCountryCode() {
            return countryCode;
        }

        /**
         * ����countryCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCountryCode(JAXBElement<String> value) {
            this.countryCode = value;
        }

        /**
         * ��ȡcountryName���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCountryName() {
            return countryName;
        }

        /**
         * ����countryName���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCountryName(JAXBElement<String> value) {
            this.countryName = value;
        }

        /**
         * ��ȡflightElapsedJetTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
         *     
         */
        public JAXBElement<Duration> getFlightElapsedJetTime() {
            return flightElapsedJetTime;
        }

        /**
         * ����flightElapsedJetTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
         *     
         */
        public void setFlightElapsedJetTime(JAXBElement<Duration> value) {
            this.flightElapsedJetTime = value;
        }

        /**
         * ��ȡflightElapsedPropellerTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
         *     
         */
        public JAXBElement<Duration> getFlightElapsedPropellerTime() {
            return flightElapsedPropellerTime;
        }

        /**
         * ����flightElapsedPropellerTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
         *     
         */
        public void setFlightElapsedPropellerTime(JAXBElement<Duration> value) {
            this.flightElapsedPropellerTime = value;
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
         * ��ȡlocationDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLocationDescription() {
            return locationDescription;
        }

        /**
         * ����locationDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLocationDescription(JAXBElement<String> value) {
            this.locationDescription = value;
        }

        /**
         * ��ȡlocationICAOCode���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLocationICAOCode() {
            return locationICAOCode;
        }

        /**
         * ����locationICAOCode���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLocationICAOCode(JAXBElement<String> value) {
            this.locationICAOCode = value;
        }

        /**
         * ��ȡlocationName���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLocationName() {
            return locationName;
        }

        /**
         * ����locationName���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLocationName(JAXBElement<String> value) {
            this.locationName = value;
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
         *         &lt;element name="LocationIATACode" type="{http://schema.ultra-as.com}LocationIATACode"/>
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
            "locationIATACode"
        })
        public static class Identification {

            @XmlElement(name = "LocationIATACode", required = true)
            protected String locationIATACode;

            /**
             * ��ȡlocationIATACode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationIATACode() {
                return locationIATACode;
            }

            /**
             * ����locationIATACode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationIATACode(String value) {
                this.locationIATACode = value;
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
     *                   &lt;element name="RunwayID" type="{http://schema.ultra-as.com}RunwayID"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RunwayDescription" type="{http://schema.ultra-as.com}RunwayDescription" minOccurs="0"/>
     *         &lt;element name="RunwayStatus" type="{http://schema.ultra-as.com}RunwayStatus" minOccurs="0"/>
     *         &lt;element name="RunwayStatusEndDateTime" type="{http://schema.ultra-as.com}RunwayStatusEndDateTime" minOccurs="0"/>
     *         &lt;element name="RunwayStatusReason" type="{http://schema.ultra-as.com}RunwayStatusReason" minOccurs="0"/>
     *         &lt;element name="RunwayStatusStartDateTime" type="{http://schema.ultra-as.com}RunwayStatusStartDateTime" minOccurs="0"/>
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
        "runwayDescription",
        "runwayStatus",
        "runwayStatusEndDateTime",
        "runwayStatusReason",
        "runwayStatusStartDateTime"
    })
    public static class Runway {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.Runway.Identification identification;
        @XmlElementRef(name = "RunwayDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> runwayDescription;
        @XmlElementRef(name = "RunwayStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<RunwayStatus> runwayStatus;
        @XmlElementRef(name = "RunwayStatusEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> runwayStatusEndDateTime;
        @XmlElementRef(name = "RunwayStatusReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> runwayStatusReason;
        @XmlElementRef(name = "RunwayStatusStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> runwayStatusStartDateTime;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.Runway.Identification }
         *     
         */
        public BasicData.Runway.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.Runway.Identification }
         *     
         */
        public void setIdentification(BasicData.Runway.Identification value) {
            this.identification = value;
        }

        /**
         * ��ȡrunwayDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRunwayDescription() {
            return runwayDescription;
        }

        /**
         * ����runwayDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRunwayDescription(JAXBElement<String> value) {
            this.runwayDescription = value;
        }

        /**
         * ��ȡrunwayStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RunwayStatus }{@code >}
         *     
         */
        public JAXBElement<RunwayStatus> getRunwayStatus() {
            return runwayStatus;
        }

        /**
         * ����runwayStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RunwayStatus }{@code >}
         *     
         */
        public void setRunwayStatus(JAXBElement<RunwayStatus> value) {
            this.runwayStatus = value;
        }

        /**
         * ��ȡrunwayStatusEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getRunwayStatusEndDateTime() {
            return runwayStatusEndDateTime;
        }

        /**
         * ����runwayStatusEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setRunwayStatusEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.runwayStatusEndDateTime = value;
        }

        /**
         * ��ȡrunwayStatusReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRunwayStatusReason() {
            return runwayStatusReason;
        }

        /**
         * ����runwayStatusReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRunwayStatusReason(JAXBElement<String> value) {
            this.runwayStatusReason = value;
        }

        /**
         * ��ȡrunwayStatusStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getRunwayStatusStartDateTime() {
            return runwayStatusStartDateTime;
        }

        /**
         * ����runwayStatusStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setRunwayStatusStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.runwayStatusStartDateTime = value;
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
         *         &lt;element name="RunwayID" type="{http://schema.ultra-as.com}RunwayID"/>
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
            "runwayID"
        })
        public static class Identification {

            @XmlElement(name = "RunwayID", required = true)
            protected String runwayID;

            /**
             * ��ȡrunwayID���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRunwayID() {
                return runwayID;
            }

            /**
             * ����runwayID���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRunwayID(String value) {
                this.runwayID = value;
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber" minOccurs="0"/>
     *         &lt;element name="StandDescription" type="{http://schema.ultra-as.com}StandDescription" minOccurs="0"/>
     *         &lt;element name="StandIsSecure" type="{http://schema.ultra-as.com}StandIsSecure" minOccurs="0"/>
     *         &lt;element name="StandStatus" type="{http://schema.ultra-as.com}StandStatus" minOccurs="0"/>
     *         &lt;element name="StandStatusEndDateTime" type="{http://schema.ultra-as.com}StandStatusEndDateTime" minOccurs="0"/>
     *         &lt;element name="StandStatusReason" type="{http://schema.ultra-as.com}StandStatusReason" minOccurs="0"/>
     *         &lt;element name="StandStatusStartDateTime" type="{http://schema.ultra-as.com}StandStatusStartDateTime" minOccurs="0"/>
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
        "identification",
        "gateNumber",
        "standDescription",
        "standIsSecure",
        "standStatus",
        "standStatusEndDateTime",
        "standStatusReason",
        "standStatusStartDateTime",
        "terminalCode"
    })
    public static class Stand {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.Stand.Identification identification;
        @XmlElementRef(name = "GateNumber", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> gateNumber;
        @XmlElementRef(name = "StandDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> standDescription;
        @XmlElementRef(name = "StandIsSecure", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> standIsSecure;
        @XmlElementRef(name = "StandStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<StandStatus> standStatus;
        @XmlElementRef(name = "StandStatusEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> standStatusEndDateTime;
        @XmlElementRef(name = "StandStatusReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> standStatusReason;
        @XmlElementRef(name = "StandStatusStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> standStatusStartDateTime;
        @XmlElementRef(name = "TerminalCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> terminalCode;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.Stand.Identification }
         *     
         */
        public BasicData.Stand.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.Stand.Identification }
         *     
         */
        public void setIdentification(BasicData.Stand.Identification value) {
            this.identification = value;
        }

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
         * ��ȡstandDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStandDescription() {
            return standDescription;
        }

        /**
         * ����standDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStandDescription(JAXBElement<String> value) {
            this.standDescription = value;
        }

        /**
         * ��ȡstandIsSecure���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getStandIsSecure() {
            return standIsSecure;
        }

        /**
         * ����standIsSecure���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setStandIsSecure(JAXBElement<Boolean> value) {
            this.standIsSecure = value;
        }

        /**
         * ��ȡstandStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link StandStatus }{@code >}
         *     
         */
        public JAXBElement<StandStatus> getStandStatus() {
            return standStatus;
        }

        /**
         * ����standStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link StandStatus }{@code >}
         *     
         */
        public void setStandStatus(JAXBElement<StandStatus> value) {
            this.standStatus = value;
        }

        /**
         * ��ȡstandStatusEndDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getStandStatusEndDateTime() {
            return standStatusEndDateTime;
        }

        /**
         * ����standStatusEndDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setStandStatusEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.standStatusEndDateTime = value;
        }

        /**
         * ��ȡstandStatusReason���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStandStatusReason() {
            return standStatusReason;
        }

        /**
         * ����standStatusReason���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStandStatusReason(JAXBElement<String> value) {
            this.standStatusReason = value;
        }

        /**
         * ��ȡstandStatusStartDateTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getStandStatusStartDateTime() {
            return standStatusStartDateTime;
        }

        /**
         * ����standStatusStartDateTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setStandStatusStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.standStatusStartDateTime = value;
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
            "standPosition"
        })
        public static class Identification {

            @XmlElement(name = "StandPosition", required = true)
            protected String standPosition;

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
     *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode"/>
     *         &lt;element name="TerminalDescription" type="{http://schema.ultra-as.com}TerminalDescription" minOccurs="0"/>
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
        "airportIATACode",
        "terminalDescription"
    })
    public static class Terminal {

        @XmlElement(name = "Identification", required = true)
        protected BasicData.Terminal.Identification identification;
        @XmlElement(name = "AirportIATACode", required = true)
        protected String airportIATACode;
        @XmlElementRef(name = "TerminalDescription", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> terminalDescription;

        /**
         * ��ȡidentification���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BasicData.Terminal.Identification }
         *     
         */
        public BasicData.Terminal.Identification getIdentification() {
            return identification;
        }

        /**
         * ����identification���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BasicData.Terminal.Identification }
         *     
         */
        public void setIdentification(BasicData.Terminal.Identification value) {
            this.identification = value;
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
         * ��ȡterminalDescription���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTerminalDescription() {
            return terminalDescription;
        }

        /**
         * ����terminalDescription���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTerminalDescription(JAXBElement<String> value) {
            this.terminalDescription = value;
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
            "terminalCode"
        })
        public static class Identification {

            @XmlElement(name = "TerminalCode", required = true)
            protected String terminalCode;

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

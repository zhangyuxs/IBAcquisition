

package com.ultra_as.schema;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.springframework.stereotype.Component;























/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ultra_as.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Component
public class ObjectFactory {

    private final static QName _Envelope_QNAME  = new QName("http://schema.ultra-as.com", "Envelope");
    private final static QName _ResourceDataStandPositionOperationFlightIdentity_QNAME = new QName("http://schema.ultra-as.com", "FlightIdentity");
    private final static QName _ResourceDataStandPositionOperationOffBlocksDateTime_QNAME = new QName("http://schema.ultra-as.com", "OffBlocksDateTime");
    private final static QName _ResourceDataStandPositionOperationAircraftRegistration_QNAME = new QName("http://schema.ultra-as.com", "AircraftRegistration");
    private final static QName _ResourceDataStandPositionOperationScheduledDate_QNAME = new QName("http://schema.ultra-as.com", "ScheduledDate");
    private final static QName _ResourceDataStandPositionOperationOnBlocksDateTime_QNAME = new QName("http://schema.ultra-as.com", "OnBlocksDateTime");
    private final static QName _ResourceDataStandPositionOperationAircraftSubtypeIATACode_QNAME = new QName("http://schema.ultra-as.com", "AircraftSubtypeIATACode");
    private final static QName _ResourceDataStandPositionOperationFlightRepeatCount_QNAME = new QName("http://schema.ultra-as.com", "FlightRepeatCount");
    private final static QName _BasicDataBaggageMakeupPositionMakeupPositionStatusReason_QNAME = new QName("http://schema.ultra-as.com", "MakeupPositionStatusReason");
    private final static QName _BasicDataBaggageMakeupPositionMakeupPositionStatus_QNAME = new QName("http://schema.ultra-as.com", "MakeupPositionStatus");
    private final static QName _BasicDataBaggageMakeupPositionMakeupPositionStatusStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "MakeupPositionStatusStartDateTime");
    private final static QName _BasicDataBaggageMakeupPositionMakeupPositionCapacity_QNAME = new QName("http://schema.ultra-as.com", "MakeupPositionCapacity");
    private final static QName _BasicDataBaggageMakeupPositionMakeupPositionStatusEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "MakeupPositionStatusEndDateTime");
    private final static QName _BasicDataBaggageMakeupPositionMakeupPositionDescription_QNAME = new QName("http://schema.ultra-as.com", "MakeupPositionDescription");
    private final static QName _IrregularityDetailsIrregularityNumericIATACode_QNAME = new QName("http://schema.ultra-as.com", "IrregularityNumericIATACode");
    private final static QName _IrregularityDetailsIrregularityAlphaIATACode_QNAME = new QName("http://schema.ultra-as.com", "IrregularityAlphaIATACode");
    private final static QName _BaggageReclaimCarouselFirstBagDateTime_QNAME = new QName("http://schema.ultra-as.com", "FirstBagDateTime");
    private final static QName _BaggageReclaimCarouselBaggageReclaimOpenDateTime_QNAME = new QName("http://schema.ultra-as.com", "BaggageReclaimOpenDateTime");
    private final static QName _BaggageReclaimCarouselExitDoorNumber_QNAME = new QName("http://schema.ultra-as.com", "ExitDoorNumber");
    private final static QName _BaggageReclaimCarouselLastBagDateTime_QNAME = new QName("http://schema.ultra-as.com", "LastBagDateTime");
    private final static QName _BaggageReclaimCarouselBaggageReclaimCloseDateTime_QNAME = new QName("http://schema.ultra-as.com", "BaggageReclaimCloseDateTime");
    private final static QName _BasicDataLocalisationTextEnglishLanguageText_QNAME = new QName("http://schema.ultra-as.com", "EnglishLanguageText");
    private final static QName _BasicDataLocalisationTextChineseLanguageText_QNAME = new QName("http://schema.ultra-as.com", "ChineseLanguageText");
    private final static QName _FlightDataAirportSecureStandIsRequired_QNAME = new QName("http://schema.ultra-as.com", "SecureStandIsRequired");
    private final static QName _FlightDataAirportAircraftTerminalCode_QNAME = new QName("http://schema.ultra-as.com", "AircraftTerminalCode");
    private final static QName _FlightDataAirportSupplementaryInformation_QNAME = new QName("http://schema.ultra-as.com", "SupplementaryInformation");
    private final static QName _FlightDataAirportBaggageTerminalCode_QNAME = new QName("http://schema.ultra-as.com", "BaggageTerminalCode");
    private final static QName _FlightDataAirportPassengerTerminalCode_QNAME = new QName("http://schema.ultra-as.com", "PassengerTerminalCode");
    private final static QName _FlightDataAirportStandPosition_QNAME = new QName("http://schema.ultra-as.com", "StandPosition");
    private final static QName _FlightDataAirportAirlineTerminalCode_QNAME = new QName("http://schema.ultra-as.com", "AirlineTerminalCode");
    private final static QName _FlightDataAirportBusIsRequired_QNAME = new QName("http://schema.ultra-as.com", "BusIsRequired");
    private final static QName _FlightDataAirportRunwayID_QNAME = new QName("http://schema.ultra-as.com", "RunwayID");
    private final static QName _FlightDataOperationalTimesLatestKnownDateTimeSource_QNAME = new QName("http://schema.ultra-as.com", "LatestKnownDateTimeSource");
    private final static QName _FlightDataOperationalTimesActualOffBlocksDateTime_QNAME = new QName("http://schema.ultra-as.com", "ActualOffBlocksDateTime");
    private final static QName _FlightDataOperationalTimesNextStationEstimatedDateTime_QNAME = new QName("http://schema.ultra-as.com", "NextStationEstimatedDateTime");
    private final static QName _FlightDataOperationalTimesNextStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "NextStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesFirstStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "FirstStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesNextInformationDateTime_QNAME = new QName("http://schema.ultra-as.com", "NextInformationDateTime");
    private final static QName _FlightDataOperationalTimesDestinationStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "DestinationStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesPreviousStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "PreviousStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesThirdStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "ThirdStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesSixthStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "SixthStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesWheelsDownDateTime_QNAME = new QName("http://schema.ultra-as.com", "WheelsDownDateTime");
    private final static QName _FlightDataOperationalTimesPreviousStationAirborneDateTime_QNAME = new QName("http://schema.ultra-as.com", "PreviousStationAirborneDateTime");
    private final static QName _FlightDataOperationalTimesOriginStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "OriginStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesEstimatedFlightDuration_QNAME = new QName("http://schema.ultra-as.com", "EstimatedFlightDuration");
    private final static QName _FlightDataOperationalTimesWheelsUpDateTime_QNAME = new QName("http://schema.ultra-as.com", "WheelsUpDateTime");
    private final static QName _FlightDataOperationalTimesActualOnBlocksDateTime_QNAME = new QName("http://schema.ultra-as.com", "ActualOnBlocksDateTime");
    private final static QName _FlightDataOperationalTimesNextStationActualDateTime_QNAME = new QName("http://schema.ultra-as.com", "NextStationActualDateTime");
    private final static QName _FlightDataOperationalTimesTenMileOutDateTime_QNAME = new QName("http://schema.ultra-as.com", "TenMileOutDateTime");
    private final static QName _FlightDataOperationalTimesPreviousStationEstimatedDateTime_QNAME = new QName("http://schema.ultra-as.com", "PreviousStationEstimatedDateTime");
    private final static QName _FlightDataOperationalTimesEstimatedDateTime_QNAME = new QName("http://schema.ultra-as.com", "EstimatedDateTime");
    private final static QName _FlightDataOperationalTimesSecondStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "SecondStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesFifthStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "FifthStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesFourthStationScheduledDateTime_QNAME = new QName("http://schema.ultra-as.com", "FourthStationScheduledDateTime");
    private final static QName _FlightDataOperationalTimesFinalApproachDateTime_QNAME = new QName("http://schema.ultra-as.com", "FinalApproachDateTime");
    private final static QName _FlightDataOperationalTimesLatestKnownDateTime_QNAME = new QName("http://schema.ultra-as.com", "LatestKnownDateTime");
    private final static QName _BasicDataGateGateDescription_QNAME = new QName("http://schema.ultra-as.com", "GateDescription");
    private final static QName _BasicDataGateGateStatusEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "GateStatusEndDateTime");
    private final static QName _BasicDataGateGateStatusReason_QNAME = new QName("http://schema.ultra-as.com", "GateStatusReason");
    private final static QName _BasicDataGateGateStatusStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "GateStatusStartDateTime");
    private final static QName _BasicDataGateGateStatus_QNAME = new QName("http://schema.ultra-as.com", "GateStatus");
    private final static QName _FlightDataAircraftAircraftOwnerIATACode_QNAME = new QName("http://schema.ultra-as.com", "AircraftOwnerIATACode");
    private final static QName _FlightDataAircraftAircraftCallsign_QNAME = new QName("http://schema.ultra-as.com", "AircraftCallsign");
    private final static QName _FlightDataAircraftAircraftOperator_QNAME = new QName("http://schema.ultra-as.com", "AircraftOperator");
    private final static QName _FlightDataAircraftAircraftTypeICAOCode_QNAME = new QName("http://schema.ultra-as.com", "AircraftTypeICAOCode");
    private final static QName _FlightDataAircraftAircraftPassengerCapacity_QNAME = new QName("http://schema.ultra-as.com", "AircraftPassengerCapacity");
    private final static QName _BasicDataCheckinDeskCheckinDeskStatusEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "CheckinDeskStatusEndDateTime");
    private final static QName _BasicDataCheckinDeskCheckinDeskDescription_QNAME = new QName("http://schema.ultra-as.com", "CheckinDeskDescription");
    private final static QName _BasicDataCheckinDeskCheckinDeskStatusReason_QNAME = new QName("http://schema.ultra-as.com", "CheckinDeskStatusReason");
    private final static QName _BasicDataCheckinDeskCheckinDeskStatus_QNAME = new QName("http://schema.ultra-as.com", "CheckinDeskStatus");
    private final static QName _BasicDataCheckinDeskCheckinDeskStatusStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "CheckinDeskStatusStartDateTime");
    private final static QName _BasicDataCheckinDeskCheckinGroup_QNAME = new QName("http://schema.ultra-as.com", "CheckinGroup");
    private final static QName _BasicDataFlightServiceTypeFlightServiceTypeDescription_QNAME = new QName("http://schema.ultra-as.com", "FlightServiceTypeDescription");
    private final static QName _BasicDataAirlineAirlineName_QNAME = new QName("http://schema.ultra-as.com", "AirlineName");
    private final static QName _BasicDataAirlineFlightServiceTypeIATACode_QNAME = new QName("http://schema.ultra-as.com", "FlightServiceTypeIATACode");
    private final static QName _BasicDataAirlineAirlineDescription_QNAME = new QName("http://schema.ultra-as.com", "AirlineDescription");
    private final static QName _BasicDataAirlineHandlingAgentIATACode_QNAME = new QName("http://schema.ultra-as.com", "HandlingAgentIATACode");
    private final static QName _BasicDataAirlinePublicCarrierCode_QNAME = new QName("http://schema.ultra-as.com", "PublicCarrierCode");
    private final static QName _BasicDataAirlineFlightSectorCode_QNAME = new QName("http://schema.ultra-as.com", "FlightSectorCode");
    private final static QName _TransferFlightTransferFlightPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "TransferFlightPassengerCount");
    private final static QName _TransferFlightTransferFlightIdentity_QNAME = new QName("http://schema.ultra-as.com", "TransferFlightIdentity");
    private final static QName _TransferFlightTransferFlightBagCount_QNAME = new QName("http://schema.ultra-as.com", "TransferFlightBagCount");
    private final static QName _CAACDelayDetailsCAACDelayCategory_QNAME = new QName("http://schema.ultra-as.com", "CAACDelayCategory");
    private final static QName _CAACDelayDetailsCAACDelayDuration_QNAME = new QName("http://schema.ultra-as.com", "CAACDelayDuration");
    private final static QName _CAACDelayDetailsCAACDelayAirportOriginated_QNAME = new QName("http://schema.ultra-as.com", "CAACDelayAirportOriginated");
    private final static QName _CAACDelayDetailsCAACDelayCode_QNAME = new QName("http://schema.ultra-as.com", "CAACDelayCode");
    private final static QName _BasicDataLocationLocationICAOCode_QNAME = new QName("http://schema.ultra-as.com", "LocationICAOCode");
    private final static QName _BasicDataLocationFlightElapsedPropellerTime_QNAME = new QName("http://schema.ultra-as.com", "FlightElapsedPropellerTime");
    private final static QName _BasicDataLocationAbbreviatedChinese_QNAME = new QName("http://schema.ultra-as.com", "AbbreviatedChinese");
    private final static QName _BasicDataLocationCountryCode_QNAME = new QName("http://schema.ultra-as.com", "CountryCode");
    private final static QName _BasicDataLocationLocationName_QNAME = new QName("http://schema.ultra-as.com", "LocationName");
    private final static QName _BasicDataLocationCountryName_QNAME = new QName("http://schema.ultra-as.com", "CountryName");
    private final static QName _BasicDataLocationFlightElapsedJetTime_QNAME = new QName("http://schema.ultra-as.com", "FlightElapsedJetTime");
    private final static QName _BasicDataLocationLocationDescription_QNAME = new QName("http://schema.ultra-as.com", "LocationDescription");
    private final static QName _BasicDataCheckinAirlineClassCheckinClassDescription_QNAME = new QName("http://schema.ultra-as.com", "CheckinClassDescription");
    private final static QName _FlightDataFlightIsReturnFlight_QNAME = new QName("http://schema.ultra-as.com", "IsReturnFlight");
    private final static QName _FlightDataFlightAccountCode_QNAME = new QName("http://schema.ultra-as.com", "AccountCode");
    private final static QName _FlightDataFlightMasterFlight_QNAME = new QName("http://schema.ultra-as.com", "MasterFlight");
    private final static QName _FlightDataFlightIsGeneralAviationFlight_QNAME = new QName("http://schema.ultra-as.com", "IsGeneralAviationFlight");
    private final static QName _FlightDataFlightFlightCancelCode_QNAME = new QName("http://schema.ultra-as.com", "FlightCancelCode");
    private final static QName _FlightDataFlightFlightOperatesOvernight_QNAME = new QName("http://schema.ultra-as.com", "FlightOperatesOvernight");
    private final static QName _FlightDataFlightCodeShareStatus_QNAME = new QName("http://schema.ultra-as.com", "CodeShareStatus");
    private final static QName _FlightDataFlightHasVIPs_QNAME = new QName("http://schema.ultra-as.com", "HasVIPs");
    private final static QName _FlightDataFlightFlightNatureCode_QNAME = new QName("http://schema.ultra-as.com", "FlightNatureCode");
    private final static QName _FlightDataFlightFlightClassificationCode_QNAME = new QName("http://schema.ultra-as.com", "FlightClassificationCode");
    private final static QName _FlightDataFlightIsTransferFlight_QNAME = new QName("http://schema.ultra-as.com", "IsTransferFlight");
    private final static QName _FlightDataFlightFlightTransitCode_QNAME = new QName("http://schema.ultra-as.com", "FlightTransitCode");
    private final static QName _FlightDataFlightDivertAirportIATACode_QNAME = new QName("http://schema.ultra-as.com", "DivertAirportIATACode");
    private final static QName _FlightDataFlightCAACDelayDetails_QNAME = new QName("http://schema.ultra-as.com", "CAACDelayDetails");
    private final static QName _FlightDataFlightFlightStatusCode_QNAME = new QName("http://schema.ultra-as.com", "FlightStatusCode");
    private final static QName _FlightDataFlightNewFlightReason_QNAME = new QName("http://schema.ultra-as.com", "NewFlightReason");
    private final static QName _FlightDataFlightLinkedFlight_QNAME = new QName("http://schema.ultra-as.com", "LinkedFlight");
    private final static QName _ResourceDataResourceImpairmentIdentificationTerminalCode_QNAME = new QName("http://schema.ultra-as.com", "TerminalCode");
    private final static QName _BasicDataFlightClassificationIsFlightClassificationDefault_QNAME = new QName("http://schema.ultra-as.com", "IsFlightClassificationDefault");
    private final static QName _BasicDataFlightClassificationClassificationCodeDescription_QNAME = new QName("http://schema.ultra-as.com", "ClassificationCodeDescription");
    private final static QName _FlightDataLoadCargoTotalMailWeight_QNAME = new QName("http://schema.ultra-as.com", "TotalMailWeight");
    private final static QName _FlightDataLoadCargoTransferCargoWeight_QNAME = new QName("http://schema.ultra-as.com", "TransferCargoWeight");
    private final static QName _FlightDataLoadCargoTransitBaggageCount_QNAME = new QName("http://schema.ultra-as.com", "TransitBaggageCount");
    private final static QName _FlightDataLoadCargoTransitBaggageWeight_QNAME = new QName("http://schema.ultra-as.com", "TransitBaggageWeight");
    private final static QName _FlightDataLoadCargoTotalBaggageWeight_QNAME = new QName("http://schema.ultra-as.com", "TotalBaggageWeight");
    private final static QName _FlightDataLoadCargoTransferBaggageCount_QNAME = new QName("http://schema.ultra-as.com", "TransferBaggageCount");
    private final static QName _FlightDataLoadCargoTransferBaggageWeight_QNAME = new QName("http://schema.ultra-as.com", "TransferBaggageWeight");
    private final static QName _FlightDataLoadCargoTransferMailWeight_QNAME = new QName("http://schema.ultra-as.com", "TransferMailWeight");
    private final static QName _FlightDataLoadCargoTotalBaggageCount_QNAME = new QName("http://schema.ultra-as.com", "TotalBaggageCount");
    private final static QName _FlightDataLoadCargoTotalFreightWeight_QNAME = new QName("http://schema.ultra-as.com", "TotalFreightWeight");
    private final static QName _FlightDataLoadCargoTotalLoadWeight_QNAME = new QName("http://schema.ultra-as.com", "TotalLoadWeight");
    private final static QName _VehicleUsageCount_QNAME = new QName("http://schema.ultra-as.com", "Count");
    private final static QName _VehicleUsageSubType_QNAME = new QName("http://schema.ultra-as.com", "SubType");
    private final static QName _BasicDataStandStandIsSecure_QNAME = new QName("http://schema.ultra-as.com", "StandIsSecure");
    private final static QName _BasicDataStandStandStatusStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "StandStatusStartDateTime");
    private final static QName _BasicDataStandStandStatusEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "StandStatusEndDateTime");
    private final static QName _BasicDataStandGateNumber_QNAME = new QName("http://schema.ultra-as.com", "GateNumber");
    private final static QName _BasicDataStandStandDescription_QNAME = new QName("http://schema.ultra-as.com", "StandDescription");
    private final static QName _BasicDataStandStandStatus_QNAME = new QName("http://schema.ultra-as.com", "StandStatus");
    private final static QName _BasicDataStandStandStatusReason_QNAME = new QName("http://schema.ultra-as.com", "StandStatusReason");
    private final static QName _BasicDataDelayCodeDelayCodeDescription_QNAME = new QName("http://schema.ultra-as.com", "DelayCodeDescription");
    private final static QName _ICAOFlightIdentifierFlightSuffix_QNAME = new QName("http://schema.ultra-as.com", "FlightSuffix");
    private final static QName _BasicDataFlightNatureFlightNatureDescription_QNAME = new QName("http://schema.ultra-as.com", "FlightNatureDescription");
    private final static QName _GateGateCloseDateTime_QNAME = new QName("http://schema.ultra-as.com", "GateCloseDateTime");
    private final static QName _GateGateOpenDateTime_QNAME = new QName("http://schema.ultra-as.com", "GateOpenDateTime");
    private final static QName _GateGateBoardingStatus_QNAME = new QName("http://schema.ultra-as.com", "GateBoardingStatus");
    private final static QName _FlightDataLoadPassengerCountsTransferPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "TransferPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsAdultPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "AdultPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsDomesticPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "DomesticPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsBusinessClassPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "BusinessClassPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsChildPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "ChildPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsFirstClassPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "FirstClassPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsLocalPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "LocalPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsInfantPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "InfantPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsTotalPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "TotalPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsTransitPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "TransitPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsNonTransferPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "NonTransferPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsEconomyClassPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "EconomyClassPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsInternationalPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "InternationalPassengerCount");
    private final static QName _FlightDataLoadPassengerCountsWheelchairPassengerCount_QNAME = new QName("http://schema.ultra-as.com", "WheelchairPassengerCount");
    private final static QName _BasicDataFlightSectorFlightSectorDescription_QNAME = new QName("http://schema.ultra-as.com", "FlightSectorDescription");
    private final static QName _BasicDataAircraftRegistrationAirlineIATACode_QNAME = new QName("http://schema.ultra-as.com", "AirlineIATACode");
    private final static QName _BasicDataAircraftRegistrationAircraftNoseNumber_QNAME = new QName("http://schema.ultra-as.com", "AircraftNoseNumber");
    private final static QName _BasicDataAircraftRegistrationAircraftRegistrationDescription_QNAME = new QName("http://schema.ultra-as.com", "AircraftRegistrationDescription");
    private final static QName _BasicDataAircraftRegistrationAircraftTailNumber_QNAME = new QName("http://schema.ultra-as.com", "AircraftTailNumber");
    private final static QName _BasicDataRunwayRunwayStatusEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "RunwayStatusEndDateTime");
    private final static QName _BasicDataRunwayRunwayStatusReason_QNAME = new QName("http://schema.ultra-as.com", "RunwayStatusReason");
    private final static QName _BasicDataRunwayRunwayDescription_QNAME = new QName("http://schema.ultra-as.com", "RunwayDescription");
    private final static QName _BasicDataRunwayRunwayStatus_QNAME = new QName("http://schema.ultra-as.com", "RunwayStatus");
    private final static QName _BasicDataRunwayRunwayStatusStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "RunwayStatusStartDateTime");
    private final static QName _BaggageMakeupPositionBaggageMakeupOpenDateTime_QNAME = new QName("http://schema.ultra-as.com", "BaggageMakeupOpenDateTime");
    private final static QName _BaggageMakeupPositionBaggageMakeupCloseDateTime_QNAME = new QName("http://schema.ultra-as.com", "BaggageMakeupCloseDateTime");
    private final static QName _OperationTypeOperationTypeCode_QNAME = new QName("http://schema.ultra-as.com", "OperationTypeCode");
    private final static QName _ResourceDataCheckinSlotCheckinSlotSequence_QNAME = new QName("http://schema.ultra-as.com", "CheckinSlotSequence");
    private final static QName _BasicDataAircraftSubtypeAircraftHeight_QNAME = new QName("http://schema.ultra-as.com", "AircraftHeight");
    private final static QName _BasicDataAircraftSubtypeAircraftWeight_QNAME = new QName("http://schema.ultra-as.com", "AircraftWeight");
    private final static QName _BasicDataAircraftSubtypeAircraftTypeIATACode_QNAME = new QName("http://schema.ultra-as.com", "AircraftTypeIATACode");
    private final static QName _BasicDataAircraftSubtypeAircraftCategoryIATACode_QNAME = new QName("http://schema.ultra-as.com", "AircraftCategoryIATACode");
    private final static QName _BasicDataAircraftSubtypeFirstClassPassengerCapacity_QNAME = new QName("http://schema.ultra-as.com", "FirstClassPassengerCapacity");
    private final static QName _BasicDataAircraftSubtypeFreightCapacity_QNAME = new QName("http://schema.ultra-as.com", "FreightCapacity");
    private final static QName _BasicDataAircraftSubtypeMaximumPayload_QNAME = new QName("http://schema.ultra-as.com", "MaximumPayload");
    private final static QName _BasicDataAircraftSubtypeEconomyClassPassengerCapacity_QNAME = new QName("http://schema.ultra-as.com", "EconomyClassPassengerCapacity");
    private final static QName _BasicDataAircraftSubtypeBusinessClassPassengerCapacity_QNAME = new QName("http://schema.ultra-as.com", "BusinessClassPassengerCapacity");
    private final static QName _BasicDataAircraftSubtypeAircraftSubtypeDescription_QNAME = new QName("http://schema.ultra-as.com", "AircraftSubtypeDescription");
    private final static QName _BasicDataAircraftSubtypeAircraftNoiseLevel_QNAME = new QName("http://schema.ultra-as.com", "AircraftNoiseLevel");
    private final static QName _BasicDataAircraftSubtypeAircraftWidth_QNAME = new QName("http://schema.ultra-as.com", "AircraftWidth");
    private final static QName _BasicDataAircraftSubtypeAircraftLength_QNAME = new QName("http://schema.ultra-as.com", "AircraftLength");
    private final static QName _BasicDataBoardingBridgeBridgeDescription_QNAME = new QName("http://schema.ultra-as.com", "BridgeDescription");
    private final static QName _BasicDataBoardingBridgeBridgeStatusPCA_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusPCA");
    private final static QName _BasicDataBoardingBridgeBridgeStatusPowerStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusPowerStartDateTime");
    private final static QName _BasicDataBoardingBridgeBridgeStatusPCAEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusPCAEndDateTime");
    private final static QName _BasicDataBoardingBridgeBridgeStatusPowerEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusPowerEndDateTime");
    private final static QName _BasicDataBoardingBridgeBridgeStatusPCAStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusPCAStartDateTime");
    private final static QName _BasicDataBoardingBridgeBridgeStatusGeneral_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusGeneral");
    private final static QName _BasicDataBoardingBridgeBridgeStatusPCAReason_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusPCAReason");
    private final static QName _BasicDataBoardingBridgeBridgeStatusGeneralStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusGeneralStartDateTime");
    private final static QName _BasicDataBoardingBridgeBridgeStatusPower_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusPower");
    private final static QName _BasicDataBoardingBridgeBridgeStatusGeneralEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusGeneralEndDateTime");
    private final static QName _BasicDataBoardingBridgeBridgeStatusPowerReason_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusPowerReason");
    private final static QName _BasicDataBoardingBridgeBridgeStatusGeneralReason_QNAME = new QName("http://schema.ultra-as.com", "BridgeStatusGeneralReason");
    private final static QName _InformationRemarkInformationLanguage_QNAME = new QName("http://schema.ultra-as.com", "InformationLanguage");
    private final static QName _InformationRemarkInformationText_QNAME = new QName("http://schema.ultra-as.com", "InformationText");
    private final static QName _ResourceDataGateOperationGateLastCallDateTime_QNAME = new QName("http://schema.ultra-as.com", "GateLastCallDateTime");
    private final static QName _FlightDataPublic_QNAME = new QName("http://schema.ultra-as.com", "Public");
    private final static QName _FlightDataAircraft_QNAME = new QName("http://schema.ultra-as.com", "Aircraft");
    private final static QName _FlightDataPortsOfCall_QNAME = new QName("http://schema.ultra-as.com", "PortsOfCall");
    private final static QName _FlightDataLoad_QNAME = new QName("http://schema.ultra-as.com", "Load");
    private final static QName _FlightDataOperationalTimes_QNAME = new QName("http://schema.ultra-as.com", "OperationalTimes");
    private final static QName _FlightDataAirport_QNAME = new QName("http://schema.ultra-as.com", "Airport");
    private final static QName _FlightDataFlight_QNAME = new QName("http://schema.ultra-as.com", "Flight");
    private final static QName _AFDSCancelSubscriptionDateTimeSubscriptionCancelled_QNAME = new QName("http://schema.ultra-as.com", "DateTimeSubscriptionCancelled");
    private final static QName _RDDSCancelSubscriptionDateTimeSubscriptionCancelled_QNAME = new QName("http://schema.ultra-as.com", "DateTimeSubscriptionCancelled");
    private final static QName _BDDSCancelSubscriptionDateTimeSubscriptionCancelled_QNAME = new QName("http://schema.ultra-as.com", "DateTimeSubscriptionCancelled");
    private final static QName _SFDSCancelSubscriptionDateTimeSubscriptionCancelled_QNAME = new QName("http://schema.ultra-as.com", "DateTimeSubscriptionCancelled");
    private final static QName _AFDSSubscriptionRequestSnapshotFromDateTime_QNAME = new QName("http://schema.ultra-as.com", "SnapshotFromDateTime");
    private final static QName _RDDSSubscriptionRequestSnapshotFromDateTime_QNAME = new QName("http://schema.ultra-as.com", "SnapshotFromDateTime");
    private final static QName _BDDSSubscriptionRequestSnapshotFromDateTime_QNAME = new QName("http://schema.ultra-as.com", "SnapshotFromDateTime");
    private final static QName _SFDSScheduleRequestScheduleStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "ScheduleStartDateTime");
    private final static QName _SFDSScheduleRequestScheduleEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "ScheduleEndDateTime");
    private final static QName _FlightFilterDataFlightType_QNAME = new QName("http://schema.ultra-as.com", "FlightType");
    private final static QName _FlightFilterDataAirportIATACode_QNAME = new QName("http://schema.ultra-as.com", "AirportIATACode");
    private final static QName _FlightFilterDataCarrierIATACode_QNAME = new QName("http://schema.ultra-as.com", "CarrierIATACode");
    private final static QName _FlightFilterDataCarrierICAOCode_QNAME = new QName("http://schema.ultra-as.com", "CarrierICAOCode");
    private final static QName _BasicDataCAACDelayCodeCAACDelayCodeDescription_QNAME = new QName("http://schema.ultra-as.com", "CAACDelayCodeDescription");
    private final static QName _BasicDataBaggageReclaimCarouselReclaimCarouselStatusStartDateTime_QNAME = new QName("http://schema.ultra-as.com", "ReclaimCarouselStatusStartDateTime");
    private final static QName _BasicDataBaggageReclaimCarouselReclaimCarouselStatusEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "ReclaimCarouselStatusEndDateTime");
    private final static QName _BasicDataBaggageReclaimCarouselReclaimCarouselStatus_QNAME = new QName("http://schema.ultra-as.com", "ReclaimCarouselStatus");
    private final static QName _BasicDataBaggageReclaimCarouselReclaimCarouselDescription_QNAME = new QName("http://schema.ultra-as.com", "ReclaimCarouselDescription");
    private final static QName _BasicDataBaggageReclaimCarouselReclaimCarouselExitDoor_QNAME = new QName("http://schema.ultra-as.com", "ReclaimCarouselExitDoor");
    private final static QName _BasicDataBaggageReclaimCarouselReclaimCarouselStatusReason_QNAME = new QName("http://schema.ultra-as.com", "ReclaimCarouselStatusReason");
    private final static QName _BasicDataBaggageReclaimCarouselReclaimCarouselCapacity_QNAME = new QName("http://schema.ultra-as.com", "ReclaimCarouselCapacity");
    private final static QName _ResourceDataCheckinOperationCheckinCloseDateTime_QNAME = new QName("http://schema.ultra-as.com", "CheckinCloseDateTime");
    private final static QName _ResourceDataCheckinOperationCheckinOpenDateTime_QNAME = new QName("http://schema.ultra-as.com", "CheckinOpenDateTime");
    private final static QName _ResourceDataResourceImpairmentImpairmentEndDateTime_QNAME = new QName("http://schema.ultra-as.com", "ImpairmentEndDateTime");
    private final static QName _FlightDataLoadTotalCrewCount_QNAME = new QName("http://schema.ultra-as.com", "TotalCrewCount");
    private final static QName _FlightDataLoadCargo_QNAME = new QName("http://schema.ultra-as.com", "Cargo");
    private final static QName _FlightDataLoadPassengerCounts_QNAME = new QName("http://schema.ultra-as.com", "PassengerCounts");
    private final static QName _CheckinCheckinTypeCode_QNAME = new QName("http://schema.ultra-as.com", "CheckinTypeCode");
    private final static QName _CheckinCheckinClusterID_QNAME = new QName("http://schema.ultra-as.com", "CheckinClusterID");
    private final static QName _ResourceDataAircraftTowAircraftMovementConfirmStatus_QNAME = new QName("http://schema.ultra-as.com", "AircraftMovementConfirmStatus");
    private final static QName _ResourceDataAircraftTowDepartureIdentification_QNAME = new QName("http://schema.ultra-as.com", "DepartureIdentification");
    private final static QName _ResourceDataAircraftTowArrivalIdentification_QNAME = new QName("http://schema.ultra-as.com", "ArrivalIdentification");
    private final static QName _ResourceDataAircraftTowAircraftMovementTypeCode_QNAME = new QName("http://schema.ultra-as.com", "AircraftMovementTypeCode");
    private final static QName _BasicDataCAACDelayCategoryCAACDelayCategoryDescription_QNAME = new QName("http://schema.ultra-as.com", "CAACDelayCategoryDescription");
    private final static QName _BasicDataTerminalTerminalDescription_QNAME = new QName("http://schema.ultra-as.com", "TerminalDescription");
    private final static QName _BasicDataHandlerHandlingAgentDescription_QNAME = new QName("http://schema.ultra-as.com", "HandlingAgentDescription");
    private final static QName _FlightDataPublicPublicDateTime_QNAME = new QName("http://schema.ultra-as.com", "PublicDateTime");
    private final static QName _AFDSStatusRequestDateTimeStatusRequestSent_QNAME = new QName("http://schema.ultra-as.com", "DateTimeStatusRequestSent");
    private final static QName _RDDSStatusRequestDateTimeStatusRequestSent_QNAME = new QName("http://schema.ultra-as.com", "DateTimeStatusRequestSent");
    private final static QName _BDDSStatusRequestDateTimeStatusRequestSent_QNAME = new QName("http://schema.ultra-as.com", "DateTimeStatusRequestSent");
    private final static QName _SFDSStatusRequestDateTimeStatusRequestSent_QNAME = new QName("http://schema.ultra-as.com", "DateTimeStatusRequestSent");
    private final static QName _SFDSScheduleRequestSubscriptionParametersFlightShareStatus_QNAME = new QName("http://schema.ultra-as.com", "FlightShareStatus");
    private final static QName _SFDSScheduleRequestSubscriptionParametersAirportIATACode_QNAME = new QName("http://schema.ultra-as.com", "AirportIATACode");
    private final static QName _SFDSScheduleRequestSubscriptionParametersFlightDirection_QNAME = new QName("http://schema.ultra-as.com", "FlightDirection");
    private final static QName _AFDSSubscriptionRequestSubscriptionParametersFlightShareStatus_QNAME = new QName("http://schema.ultra-as.com", "FlightShareStatus");
    private final static QName _AFDSSubscriptionRequestSubscriptionParametersFlightType_QNAME = new QName("http://schema.ultra-as.com", "FlightType");
    private final static QName _AFDSSubscriptionRequestSubscriptionParametersAirportIATACode_QNAME = new QName("http://schema.ultra-as.com", "AirportIATACode");
    private final static QName _AFDSSubscriptionRequestSubscriptionParametersFlightDirection_QNAME = new QName("http://schema.ultra-as.com", "FlightDirection");
    private final static QName _AFDSStatusResponseDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _AFDSCancellationDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _AFDSCancellationRejectionReason_QNAME = new QName("http://schema.ultra-as.com", "RejectionReason");
    private final static QName _AFDSSnapshotStartDateTimeSnapshotStartSent_QNAME = new QName("http://schema.ultra-as.com", "DateTimeSnapshotStartSent");
    private final static QName _AFDSSnapshotEndDNumberOfRecords_QNAME = new QName("http://schema.ultra-as.com", "NumberOfRecords");
    private final static QName _AFDSSubscriptionResponseDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _AFDSSubscriptionResponseRejectionReason_QNAME = new QName("http://schema.ultra-as.com", "RejectionReason");
    private final static QName _BDDSCancellationDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _BDDSCancellationRejectionReason_QNAME = new QName("http://schema.ultra-as.com", "RejectionReason");
    private final static QName _BDDSSnapshotStartDateTimeSnapshotStartSent_QNAME = new QName("http://schema.ultra-as.com", "DateTimeSnapshotStartSent");
    private final static QName _BDDSSubscriptionResponseDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _BDDSSubscriptionResponseRejectionReason_QNAME = new QName("http://schema.ultra-as.com", "RejectionReason");
    private final static QName _BDDSStatusResponseDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _BDDSSnapshotEndDNumberOfRecords_QNAME = new QName("http://schema.ultra-as.com", "NumberOfRecords");
    private final static QName _RDDSCancellationDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _RDDSSnapshotStartDateTimeSnapshotStartSent_QNAME = new QName("http://schema.ultra-as.com", "DateTimeSnapshotStartSent");
    private final static QName _RDDSSubscriptionResponseDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _RDDSSubscriptionResponseRejectionReason_QNAME = new QName("http://schema.ultra-as.com", "RejectionReason");
    private final static QName _RDDSStatusResponseDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _RDDSSnapshotEndDNumberOfRecords_QNAME = new QName("http://schema.ultra-as.com", "NumberOfRecords");
    private final static QName _SFDSCancellationDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _SFDSCancellationRejectionReason_QNAME = new QName("http://schema.ultra-as.com", "RejectionReason");
    private final static QName _SFDSScheduleResponseDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _SFDSScheduleResponseRejectionReason_QNAME = new QName("http://schema.ultra-as.com", "RejectionReason");
    private final static QName _SFDSStatusResponseDateTimeRequestReceived_QNAME = new QName("http://schema.ultra-as.com", "DateTimeRequestReceived");
    private final static QName _SFDSScheduleEndDNumberOfRecords_QNAME = new QName("http://schema.ultra-as.com", "NumberOfRecords");
    private final static QName _SFDSScheduleStartRequestID_QNAME = new QName("http://schema.ultra-as.com", "RequestID");
    private final static QName _SFDSFlightDataFlightLinkedFlightLinkDay_QNAME = new QName("http://schema.ultra-as.com", "LinkDay");
    private final static QName _SFDSFlightDataFlightLinkedFlightLinkedFlightID_QNAME = new QName("http://schema.ultra-as.com", "LinkedFlightID");
    private final static QName _SFDSFlightDataIdentificationSeasonalFlightCancelCode_QNAME = new QName("http://schema.ultra-as.com", "SeasonalFlightCancelCode");
    private final static QName _SFDSFlightDataIdentificationFlightID_QNAME = new QName("http://schema.ultra-as.com", "FlightID");
    private final static QName _SFDSFlightDataAirportBaggageMakeupPositionBaggageMakeupPositionID_QNAME = new QName("http://schema.ultra-as.com", "BaggageMakeupPositionID");
    private final static QName _SFDSFlightDataFlightMasterFlightMasterFlightID_QNAME = new QName("http://schema.ultra-as.com", "MasterFlightID");
    private final static QName _SFDSFlightDataFlightMasterFlight_QNAME = new QName("http://schema.ultra-as.com", "MasterFlight");
    private final static QName _SFDSFlightDataFlightFlightTransitCode_QNAME = new QName("http://schema.ultra-as.com", "FlightTransitCode");
    private final static QName _SFDSFlightDataFlightIsGeneralAviationFlight_QNAME = new QName("http://schema.ultra-as.com", "IsGeneralAviationFlight");
    private final static QName _SFDSFlightDataFlightFlightOperatesOvernight_QNAME = new QName("http://schema.ultra-as.com", "FlightOperatesOvernight");
    private final static QName _SFDSFlightDataFlightFlightSeason_QNAME = new QName("http://schema.ultra-as.com", "FlightSeason");
    private final static QName _SFDSFlightDataFlightFlightClassificationCode_QNAME = new QName("http://schema.ultra-as.com", "FlightClassificationCode");
    private final static QName _SFDSFlightDataFlightIsTransferFlight_QNAME = new QName("http://schema.ultra-as.com", "IsTransferFlight");
    private final static QName _SFDSFlightDataFlightLinkedFlight_QNAME = new QName("http://schema.ultra-as.com", "LinkedFlight");
    private final static QName _SFDSFlightDataAirportCheckinCheckinDeskRange_QNAME = new QName("http://schema.ultra-as.com", "CheckinDeskRange");
    private final static QName _SFDSFlightDataAirportBaggageReclaimCarouselBaggageReclaimCarouselID_QNAME = new QName("http://schema.ultra-as.com", "BaggageReclaimCarouselID");
    private final static QName _FlightDataAircraftAircraftSubtypeIATACode_QNAME = new QName("http://schema.ultra-as.com", "AircraftSubtypeIATACode");
    private final static QName _FlightFilterDataFlightServiceTypeIATACode_QNAME = new QName("http://schema.ultra-as.com", "FlightServiceTypeIATACode");
    private final static QName _BasicDataLocationFlightSectorCode_QNAME = new QName("http://schema.ultra-as.com", "FlightSectorCode");
    private final static QName _FlightFilterDataCodeShareStatus_QNAME = new QName("http://schema.ultra-as.com", "CodeShareStatus");    
    private final static QName _ResourceDataCheckinOperationIdentificationFlightIdentity_QNAME = new QName("http://schema.ultra-as.com", "FlightIdentity");    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ultra_as.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BasicData }
     * 
     */
    public BasicData createBasicData() {
        return new BasicData();
    }

    /**
     * Create an instance of {@link BasicData.Terminal }
     * 
     */
    public BasicData.Terminal createBasicDataTerminal() {
        return new BasicData.Terminal();
    }

    /**
     * Create an instance of {@link BasicData.Stand }
     * 
     */
    public BasicData.Stand createBasicDataStand() {
        return new BasicData.Stand();
    }

    /**
     * Create an instance of {@link BasicData.Runway }
     * 
     */
    public BasicData.Runway createBasicDataRunway() {
        return new BasicData.Runway();
    }

    /**
     * Create an instance of {@link BasicData.Location }
     * 
     */
    public BasicData.Location createBasicDataLocation() {
        return new BasicData.Location();
    }

    /**
     * Create an instance of {@link BasicData.LocalisationText }
     * 
     */
    public BasicData.LocalisationText createBasicDataLocalisationText() {
        return new BasicData.LocalisationText();
    }

    /**
     * Create an instance of {@link BasicData.Handler }
     * 
     */
    public BasicData.Handler createBasicDataHandler() {
        return new BasicData.Handler();
    }

    /**
     * Create an instance of {@link BasicData.Gate }
     * 
     */
    public BasicData.Gate createBasicDataGate() {
        return new BasicData.Gate();
    }

    /**
     * Create an instance of {@link BasicData.FlightServiceType }
     * 
     */
    public BasicData.FlightServiceType createBasicDataFlightServiceType() {
        return new BasicData.FlightServiceType();
    }

    /**
     * Create an instance of {@link BasicData.FlightSector }
     * 
     */
    public BasicData.FlightSector createBasicDataFlightSector() {
        return new BasicData.FlightSector();
    }

    /**
     * Create an instance of {@link BasicData.FlightNature }
     * 
     */
    public BasicData.FlightNature createBasicDataFlightNature() {
        return new BasicData.FlightNature();
    }

    /**
     * Create an instance of {@link BasicData.FlightClassification }
     * 
     */
    public BasicData.FlightClassification createBasicDataFlightClassification() {
        return new BasicData.FlightClassification();
    }

    /**
     * Create an instance of {@link BasicData.DelayCode }
     * 
     */
    public BasicData.DelayCode createBasicDataDelayCode() {
        return new BasicData.DelayCode();
    }

    /**
     * Create an instance of {@link BasicData.CheckinDesk }
     * 
     */
    public BasicData.CheckinDesk createBasicDataCheckinDesk() {
        return new BasicData.CheckinDesk();
    }

    /**
     * Create an instance of {@link BasicData.CheckinClass }
     * 
     */
    public BasicData.CheckinClass createBasicDataCheckinClass() {
        return new BasicData.CheckinClass();
    }

    /**
     * Create an instance of {@link BasicData.CheckinAirlineClass }
     * 
     */
    public BasicData.CheckinAirlineClass createBasicDataCheckinAirlineClass() {
        return new BasicData.CheckinAirlineClass();
    }

    /**
     * Create an instance of {@link BasicData.CAACDelayCode }
     * 
     */
    public BasicData.CAACDelayCode createBasicDataCAACDelayCode() {
        return new BasicData.CAACDelayCode();
    }

    /**
     * Create an instance of {@link BasicData.CAACDelayCategory }
     * 
     */
    public BasicData.CAACDelayCategory createBasicDataCAACDelayCategory() {
        return new BasicData.CAACDelayCategory();
    }

    /**
     * Create an instance of {@link BasicData.BoardingBridge }
     * 
     */
    public BasicData.BoardingBridge createBasicDataBoardingBridge() {
        return new BasicData.BoardingBridge();
    }

    /**
     * Create an instance of {@link BasicData.BaggageReclaimCarousel }
     * 
     */
    public BasicData.BaggageReclaimCarousel createBasicDataBaggageReclaimCarousel() {
        return new BasicData.BaggageReclaimCarousel();
    }

    /**
     * Create an instance of {@link BasicData.BaggageMakeupPosition }
     * 
     */
    public BasicData.BaggageMakeupPosition createBasicDataBaggageMakeupPosition() {
        return new BasicData.BaggageMakeupPosition();
    }

    /**
     * Create an instance of {@link BasicData.Airline }
     * 
     */
    public BasicData.Airline createBasicDataAirline() {
        return new BasicData.Airline();
    }

    /**
     * Create an instance of {@link BasicData.AircraftSubtype }
     * 
     */
    public BasicData.AircraftSubtype createBasicDataAircraftSubtype() {
        return new BasicData.AircraftSubtype();
    }

    /**
     * Create an instance of {@link BasicData.AircraftRegistration }
     * 
     */
    public BasicData.AircraftRegistration createBasicDataAircraftRegistration() {
        return new BasicData.AircraftRegistration();
    }

    /**
     * Create an instance of {@link FlightFilterData }
     * 
     */
    public FlightFilterData createFlightFilterData() {
        return new FlightFilterData();
    }

    /**
     * Create an instance of {@link FlightData }
     * 
     */
    public FlightData createFlightData() {
        return new FlightData();
    }

    /**
     * Create an instance of {@link FlightData.Load }
     * 
     */
    public FlightData.Load createFlightDataLoad() {
        return new FlightData.Load();
    }

    /**
     * Create an instance of {@link ResourceData }
     * 
     */
    public ResourceData createResourceData() {
        return new ResourceData();
    }

    /**
     * Create an instance of {@link ResourceData.StandPositionOperation }
     * 
     */
    public ResourceData.StandPositionOperation createResourceDataStandPositionOperation() {
        return new ResourceData.StandPositionOperation();
    }

    /**
     * Create an instance of {@link ResourceData.ResourceImpairment }
     * 
     */
    public ResourceData.ResourceImpairment createResourceDataResourceImpairment() {
        return new ResourceData.ResourceImpairment();
    }

    /**
     * Create an instance of {@link ResourceData.GateOperation }
     * 
     */
    public ResourceData.GateOperation createResourceDataGateOperation() {
        return new ResourceData.GateOperation();
    }

    /**
     * Create an instance of {@link ResourceData.CheckinSlot }
     * 
     */
    public ResourceData.CheckinSlot createResourceDataCheckinSlot() {
        return new ResourceData.CheckinSlot();
    }

    /**
     * Create an instance of {@link ResourceData.CheckinOperation }
     * 
     */
    public ResourceData.CheckinOperation createResourceDataCheckinOperation() {
        return new ResourceData.CheckinOperation();
    }

    /**
     * Create an instance of {@link ResourceData.BaggageReclaimOperation }
     * 
     */
    public ResourceData.BaggageReclaimOperation createResourceDataBaggageReclaimOperation() {
        return new ResourceData.BaggageReclaimOperation();
    }

    /**
     * Create an instance of {@link ResourceData.AircraftTow }
     * 
     */
    public ResourceData.AircraftTow createResourceDataAircraftTow() {
        return new ResourceData.AircraftTow();
    }

    /**
     * Create an instance of {@link AFDSCancelSubscription }
     * 
     */
    public AFDSCancelSubscription createAFDSCancelSubscription() {
        return new AFDSCancelSubscription();
    }

    
    /**
     * Create an instance of {@link AFDSCancelSubscription }
     * 
     */
    public BDDSCancelSubscription createBDDSCancelSubscription() {
        return new BDDSCancelSubscription();
    }
    
    /**
     * Create an instance of {@link AFDSCancelSubscription }
     * 
     */
    public SFDSCancelSubscription createSFDSCancelSubscription() {
        return new SFDSCancelSubscription();
    }
    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link LinkedFlight }
     * 
     */
    public LinkedFlight createLinkedFlight() {
        return new LinkedFlight();
    }

    /**
     * Create an instance of {@link Remark }
     * 
     */
    public Remark createRemark() {
        return new Remark();
    }

    /**
     * Create an instance of {@link ExtendedFlightData }
     * 
     */
    public ExtendedFlightData createExtendedFlightData() {
        return new ExtendedFlightData();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link OperationType }
     * 
     */
    public OperationType createOperationType() {
        return new OperationType();
    }

    /**
     * Create an instance of {@link IATAMasterFlightIdentifier }
     * 
     */
    public IATAMasterFlightIdentifier createIATAMasterFlightIdentifier() {
        return new IATAMasterFlightIdentifier();
    }

    /**
     * Create an instance of {@link IrregularityDetails }
     * 
     */
    public IrregularityDetails createIrregularityDetails() {
        return new IrregularityDetails();
    }

    /**
     * Create an instance of {@link InformationRemark }
     * 
     */
    public InformationRemark createInformationRemark() {
        return new InformationRemark();
    }

    /**
     * Create an instance of {@link MasterFlight }
     * 
     */
    public MasterFlight createMasterFlight() {
        return new MasterFlight();
    }

    /**
     * Create an instance of {@link RecordIdentification }
     * 
     */
    public RecordIdentification createRecordIdentification() {
        return new RecordIdentification();
    }

    /**
     * Create an instance of {@link AircraftVisitIdentification }
     * 
     */
    public AircraftVisitIdentification createAircraftVisitIdentification() {
        return new AircraftVisitIdentification();
    }

    /**
     * Create an instance of {@link FlightTask }
     * 
     */
    public FlightTask createFlightTask() {
        return new FlightTask();
    }

    /**
     * Create an instance of {@link com.ultra_as.schema.Gate }
     * 
     */
    public com.ultra_as.schema.Gate createGate() {
        return new com.ultra_as.schema.Gate();
    }

    /**
     * Create an instance of {@link FlightIdentification }
     * 
     */
    public FlightIdentification createFlightIdentification() {
        return new FlightIdentification();
    }

    /**
     * Create an instance of {@link com.ultra_as.schema.BaggageMakeupPosition }
     * 
     */
    public com.ultra_as.schema.BaggageMakeupPosition createBaggageMakeupPosition() {
        return new com.ultra_as.schema.BaggageMakeupPosition();
    }

    /**
     * Create an instance of {@link CAACDelayDetails }
     * 
     */
    public CAACDelayDetails createCAACDelayDetails() {
        return new CAACDelayDetails();
    }

    /**
     * Create an instance of {@link VIPData }
     * 
     */
    public VIPData createVIPData() {
        return new VIPData();
    }

    /**
     * Create an instance of {@link ICAOFlightIdentifier }
     * 
     */
    public ICAOFlightIdentifier createICAOFlightIdentifier() {
        return new ICAOFlightIdentifier();
    }

    /**
     * Create an instance of {@link IATAFlightIdentifier }
     * 
     */
    public IATAFlightIdentifier createIATAFlightIdentifier() {
        return new IATAFlightIdentifier();
    }

    /**
     * Create an instance of {@link Checkin }
     * 
     */
    public Checkin createCheckin() {
        return new Checkin();
    }

    /**
     * Create an instance of {@link ShareFlight }
     * 
     */
    public ShareFlight createShareFlight() {
        return new ShareFlight();
    }

    /**
     * Create an instance of {@link TransferFlight }
     * 
     */
    public TransferFlight createTransferFlight() {
        return new TransferFlight();
    }

    /**
     * Create an instance of {@link VehicleUsage }
     * 
     */
    public VehicleUsage createVehicleUsage() {
        return new VehicleUsage();
    }

    /**
     * Create an instance of {@link com.ultra_as.schema.BaggageReclaimCarousel }
     * 
     */
    public com.ultra_as.schema.BaggageReclaimCarousel createBaggageReclaimCarousel() {
        return new com.ultra_as.schema.BaggageReclaimCarousel();
    }

    /**
     * Create an instance of {@link HandlingAgent }
     * 
     */
    public HandlingAgent createHandlingAgent() {
        return new HandlingAgent();
    }

    /**
     * Create an instance of {@link SupplementaryInformation }
     * 
     */
    public SupplementaryInformation createSupplementaryInformation() {
        return new SupplementaryInformation();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link IATALinkFlightIdentifier }
     * 
     */
    public IATALinkFlightIdentifier createIATALinkFlightIdentifier() {
        return new IATALinkFlightIdentifier();
    }

    /**
     * Create an instance of {@link BasicData.Terminal.Identification }
     * 
     */
    public BasicData.Terminal.Identification createBasicDataTerminalIdentification() {
        return new BasicData.Terminal.Identification();
    }

    /**
     * Create an instance of {@link BasicData.Stand.Identification }
     * 
     */
    public BasicData.Stand.Identification createBasicDataStandIdentification() {
        return new BasicData.Stand.Identification();
    }

    /**
     * Create an instance of {@link BasicData.Runway.Identification }
     * 
     */
    public BasicData.Runway.Identification createBasicDataRunwayIdentification() {
        return new BasicData.Runway.Identification();
    }

    /**
     * Create an instance of {@link BasicData.Location.Identification }
     * 
     */
    public BasicData.Location.Identification createBasicDataLocationIdentification() {
        return new BasicData.Location.Identification();
    }

    /**
     * Create an instance of {@link BasicData.LocalisationText.Identification }
     * 
     */
    public BasicData.LocalisationText.Identification createBasicDataLocalisationTextIdentification() {
        return new BasicData.LocalisationText.Identification();
    }

    /**
     * Create an instance of {@link BasicData.Handler.Identification }
     * 
     */
    public BasicData.Handler.Identification createBasicDataHandlerIdentification() {
        return new BasicData.Handler.Identification();
    }

    /**
     * Create an instance of {@link BasicData.Gate.Identification }
     * 
     */
    public BasicData.Gate.Identification createBasicDataGateIdentification() {
        return new BasicData.Gate.Identification();
    }

    /**
     * Create an instance of {@link BasicData.FlightServiceType.Identification }
     * 
     */
    public BasicData.FlightServiceType.Identification createBasicDataFlightServiceTypeIdentification() {
        return new BasicData.FlightServiceType.Identification();
    }

    /**
     * Create an instance of {@link BasicData.FlightSector.Identification }
     * 
     */
    public BasicData.FlightSector.Identification createBasicDataFlightSectorIdentification() {
        return new BasicData.FlightSector.Identification();
    }

    /**
     * Create an instance of {@link BasicData.FlightNature.Identification }
     * 
     */
    public BasicData.FlightNature.Identification createBasicDataFlightNatureIdentification() {
        return new BasicData.FlightNature.Identification();
    }

    /**
     * Create an instance of {@link BasicData.FlightClassification.Identification }
     * 
     */
    public BasicData.FlightClassification.Identification createBasicDataFlightClassificationIdentification() {
        return new BasicData.FlightClassification.Identification();
    }

    /**
     * Create an instance of {@link BasicData.DelayCode.Identification }
     * 
     */
    public BasicData.DelayCode.Identification createBasicDataDelayCodeIdentification() {
        return new BasicData.DelayCode.Identification();
    }

    /**
     * Create an instance of {@link BasicData.CheckinDesk.Identification }
     * 
     */
    public BasicData.CheckinDesk.Identification createBasicDataCheckinDeskIdentification() {
        return new BasicData.CheckinDesk.Identification();
    }

    /**
     * Create an instance of {@link BasicData.CheckinClass.Identification }
     * 
     */
    public BasicData.CheckinClass.Identification createBasicDataCheckinClassIdentification() {
        return new BasicData.CheckinClass.Identification();
    }

    /**
     * Create an instance of {@link BasicData.CheckinAirlineClass.Identification }
     * 
     */
    public BasicData.CheckinAirlineClass.Identification createBasicDataCheckinAirlineClassIdentification() {
        return new BasicData.CheckinAirlineClass.Identification();
    }

    /**
     * Create an instance of {@link BasicData.CAACDelayCode.Identification }
     * 
     */
    public BasicData.CAACDelayCode.Identification createBasicDataCAACDelayCodeIdentification() {
        return new BasicData.CAACDelayCode.Identification();
    }

    /**
     * Create an instance of {@link BasicData.CAACDelayCategory.Identification }
     * 
     */
    public BasicData.CAACDelayCategory.Identification createBasicDataCAACDelayCategoryIdentification() {
        return new BasicData.CAACDelayCategory.Identification();
    }

    /**
     * Create an instance of {@link BasicData.BoardingBridge.Identification }
     * 
     */
    public BasicData.BoardingBridge.Identification createBasicDataBoardingBridgeIdentification() {
        return new BasicData.BoardingBridge.Identification();
    }

    /**
     * Create an instance of {@link BasicData.BaggageReclaimCarousel.Identification }
     * 
     */
    public BasicData.BaggageReclaimCarousel.Identification createBasicDataBaggageReclaimCarouselIdentification() {
        return new BasicData.BaggageReclaimCarousel.Identification();
    }

    /**
     * Create an instance of {@link BasicData.BaggageMakeupPosition.Identification }
     * 
     */
    public BasicData.BaggageMakeupPosition.Identification createBasicDataBaggageMakeupPositionIdentification() {
        return new BasicData.BaggageMakeupPosition.Identification();
    }

    /**
     * Create an instance of {@link BasicData.Airline.Identification }
     * 
     */
    public BasicData.Airline.Identification createBasicDataAirlineIdentification() {
        return new BasicData.Airline.Identification();
    }

    /**
     * Create an instance of {@link BasicData.AircraftSubtype.Identification }
     * 
     */
    public BasicData.AircraftSubtype.Identification createBasicDataAircraftSubtypeIdentification() {
        return new BasicData.AircraftSubtype.Identification();
    }

    /**
     * Create an instance of {@link BasicData.AircraftRegistration.Identification }
     * 
     */
    public BasicData.AircraftRegistration.Identification createBasicDataAircraftRegistrationIdentification() {
        return new BasicData.AircraftRegistration.Identification();
    }

    /**
     * Create an instance of {@link FlightFilterData.AirportIATACode }
     * 
     */
    public FlightFilterData.AirportIATACode createFlightFilterDataAirportIATACode() {
        return new FlightFilterData.AirportIATACode();
    }

    /**
     * Create an instance of {@link FlightFilterData.CarrierIATACode }
     * 
     */
    public FlightFilterData.CarrierIATACode createFlightFilterDataCarrierIATACode() {
        return new FlightFilterData.CarrierIATACode();
    }

    /**
     * Create an instance of {@link FlightFilterData.CarrierICAOCode }
     * 
     */
    public FlightFilterData.CarrierICAOCode createFlightFilterDataCarrierICAOCode() {
        return new FlightFilterData.CarrierICAOCode();
    }

    /**
     * Create an instance of {@link FlightFilterData.CodeShareStatus }
     * 
     */
    public FlightFilterData.CodeShareStatus createFlightFilterDataCodeShareStatus() {
        return new FlightFilterData.CodeShareStatus();
    }

    /**
     * Create an instance of {@link FlightFilterData.FlightNatureCode }
     * 
     */
    public FlightFilterData.FlightNatureCode createFlightFilterDataFlightNatureCode() {
        return new FlightFilterData.FlightNatureCode();
    }

    /**
     * Create an instance of {@link FlightFilterData.FlightSectorCode }
     * 
     */
    public FlightFilterData.FlightSectorCode createFlightFilterDataFlightSectorCode() {
        return new FlightFilterData.FlightSectorCode();
    }

    /**
     * Create an instance of {@link FlightFilterData.FlightServiceTypeIATACode }
     * 
     */
    public FlightFilterData.FlightServiceTypeIATACode createFlightFilterDataFlightServiceTypeIATACode() {
        return new FlightFilterData.FlightServiceTypeIATACode();
    }

    /**
     * Create an instance of {@link FlightFilterData.FlightType }
     * 
     */
    public FlightFilterData.FlightType createFlightFilterDataFlightType() {
        return new FlightFilterData.FlightType();
    }

    /**
     * Create an instance of {@link FlightFilterData.TerminalCode }
     * 
     */
    public FlightFilterData.TerminalCode createFlightFilterDataTerminalCode() {
        return new FlightFilterData.TerminalCode();
    }

    /**
     * Create an instance of {@link FlightData.Aircraft }
     * 
     */
    public FlightData.Aircraft createFlightDataAircraft() {
        return new FlightData.Aircraft();
    }

    /**
     * Create an instance of {@link FlightData.Airport }
     * 
     */
    public FlightData.Airport createFlightDataAirport() {
        return new FlightData.Airport();
    }

    /**
     * Create an instance of {@link FlightData.Flight }
     * 
     */
    public FlightData.Flight createFlightDataFlight() {
        return new FlightData.Flight();
    }

    /**
     * Create an instance of {@link FlightData.OperationalTimes }
     * 
     */
    public FlightData.OperationalTimes createFlightDataOperationalTimes() {
        return new FlightData.OperationalTimes();
    }

    /**
     * Create an instance of {@link FlightData.PortsOfCall }
     * 
     */
    public FlightData.PortsOfCall createFlightDataPortsOfCall() {
        return new FlightData.PortsOfCall();
    }

    /**
     * Create an instance of {@link FlightData.Public }
     * 
     */
    public FlightData.Public createFlightDataPublic() {
        return new FlightData.Public();
    }

    /**
     * Create an instance of {@link FlightData.Load.Cargo }
     * 
     */
    public FlightData.Load.Cargo createFlightDataLoadCargo() {
        return new FlightData.Load.Cargo();
    }

    /**
     * Create an instance of {@link FlightData.Load.PassengerCounts }
     * 
     */
    public FlightData.Load.PassengerCounts createFlightDataLoadPassengerCounts() {
        return new FlightData.Load.PassengerCounts();
    }

    /**
     * Create an instance of {@link ResourceData.StandPositionOperation.Identification }
     * 
     */
    public ResourceData.StandPositionOperation.Identification createResourceDataStandPositionOperationIdentification() {
        return new ResourceData.StandPositionOperation.Identification();
    }

    /**
     * Create an instance of {@link ResourceData.ResourceImpairment.Identification }
     * 
     */
    public ResourceData.ResourceImpairment.Identification createResourceDataResourceImpairmentIdentification() {
        return new ResourceData.ResourceImpairment.Identification();
    }

    /**
     * Create an instance of {@link ResourceData.GateOperation.Identification }
     * 
     */
    public ResourceData.GateOperation.Identification createResourceDataGateOperationIdentification() {
        return new ResourceData.GateOperation.Identification();
    }

    /**
     * Create an instance of {@link ResourceData.CheckinSlot.Identification }
     * 
     */
    public ResourceData.CheckinSlot.Identification createResourceDataCheckinSlotIdentification() {
        return new ResourceData.CheckinSlot.Identification();
    }

    /**
     * Create an instance of {@link ResourceData.CheckinOperation.Identification }
     * 
     */
    public ResourceData.CheckinOperation.Identification createResourceDataCheckinOperationIdentification() {
        return new ResourceData.CheckinOperation.Identification();
    }

    /**
     * Create an instance of {@link ResourceData.BaggageReclaimOperation.Identification }
     * 
     */
    public ResourceData.BaggageReclaimOperation.Identification createResourceDataBaggageReclaimOperationIdentification() {
        return new ResourceData.BaggageReclaimOperation.Identification();
    }

    /**
     * Create an instance of {@link ResourceData.AircraftTow.Identification }
     * 
     */
    public ResourceData.AircraftTow.Identification createResourceDataAircraftTowIdentification() {
        return new ResourceData.AircraftTow.Identification();
    }

    /**
     * Create an instance of {@link ResourceData.AircraftTow.ArrivalIdentification }
     * 
     */
    public ResourceData.AircraftTow.ArrivalIdentification createResourceDataAircraftTowArrivalIdentification() {
        return new ResourceData.AircraftTow.ArrivalIdentification();
    }

    /**
     * Create an instance of {@link ResourceData.AircraftTow.DepartureIdentification }
     * 
     */
    public ResourceData.AircraftTow.DepartureIdentification createResourceDataAircraftTowDepartureIdentification() {
        return new ResourceData.AircraftTow.DepartureIdentification();
    }
    
    /**
     * Create an instance of {@link AFDSStatusRequest }
     * 
     */
    public AFDSStatusRequest createAFDSStatusRequest() {
        return new AFDSStatusRequest();
    }

    
    /**
     * Create an instance of {@link RDDSStatusRequest }
     * 
     */
    public RDDSStatusRequest createRDDSStatusRequest() {
        return new RDDSStatusRequest();
    }
    
    /**
     * Create an instance of {@link BDDSStatusRequest }
     * 
     */
    public BDDSStatusRequest createBDDSStatusRequest() {
        return new BDDSStatusRequest();
    }
    
    /**
     * Create an instance of {@link SFDSStatusRequest }
     * 
     */
    public SFDSStatusRequest createSFDSStatusRequest() {
        return new SFDSStatusRequest();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Envelope")
    public JAXBElement<Envelope> createEnvelope(Envelope value) {
        return new JAXBElement<Envelope>(_Envelope_QNAME, Envelope.class, null, value);
    }
    
 
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightIdentity", scope = ResourceData.StandPositionOperation.class)
    public JAXBElement<String> createResourceDataStandPositionOperationFlightIdentity(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationFlightIdentity_QNAME, String.class, ResourceData.StandPositionOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "OffBlocksDateTime", scope = ResourceData.StandPositionOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataStandPositionOperationOffBlocksDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataStandPositionOperationOffBlocksDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.StandPositionOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftRegistration", scope = ResourceData.StandPositionOperation.class)
    public JAXBElement<String> createResourceDataStandPositionOperationAircraftRegistration(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationAircraftRegistration_QNAME, String.class, ResourceData.StandPositionOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ScheduledDate", scope = ResourceData.StandPositionOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataStandPositionOperationScheduledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataStandPositionOperationScheduledDate_QNAME, XMLGregorianCalendar.class, ResourceData.StandPositionOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "OnBlocksDateTime", scope = ResourceData.StandPositionOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataStandPositionOperationOnBlocksDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataStandPositionOperationOnBlocksDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.StandPositionOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftSubtypeIATACode", scope = ResourceData.StandPositionOperation.class)
    public JAXBElement<String> createResourceDataStandPositionOperationAircraftSubtypeIATACode(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationAircraftSubtypeIATACode_QNAME, String.class, ResourceData.StandPositionOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = ResourceData.StandPositionOperation.class)
    public JAXBElement<Integer> createResourceDataStandPositionOperationFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, ResourceData.StandPositionOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MakeupPositionStatusReason", scope = BasicData.BaggageMakeupPosition.class)
    public JAXBElement<String> createBasicDataBaggageMakeupPositionMakeupPositionStatusReason(String value) {
        return new JAXBElement<String>(_BasicDataBaggageMakeupPositionMakeupPositionStatusReason_QNAME, String.class, BasicData.BaggageMakeupPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeupPositionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MakeupPositionStatus", scope = BasicData.BaggageMakeupPosition.class)
    public JAXBElement<MakeupPositionStatus> createBasicDataBaggageMakeupPositionMakeupPositionStatus(MakeupPositionStatus value) {
        return new JAXBElement<MakeupPositionStatus>(_BasicDataBaggageMakeupPositionMakeupPositionStatus_QNAME, MakeupPositionStatus.class, BasicData.BaggageMakeupPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MakeupPositionStatusStartDateTime", scope = BasicData.BaggageMakeupPosition.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBaggageMakeupPositionMakeupPositionStatusStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBaggageMakeupPositionMakeupPositionStatusStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BaggageMakeupPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MakeupPositionCapacity", scope = BasicData.BaggageMakeupPosition.class)
    public JAXBElement<Integer> createBasicDataBaggageMakeupPositionMakeupPositionCapacity(Integer value) {
        return new JAXBElement<Integer>(_BasicDataBaggageMakeupPositionMakeupPositionCapacity_QNAME, Integer.class, BasicData.BaggageMakeupPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MakeupPositionStatusEndDateTime", scope = BasicData.BaggageMakeupPosition.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBaggageMakeupPositionMakeupPositionStatusEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBaggageMakeupPositionMakeupPositionStatusEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BaggageMakeupPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MakeupPositionDescription", scope = BasicData.BaggageMakeupPosition.class)
    public JAXBElement<String> createBasicDataBaggageMakeupPositionMakeupPositionDescription(String value) {
        return new JAXBElement<String>(_BasicDataBaggageMakeupPositionMakeupPositionDescription_QNAME, String.class, BasicData.BaggageMakeupPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "IrregularityNumericIATACode", scope = IrregularityDetails.class)
    public JAXBElement<String> createIrregularityDetailsIrregularityNumericIATACode(String value) {
        return new JAXBElement<String>(_IrregularityDetailsIrregularityNumericIATACode_QNAME, String.class, IrregularityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "IrregularityAlphaIATACode", scope = IrregularityDetails.class)
    public JAXBElement<String> createIrregularityDetailsIrregularityAlphaIATACode(String value) {
        return new JAXBElement<String>(_IrregularityDetailsIrregularityAlphaIATACode_QNAME, String.class, IrregularityDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FirstBagDateTime", scope = com.ultra_as.schema.BaggageReclaimCarousel.class)
    public JAXBElement<XMLGregorianCalendar> createBaggageReclaimCarouselFirstBagDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaggageReclaimCarouselFirstBagDateTime_QNAME, XMLGregorianCalendar.class, com.ultra_as.schema.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BaggageReclaimOpenDateTime", scope = com.ultra_as.schema.BaggageReclaimCarousel.class)
    public JAXBElement<XMLGregorianCalendar> createBaggageReclaimCarouselBaggageReclaimOpenDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaggageReclaimCarouselBaggageReclaimOpenDateTime_QNAME, XMLGregorianCalendar.class, com.ultra_as.schema.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ExitDoorNumber", scope = com.ultra_as.schema.BaggageReclaimCarousel.class)
    public JAXBElement<String> createBaggageReclaimCarouselExitDoorNumber(String value) {
        return new JAXBElement<String>(_BaggageReclaimCarouselExitDoorNumber_QNAME, String.class, com.ultra_as.schema.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LastBagDateTime", scope = com.ultra_as.schema.BaggageReclaimCarousel.class)
    public JAXBElement<XMLGregorianCalendar> createBaggageReclaimCarouselLastBagDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaggageReclaimCarouselLastBagDateTime_QNAME, XMLGregorianCalendar.class, com.ultra_as.schema.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BaggageReclaimCloseDateTime", scope = com.ultra_as.schema.BaggageReclaimCarousel.class)
    public JAXBElement<XMLGregorianCalendar> createBaggageReclaimCarouselBaggageReclaimCloseDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaggageReclaimCarouselBaggageReclaimCloseDateTime_QNAME, XMLGregorianCalendar.class, com.ultra_as.schema.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "EnglishLanguageText", scope = BasicData.LocalisationText.class)
    public JAXBElement<String> createBasicDataLocalisationTextEnglishLanguageText(String value) {
        return new JAXBElement<String>(_BasicDataLocalisationTextEnglishLanguageText_QNAME, String.class, BasicData.LocalisationText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ChineseLanguageText", scope = BasicData.LocalisationText.class)
    public JAXBElement<String> createBasicDataLocalisationTextChineseLanguageText(String value) {
        return new JAXBElement<String>(_BasicDataLocalisationTextChineseLanguageText_QNAME, String.class, BasicData.LocalisationText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = ResourceData.GateOperation.Identification.class)
    public JAXBElement<Integer> createResourceDataGateOperationIdentificationFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, ResourceData.GateOperation.Identification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FirstBagDateTime", scope = ResourceData.BaggageReclaimOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataBaggageReclaimOperationFirstBagDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaggageReclaimCarouselFirstBagDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.BaggageReclaimOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LastBagDateTime", scope = ResourceData.BaggageReclaimOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataBaggageReclaimOperationLastBagDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaggageReclaimCarouselLastBagDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.BaggageReclaimOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightIdentity", scope = ResourceData.CheckinOperation.Identification.class)
    public JAXBElement<String> createResourceDataCheckinOperationIdentificationFlightIdentity(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationFlightIdentity_QNAME, String.class, ResourceData.CheckinOperation.Identification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ScheduledDate", scope = ResourceData.CheckinOperation.Identification.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataCheckinOperationIdentificationScheduledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataStandPositionOperationScheduledDate_QNAME, XMLGregorianCalendar.class, ResourceData.CheckinOperation.Identification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = ResourceData.CheckinOperation.Identification.class)
    public JAXBElement<Integer> createResourceDataCheckinOperationIdentificationFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, ResourceData.CheckinOperation.Identification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SecureStandIsRequired", scope = FlightData.Airport.class)
    public JAXBElement<Boolean> createFlightDataAirportSecureStandIsRequired(Boolean value) {
        return new JAXBElement<Boolean>(_FlightDataAirportSecureStandIsRequired_QNAME, Boolean.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftTerminalCode", scope = FlightData.Airport.class)
    public JAXBElement<String> createFlightDataAirportAircraftTerminalCode(String value) {
        return new JAXBElement<String>(_FlightDataAirportAircraftTerminalCode_QNAME, String.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplementaryInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SupplementaryInformation", scope = FlightData.Airport.class)
    public JAXBElement<SupplementaryInformation> createFlightDataAirportSupplementaryInformation(SupplementaryInformation value) {
        return new JAXBElement<SupplementaryInformation>(_FlightDataAirportSupplementaryInformation_QNAME, SupplementaryInformation.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BaggageTerminalCode", scope = FlightData.Airport.class)
    public JAXBElement<String> createFlightDataAirportBaggageTerminalCode(String value) {
        return new JAXBElement<String>(_FlightDataAirportBaggageTerminalCode_QNAME, String.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PassengerTerminalCode", scope = FlightData.Airport.class)
    public JAXBElement<String> createFlightDataAirportPassengerTerminalCode(String value) {
        return new JAXBElement<String>(_FlightDataAirportPassengerTerminalCode_QNAME, String.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "StandPosition", scope = FlightData.Airport.class)
    public JAXBElement<String> createFlightDataAirportStandPosition(String value) {
        return new JAXBElement<String>(_FlightDataAirportStandPosition_QNAME, String.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AirlineTerminalCode", scope = FlightData.Airport.class)
    public JAXBElement<String> createFlightDataAirportAirlineTerminalCode(String value) {
        return new JAXBElement<String>(_FlightDataAirportAirlineTerminalCode_QNAME, String.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BusIsRequired", scope = FlightData.Airport.class)
    public JAXBElement<Boolean> createFlightDataAirportBusIsRequired(Boolean value) {
        return new JAXBElement<Boolean>(_FlightDataAirportBusIsRequired_QNAME, Boolean.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RunwayID", scope = FlightData.Airport.class)
    public JAXBElement<String> createFlightDataAirportRunwayID(String value) {
        return new JAXBElement<String>(_FlightDataAirportRunwayID_QNAME, String.class, FlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatestKnownDateTimeSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LatestKnownDateTimeSource", scope = FlightData.OperationalTimes.class)
    public JAXBElement<LatestKnownDateTimeSource> createFlightDataOperationalTimesLatestKnownDateTimeSource(LatestKnownDateTimeSource value) {
        return new JAXBElement<LatestKnownDateTimeSource>(_FlightDataOperationalTimesLatestKnownDateTimeSource_QNAME, LatestKnownDateTimeSource.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ActualOffBlocksDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesActualOffBlocksDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesActualOffBlocksDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NextStationEstimatedDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesNextStationEstimatedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesNextStationEstimatedDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NextStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesNextStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesNextStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FirstStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesFirstStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesFirstStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NextInformationDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesNextInformationDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesNextInformationDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DestinationStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesDestinationStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesDestinationStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PreviousStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesPreviousStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesPreviousStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ThirdStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesThirdStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesThirdStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SixthStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesSixthStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesSixthStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "WheelsDownDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesWheelsDownDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesWheelsDownDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PreviousStationAirborneDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesPreviousStationAirborneDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesPreviousStationAirborneDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "OriginStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesOriginStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesOriginStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "EstimatedFlightDuration", scope = FlightData.OperationalTimes.class)
    public JAXBElement<Duration> createFlightDataOperationalTimesEstimatedFlightDuration(Duration value) {
        return new JAXBElement<Duration>(_FlightDataOperationalTimesEstimatedFlightDuration_QNAME, Duration.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "WheelsUpDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesWheelsUpDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesWheelsUpDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ActualOnBlocksDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesActualOnBlocksDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesActualOnBlocksDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NextStationActualDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesNextStationActualDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesNextStationActualDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TenMileOutDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesTenMileOutDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesTenMileOutDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PreviousStationEstimatedDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesPreviousStationEstimatedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesPreviousStationEstimatedDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "EstimatedDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesEstimatedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesEstimatedDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SecondStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesSecondStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesSecondStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FifthStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesFifthStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesFifthStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FourthStationScheduledDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesFourthStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesFourthStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FinalApproachDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesFinalApproachDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesFinalApproachDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LatestKnownDateTime", scope = FlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataOperationalTimesLatestKnownDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesLatestKnownDateTime_QNAME, XMLGregorianCalendar.class, FlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateDescription", scope = BasicData.Gate.class)
    public JAXBElement<String> createBasicDataGateGateDescription(String value) {
        return new JAXBElement<String>(_BasicDataGateGateDescription_QNAME, String.class, BasicData.Gate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateStatusEndDateTime", scope = BasicData.Gate.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataGateGateStatusEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataGateGateStatusEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.Gate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateStatusReason", scope = BasicData.Gate.class)
    public JAXBElement<String> createBasicDataGateGateStatusReason(String value) {
        return new JAXBElement<String>(_BasicDataGateGateStatusReason_QNAME, String.class, BasicData.Gate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateStatusStartDateTime", scope = BasicData.Gate.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataGateGateStatusStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataGateGateStatusStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.Gate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GateStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateStatus", scope = BasicData.Gate.class)
    public JAXBElement<GateStatus> createBasicDataGateGateStatus(GateStatus value) {
        return new JAXBElement<GateStatus>(_BasicDataGateGateStatus_QNAME, GateStatus.class, BasicData.Gate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightIdentity", scope = ResourceData.AircraftTow.ArrivalIdentification.class)
    public JAXBElement<String> createResourceDataAircraftTowArrivalIdentificationFlightIdentity(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationFlightIdentity_QNAME, String.class, ResourceData.AircraftTow.ArrivalIdentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ScheduledDate", scope = ResourceData.AircraftTow.ArrivalIdentification.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataAircraftTowArrivalIdentificationScheduledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataStandPositionOperationScheduledDate_QNAME, XMLGregorianCalendar.class, ResourceData.AircraftTow.ArrivalIdentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = ResourceData.AircraftTow.ArrivalIdentification.class)
    public JAXBElement<Integer> createResourceDataAircraftTowArrivalIdentificationFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, ResourceData.AircraftTow.ArrivalIdentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftOwnerIATACode", scope = FlightData.Aircraft.class)
    public JAXBElement<String> createFlightDataAircraftAircraftOwnerIATACode(String value) {
        return new JAXBElement<String>(_FlightDataAircraftAircraftOwnerIATACode_QNAME, String.class, FlightData.Aircraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftRegistration", scope = FlightData.Aircraft.class)
    public JAXBElement<String> createFlightDataAircraftAircraftRegistration(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationAircraftRegistration_QNAME, String.class, FlightData.Aircraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftCallsign", scope = FlightData.Aircraft.class)
    public JAXBElement<String> createFlightDataAircraftAircraftCallsign(String value) {
        return new JAXBElement<String>(_FlightDataAircraftAircraftCallsign_QNAME, String.class, FlightData.Aircraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftSubtypeIATACode", scope = FlightData.Aircraft.class)
    public JAXBElement<String> createFlightDataAircraftAircraftSubtypeIATACode(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationAircraftSubtypeIATACode_QNAME, String.class, FlightData.Aircraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftOperator", scope = FlightData.Aircraft.class)
    public JAXBElement<String> createFlightDataAircraftAircraftOperator(String value) {
        return new JAXBElement<String>(_FlightDataAircraftAircraftOperator_QNAME, String.class, FlightData.Aircraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftTypeICAOCode", scope = FlightData.Aircraft.class)
    public JAXBElement<String> createFlightDataAircraftAircraftTypeICAOCode(String value) {
        return new JAXBElement<String>(_FlightDataAircraftAircraftTypeICAOCode_QNAME, String.class, FlightData.Aircraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftPassengerCapacity", scope = FlightData.Aircraft.class)
    public JAXBElement<Integer> createFlightDataAircraftAircraftPassengerCapacity(Integer value) {
        return new JAXBElement<Integer>(_FlightDataAircraftAircraftPassengerCapacity_QNAME, Integer.class, FlightData.Aircraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinDeskStatusEndDateTime", scope = BasicData.CheckinDesk.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataCheckinDeskCheckinDeskStatusEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataCheckinDeskCheckinDeskStatusEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.CheckinDesk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinDeskDescription", scope = BasicData.CheckinDesk.class)
    public JAXBElement<String> createBasicDataCheckinDeskCheckinDeskDescription(String value) {
        return new JAXBElement<String>(_BasicDataCheckinDeskCheckinDeskDescription_QNAME, String.class, BasicData.CheckinDesk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinDeskStatusReason", scope = BasicData.CheckinDesk.class)
    public JAXBElement<String> createBasicDataCheckinDeskCheckinDeskStatusReason(String value) {
        return new JAXBElement<String>(_BasicDataCheckinDeskCheckinDeskStatusReason_QNAME, String.class, BasicData.CheckinDesk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinDeskStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinDeskStatus", scope = BasicData.CheckinDesk.class)
    public JAXBElement<CheckinDeskStatus> createBasicDataCheckinDeskCheckinDeskStatus(CheckinDeskStatus value) {
        return new JAXBElement<CheckinDeskStatus>(_BasicDataCheckinDeskCheckinDeskStatus_QNAME, CheckinDeskStatus.class, BasicData.CheckinDesk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinDeskStatusStartDateTime", scope = BasicData.CheckinDesk.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataCheckinDeskCheckinDeskStatusStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataCheckinDeskCheckinDeskStatusStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.CheckinDesk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinGroup", scope = BasicData.CheckinDesk.class)
    public JAXBElement<String> createBasicDataCheckinDeskCheckinGroup(String value) {
        return new JAXBElement<String>(_BasicDataCheckinDeskCheckinGroup_QNAME, String.class, BasicData.CheckinDesk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightServiceTypeDescription", scope = BasicData.FlightServiceType.class)
    public JAXBElement<String> createBasicDataFlightServiceTypeFlightServiceTypeDescription(String value) {
        return new JAXBElement<String>(_BasicDataFlightServiceTypeFlightServiceTypeDescription_QNAME, String.class, BasicData.FlightServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AirlineName", scope = BasicData.Airline.class)
    public JAXBElement<String> createBasicDataAirlineAirlineName(String value) {
        return new JAXBElement<String>(_BasicDataAirlineAirlineName_QNAME, String.class, BasicData.Airline.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightServiceTypeIATACode", scope = BasicData.Airline.class)
    public JAXBElement<String> createBasicDataAirlineFlightServiceTypeIATACode(String value) {
        return new JAXBElement<String>(_BasicDataAirlineFlightServiceTypeIATACode_QNAME, String.class, BasicData.Airline.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AirlineDescription", scope = BasicData.Airline.class)
    public JAXBElement<String> createBasicDataAirlineAirlineDescription(String value) {
        return new JAXBElement<String>(_BasicDataAirlineAirlineDescription_QNAME, String.class, BasicData.Airline.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "HandlingAgentIATACode", scope = BasicData.Airline.class)
    public JAXBElement<String> createBasicDataAirlineHandlingAgentIATACode(String value) {
        return new JAXBElement<String>(_BasicDataAirlineHandlingAgentIATACode_QNAME, String.class, BasicData.Airline.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PublicCarrierCode", scope = BasicData.Airline.class)
    public JAXBElement<String> createBasicDataAirlinePublicCarrierCode(String value) {
        return new JAXBElement<String>(_BasicDataAirlinePublicCarrierCode_QNAME, String.class, BasicData.Airline.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.ultra_as.schema.FlightSectorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSectorCode", scope = BasicData.Airline.class)
    public JAXBElement<com.ultra_as.schema.FlightSectorCode> createBasicDataAirlineFlightSectorCode(com.ultra_as.schema.FlightSectorCode value) {
        return new JAXBElement<com.ultra_as.schema.FlightSectorCode>(_BasicDataAirlineFlightSectorCode_QNAME, com.ultra_as.schema.FlightSectorCode.class, BasicData.Airline.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransferFlightPassengerCount", scope = TransferFlight.class)
    public JAXBElement<Integer> createTransferFlightTransferFlightPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_TransferFlightTransferFlightPassengerCount_QNAME, Integer.class, TransferFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransferFlightIdentity", scope = TransferFlight.class)
    public JAXBElement<String> createTransferFlightTransferFlightIdentity(String value) {
        return new JAXBElement<String>(_TransferFlightTransferFlightIdentity_QNAME, String.class, TransferFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransferFlightBagCount", scope = TransferFlight.class)
    public JAXBElement<Integer> createTransferFlightTransferFlightBagCount(Integer value) {
        return new JAXBElement<Integer>(_TransferFlightTransferFlightBagCount_QNAME, Integer.class, TransferFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CAACDelayCategory", scope = CAACDelayDetails.class)
    public JAXBElement<String> createCAACDelayDetailsCAACDelayCategory(String value) {
        return new JAXBElement<String>(_CAACDelayDetailsCAACDelayCategory_QNAME, String.class, CAACDelayDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CAACDelayDuration", scope = CAACDelayDetails.class)
    public JAXBElement<Duration> createCAACDelayDetailsCAACDelayDuration(Duration value) {
        return new JAXBElement<Duration>(_CAACDelayDetailsCAACDelayDuration_QNAME, Duration.class, CAACDelayDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CAACDelayAirportOriginated", scope = CAACDelayDetails.class)
    public JAXBElement<Boolean> createCAACDelayDetailsCAACDelayAirportOriginated(Boolean value) {
        return new JAXBElement<Boolean>(_CAACDelayDetailsCAACDelayAirportOriginated_QNAME, Boolean.class, CAACDelayDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CAACDelayCode", scope = CAACDelayDetails.class)
    public JAXBElement<String> createCAACDelayDetailsCAACDelayCode(String value) {
        return new JAXBElement<String>(_CAACDelayDetailsCAACDelayCode_QNAME, String.class, CAACDelayDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LocationICAOCode", scope = BasicData.Location.class)
    public JAXBElement<String> createBasicDataLocationLocationICAOCode(String value) {
        return new JAXBElement<String>(_BasicDataLocationLocationICAOCode_QNAME, String.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightElapsedPropellerTime", scope = BasicData.Location.class)
    public JAXBElement<Duration> createBasicDataLocationFlightElapsedPropellerTime(Duration value) {
        return new JAXBElement<Duration>(_BasicDataLocationFlightElapsedPropellerTime_QNAME, Duration.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AbbreviatedChinese", scope = BasicData.Location.class)
    public JAXBElement<String> createBasicDataLocationAbbreviatedChinese(String value) {
        return new JAXBElement<String>(_BasicDataLocationAbbreviatedChinese_QNAME, String.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CountryCode", scope = BasicData.Location.class)
    public JAXBElement<String> createBasicDataLocationCountryCode(String value) {
        return new JAXBElement<String>(_BasicDataLocationCountryCode_QNAME, String.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LocationName", scope = BasicData.Location.class)
    public JAXBElement<String> createBasicDataLocationLocationName(String value) {
        return new JAXBElement<String>(_BasicDataLocationLocationName_QNAME, String.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CountryName", scope = BasicData.Location.class)
    public JAXBElement<String> createBasicDataLocationCountryName(String value) {
        return new JAXBElement<String>(_BasicDataLocationCountryName_QNAME, String.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.ultra_as.schema.FlightSectorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSectorCode", scope = BasicData.Location.class)
    public JAXBElement<com.ultra_as.schema.FlightSectorCode> createBasicDataLocationFlightSectorCode(com.ultra_as.schema.FlightSectorCode value) {
        return new JAXBElement<com.ultra_as.schema.FlightSectorCode>(_BasicDataAirlineFlightSectorCode_QNAME, com.ultra_as.schema.FlightSectorCode.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightElapsedJetTime", scope = BasicData.Location.class)
    public JAXBElement<Duration> createBasicDataLocationFlightElapsedJetTime(Duration value) {
        return new JAXBElement<Duration>(_BasicDataLocationFlightElapsedJetTime_QNAME, Duration.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LocationDescription", scope = BasicData.Location.class)
    public JAXBElement<String> createBasicDataLocationLocationDescription(String value) {
        return new JAXBElement<String>(_BasicDataLocationLocationDescription_QNAME, String.class, BasicData.Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinClassDescription", scope = BasicData.CheckinAirlineClass.class)
    public JAXBElement<String> createBasicDataCheckinAirlineClassCheckinClassDescription(String value) {
        return new JAXBElement<String>(_BasicDataCheckinAirlineClassCheckinClassDescription_QNAME, String.class, BasicData.CheckinAirlineClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "IsReturnFlight", scope = FlightData.Flight.class)
    public JAXBElement<Boolean> createFlightDataFlightIsReturnFlight(Boolean value) {
        return new JAXBElement<Boolean>(_FlightDataFlightIsReturnFlight_QNAME, Boolean.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AccountCode", scope = FlightData.Flight.class)
    public JAXBElement<String> createFlightDataFlightAccountCode(String value) {
        return new JAXBElement<String>(_FlightDataFlightAccountCode_QNAME, String.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MasterFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MasterFlight", scope = FlightData.Flight.class)
    public JAXBElement<MasterFlight> createFlightDataFlightMasterFlight(MasterFlight value) {
        return new JAXBElement<MasterFlight>(_FlightDataFlightMasterFlight_QNAME, MasterFlight.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "IsGeneralAviationFlight", scope = FlightData.Flight.class)
    public JAXBElement<Boolean> createFlightDataFlightIsGeneralAviationFlight(Boolean value) {
        return new JAXBElement<Boolean>(_FlightDataFlightIsGeneralAviationFlight_QNAME, Boolean.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCancelCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightCancelCode", scope = FlightData.Flight.class)
    public JAXBElement<FlightCancelCode> createFlightDataFlightFlightCancelCode(FlightCancelCode value) {
        return new JAXBElement<FlightCancelCode>(_FlightDataFlightFlightCancelCode_QNAME, FlightCancelCode.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightOperatesOvernight", scope = FlightData.Flight.class)
    public JAXBElement<Boolean> createFlightDataFlightFlightOperatesOvernight(Boolean value) {
        return new JAXBElement<Boolean>(_FlightDataFlightFlightOperatesOvernight_QNAME, Boolean.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CodeShareStatus", scope = FlightData.Flight.class)
    public JAXBElement<String> createFlightDataFlightCodeShareStatus(String value) {
        return new JAXBElement<String>(_FlightDataFlightCodeShareStatus_QNAME, String.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "HasVIPs", scope = FlightData.Flight.class)
    public JAXBElement<Boolean> createFlightDataFlightHasVIPs(Boolean value) {
        return new JAXBElement<Boolean>(_FlightDataFlightHasVIPs_QNAME, Boolean.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightNatureCode", scope = FlightData.Flight.class)
    public JAXBElement<String> createFlightDataFlightFlightNatureCode(String value) {
        return new JAXBElement<String>(_FlightDataFlightFlightNatureCode_QNAME, String.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.ultra_as.schema.FlightSectorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSectorCode", scope = FlightData.Flight.class)
    public JAXBElement<com.ultra_as.schema.FlightSectorCode> createFlightDataFlightFlightSectorCode(com.ultra_as.schema.FlightSectorCode value) {
        return new JAXBElement<com.ultra_as.schema.FlightSectorCode>(_BasicDataAirlineFlightSectorCode_QNAME, com.ultra_as.schema.FlightSectorCode.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightClassificationCode", scope = FlightData.Flight.class)
    public JAXBElement<String> createFlightDataFlightFlightClassificationCode(String value) {
        return new JAXBElement<String>(_FlightDataFlightFlightClassificationCode_QNAME, String.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "IsTransferFlight", scope = FlightData.Flight.class)
    public JAXBElement<Boolean> createFlightDataFlightIsTransferFlight(Boolean value) {
        return new JAXBElement<Boolean>(_FlightDataFlightIsTransferFlight_QNAME, Boolean.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightServiceTypeIATACode", scope = FlightData.Flight.class)
    public JAXBElement<String> createFlightDataFlightFlightServiceTypeIATACode(String value) {
        return new JAXBElement<String>(_BasicDataAirlineFlightServiceTypeIATACode_QNAME, String.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightTransitCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightTransitCode", scope = FlightData.Flight.class)
    public JAXBElement<FlightTransitCode> createFlightDataFlightFlightTransitCode(FlightTransitCode value) {
        return new JAXBElement<FlightTransitCode>(_FlightDataFlightFlightTransitCode_QNAME, FlightTransitCode.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DivertAirportIATACode", scope = FlightData.Flight.class)
    public JAXBElement<String> createFlightDataFlightDivertAirportIATACode(String value) {
        return new JAXBElement<String>(_FlightDataFlightDivertAirportIATACode_QNAME, String.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAACDelayDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CAACDelayDetails", scope = FlightData.Flight.class)
    public JAXBElement<CAACDelayDetails> createFlightDataFlightCAACDelayDetails(CAACDelayDetails value) {
        return new JAXBElement<CAACDelayDetails>(_FlightDataFlightCAACDelayDetails_QNAME, CAACDelayDetails.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightStatusCode", scope = FlightData.Flight.class)
    public JAXBElement<String> createFlightDataFlightFlightStatusCode(String value) {
        return new JAXBElement<String>(_FlightDataFlightFlightStatusCode_QNAME, String.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NewFlightReason", scope = FlightData.Flight.class)
    public JAXBElement<String> createFlightDataFlightNewFlightReason(String value) {
        return new JAXBElement<String>(_FlightDataFlightNewFlightReason_QNAME, String.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkedFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LinkedFlight", scope = FlightData.Flight.class)
    public JAXBElement<LinkedFlight> createFlightDataFlightLinkedFlight(LinkedFlight value) {
        return new JAXBElement<LinkedFlight>(_FlightDataFlightLinkedFlight_QNAME, LinkedFlight.class, FlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TerminalCode", scope = ResourceData.ResourceImpairment.Identification.class)
    public JAXBElement<String> createResourceDataResourceImpairmentIdentificationTerminalCode(String value) {
        return new JAXBElement<String>(_ResourceDataResourceImpairmentIdentificationTerminalCode_QNAME, String.class, ResourceData.ResourceImpairment.Identification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "IsFlightClassificationDefault", scope = BasicData.FlightClassification.class)
    public JAXBElement<Boolean> createBasicDataFlightClassificationIsFlightClassificationDefault(Boolean value) {
        return new JAXBElement<Boolean>(_BasicDataFlightClassificationIsFlightClassificationDefault_QNAME, Boolean.class, BasicData.FlightClassification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ClassificationCodeDescription", scope = BasicData.FlightClassification.class)
    public JAXBElement<String> createBasicDataFlightClassificationClassificationCodeDescription(String value) {
        return new JAXBElement<String>(_BasicDataFlightClassificationClassificationCodeDescription_QNAME, String.class, BasicData.FlightClassification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TotalMailWeight", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTotalMailWeight(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTotalMailWeight_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransferCargoWeight", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTransferCargoWeight(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTransferCargoWeight_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransitBaggageCount", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTransitBaggageCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTransitBaggageCount_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransitBaggageWeight", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTransitBaggageWeight(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTransitBaggageWeight_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TotalBaggageWeight", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTotalBaggageWeight(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTotalBaggageWeight_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransferBaggageCount", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTransferBaggageCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTransferBaggageCount_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransferBaggageWeight", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTransferBaggageWeight(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTransferBaggageWeight_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransferMailWeight", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTransferMailWeight(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTransferMailWeight_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TotalBaggageCount", scope = FlightData.Load.Cargo.class)
    public JAXBElement<Integer> createFlightDataLoadCargoTotalBaggageCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadCargoTotalBaggageCount_QNAME, Integer.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TotalFreightWeight", scope = FlightData.Load.Cargo.class)
    public JAXBElement<BigInteger> createFlightDataLoadCargoTotalFreightWeight(BigInteger value) {
        return new JAXBElement<BigInteger>(_FlightDataLoadCargoTotalFreightWeight_QNAME, BigInteger.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TotalLoadWeight", scope = FlightData.Load.Cargo.class)
    public JAXBElement<BigInteger> createFlightDataLoadCargoTotalLoadWeight(BigInteger value) {
        return new JAXBElement<BigInteger>(_FlightDataLoadCargoTotalLoadWeight_QNAME, BigInteger.class, FlightData.Load.Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Count", scope = VehicleUsage.class)
    public JAXBElement<Integer> createVehicleUsageCount(Integer value) {
        return new JAXBElement<Integer>(_VehicleUsageCount_QNAME, Integer.class, VehicleUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SubType", scope = VehicleUsage.class)
    public JAXBElement<String> createVehicleUsageSubType(String value) {
        return new JAXBElement<String>(_VehicleUsageSubType_QNAME, String.class, VehicleUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = FlightIdentification.class)
    public JAXBElement<Integer> createFlightIdentificationFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, FlightIdentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = ResourceData.BaggageReclaimOperation.Identification.class)
    public JAXBElement<Integer> createResourceDataBaggageReclaimOperationIdentificationFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, ResourceData.BaggageReclaimOperation.Identification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "StandIsSecure", scope = BasicData.Stand.class)
    public JAXBElement<Boolean> createBasicDataStandStandIsSecure(Boolean value) {
        return new JAXBElement<Boolean>(_BasicDataStandStandIsSecure_QNAME, Boolean.class, BasicData.Stand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "StandStatusStartDateTime", scope = BasicData.Stand.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataStandStandStatusStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataStandStandStatusStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.Stand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "StandStatusEndDateTime", scope = BasicData.Stand.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataStandStandStatusEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataStandStandStatusEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.Stand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateNumber", scope = BasicData.Stand.class)
    public JAXBElement<String> createBasicDataStandGateNumber(String value) {
        return new JAXBElement<String>(_BasicDataStandGateNumber_QNAME, String.class, BasicData.Stand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TerminalCode", scope = BasicData.Stand.class)
    public JAXBElement<String> createBasicDataStandTerminalCode(String value) {
        return new JAXBElement<String>(_ResourceDataResourceImpairmentIdentificationTerminalCode_QNAME, String.class, BasicData.Stand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "StandDescription", scope = BasicData.Stand.class)
    public JAXBElement<String> createBasicDataStandStandDescription(String value) {
        return new JAXBElement<String>(_BasicDataStandStandDescription_QNAME, String.class, BasicData.Stand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "StandStatus", scope = BasicData.Stand.class)
    public JAXBElement<StandStatus> createBasicDataStandStandStatus(StandStatus value) {
        return new JAXBElement<StandStatus>(_BasicDataStandStandStatus_QNAME, StandStatus.class, BasicData.Stand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "StandStatusReason", scope = BasicData.Stand.class)
    public JAXBElement<String> createBasicDataStandStandStatusReason(String value) {
        return new JAXBElement<String>(_BasicDataStandStandStatusReason_QNAME, String.class, BasicData.Stand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DelayCodeDescription", scope = BasicData.DelayCode.class)
    public JAXBElement<String> createBasicDataDelayCodeDelayCodeDescription(String value) {
        return new JAXBElement<String>(_BasicDataDelayCodeDelayCodeDescription_QNAME, String.class, BasicData.DelayCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSuffix", scope = ICAOFlightIdentifier.class)
    public JAXBElement<FlightSuffix> createICAOFlightIdentifierFlightSuffix(FlightSuffix value) {
        return new JAXBElement<FlightSuffix>(_ICAOFlightIdentifierFlightSuffix_QNAME, FlightSuffix.class, ICAOFlightIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightNatureDescription", scope = BasicData.FlightNature.class)
    public JAXBElement<String> createBasicDataFlightNatureFlightNatureDescription(String value) {
        return new JAXBElement<String>(_BasicDataFlightNatureFlightNatureDescription_QNAME, String.class, BasicData.FlightNature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightIdentity", scope = ResourceData.AircraftTow.DepartureIdentification.class)
    public JAXBElement<String> createResourceDataAircraftTowDepartureIdentificationFlightIdentity(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationFlightIdentity_QNAME, String.class, ResourceData.AircraftTow.DepartureIdentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ScheduledDate", scope = ResourceData.AircraftTow.DepartureIdentification.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataAircraftTowDepartureIdentificationScheduledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataStandPositionOperationScheduledDate_QNAME, XMLGregorianCalendar.class, ResourceData.AircraftTow.DepartureIdentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = ResourceData.AircraftTow.DepartureIdentification.class)
    public JAXBElement<Integer> createResourceDataAircraftTowDepartureIdentificationFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, ResourceData.AircraftTow.DepartureIdentification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = ShareFlight.class)
    public JAXBElement<Integer> createShareFlightFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, ShareFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateCloseDateTime", scope = com.ultra_as.schema.Gate.class)
    public JAXBElement<XMLGregorianCalendar> createGateGateCloseDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GateGateCloseDateTime_QNAME, XMLGregorianCalendar.class, com.ultra_as.schema.Gate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateOpenDateTime", scope = com.ultra_as.schema.Gate.class)
    public JAXBElement<XMLGregorianCalendar> createGateGateOpenDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GateGateOpenDateTime_QNAME, XMLGregorianCalendar.class, com.ultra_as.schema.Gate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GateBoardingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateBoardingStatus", scope = com.ultra_as.schema.Gate.class)
    public JAXBElement<GateBoardingStatus> createGateGateBoardingStatus(GateBoardingStatus value) {
        return new JAXBElement<GateBoardingStatus>(_GateGateBoardingStatus_QNAME, GateBoardingStatus.class, com.ultra_as.schema.Gate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransferPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsTransferPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsTransferPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AdultPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsAdultPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsAdultPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DomesticPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsDomesticPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsDomesticPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BusinessClassPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsBusinessClassPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsBusinessClassPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ChildPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsChildPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsChildPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FirstClassPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsFirstClassPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsFirstClassPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LocalPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsLocalPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsLocalPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "InfantPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsInfantPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsInfantPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TotalPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsTotalPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsTotalPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TransitPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsTransitPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsTransitPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NonTransferPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsNonTransferPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsNonTransferPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "EconomyClassPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsEconomyClassPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsEconomyClassPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "InternationalPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsInternationalPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsInternationalPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "WheelchairPassengerCount", scope = FlightData.Load.PassengerCounts.class)
    public JAXBElement<Integer> createFlightDataLoadPassengerCountsWheelchairPassengerCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadPassengerCountsWheelchairPassengerCount_QNAME, Integer.class, FlightData.Load.PassengerCounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSectorDescription", scope = BasicData.FlightSector.class)
    public JAXBElement<String> createBasicDataFlightSectorFlightSectorDescription(String value) {
        return new JAXBElement<String>(_BasicDataFlightSectorFlightSectorDescription_QNAME, String.class, BasicData.FlightSector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftOwnerIATACode", scope = BasicData.AircraftRegistration.class)
    public JAXBElement<String> createBasicDataAircraftRegistrationAircraftOwnerIATACode(String value) {
        return new JAXBElement<String>(_FlightDataAircraftAircraftOwnerIATACode_QNAME, String.class, BasicData.AircraftRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AirlineIATACode", scope = BasicData.AircraftRegistration.class)
    public JAXBElement<String> createBasicDataAircraftRegistrationAirlineIATACode(String value) {
        return new JAXBElement<String>(_BasicDataAircraftRegistrationAirlineIATACode_QNAME, String.class, BasicData.AircraftRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftNoseNumber", scope = BasicData.AircraftRegistration.class)
    public JAXBElement<String> createBasicDataAircraftRegistrationAircraftNoseNumber(String value) {
        return new JAXBElement<String>(_BasicDataAircraftRegistrationAircraftNoseNumber_QNAME, String.class, BasicData.AircraftRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftSubtypeIATACode", scope = BasicData.AircraftRegistration.class)
    public JAXBElement<String> createBasicDataAircraftRegistrationAircraftSubtypeIATACode(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationAircraftSubtypeIATACode_QNAME, String.class, BasicData.AircraftRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftRegistrationDescription", scope = BasicData.AircraftRegistration.class)
    public JAXBElement<String> createBasicDataAircraftRegistrationAircraftRegistrationDescription(String value) {
        return new JAXBElement<String>(_BasicDataAircraftRegistrationAircraftRegistrationDescription_QNAME, String.class, BasicData.AircraftRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftPassengerCapacity", scope = BasicData.AircraftRegistration.class)
    public JAXBElement<Integer> createBasicDataAircraftRegistrationAircraftPassengerCapacity(Integer value) {
        return new JAXBElement<Integer>(_FlightDataAircraftAircraftPassengerCapacity_QNAME, Integer.class, BasicData.AircraftRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftTailNumber", scope = BasicData.AircraftRegistration.class)
    public JAXBElement<String> createBasicDataAircraftRegistrationAircraftTailNumber(String value) {
        return new JAXBElement<String>(_BasicDataAircraftRegistrationAircraftTailNumber_QNAME, String.class, BasicData.AircraftRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RunwayStatusEndDateTime", scope = BasicData.Runway.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataRunwayRunwayStatusEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataRunwayRunwayStatusEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.Runway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RunwayStatusReason", scope = BasicData.Runway.class)
    public JAXBElement<String> createBasicDataRunwayRunwayStatusReason(String value) {
        return new JAXBElement<String>(_BasicDataRunwayRunwayStatusReason_QNAME, String.class, BasicData.Runway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RunwayDescription", scope = BasicData.Runway.class)
    public JAXBElement<String> createBasicDataRunwayRunwayDescription(String value) {
        return new JAXBElement<String>(_BasicDataRunwayRunwayDescription_QNAME, String.class, BasicData.Runway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RunwayStatus", scope = BasicData.Runway.class)
    public JAXBElement<RunwayStatus> createBasicDataRunwayRunwayStatus(RunwayStatus value) {
        return new JAXBElement<RunwayStatus>(_BasicDataRunwayRunwayStatus_QNAME, RunwayStatus.class, BasicData.Runway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RunwayStatusStartDateTime", scope = BasicData.Runway.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataRunwayRunwayStatusStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataRunwayRunwayStatusStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.Runway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BaggageMakeupOpenDateTime", scope = com.ultra_as.schema.BaggageMakeupPosition.class)
    public JAXBElement<XMLGregorianCalendar> createBaggageMakeupPositionBaggageMakeupOpenDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaggageMakeupPositionBaggageMakeupOpenDateTime_QNAME, XMLGregorianCalendar.class, com.ultra_as.schema.BaggageMakeupPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BaggageMakeupCloseDateTime", scope = com.ultra_as.schema.BaggageMakeupPosition.class)
    public JAXBElement<XMLGregorianCalendar> createBaggageMakeupPositionBaggageMakeupCloseDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaggageMakeupPositionBaggageMakeupCloseDateTime_QNAME, XMLGregorianCalendar.class, com.ultra_as.schema.BaggageMakeupPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "OperationTypeCode", scope = OperationType.class)
    public JAXBElement<String> createOperationTypeOperationTypeCode(String value) {
        return new JAXBElement<String>(_OperationTypeOperationTypeCode_QNAME, String.class, OperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightIdentity", scope = ResourceData.CheckinSlot.class)
    public JAXBElement<String> createResourceDataCheckinSlotFlightIdentity(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationFlightIdentity_QNAME, String.class, ResourceData.CheckinSlot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ScheduledDate", scope = ResourceData.CheckinSlot.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataCheckinSlotScheduledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataStandPositionOperationScheduledDate_QNAME, XMLGregorianCalendar.class, ResourceData.CheckinSlot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = ResourceData.CheckinSlot.class)
    public JAXBElement<Integer> createResourceDataCheckinSlotFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, ResourceData.CheckinSlot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinSlotSequence", scope = ResourceData.CheckinSlot.class)
    public JAXBElement<Long> createResourceDataCheckinSlotCheckinSlotSequence(Long value) {
        return new JAXBElement<Long>(_ResourceDataCheckinSlotCheckinSlotSequence_QNAME, Long.class, ResourceData.CheckinSlot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftHeight", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeAircraftHeight(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeAircraftHeight_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftTypeICAOCode", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<String> createBasicDataAircraftSubtypeAircraftTypeICAOCode(String value) {
        return new JAXBElement<String>(_FlightDataAircraftAircraftTypeICAOCode_QNAME, String.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftWeight", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeAircraftWeight(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeAircraftWeight_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftTypeIATACode", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<String> createBasicDataAircraftSubtypeAircraftTypeIATACode(String value) {
        return new JAXBElement<String>(_BasicDataAircraftSubtypeAircraftTypeIATACode_QNAME, String.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftCategoryIATACode", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<String> createBasicDataAircraftSubtypeAircraftCategoryIATACode(String value) {
        return new JAXBElement<String>(_BasicDataAircraftSubtypeAircraftCategoryIATACode_QNAME, String.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FirstClassPassengerCapacity", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeFirstClassPassengerCapacity(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeFirstClassPassengerCapacity_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FreightCapacity", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeFreightCapacity(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeFreightCapacity_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MaximumPayload", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeMaximumPayload(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeMaximumPayload_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "EconomyClassPassengerCapacity", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeEconomyClassPassengerCapacity(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeEconomyClassPassengerCapacity_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BusinessClassPassengerCapacity", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeBusinessClassPassengerCapacity(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeBusinessClassPassengerCapacity_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftPassengerCapacity", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeAircraftPassengerCapacity(Integer value) {
        return new JAXBElement<Integer>(_FlightDataAircraftAircraftPassengerCapacity_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftSubtypeDescription", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<String> createBasicDataAircraftSubtypeAircraftSubtypeDescription(String value) {
        return new JAXBElement<String>(_BasicDataAircraftSubtypeAircraftSubtypeDescription_QNAME, String.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftNoiseLevel", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<String> createBasicDataAircraftSubtypeAircraftNoiseLevel(String value) {
        return new JAXBElement<String>(_BasicDataAircraftSubtypeAircraftNoiseLevel_QNAME, String.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftWidth", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeAircraftWidth(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeAircraftWidth_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftLength", scope = BasicData.AircraftSubtype.class)
    public JAXBElement<Integer> createBasicDataAircraftSubtypeAircraftLength(Integer value) {
        return new JAXBElement<Integer>(_BasicDataAircraftSubtypeAircraftLength_QNAME, Integer.class, BasicData.AircraftSubtype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeDescription", scope = BasicData.BoardingBridge.class)
    public JAXBElement<String> createBasicDataBoardingBridgeBridgeDescription(String value) {
        return new JAXBElement<String>(_BasicDataBoardingBridgeBridgeDescription_QNAME, String.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BridgeStatusPCA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusPCA", scope = BasicData.BoardingBridge.class)
    public JAXBElement<BridgeStatusPCA> createBasicDataBoardingBridgeBridgeStatusPCA(BridgeStatusPCA value) {
        return new JAXBElement<BridgeStatusPCA>(_BasicDataBoardingBridgeBridgeStatusPCA_QNAME, BridgeStatusPCA.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusPowerStartDateTime", scope = BasicData.BoardingBridge.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBoardingBridgeBridgeStatusPowerStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBoardingBridgeBridgeStatusPowerStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusPCAEndDateTime", scope = BasicData.BoardingBridge.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBoardingBridgeBridgeStatusPCAEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBoardingBridgeBridgeStatusPCAEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusPowerEndDateTime", scope = BasicData.BoardingBridge.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBoardingBridgeBridgeStatusPowerEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBoardingBridgeBridgeStatusPowerEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusPCAStartDateTime", scope = BasicData.BoardingBridge.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBoardingBridgeBridgeStatusPCAStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBoardingBridgeBridgeStatusPCAStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BridgeStatusGeneral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusGeneral", scope = BasicData.BoardingBridge.class)
    public JAXBElement<BridgeStatusGeneral> createBasicDataBoardingBridgeBridgeStatusGeneral(BridgeStatusGeneral value) {
        return new JAXBElement<BridgeStatusGeneral>(_BasicDataBoardingBridgeBridgeStatusGeneral_QNAME, BridgeStatusGeneral.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusPCAReason", scope = BasicData.BoardingBridge.class)
    public JAXBElement<String> createBasicDataBoardingBridgeBridgeStatusPCAReason(String value) {
        return new JAXBElement<String>(_BasicDataBoardingBridgeBridgeStatusPCAReason_QNAME, String.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusGeneralStartDateTime", scope = BasicData.BoardingBridge.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBoardingBridgeBridgeStatusGeneralStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBoardingBridgeBridgeStatusGeneralStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BridgeStatusPower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusPower", scope = BasicData.BoardingBridge.class)
    public JAXBElement<BridgeStatusPower> createBasicDataBoardingBridgeBridgeStatusPower(BridgeStatusPower value) {
        return new JAXBElement<BridgeStatusPower>(_BasicDataBoardingBridgeBridgeStatusPower_QNAME, BridgeStatusPower.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusGeneralEndDateTime", scope = BasicData.BoardingBridge.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBoardingBridgeBridgeStatusGeneralEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBoardingBridgeBridgeStatusGeneralEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusPowerReason", scope = BasicData.BoardingBridge.class)
    public JAXBElement<String> createBasicDataBoardingBridgeBridgeStatusPowerReason(String value) {
        return new JAXBElement<String>(_BasicDataBoardingBridgeBridgeStatusPowerReason_QNAME, String.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BridgeStatusGeneralReason", scope = BasicData.BoardingBridge.class)
    public JAXBElement<String> createBasicDataBoardingBridgeBridgeStatusGeneralReason(String value) {
        return new JAXBElement<String>(_BasicDataBoardingBridgeBridgeStatusGeneralReason_QNAME, String.class, BasicData.BoardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSuffix", scope = IATAMasterFlightIdentifier.class)
    public JAXBElement<FlightSuffix> createIATAMasterFlightIdentifierFlightSuffix(FlightSuffix value) {
        return new JAXBElement<FlightSuffix>(_ICAOFlightIdentifierFlightSuffix_QNAME, FlightSuffix.class, IATAMasterFlightIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationLanguage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "InformationLanguage", scope = InformationRemark.class)
    public JAXBElement<InformationLanguage> createInformationRemarkInformationLanguage(InformationLanguage value) {
        return new JAXBElement<InformationLanguage>(_InformationRemarkInformationLanguage_QNAME, InformationLanguage.class, InformationRemark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "InformationText", scope = InformationRemark.class)
    public JAXBElement<String> createInformationRemarkInformationText(String value) {
        return new JAXBElement<String>(_InformationRemarkInformationText_QNAME, String.class, InformationRemark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSuffix", scope = IATALinkFlightIdentifier.class)
    public JAXBElement<FlightSuffix> createIATALinkFlightIdentifierFlightSuffix(FlightSuffix value) {
        return new JAXBElement<FlightSuffix>(_ICAOFlightIdentifierFlightSuffix_QNAME, FlightSuffix.class, IATALinkFlightIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "HandlingAgentIATACode", scope = ResourceData.GateOperation.class)
    public JAXBElement<String> createResourceDataGateOperationHandlingAgentIATACode(String value) {
        return new JAXBElement<String>(_BasicDataAirlineHandlingAgentIATACode_QNAME, String.class, ResourceData.GateOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateCloseDateTime", scope = ResourceData.GateOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataGateOperationGateCloseDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GateGateCloseDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.GateOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateOpenDateTime", scope = ResourceData.GateOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataGateOperationGateOpenDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GateGateOpenDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.GateOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateLastCallDateTime", scope = ResourceData.GateOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataGateOperationGateLastCallDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataGateOperationGateLastCallDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.GateOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.Public }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Public", scope = FlightData.class)
    public JAXBElement<FlightData.Public> createFlightDataPublic(FlightData.Public value) {
        return new JAXBElement<FlightData.Public>(_FlightDataPublic_QNAME, FlightData.Public.class, FlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.Aircraft }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Aircraft", scope = FlightData.class)
    public JAXBElement<FlightData.Aircraft> createFlightDataAircraft(FlightData.Aircraft value) {
        return new JAXBElement<FlightData.Aircraft>(_FlightDataAircraft_QNAME, FlightData.Aircraft.class, FlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.PortsOfCall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PortsOfCall", scope = FlightData.class)
    public JAXBElement<FlightData.PortsOfCall> createFlightDataPortsOfCall(FlightData.PortsOfCall value) {
        return new JAXBElement<FlightData.PortsOfCall>(_FlightDataPortsOfCall_QNAME, FlightData.PortsOfCall.class, FlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.Load }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Load", scope = FlightData.class)
    public JAXBElement<FlightData.Load> createFlightDataLoad(FlightData.Load value) {
        return new JAXBElement<FlightData.Load>(_FlightDataLoad_QNAME, FlightData.Load.class, FlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.OperationalTimes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "OperationalTimes", scope = FlightData.class)
    public JAXBElement<FlightData.OperationalTimes> createFlightDataOperationalTimes(FlightData.OperationalTimes value) {
        return new JAXBElement<FlightData.OperationalTimes>(_FlightDataOperationalTimes_QNAME, FlightData.OperationalTimes.class, FlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.Airport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Airport", scope = FlightData.class)
    public JAXBElement<FlightData.Airport> createFlightDataAirport(FlightData.Airport value) {
        return new JAXBElement<FlightData.Airport>(_FlightDataAirport_QNAME, FlightData.Airport.class, FlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.Flight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Flight", scope = FlightData.class)
    public JAXBElement<FlightData.Flight> createFlightDataFlight(FlightData.Flight value) {
        return new JAXBElement<FlightData.Flight>(_FlightDataFlight_QNAME, FlightData.Flight.class, FlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeSubscriptionCancelled", scope = AFDSCancelSubscription.class)
    public JAXBElement<XMLGregorianCalendar> createAFDSCancelSubscriptionDateTimeSubscriptionCancelled(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFDSCancelSubscriptionDateTimeSubscriptionCancelled_QNAME, XMLGregorianCalendar.class, AFDSCancelSubscription.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeSubscriptionCancelled", scope = RDDSCancelSubscription.class)
    public JAXBElement<XMLGregorianCalendar> createRDDSCancelSubscriptionDateTimeSubscriptionCancelled(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RDDSCancelSubscriptionDateTimeSubscriptionCancelled_QNAME, XMLGregorianCalendar.class, RDDSCancelSubscription.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeSubscriptionCancelled", scope = BDDSCancelSubscription.class)
    public JAXBElement<XMLGregorianCalendar> createBDDSCancelSubscriptionDateTimeSubscriptionCancelled(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BDDSCancelSubscriptionDateTimeSubscriptionCancelled_QNAME, XMLGregorianCalendar.class, BDDSCancelSubscription.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeSubscriptionCancelled", scope = SFDSCancelSubscription.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSCancelSubscriptionDateTimeSubscriptionCancelled(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SFDSCancelSubscriptionDateTimeSubscriptionCancelled_QNAME, XMLGregorianCalendar.class, SFDSCancelSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinClassDescription", scope = BasicData.CheckinClass.class)
    public JAXBElement<String> createBasicDataCheckinClassCheckinClassDescription(String value) {
        return new JAXBElement<String>(_BasicDataCheckinAirlineClassCheckinClassDescription_QNAME, String.class, BasicData.CheckinClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.FlightServiceTypeIATACode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightServiceTypeIATACode", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.FlightServiceTypeIATACode> createFlightFilterDataFlightServiceTypeIATACode(FlightFilterData.FlightServiceTypeIATACode value) {
        return new JAXBElement<FlightFilterData.FlightServiceTypeIATACode>(_BasicDataAirlineFlightServiceTypeIATACode_QNAME, FlightFilterData.FlightServiceTypeIATACode.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.FlightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightType", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.FlightType> createFlightFilterDataFlightType(FlightFilterData.FlightType value) {
        return new JAXBElement<FlightFilterData.FlightType>(_FlightFilterDataFlightType_QNAME, FlightFilterData.FlightType.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.AirportIATACode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AirportIATACode", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.AirportIATACode> createFlightFilterDataAirportIATACode(FlightFilterData.AirportIATACode value) {
        return new JAXBElement<FlightFilterData.AirportIATACode>(_FlightFilterDataAirportIATACode_QNAME, FlightFilterData.AirportIATACode.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.CarrierIATACode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CarrierIATACode", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.CarrierIATACode> createFlightFilterDataCarrierIATACode(FlightFilterData.CarrierIATACode value) {
        return new JAXBElement<FlightFilterData.CarrierIATACode>(_FlightFilterDataCarrierIATACode_QNAME, FlightFilterData.CarrierIATACode.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.CarrierICAOCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CarrierICAOCode", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.CarrierICAOCode> createFlightFilterDataCarrierICAOCode(FlightFilterData.CarrierICAOCode value) {
        return new JAXBElement<FlightFilterData.CarrierICAOCode>(_FlightFilterDataCarrierICAOCode_QNAME, FlightFilterData.CarrierICAOCode.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.CodeShareStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CodeShareStatus", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.CodeShareStatus> createFlightFilterDataCodeShareStatus(FlightFilterData.CodeShareStatus value) {
        return new JAXBElement<FlightFilterData.CodeShareStatus>(_FlightDataFlightCodeShareStatus_QNAME, FlightFilterData.CodeShareStatus.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.FlightNatureCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightNatureCode", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.FlightNatureCode> createFlightFilterDataFlightNatureCode(FlightFilterData.FlightNatureCode value) {
        return new JAXBElement<FlightFilterData.FlightNatureCode>(_FlightDataFlightFlightNatureCode_QNAME, FlightFilterData.FlightNatureCode.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.FlightSectorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSectorCode", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.FlightSectorCode> createFlightFilterDataFlightSectorCode(FlightFilterData.FlightSectorCode value) {
        return new JAXBElement<FlightFilterData.FlightSectorCode>(_BasicDataAirlineFlightSectorCode_QNAME, FlightFilterData.FlightSectorCode.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFilterData.TerminalCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TerminalCode", scope = FlightFilterData.class)
    public JAXBElement<FlightFilterData.TerminalCode> createFlightFilterDataTerminalCode(FlightFilterData.TerminalCode value) {
        return new JAXBElement<FlightFilterData.TerminalCode>(_ResourceDataResourceImpairmentIdentificationTerminalCode_QNAME, FlightFilterData.TerminalCode.class, FlightFilterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CAACDelayCodeDescription", scope = BasicData.CAACDelayCode.class)
    public JAXBElement<String> createBasicDataCAACDelayCodeCAACDelayCodeDescription(String value) {
        return new JAXBElement<String>(_BasicDataCAACDelayCodeCAACDelayCodeDescription_QNAME, String.class, BasicData.CAACDelayCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ReclaimCarouselStatusStartDateTime", scope = BasicData.BaggageReclaimCarousel.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBaggageReclaimCarouselReclaimCarouselStatusStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBaggageReclaimCarouselReclaimCarouselStatusStartDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ReclaimCarouselStatusEndDateTime", scope = BasicData.BaggageReclaimCarousel.class)
    public JAXBElement<XMLGregorianCalendar> createBasicDataBaggageReclaimCarouselReclaimCarouselStatusEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BasicDataBaggageReclaimCarouselReclaimCarouselStatusEndDateTime_QNAME, XMLGregorianCalendar.class, BasicData.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReclaimCarouselStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ReclaimCarouselStatus", scope = BasicData.BaggageReclaimCarousel.class)
    public JAXBElement<ReclaimCarouselStatus> createBasicDataBaggageReclaimCarouselReclaimCarouselStatus(ReclaimCarouselStatus value) {
        return new JAXBElement<ReclaimCarouselStatus>(_BasicDataBaggageReclaimCarouselReclaimCarouselStatus_QNAME, ReclaimCarouselStatus.class, BasicData.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ReclaimCarouselDescription", scope = BasicData.BaggageReclaimCarousel.class)
    public JAXBElement<String> createBasicDataBaggageReclaimCarouselReclaimCarouselDescription(String value) {
        return new JAXBElement<String>(_BasicDataBaggageReclaimCarouselReclaimCarouselDescription_QNAME, String.class, BasicData.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ReclaimCarouselExitDoor", scope = BasicData.BaggageReclaimCarousel.class)
    public JAXBElement<String> createBasicDataBaggageReclaimCarouselReclaimCarouselExitDoor(String value) {
        return new JAXBElement<String>(_BasicDataBaggageReclaimCarouselReclaimCarouselExitDoor_QNAME, String.class, BasicData.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ReclaimCarouselStatusReason", scope = BasicData.BaggageReclaimCarousel.class)
    public JAXBElement<String> createBasicDataBaggageReclaimCarouselReclaimCarouselStatusReason(String value) {
        return new JAXBElement<String>(_BasicDataBaggageReclaimCarouselReclaimCarouselStatusReason_QNAME, String.class, BasicData.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ReclaimCarouselCapacity", scope = BasicData.BaggageReclaimCarousel.class)
    public JAXBElement<Integer> createBasicDataBaggageReclaimCarouselReclaimCarouselCapacity(Integer value) {
        return new JAXBElement<Integer>(_BasicDataBaggageReclaimCarouselReclaimCarouselCapacity_QNAME, Integer.class, BasicData.BaggageReclaimCarousel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "HandlingAgentIATACode", scope = ResourceData.CheckinOperation.class)
    public JAXBElement<String> createResourceDataCheckinOperationHandlingAgentIATACode(String value) {
        return new JAXBElement<String>(_BasicDataAirlineHandlingAgentIATACode_QNAME, String.class, ResourceData.CheckinOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinCloseDateTime", scope = ResourceData.CheckinOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataCheckinOperationCheckinCloseDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataCheckinOperationCheckinCloseDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.CheckinOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinOpenDateTime", scope = ResourceData.CheckinOperation.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataCheckinOperationCheckinOpenDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataCheckinOperationCheckinOpenDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.CheckinOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSuffix", scope = IATAFlightIdentifier.class)
    public JAXBElement<FlightSuffix> createIATAFlightIdentifierFlightSuffix(FlightSuffix value) {
        return new JAXBElement<FlightSuffix>(_ICAOFlightIdentifierFlightSuffix_QNAME, FlightSuffix.class, IATAFlightIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ImpairmentEndDateTime", scope = ResourceData.ResourceImpairment.class)
    public JAXBElement<XMLGregorianCalendar> createResourceDataResourceImpairmentImpairmentEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataResourceImpairmentImpairmentEndDateTime_QNAME, XMLGregorianCalendar.class, ResourceData.ResourceImpairment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TotalCrewCount", scope = FlightData.Load.class)
    public JAXBElement<Integer> createFlightDataLoadTotalCrewCount(Integer value) {
        return new JAXBElement<Integer>(_FlightDataLoadTotalCrewCount_QNAME, Integer.class, FlightData.Load.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.Load.Cargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Cargo", scope = FlightData.Load.class)
    public JAXBElement<FlightData.Load.Cargo> createFlightDataLoadCargo(FlightData.Load.Cargo value) {
        return new JAXBElement<FlightData.Load.Cargo>(_FlightDataLoadCargo_QNAME, FlightData.Load.Cargo.class, FlightData.Load.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData.Load.PassengerCounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PassengerCounts", scope = FlightData.Load.class)
    public JAXBElement<FlightData.Load.PassengerCounts> createFlightDataLoadPassengerCounts(FlightData.Load.PassengerCounts value) {
        return new JAXBElement<FlightData.Load.PassengerCounts>(_FlightDataLoadPassengerCounts_QNAME, FlightData.Load.PassengerCounts.class, FlightData.Load.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = LinkedFlight.class)
    public JAXBElement<Integer> createLinkedFlightFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, LinkedFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinCloseDateTime", scope = Checkin.class)
    public JAXBElement<XMLGregorianCalendar> createCheckinCheckinCloseDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataCheckinOperationCheckinCloseDateTime_QNAME, XMLGregorianCalendar.class, Checkin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinOpenDateTime", scope = Checkin.class)
    public JAXBElement<XMLGregorianCalendar> createCheckinCheckinOpenDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResourceDataCheckinOperationCheckinOpenDateTime_QNAME, XMLGregorianCalendar.class, Checkin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinTypeCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinTypeCode", scope = Checkin.class)
    public JAXBElement<CheckinTypeCode> createCheckinCheckinTypeCode(CheckinTypeCode value) {
        return new JAXBElement<CheckinTypeCode>(_CheckinCheckinTypeCode_QNAME, CheckinTypeCode.class, Checkin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinClusterID", scope = Checkin.class)
    public JAXBElement<Long> createCheckinCheckinClusterID(Long value) {
        return new JAXBElement<Long>(_CheckinCheckinClusterID_QNAME, Long.class, Checkin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftMovementConfirmStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftMovementConfirmStatus", scope = ResourceData.AircraftTow.class)
    public JAXBElement<AircraftMovementConfirmStatus> createResourceDataAircraftTowAircraftMovementConfirmStatus(AircraftMovementConfirmStatus value) {
        return new JAXBElement<AircraftMovementConfirmStatus>(_ResourceDataAircraftTowAircraftMovementConfirmStatus_QNAME, AircraftMovementConfirmStatus.class, ResourceData.AircraftTow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftRegistration", scope = ResourceData.AircraftTow.class)
    public JAXBElement<String> createResourceDataAircraftTowAircraftRegistration(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationAircraftRegistration_QNAME, String.class, ResourceData.AircraftTow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceData.AircraftTow.DepartureIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DepartureIdentification", scope = ResourceData.AircraftTow.class)
    public JAXBElement<ResourceData.AircraftTow.DepartureIdentification> createResourceDataAircraftTowDepartureIdentification(ResourceData.AircraftTow.DepartureIdentification value) {
        return new JAXBElement<ResourceData.AircraftTow.DepartureIdentification>(_ResourceDataAircraftTowDepartureIdentification_QNAME, ResourceData.AircraftTow.DepartureIdentification.class, ResourceData.AircraftTow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceData.AircraftTow.ArrivalIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ArrivalIdentification", scope = ResourceData.AircraftTow.class)
    public JAXBElement<ResourceData.AircraftTow.ArrivalIdentification> createResourceDataAircraftTowArrivalIdentification(ResourceData.AircraftTow.ArrivalIdentification value) {
        return new JAXBElement<ResourceData.AircraftTow.ArrivalIdentification>(_ResourceDataAircraftTowArrivalIdentification_QNAME, ResourceData.AircraftTow.ArrivalIdentification.class, ResourceData.AircraftTow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftMovementTypeCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftMovementTypeCode", scope = ResourceData.AircraftTow.class)
    public JAXBElement<AircraftMovementTypeCode> createResourceDataAircraftTowAircraftMovementTypeCode(AircraftMovementTypeCode value) {
        return new JAXBElement<AircraftMovementTypeCode>(_ResourceDataAircraftTowAircraftMovementTypeCode_QNAME, AircraftMovementTypeCode.class, ResourceData.AircraftTow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CAACDelayCategoryDescription", scope = BasicData.CAACDelayCategory.class)
    public JAXBElement<String> createBasicDataCAACDelayCategoryCAACDelayCategoryDescription(String value) {
        return new JAXBElement<String>(_BasicDataCAACDelayCategoryCAACDelayCategoryDescription_QNAME, String.class, BasicData.CAACDelayCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "TerminalDescription", scope = BasicData.Terminal.class)
    public JAXBElement<String> createBasicDataTerminalTerminalDescription(String value) {
        return new JAXBElement<String>(_BasicDataTerminalTerminalDescription_QNAME, String.class, BasicData.Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightRepeatCount", scope = MasterFlight.class)
    public JAXBElement<Integer> createMasterFlightFlightRepeatCount(Integer value) {
        return new JAXBElement<Integer>(_ResourceDataStandPositionOperationFlightRepeatCount_QNAME, Integer.class, MasterFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "HandlingAgentDescription", scope = BasicData.Handler.class)
    public JAXBElement<String> createBasicDataHandlerHandlingAgentDescription(String value) {
        return new JAXBElement<String>(_BasicDataHandlerHandlingAgentDescription_QNAME, String.class, BasicData.Handler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightIdentity", scope = FlightData.Public.class)
    public JAXBElement<String> createFlightDataPublicFlightIdentity(String value) {
        return new JAXBElement<String>(_ResourceDataStandPositionOperationFlightIdentity_QNAME, String.class, FlightData.Public.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PublicDateTime", scope = FlightData.Public.class)
    public JAXBElement<XMLGregorianCalendar> createFlightDataPublicPublicDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataPublicPublicDateTime_QNAME, XMLGregorianCalendar.class, FlightData.Public.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PublicCarrierCode", scope = FlightData.Public.class)
    public JAXBElement<String> createFlightDataPublicPublicCarrierCode(String value) {
        return new JAXBElement<String>(_BasicDataAirlinePublicCarrierCode_QNAME, String.class, FlightData.Public.class, value);
    }

    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeStatusRequestSent", scope = AFDSStatusRequest.class)
    public JAXBElement<XMLGregorianCalendar> createAFDSStatusRequestDateTimeStatusRequestSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFDSStatusRequestDateTimeStatusRequestSent_QNAME, XMLGregorianCalendar.class, AFDSStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeStatusRequestSent", scope = RDDSStatusRequest.class)
    public JAXBElement<XMLGregorianCalendar> createRDDSStatusRequestDateTimeStatusRequestSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RDDSStatusRequestDateTimeStatusRequestSent_QNAME, XMLGregorianCalendar.class, RDDSStatusRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeStatusRequestSent", scope = BDDSStatusRequest.class)
    public JAXBElement<XMLGregorianCalendar> createBDDSStatusRequestDateTimeStatusRequestSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BDDSStatusRequestDateTimeStatusRequestSent_QNAME, XMLGregorianCalendar.class, BDDSStatusRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeStatusRequestSent", scope = SFDSStatusRequest.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSStatusRequestDateTimeStatusRequestSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SFDSStatusRequestDateTimeStatusRequestSent_QNAME, XMLGregorianCalendar.class, SFDSStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SnapshotFromDateTime", scope = AFDSSubscriptionRequest.class)
    public JAXBElement<XMLGregorianCalendar> createAFDSSubscriptionRequestSnapshotFromDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFDSSubscriptionRequestSnapshotFromDateTime_QNAME, XMLGregorianCalendar.class, AFDSSubscriptionRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SnapshotFromDateTime", scope = RDDSSubscriptionRequest.class)
    public JAXBElement<XMLGregorianCalendar> createRDDSSubscriptionRequestSnapshotFromDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RDDSSubscriptionRequestSnapshotFromDateTime_QNAME, XMLGregorianCalendar.class, RDDSSubscriptionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SnapshotFromDateTime", scope = BDDSSubscriptionRequest.class)
    public JAXBElement<XMLGregorianCalendar> createBDDSSubscriptionRequestSnapshotFromDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BDDSSubscriptionRequestSnapshotFromDateTime_QNAME, XMLGregorianCalendar.class, BDDSSubscriptionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ScheduleStartDateTime", scope = SFDSScheduleRequest.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSScheduleRequestScheduleStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SFDSScheduleRequestScheduleStartDateTime_QNAME, XMLGregorianCalendar.class, SFDSScheduleRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ScheduleEndDateTime", scope = SFDSScheduleRequest.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSScheduleRequestScheduleEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SFDSScheduleRequestScheduleEndDateTime_QNAME, XMLGregorianCalendar.class, SFDSScheduleRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightShareStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightShareStatus", scope = AFDSSubscriptionRequest.SubscriptionParameters.class)
    public JAXBElement<FlightShareStatus> createAFDSSubscriptionRequestSubscriptionParametersFlightShareStatus(FlightShareStatus value) {
        return new JAXBElement<FlightShareStatus>(_AFDSSubscriptionRequestSubscriptionParametersFlightShareStatus_QNAME, FlightShareStatus.class, AFDSSubscriptionRequest.SubscriptionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMP.FlightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightType", scope = AFDSSubscriptionRequest.SubscriptionParameters.class)
    public JAXBElement<FlightType> createAFDSSubscriptionRequestSubscriptionParametersFlightType(FlightType value) {
        return new JAXBElement<FlightType>(_AFDSSubscriptionRequestSubscriptionParametersFlightType_QNAME, FlightType.class, AFDSSubscriptionRequest.SubscriptionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AirportIATACode", scope = AFDSSubscriptionRequest.SubscriptionParameters.class)
    public JAXBElement<String> createAFDSSubscriptionRequestSubscriptionParametersAirportIATACode(String value) {
        return new JAXBElement<String>(_AFDSSubscriptionRequestSubscriptionParametersAirportIATACode_QNAME, String.class, AFDSSubscriptionRequest.SubscriptionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightDirection", scope = AFDSSubscriptionRequest.SubscriptionParameters.class)
    public JAXBElement<FlightDirection> createAFDSSubscriptionRequestSubscriptionParametersFlightDirection(FlightDirection value) {
        return new JAXBElement<FlightDirection>(_AFDSSubscriptionRequestSubscriptionParametersFlightDirection_QNAME, FlightDirection.class, AFDSSubscriptionRequest.SubscriptionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightShareStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightShareStatus", scope = SFDSScheduleRequest.SubscriptionParameters.class)
    public JAXBElement<FlightShareStatus> createSFDSScheduleRequestSubscriptionParametersFlightShareStatus(FlightShareStatus value) {
        return new JAXBElement<FlightShareStatus>(_SFDSScheduleRequestSubscriptionParametersFlightShareStatus_QNAME, FlightShareStatus.class, SFDSScheduleRequest.SubscriptionParameters.class, value);
    }

    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AirportIATACode", scope =SFDSScheduleRequest.SubscriptionParameters.class)
    public JAXBElement<String> createSFDSScheduleRequestSubscriptionParametersAirportIATACode(String value) {
        return new JAXBElement<String>(_SFDSScheduleRequestSubscriptionParametersAirportIATACode_QNAME, String.class, SFDSScheduleRequest.SubscriptionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightDirection", scope = SFDSScheduleRequest.SubscriptionParameters.class)
    public JAXBElement<FlightDirection> createSFDSScheduleRequestSubscriptionParametersFlightDirection(FlightDirection value) {
        return new JAXBElement<FlightDirection>(_SFDSScheduleRequestSubscriptionParametersFlightDirection_QNAME, FlightDirection.class, SFDSScheduleRequest.SubscriptionParameters.class, value);
    }
	
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = AFDSStatusResponse.class)
    public JAXBElement<XMLGregorianCalendar> createAFDSStatusResponseDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFDSStatusResponseDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class,  AFDSStatusResponse.class, value);
    }

    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = AFDSCancellation.class)
    public JAXBElement<XMLGregorianCalendar> createAFDSCancellationDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFDSCancellationDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class,  AFDSCancellation.class, value);
    }
    
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RejectionReason", scope = AFDSCancellation.class)
    public JAXBElement<String> createAFDSCancellationRejectionReason(String value) {
        return new JAXBElement<String>(_AFDSCancellationRejectionReason_QNAME, String.class,  AFDSCancellation.class, value);
    }
    
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeSnapshotStartSent", scope = AFDSSnapshotStart.class)
    public JAXBElement<XMLGregorianCalendar> createAFDSSnapshotStartDateTimeSnapshotStartSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFDSSnapshotStartDateTimeSnapshotStartSent_QNAME, XMLGregorianCalendar.class,  AFDSSnapshotStart.class, value);
    }
    
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NumberOfRecords", scope = AFDSSnapshotEnd.class)
    public JAXBElement<Integer> createAFDSSnapshotEndNumberOfRecords(Integer value) {
    	return new JAXBElement<Integer>(_AFDSSnapshotEndDNumberOfRecords_QNAME, Integer.class,  AFDSSnapshotEnd.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = AFDSSubscriptionResponse.class)
    public JAXBElement<XMLGregorianCalendar> createAFDSSubscriptionResponseDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFDSSubscriptionResponseDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class, AFDSSubscriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RejectionReason", scope = AFDSSubscriptionResponse.class)
    public JAXBElement<String> createAFDSSubscriptionResponseRejectionReason(String value) {
        return new JAXBElement<String>(_AFDSSubscriptionResponseRejectionReason_QNAME, String.class, AFDSSubscriptionResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = BDDSCancellation.class)
    public JAXBElement<XMLGregorianCalendar> createBDDSCancellationDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BDDSCancellationDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class, BDDSCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RejectionReason", scope = BDDSCancellation.class)
    public JAXBElement<String> createBDDSCancellationRejectionReason(String value) {
        return new JAXBElement<String>(_BDDSCancellationRejectionReason_QNAME, String.class, BDDSCancellation.class, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeSnapshotStartSent", scope = BDDSSnapshotStart.class)
    public JAXBElement<XMLGregorianCalendar> createBDDSSnapshotStartDateTimeSnapshotStartSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BDDSSnapshotStartDateTimeSnapshotStartSent_QNAME, XMLGregorianCalendar.class, BDDSSnapshotStart.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = BDDSSubscriptionResponse.class)
    public JAXBElement<XMLGregorianCalendar> createBDDSSubscriptionResponseDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BDDSSubscriptionResponseDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class, BDDSSubscriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RejectionReason", scope = BDDSSubscriptionResponse.class)
    public JAXBElement<String> createBDDSSubscriptionResponseRejectionReason(String value) {
        return new JAXBElement<String>(_BDDSSubscriptionResponseRejectionReason_QNAME, String.class, BDDSSubscriptionResponse.class, value);
    }
    
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = BDDSStatusResponse.class)
    public JAXBElement<XMLGregorianCalendar> createBDDSStatusResponseDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BDDSStatusResponseDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class,  BDDSStatusResponse.class, value);
    }
    
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NumberOfRecords", scope = BDDSSnapshotEnd.class)
    public JAXBElement<Integer> createBDDSSnapshotEndNumberOfRecords(Integer value) {
    	return new JAXBElement<Integer>(_BDDSSnapshotEndDNumberOfRecords_QNAME, Integer.class,  BDDSSnapshotEnd.class, value);
    }
    
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = RDDSCancellation.class)
    public JAXBElement<XMLGregorianCalendar> createRDDSCancellationDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RDDSCancellationDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class, RDDSCancellation.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeSnapshotStartSent", scope = RDDSSnapshotStart.class)
    public JAXBElement<XMLGregorianCalendar> createRDDSSnapshotStartDateTimeSnapshotStartSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RDDSSnapshotStartDateTimeSnapshotStartSent_QNAME, XMLGregorianCalendar.class, RDDSSnapshotStart.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = RDDSSubscriptionResponse.class)
    public JAXBElement<XMLGregorianCalendar> createRDDSSubscriptionResponseDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RDDSSubscriptionResponseDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class, RDDSSubscriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RejectionReason", scope = RDDSSubscriptionResponse.class)
    public JAXBElement<String> createRDDSSubscriptionResponseRejectionReason(String value) {
        return new JAXBElement<String>(_RDDSSubscriptionResponseRejectionReason_QNAME, String.class, RDDSSubscriptionResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = RDDSStatusResponse.class)
    public JAXBElement<XMLGregorianCalendar> createRDDSStatusResponseDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RDDSStatusResponseDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class,  RDDSStatusResponse.class, value);
    }
    
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NumberOfRecords", scope = RDDSSnapshotEnd.class)
    public JAXBElement<Integer> createRDDSSnapshotEndNumberOfRecords(Integer value) {
    	return new JAXBElement<Integer>(_RDDSSnapshotEndDNumberOfRecords_QNAME, Integer.class,  RDDSSnapshotEnd.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = SFDSCancellation.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSCancellationDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SFDSCancellationDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class, SFDSCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RejectionReason", scope = SFDSCancellation.class)
    public JAXBElement<String> createSFDSCancellationRejectionReason(String value) {
        return new JAXBElement<String>(_SFDSCancellationRejectionReason_QNAME, String.class, SFDSCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = SFDSScheduleResponse.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSScheduleResponseDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SFDSScheduleResponseDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class, SFDSScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RejectionReason", scope = SFDSScheduleResponse.class)
    public JAXBElement<String> createSFDSScheduleResponseRejectionReason(String value) {
        return new JAXBElement<String>(_SFDSScheduleResponseRejectionReason_QNAME, String.class, SFDSScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DateTimeRequestReceived", scope = SFDSStatusResponse.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSStatusResponseDateTimeRequestReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SFDSStatusResponseDateTimeRequestReceived_QNAME, XMLGregorianCalendar.class, SFDSStatusResponse.class, value);
    }

    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NumberOfRecords", scope = SFDSScheduleEnd.class)
    public JAXBElement<Integer> createSFDSScheduleEndNumberOfRecords(Integer value) {
    	return new JAXBElement<Integer>(_SFDSScheduleEndDNumberOfRecords_QNAME, Integer.class,  SFDSScheduleEnd.class, value);
    }
    
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "RequestID", scope = SFDSScheduleStart.class)
    public JAXBElement<Integer> createSFDSScheduleStartRequestID(Integer value) {
    	return new JAXBElement<Integer>(_SFDSScheduleStartRequestID_QNAME, Integer.class,  SFDSScheduleStart.class, value);
    }

    
    /**
     * 
     * Create an instance of {@link RDDSCancelSubscription }
     */
	public RDDSCancelSubscription createRDDSCancelSubscription() {
		return new RDDSCancelSubscription();
	}

	public Object createAFDSSubscriptionRequest() {
		// TODO Auto-generated method stub
		return new AFDSSubscriptionRequest();
	}

	public Object createRDDSSubscriptionRequest() {
		// TODO Auto-generated method stub
		return new RDDSSubscriptionRequest();
	}

	public Object createBDDSSubscriptionRequest() {
		// TODO Auto-generated method stub
		return new BDDSSubscriptionRequest();
	}

	public Object createSFDSScheduleRequest() {
		// TODO Auto-generated method stub
		return new SFDSScheduleRequest();
	}
//    
	
	  /**
     * Create an instance of {@link SFDSFlightData }
     * 
     */
    public SFDSFlightData createSFDSFlightData() {
        return new SFDSFlightData();
    }

/**
     * Create an instance of {@link SFDSFlightData.Flight }
     * 
     */
    public SFDSFlightData.Flight createSFDSFlightDataFlight() {
        return new SFDSFlightData.Flight();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Airport }
     * 
     */
    public SFDSFlightData.Airport createSFDSFlightDataAirport() {
        return new SFDSFlightData.Airport();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Identification }
     * 
     */
    public SFDSFlightData.Identification createSFDSFlightDataIdentification() {
        return new SFDSFlightData.Identification();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Aircraft }
     * 
     */
    public SFDSFlightData.Aircraft createSFDSFlightDataAircraft() {
        return new SFDSFlightData.Aircraft();
    }

    /**
     * Create an instance of {@link SFDSFlightData.OperationalTimes }
     * 
     */
    public SFDSFlightData.OperationalTimes createSFDSFlightDataOperationalTimes() {
        return new SFDSFlightData.OperationalTimes();
    }

    /**
     * Create an instance of {@link SFDSFlightData.PortsOfCall }
     * 
     */
    public SFDSFlightData.PortsOfCall createSFDSFlightDataPortsOfCall() {
        return new SFDSFlightData.PortsOfCall();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Public }
     * 
     */
    public SFDSFlightData.Public createSFDSFlightDataPublic() {
        return new SFDSFlightData.Public();
    }

   /**
     * Create an instance of {@link SFDSFlightData.Flight.LinkedFlight }
     * 
     */
    public SFDSFlightData.Flight.LinkedFlight createSFDSFlightDataFlightLinkedFlight() {
        return new SFDSFlightData.Flight.LinkedFlight();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Flight.MasterFlight }
     * 
     */
    public SFDSFlightData.Flight.MasterFlight createSFDSFlightDataFlightMasterFlight() {
        return new SFDSFlightData.Flight.MasterFlight();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Airport.BaggageReclaimCarousel }
     * 
     */
    public SFDSFlightData.Airport.BaggageReclaimCarousel createSFDSFlightDataAirportBaggageReclaimCarousel() {
        return new SFDSFlightData.Airport.BaggageReclaimCarousel();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Airport.BaggageMakeupPosition }
     * 
     */
    public SFDSFlightData.Airport.BaggageMakeupPosition createSFDSFlightDataAirportBaggageMakeupPosition() {
        return new SFDSFlightData.Airport.BaggageMakeupPosition();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Airport.Checkin }
     * 
     */
    public SFDSFlightData.Airport.Checkin createSFDSFlightDataAirportCheckin() {
        return new SFDSFlightData.Airport.Checkin();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Airport.Gate }
     * 
     */
    public SFDSFlightData.Airport.Gate createSFDSFlightDataAirportGate() {
        return new SFDSFlightData.Airport.Gate();
    }

    /**
     * Create an instance of {@link SFDSFlightData.Identification.DaysOfOperation }
     * 
     */
    public SFDSFlightData.Identification.DaysOfOperation createSFDSFlightDataIdentificationDaysOfOperation() {
        return new SFDSFlightData.Identification.DaysOfOperation();
    }
    
	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LinkDay", scope = SFDSFlightData.Flight.LinkedFlight.class)
    public JAXBElement<Integer> createSFDSFlightDataFlightLinkedFlightLinkDay(Integer value) {
        return new JAXBElement<Integer>(_SFDSFlightDataFlightLinkedFlightLinkDay_QNAME, Integer.class, SFDSFlightData.Flight.LinkedFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LinkedFlightID", scope = SFDSFlightData.Flight.LinkedFlight.class)
    public JAXBElement<Long> createSFDSFlightDataFlightLinkedFlightLinkedFlightID(Long value) {
        return new JAXBElement<Long>(_SFDSFlightDataFlightLinkedFlightLinkedFlightID_QNAME, Long.class, SFDSFlightData.Flight.LinkedFlight.class, value);
    }




    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeasonalFlightCancelCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SeasonalFlightCancelCode", scope = SFDSFlightData.Identification.class)
    public JAXBElement<SeasonalFlightCancelCode> createSFDSFlightDataIdentificationSeasonalFlightCancelCode(SeasonalFlightCancelCode value) {
        return new JAXBElement<SeasonalFlightCancelCode>(_SFDSFlightDataIdentificationSeasonalFlightCancelCode_QNAME, SeasonalFlightCancelCode.class, SFDSFlightData.Identification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightID", scope = SFDSFlightData.Identification.class)
    public JAXBElement<Long> createSFDSFlightDataIdentificationFlightID(Long value) {
        return new JAXBElement<Long>(_SFDSFlightDataIdentificationFlightID_QNAME, Long.class, SFDSFlightData.Identification.class, value);
    }

/**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BaggageMakeupPositionID", scope = SFDSFlightData.Airport.BaggageMakeupPosition.class)
    public JAXBElement<String> createSFDSFlightDataAirportBaggageMakeupPositionBaggageMakeupPositionID(String value) {
        return new JAXBElement<String>(_SFDSFlightDataAirportBaggageMakeupPositionBaggageMakeupPositionID_QNAME, String.class, SFDSFlightData.Airport.BaggageMakeupPosition.class, value);
    }

/**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MasterFlightID", scope = SFDSFlightData.Flight.MasterFlight.class)
    public JAXBElement<Long> createSFDSFlightDataFlightMasterFlightMasterFlightID(Long value) {
        return new JAXBElement<Long>(_SFDSFlightDataFlightMasterFlightMasterFlightID_QNAME, Long.class, SFDSFlightData.Flight.MasterFlight.class, value);
    }

/**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "AircraftSubtypeIATACode", scope = SFDSFlightData.Aircraft.class)
    public JAXBElement<String> createSFDSFlightDataAircraftAircraftSubtypeIATACode(String value) {
        return new JAXBElement<String>(_FlightDataAircraftAircraftSubtypeIATACode_QNAME, String.class, SFDSFlightData.Aircraft.class, value);
    }

 /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "GateNumber", scope = SFDSFlightData.Airport.Gate.class)
    public JAXBElement<String> createSFDSFlightDataAirportGateGateNumber(String value) {
        return new JAXBElement<String>(_BasicDataStandGateNumber_QNAME, String.class, SFDSFlightData.Airport.Gate.class, value);

    }

   /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightServiceTypeIATACode", scope = SFDSFlightData.Flight.class)
    public JAXBElement<String> createSFDSFlightDataFlightFlightServiceTypeIATACode(String value) {
        return new JAXBElement<String>(_FlightFilterDataFlightServiceTypeIATACode_QNAME, String.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight.MasterFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "MasterFlight", scope = SFDSFlightData.Flight.class)
    public JAXBElement<SFDSFlightData.Flight.MasterFlight> createSFDSFlightDataFlightMasterFlight(SFDSFlightData.Flight.MasterFlight value) {
        return new JAXBElement<SFDSFlightData.Flight.MasterFlight>(_SFDSFlightDataFlightMasterFlight_QNAME, SFDSFlightData.Flight.MasterFlight.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightTransitCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightTransitCode", scope = SFDSFlightData.Flight.class)
    public JAXBElement<FlightTransitCode> createSFDSFlightDataFlightFlightTransitCode(FlightTransitCode value) {
        return new JAXBElement<FlightTransitCode>(_SFDSFlightDataFlightFlightTransitCode_QNAME, FlightTransitCode.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "IsGeneralAviationFlight", scope = SFDSFlightData.Flight.class)
    public JAXBElement<Boolean> createSFDSFlightDataFlightIsGeneralAviationFlight(Boolean value) {
        return new JAXBElement<Boolean>(_SFDSFlightDataFlightIsGeneralAviationFlight_QNAME, Boolean.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightOperatesOvernight", scope = SFDSFlightData.Flight.class)
    public JAXBElement<Boolean> createSFDSFlightDataFlightFlightOperatesOvernight(Boolean value) {
        return new JAXBElement<Boolean>(_SFDSFlightDataFlightFlightOperatesOvernight_QNAME, Boolean.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CodeShareStatus", scope = SFDSFlightData.Flight.class)
    public JAXBElement<String> createSFDSFlightDataFlightCodeShareStatus(String value) {
        return new JAXBElement<String>(_FlightFilterDataCodeShareStatus_QNAME, String.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSeason", scope = SFDSFlightData.Flight.class)
    public JAXBElement<String> createSFDSFlightDataFlightFlightSeason(String value) {
        return new JAXBElement<String>(_SFDSFlightDataFlightFlightSeason_QNAME, String.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMP.FlightSectorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightSectorCode", scope = SFDSFlightData.Flight.class)
    public JAXBElement<FlightSectorCode> createSFDSFlightDataFlightFlightSectorCode(FlightSectorCode value) {
        return new JAXBElement<FlightSectorCode>(_BasicDataLocationFlightSectorCode_QNAME, FlightSectorCode.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightClassificationCode", scope = SFDSFlightData.Flight.class)
    public JAXBElement<String> createSFDSFlightDataFlightFlightClassificationCode(String value) {
        return new JAXBElement<String>(_SFDSFlightDataFlightFlightClassificationCode_QNAME, String.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "IsTransferFlight", scope = SFDSFlightData.Flight.class)
    public JAXBElement<Boolean> createSFDSFlightDataFlightIsTransferFlight(Boolean value) {
        return new JAXBElement<Boolean>(_SFDSFlightDataFlightIsTransferFlight_QNAME, Boolean.class, SFDSFlightData.Flight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight.LinkedFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "LinkedFlight", scope = SFDSFlightData.Flight.class)
    public JAXBElement<SFDSFlightData.Flight.LinkedFlight> createSFDSFlightDataFlightLinkedFlight(SFDSFlightData.Flight.LinkedFlight value) {
        return new JAXBElement<SFDSFlightData.Flight.LinkedFlight>(_SFDSFlightDataFlightLinkedFlight_QNAME, SFDSFlightData.Flight.LinkedFlight.class, SFDSFlightData.Flight.class, value);
    }

/**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinTypeCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinTypeCode", scope = SFDSFlightData.Airport.Checkin.class)
    public JAXBElement<CheckinTypeCode> createSFDSFlightDataAirportCheckinCheckinTypeCode(CheckinTypeCode value) {
        return new JAXBElement<CheckinTypeCode>(_CheckinCheckinTypeCode_QNAME, CheckinTypeCode.class, SFDSFlightData.Airport.Checkin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CheckinDeskRange", scope = SFDSFlightData.Airport.Checkin.class)
    public JAXBElement<String> createSFDSFlightDataAirportCheckinCheckinDeskRange(String value) {
        return new JAXBElement<String>(_SFDSFlightDataAirportCheckinCheckinDeskRange_QNAME, String.class, SFDSFlightData.Airport.Checkin.class, value);
    }


/**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PreviousStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesPreviousStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesPreviousStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "ThirdStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesThirdStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesThirdStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SixthStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesSixthStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesSixthStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "NextStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesNextStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesNextStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FirstStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesFirstStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesFirstStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SecondStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesSecondStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesSecondStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FifthStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesFifthStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesFifthStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "OriginStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesOriginStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesOriginStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FourthStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesFourthStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesFourthStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "EstimatedFlightDuration", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<Duration> createSFDSFlightDataOperationalTimesEstimatedFlightDuration(Duration value) {
        return new JAXBElement<Duration>(_FlightDataOperationalTimesEstimatedFlightDuration_QNAME, Duration.class, SFDSFlightData.OperationalTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "DestinationStationScheduledDateTime", scope = SFDSFlightData.OperationalTimes.class)
    public JAXBElement<XMLGregorianCalendar> createSFDSFlightDataOperationalTimesDestinationStationScheduledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlightDataOperationalTimesDestinationStationScheduledDateTime_QNAME, XMLGregorianCalendar.class, SFDSFlightData.OperationalTimes.class, value);
    }
 /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "FlightIdentity", scope = SFDSFlightData.Public.class)
    public JAXBElement<String> createSFDSFlightDataPublicFlightIdentity(String value) {
        return new JAXBElement<String>(_ResourceDataCheckinOperationIdentificationFlightIdentity_QNAME, String.class, SFDSFlightData.Public.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "CarrierIATACode", scope = SFDSFlightData.Public.class)
    public JAXBElement<String> createSFDSFlightDataPublicCarrierIATACode(String value) {
        return new JAXBElement<String>(_FlightFilterDataCarrierIATACode_QNAME, String.class, SFDSFlightData.Public.class, value);
    }


  /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "SecureStandIsRequired", scope = SFDSFlightData.Airport.class)
    public JAXBElement<Boolean> createSFDSFlightDataAirportSecureStandIsRequired(Boolean value) {
        return new JAXBElement<Boolean>(_FlightDataAirportSecureStandIsRequired_QNAME, Boolean.class, SFDSFlightData.Airport.class, value);
    }

 /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PassengerTerminalCode", scope = SFDSFlightData.Airport.class)
    public JAXBElement<String> createSFDSFlightDataAirportPassengerTerminalCode(String value) {
        return new JAXBElement<String>(_FlightDataAirportPassengerTerminalCode_QNAME, String.class, SFDSFlightData.Airport.class, value);
    }

  /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "StandPosition", scope = SFDSFlightData.Airport.class)
    public JAXBElement<String> createSFDSFlightDataAirportStandPosition(String value) {
        return new JAXBElement<String>(_FlightDataAirportStandPosition_QNAME, String.class, SFDSFlightData.Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "BaggageReclaimCarouselID", scope = SFDSFlightData.Airport.BaggageReclaimCarousel.class)
    public JAXBElement<String> createSFDSFlightDataAirportBaggageReclaimCarouselBaggageReclaimCarouselID(String value) {
        return new JAXBElement<String>(_SFDSFlightDataAirportBaggageReclaimCarouselBaggageReclaimCarouselID_QNAME, String.class, SFDSFlightData.Airport.BaggageReclaimCarousel.class, value);
    }

 /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFDSFlightData.Public }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Public", scope = SFDSFlightData.class)
    public JAXBElement<SFDSFlightData.Public> createSFDSFlightDataPublic(SFDSFlightData.Public value) {
        return new JAXBElement<SFDSFlightData.Public>(_FlightDataPublic_QNAME, SFDSFlightData.Public.class, SFDSFlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFDSFlightData.Aircraft }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Aircraft", scope = SFDSFlightData.class)
    public JAXBElement<SFDSFlightData.Aircraft> createSFDSFlightDataAircraft(SFDSFlightData.Aircraft value) {
        return new JAXBElement<SFDSFlightData.Aircraft>(_FlightDataAircraft_QNAME, SFDSFlightData.Aircraft.class, SFDSFlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFDSFlightData.PortsOfCall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "PortsOfCall", scope = SFDSFlightData.class)
    public JAXBElement<SFDSFlightData.PortsOfCall> createSFDSFlightDataPortsOfCall(SFDSFlightData.PortsOfCall value) {
        return new JAXBElement<SFDSFlightData.PortsOfCall>(_FlightDataPortsOfCall_QNAME, SFDSFlightData.PortsOfCall.class, SFDSFlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFDSFlightData.OperationalTimes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "OperationalTimes", scope = SFDSFlightData.class)
    public JAXBElement<SFDSFlightData.OperationalTimes> createSFDSFlightDataOperationalTimes(SFDSFlightData.OperationalTimes value) {
        return new JAXBElement<SFDSFlightData.OperationalTimes>(_FlightDataOperationalTimes_QNAME, SFDSFlightData.OperationalTimes.class, SFDSFlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFDSFlightData.Airport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Airport", scope = SFDSFlightData.class)
    public JAXBElement<SFDSFlightData.Airport> createSFDSFlightDataAirport(SFDSFlightData.Airport value) {
        return new JAXBElement<SFDSFlightData.Airport>(_FlightDataAirport_QNAME, SFDSFlightData.Airport.class, SFDSFlightData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFDSFlightData.Flight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.ultra-as.com", name = "Flight", scope = SFDSFlightData.class)
    public JAXBElement<SFDSFlightData.Flight> createSFDSFlightDataFlight(SFDSFlightData.Flight value) {
        return new JAXBElement<SFDSFlightData.Flight>(_FlightDataFlight_QNAME, SFDSFlightData.Flight.class, SFDSFlightData.class, value);
    }

    
    


    
}

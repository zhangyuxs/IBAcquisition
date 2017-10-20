//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.01 ʱ�� 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BasicDataCategory�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="BasicDataCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="AircraftRegistration"/>
 *     &lt;enumeration value="AircraftSubtype"/>
 *     &lt;enumeration value="Airline"/>
 *     &lt;enumeration value="BaggageMakeupPosition"/>
 *     &lt;enumeration value="BaggageReclaimCarousel"/>
 *     &lt;enumeration value="BoardingBridge"/>
 *     &lt;enumeration value="CAACDelayCategory"/>
 *     &lt;enumeration value="CAACDelayCode"/>
 *     &lt;enumeration value="CheckinAirlineClass"/>
 *     &lt;enumeration value="CheckinClass"/>
 *     &lt;enumeration value="CheckinDesk"/>
 *     &lt;enumeration value="DelayCode"/>
 *     &lt;enumeration value="FlightClassification"/>
 *     &lt;enumeration value="FlightNature"/>
 *     &lt;enumeration value="FlightSector"/>
 *     &lt;enumeration value="FlightServiceType"/>
 *     &lt;enumeration value="Gate"/>
 *     &lt;enumeration value="Handler"/>
 *     &lt;enumeration value="LocalisationText"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Runway"/>
 *     &lt;enumeration value="Stand"/>
 *     &lt;enumeration value="Terminal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BasicDataCategory")
@XmlEnum
public enum BasicDataCategory {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("AircraftRegistration")
    AIRCRAFT_REGISTRATION("AircraftRegistration"),
    @XmlEnumValue("AircraftSubtype")
    AIRCRAFT_SUBTYPE("AircraftSubtype"),
    @XmlEnumValue("Airline")
    AIRLINE("Airline"),
    @XmlEnumValue("BaggageMakeupPosition")
    BAGGAGE_MAKEUP_POSITION("BaggageMakeupPosition"),
    @XmlEnumValue("BaggageReclaimCarousel")
    BAGGAGE_RECLAIM_CAROUSEL("BaggageReclaimCarousel"),
    @XmlEnumValue("BoardingBridge")
    BOARDING_BRIDGE("BoardingBridge"),
    @XmlEnumValue("CAACDelayCategory")
    CAAC_DELAY_CATEGORY("CAACDelayCategory"),
    @XmlEnumValue("CAACDelayCode")
    CAAC_DELAY_CODE("CAACDelayCode"),
    @XmlEnumValue("CheckinAirlineClass")
    CHECKIN_AIRLINE_CLASS("CheckinAirlineClass"),
    @XmlEnumValue("CheckinClass")
    CHECKIN_CLASS("CheckinClass"),
    @XmlEnumValue("CheckinDesk")
    CHECKIN_DESK("CheckinDesk"),
    @XmlEnumValue("DelayCode")
    DELAY_CODE("DelayCode"),
    @XmlEnumValue("FlightClassification")
    FLIGHT_CLASSIFICATION("FlightClassification"),
    @XmlEnumValue("FlightNature")
    FLIGHT_NATURE("FlightNature"),
    @XmlEnumValue("FlightSector")
    FLIGHT_SECTOR("FlightSector"),
    @XmlEnumValue("FlightServiceType")
    FLIGHT_SERVICE_TYPE("FlightServiceType"),
    @XmlEnumValue("Gate")
    GATE("Gate"),
    @XmlEnumValue("Handler")
    HANDLER("Handler"),
    @XmlEnumValue("LocalisationText")
    LOCALISATION_TEXT("LocalisationText"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Runway")
    RUNWAY("Runway"),
    @XmlEnumValue("Stand")
    STAND("Stand"),
    @XmlEnumValue("Terminal")
    TERMINAL("Terminal");
    private final String value;

    BasicDataCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BasicDataCategory fromValue(String v) {
        for (BasicDataCategory c: BasicDataCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

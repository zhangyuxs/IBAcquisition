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
 * <p>RemarkType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="RemarkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirsidePublicDepartures"/>
 *     &lt;enumeration value="BaggageHall"/>
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="LandsidePublicDepartures"/>
 *     &lt;enumeration value="PublicArrivals"/>
 *     &lt;enumeration value="Staff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemarkType")
@XmlEnum
public enum RemarkType {

    @XmlEnumValue("AirsidePublicDepartures")
    AIRSIDE_PUBLIC_DEPARTURES("AirsidePublicDepartures"),
    @XmlEnumValue("BaggageHall")
    BAGGAGE_HALL("BaggageHall"),
    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("LandsidePublicDepartures")
    LANDSIDE_PUBLIC_DEPARTURES("LandsidePublicDepartures"),
    @XmlEnumValue("PublicArrivals")
    PUBLIC_ARRIVALS("PublicArrivals"),
    @XmlEnumValue("Staff")
    STAFF("Staff");
    private final String value;

    RemarkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemarkType fromValue(String v) {
        for (RemarkType c: RemarkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

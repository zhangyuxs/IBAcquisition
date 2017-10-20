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
 * <p>FlightWindow�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="FlightWindow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D0"/>
 *     &lt;enumeration value="D+1"/>
 *     &lt;enumeration value="D+2"/>
 *     &lt;enumeration value="D+3"/>
 *     &lt;enumeration value="D+4"/>
 *     &lt;enumeration value="D+5"/>
 *     &lt;enumeration value="D+6"/>
 *     &lt;enumeration value="D+7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightWindow")
@XmlEnum
public enum FlightWindow {

    @XmlEnumValue("D0")
    D_0("D0"),
    @XmlEnumValue("D+1")
    D_1("D+1"),
    @XmlEnumValue("D+2")
    D_2("D+2"),
    @XmlEnumValue("D+3")
    D_3("D+3"),
    @XmlEnumValue("D+4")
    D_4("D+4"),
    @XmlEnumValue("D+5")
    D_5("D+5"),
    @XmlEnumValue("D+6")
    D_6("D+6"),
    @XmlEnumValue("D+7")
    D_7("D+7");
    private final String value;

    FlightWindow(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightWindow fromValue(String v) {
        for (FlightWindow c: FlightWindow.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

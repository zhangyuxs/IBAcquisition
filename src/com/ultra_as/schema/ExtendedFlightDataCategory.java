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
 * <p>ExtendedFlightDataCategory�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedFlightDataCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="VIPs"/>
 *     &lt;enumeration value="Tasks"/>
 *     &lt;enumeration value="Vehicles"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtendedFlightDataCategory")
@XmlEnum
public enum ExtendedFlightDataCategory {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("VIPs")
    VI_PS("VIPs"),
    @XmlEnumValue("Tasks")
    TASKS("Tasks"),
    @XmlEnumValue("Vehicles")
    VEHICLES("Vehicles");
    private final String value;

    ExtendedFlightDataCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendedFlightDataCategory fromValue(String v) {
        for (ExtendedFlightDataCategory c: ExtendedFlightDataCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

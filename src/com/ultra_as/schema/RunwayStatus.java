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
 * <p>RunwayStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="RunwayStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Serviceable"/>
 *     &lt;enumeration value="Unserviceable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RunwayStatus")
@XmlEnum
public enum RunwayStatus {

    @XmlEnumValue("Serviceable")
    SERVICEABLE("Serviceable"),
    @XmlEnumValue("Unserviceable")
    UNSERVICEABLE("Unserviceable");
    private final String value;

    RunwayStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RunwayStatus fromValue(String v) {
        for (RunwayStatus c: RunwayStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

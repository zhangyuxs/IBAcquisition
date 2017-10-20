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
 * <p>BaggageReclaimCarouselRole�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="BaggageReclaimCarouselRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Primary"/>
 *     &lt;enumeration value="Secondary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaggageReclaimCarouselRole")
@XmlEnum
public enum BaggageReclaimCarouselRole {

    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary");
    private final String value;

    BaggageReclaimCarouselRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageReclaimCarouselRole fromValue(String v) {
        for (BaggageReclaimCarouselRole c: BaggageReclaimCarouselRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

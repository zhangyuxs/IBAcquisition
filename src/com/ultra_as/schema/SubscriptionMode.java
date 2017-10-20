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
 * <p>SubscriptionMode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SnapshotOnly"/>
 *     &lt;enumeration value="SnapshotThenUpdates"/>
 *     &lt;enumeration value="UpdatesOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionMode")
@XmlEnum
public enum SubscriptionMode {

    @XmlEnumValue("SnapshotOnly")
    SNAPSHOT_ONLY("SnapshotOnly"),
    @XmlEnumValue("SnapshotThenUpdates")
    SNAPSHOT_THEN_UPDATES("SnapshotThenUpdates"),
    @XmlEnumValue("UpdatesOnly")
    UPDATES_ONLY("UpdatesOnly");
    private final String value;

    SubscriptionMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionMode fromValue(String v) {
        for (SubscriptionMode c: SubscriptionMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

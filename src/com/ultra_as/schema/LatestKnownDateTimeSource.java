//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LatestKnownDateTimeSource的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LatestKnownDateTimeSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Estimated"/>
 *     &lt;enumeration value="Scheduled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LatestKnownDateTimeSource")
@XmlEnum
public enum LatestKnownDateTimeSource {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled");
    private final String value;

    LatestKnownDateTimeSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LatestKnownDateTimeSource fromValue(String v) {
        for (LatestKnownDateTimeSource c: LatestKnownDateTimeSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

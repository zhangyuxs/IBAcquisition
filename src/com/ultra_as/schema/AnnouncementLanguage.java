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
 * <p>AnnouncementLanguage的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AnnouncementLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="30"/>
 *     &lt;enumeration value="Chinese"/>
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="Korean"/>
 *     &lt;enumeration value="Japanese"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnnouncementLanguage")
@XmlEnum
public enum AnnouncementLanguage {

    @XmlEnumValue("Chinese")
    CHINESE("Chinese"),
    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("Korean")
    KOREAN("Korean"),
    @XmlEnumValue("Japanese")
    JAPANESE("Japanese");
    private final String value;

    AnnouncementLanguage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnnouncementLanguage fromValue(String v) {
        for (AnnouncementLanguage c: AnnouncementLanguage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

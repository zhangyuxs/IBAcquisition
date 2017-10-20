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
 * <p>ResourceRole的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Baggage Carousel"/>
 *     &lt;enumeration value="Baggage Make-up Position"/>
 *     &lt;enumeration value="Boarding Bridge PCA"/>
 *     &lt;enumeration value="Boarding Bridge Power"/>
 *     &lt;enumeration value="Boarding Bridge"/>
 *     &lt;enumeration value="Check-in"/>
 *     &lt;enumeration value="Gate"/>
 *     &lt;enumeration value="Stand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceRole")
@XmlEnum
public enum ResourceRole {

    @XmlEnumValue("Baggage Carousel")
    BAGGAGE_CAROUSEL("Baggage Carousel"),
    @XmlEnumValue("Baggage Make-up Position")
    BAGGAGE_MAKE_UP_POSITION("Baggage Make-up Position"),
    @XmlEnumValue("Boarding Bridge PCA")
    BOARDING_BRIDGE_PCA("Boarding Bridge PCA"),
    @XmlEnumValue("Boarding Bridge Power")
    BOARDING_BRIDGE_POWER("Boarding Bridge Power"),
    @XmlEnumValue("Boarding Bridge")
    BOARDING_BRIDGE("Boarding Bridge"),
    @XmlEnumValue("Check-in")
    CHECK_IN("Check-in"),
    @XmlEnumValue("Gate")
    GATE("Gate"),
    @XmlEnumValue("Stand")
    STAND("Stand");
    private final String value;

    ResourceRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceRole fromValue(String v) {
        for (ResourceRole c: ResourceRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

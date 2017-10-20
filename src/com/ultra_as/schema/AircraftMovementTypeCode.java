//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AircraftMovementTypeCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AircraftMovementTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AircraftMovementTypeCode")
@XmlEnum
public enum AircraftMovementTypeCode {


    /**
     * Archived but incomplete tow.
     * 
     */
    A,

    /**
     * Created on system initialisation to represent existing state when cutting over.
     * 
     */
    C,

    /**
     * Open tow. Allows tow off/on time to be set without having a complete parking sequence.
     * 
     */
    O,

    /**
     * Restricted tow.
     * 
     */
    R,

    /**
     * Slide back.
     * 
     */
    S,

    /**
     * Tow.
     * 
     */
    T;

    public String value() {
        return name();
    }

    public static AircraftMovementTypeCode fromValue(String v) {
        return valueOf(v);
    }

}

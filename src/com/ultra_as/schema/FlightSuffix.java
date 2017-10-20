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
 * <p>FlightSuffix的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FlightSuffix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightSuffix")
@XmlEnum
public enum FlightSuffix {

    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P,
    Q,
    R,
    S,
    T,
    U,
    V,
    W,
    X,
    Y,
    Z;

    public String value() {
        return name();
    }

    public static FlightSuffix fromValue(String v) {
        return valueOf(v);
    }

}

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Complete detail of a single CAAC delay event including category, code, duration and flag to indicate if airport delay is airport originated. Used to provide additional narrative on operational events such as delays and diversions to allow for corrective action to be taken and is not intended as a mechanism for apportioning blame.
 * 
 * <p>CAACDelayDetails complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CAACDelayDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAACDelayCategory" type="{http://schema.ultra-as.com}CAACDelayCategory" minOccurs="0"/>
 *         &lt;element name="CAACDelayCode" type="{http://schema.ultra-as.com}CAACDelayCode" minOccurs="0"/>
 *         &lt;element name="CAACDelayDuration" type="{http://schema.ultra-as.com}CAACDelayDuration" minOccurs="0"/>
 *         &lt;element name="CAACDelayAirportOriginated" type="{http://schema.ultra-as.com}CAACDelayAirportOriginated" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAACDelayDetails", propOrder = {
    "caacDelayCategory",
    "caacDelayCode",
    "caacDelayDuration",
    "caacDelayAirportOriginated"
})
public class CAACDelayDetails {

    @XmlElementRef(name = "CAACDelayCategory", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caacDelayCategory;
    @XmlElementRef(name = "CAACDelayCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caacDelayCode;
    @XmlElementRef(name = "CAACDelayDuration", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> caacDelayDuration;
    @XmlElementRef(name = "CAACDelayAirportOriginated", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> caacDelayAirportOriginated;

    /**
     * 获取caacDelayCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCAACDelayCategory() {
        return caacDelayCategory;
    }

    /**
     * 设置caacDelayCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCAACDelayCategory(JAXBElement<String> value) {
        this.caacDelayCategory = value;
    }

    /**
     * 获取caacDelayCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCAACDelayCode() {
        return caacDelayCode;
    }

    /**
     * 设置caacDelayCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCAACDelayCode(JAXBElement<String> value) {
        this.caacDelayCode = value;
    }

    /**
     * 获取caacDelayDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getCAACDelayDuration() {
        return caacDelayDuration;
    }

    /**
     * 设置caacDelayDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setCAACDelayDuration(JAXBElement<Duration> value) {
        this.caacDelayDuration = value;
    }

    /**
     * 获取caacDelayAirportOriginated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCAACDelayAirportOriginated() {
        return caacDelayAirportOriginated;
    }

    /**
     * 设置caacDelayAirportOriginated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCAACDelayAirportOriginated(JAXBElement<Boolean> value) {
        this.caacDelayAirportOriginated = value;
    }

}

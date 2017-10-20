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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Complete detail of a single irregularity event including numeric and alphabetic codes and duration. Used to provide additional narrative on operational events such as delays and diversions to allow for corrective action to be taken and is not intended as a mechanism for apportioning blame.
 * 
 * <p>IrregularityDetails complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IrregularityDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IrregularityAlphaIATACode" type="{http://schema.ultra-as.com}IrregularityAlphaIATACode" minOccurs="0"/>
 *         &lt;element name="IrregularityDuration" type="{http://schema.ultra-as.com}IrregularityDuration"/>
 *         &lt;element name="IrregularityNumericIATACode" type="{http://schema.ultra-as.com}IrregularityNumericIATACode" minOccurs="0"/>
 *         &lt;element name="IrregularityRole" type="{http://schema.ultra-as.com}IrregularityRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrregularityDetails", propOrder = {
    "irregularityAlphaIATACode",
    "irregularityDuration",
    "irregularityNumericIATACode",
    "irregularityRole"
})
public class IrregularityDetails {

    @XmlElementRef(name = "IrregularityAlphaIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> irregularityAlphaIATACode;
    @XmlElement(name = "IrregularityDuration", required = true, nillable = true)
    protected Duration irregularityDuration;
    @XmlElementRef(name = "IrregularityNumericIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> irregularityNumericIATACode;
    @XmlElement(name = "IrregularityRole", required = true)
    @XmlSchemaType(name = "string")
    protected IrregularityRole irregularityRole;

    /**
     * 获取irregularityAlphaIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIrregularityAlphaIATACode() {
        return irregularityAlphaIATACode;
    }

    /**
     * 设置irregularityAlphaIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIrregularityAlphaIATACode(JAXBElement<String> value) {
        this.irregularityAlphaIATACode = value;
    }

    /**
     * 获取irregularityDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getIrregularityDuration() {
        return irregularityDuration;
    }

    /**
     * 设置irregularityDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setIrregularityDuration(Duration value) {
        this.irregularityDuration = value;
    }

    /**
     * 获取irregularityNumericIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIrregularityNumericIATACode() {
        return irregularityNumericIATACode;
    }

    /**
     * 设置irregularityNumericIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIrregularityNumericIATACode(JAXBElement<String> value) {
        this.irregularityNumericIATACode = value;
    }

    /**
     * 获取irregularityRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IrregularityRole }
     *     
     */
    public IrregularityRole getIrregularityRole() {
        return irregularityRole;
    }

    /**
     * 设置irregularityRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IrregularityRole }
     *     
     */
    public void setIrregularityRole(IrregularityRole value) {
        this.irregularityRole = value;
    }

}

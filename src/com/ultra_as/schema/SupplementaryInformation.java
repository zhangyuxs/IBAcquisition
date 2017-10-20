//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A single piece of supplementary information of a particular type.
 * 
 * <p>SupplementaryInformation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplementaryInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplementaryInformationText" type="{http://schema.ultra-as.com}SupplementaryInformationText"/>
 *         &lt;element name="SupplementaryInformationType" type="{http://schema.ultra-as.com}SupplementaryInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryInformation", propOrder = {
    "supplementaryInformationText",
    "supplementaryInformationType"
})
public class SupplementaryInformation {

    @XmlElement(name = "SupplementaryInformationText", required = true, nillable = true)
    protected String supplementaryInformationText;
    @XmlElement(name = "SupplementaryInformationType", required = true)
    @XmlSchemaType(name = "string")
    protected SupplementaryInformationType supplementaryInformationType;

    /**
     * 获取supplementaryInformationText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryInformationText() {
        return supplementaryInformationText;
    }

    /**
     * 设置supplementaryInformationText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryInformationText(String value) {
        this.supplementaryInformationText = value;
    }

    /**
     * 获取supplementaryInformationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryInformationType }
     *     
     */
    public SupplementaryInformationType getSupplementaryInformationType() {
        return supplementaryInformationType;
    }

    /**
     * 设置supplementaryInformationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryInformationType }
     *     
     */
    public void setSupplementaryInformationType(SupplementaryInformationType value) {
        this.supplementaryInformationType = value;
    }

}

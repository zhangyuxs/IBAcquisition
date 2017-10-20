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
 * A single remark code of a particular type.
 * 
 * <p>Remark complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Remark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemarkCode" type="{http://schema.ultra-as.com}RemarkCode"/>
 *         &lt;element name="RemarkType" type="{http://schema.ultra-as.com}RemarkType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remark", propOrder = {
    "remarkCode",
    "remarkType"
})
public class Remark {

    @XmlElement(name = "RemarkCode", required = true, nillable = true)
    protected String remarkCode;
    @XmlElement(name = "RemarkType", required = true)
    @XmlSchemaType(name = "string")
    protected RemarkType remarkType;

    /**
     * 获取remarkCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkCode() {
        return remarkCode;
    }

    /**
     * 设置remarkCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkCode(String value) {
        this.remarkCode = value;
    }

    /**
     * 获取remarkType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarkType() {
        return remarkType;
    }

    /**
     * 设置remarkType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarkType(RemarkType value) {
        this.remarkType = value;
    }

}

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


/**
 * The internal or published operation type codes for a flight.
 * 
 * <p>OperationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OperationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationTypeCode" type="{http://schema.ultra-as.com}OperationTypeCode" minOccurs="0"/>
 *         &lt;element name="OperationTypeRole" type="{http://schema.ultra-as.com}OperationTypeRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationType", propOrder = {
    "operationTypeCode",
    "operationTypeRole"
})
public class OperationType {

    @XmlElementRef(name = "OperationTypeCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationTypeCode;
    @XmlElement(name = "OperationTypeRole", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected OperationTypeRole operationTypeRole;

    /**
     * 获取operationTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationTypeCode() {
        return operationTypeCode;
    }

    /**
     * 设置operationTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationTypeCode(JAXBElement<String> value) {
        this.operationTypeCode = value;
    }

    /**
     * 获取operationTypeRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationTypeRole }
     *     
     */
    public OperationTypeRole getOperationTypeRole() {
        return operationTypeRole;
    }

    /**
     * 设置operationTypeRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTypeRole }
     *     
     */
    public void setOperationTypeRole(OperationTypeRole value) {
        this.operationTypeRole = value;
    }

}

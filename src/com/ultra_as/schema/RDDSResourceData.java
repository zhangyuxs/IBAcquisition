//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.28 时间 06:37:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestType" type="{http://schema.ultra-as.com}RequestType"/>
 *         &lt;element name="ResourceData" type="{http://schema.ultra-as.com}ResourceData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isCompleteRecord" use="required" type="{http://schema.ultra-as.com}IsCompleteRecord" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestType",
    "resourceData"
})
@XmlRootElement(name = "RDDSResourceData")
public class RDDSResourceData {

    @XmlElement(name = "RequestType", required = true)
    @XmlSchemaType(name = "string")
    protected RequestType requestType;
    @XmlElement(name = "ResourceData", required = true)
    protected ResourceData resourceData;
    @XmlAttribute(name = "isCompleteRecord", required = true)
    protected boolean isCompleteRecord;

    /**
     * 获取requestType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * 设置requestType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * 获取resourceData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceData }
     *     
     */
    public ResourceData getResourceData() {
        return resourceData;
    }

    /**
     * 设置resourceData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData }
     *     
     */
    public void setResourceData(ResourceData value) {
        this.resourceData = value;
    }

    /**
     * 获取isCompleteRecord属性的值。
     * 
     */
    public boolean isIsCompleteRecord() {
        return isCompleteRecord;
    }

    /**
     * 设置isCompleteRecord属性的值。
     * 
     */
    public void setIsCompleteRecord(boolean value) {
        this.isCompleteRecord = value;
    }

}

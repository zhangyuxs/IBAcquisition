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
 * Description of an individual agent and the specific handling services they provide for a given flight.
 * 
 * <p>HandlingAgent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HandlingAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode"/>
 *         &lt;element name="HandlingAgentService" type="{http://schema.ultra-as.com}HandlingAgentService"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandlingAgent", propOrder = {
    "handlingAgentIATACode",
    "handlingAgentService"
})
public class HandlingAgent {

    @XmlElement(name = "HandlingAgentIATACode", required = true, nillable = true)
    protected String handlingAgentIATACode;
    @XmlElement(name = "HandlingAgentService", required = true)
    @XmlSchemaType(name = "string")
    protected HandlingAgentService handlingAgentService;

    /**
     * 获取handlingAgentIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingAgentIATACode() {
        return handlingAgentIATACode;
    }

    /**
     * 设置handlingAgentIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingAgentIATACode(String value) {
        this.handlingAgentIATACode = value;
    }

    /**
     * 获取handlingAgentService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HandlingAgentService }
     *     
     */
    public HandlingAgentService getHandlingAgentService() {
        return handlingAgentService;
    }

    /**
     * 设置handlingAgentService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingAgentService }
     *     
     */
    public void setHandlingAgentService(HandlingAgentService value) {
        this.handlingAgentService = value;
    }

}

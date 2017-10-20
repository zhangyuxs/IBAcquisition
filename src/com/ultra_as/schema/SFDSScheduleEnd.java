//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.28 时间 06:39:24 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="NumberOfRecords" type="{http://schema.ultra-as.com}NumberOfRecords"/>
 *         &lt;element name="RequestID" type="{http://schema.ultra-as.com}RequestID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberOfRecords",
    "requestID"
})
@XmlRootElement(name = "SFDSScheduleEnd")
public class SFDSScheduleEnd {

	@XmlElementRef(name = "NumberOfRecords", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfRecords;
    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "integer")
    protected int requestID;

    /**
     * 获取numberOfRecords属性的值。
     * 
     */
    public JAXBElement<Integer> getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * 设置numberOfRecords属性的值。
     * 
     */
    public void setNumberOfRecords(JAXBElement<Integer> value) {
        this.numberOfRecords = value;
    }


    /**
     * 获取requestID属性的值。
     * 
     */
    public int getRequestID() {
        return requestID;
    }

    /**
     * 设置requestID属性的值。
     * 
     */
    public void setRequestID(int value) {
        this.requestID = value;
    }

}

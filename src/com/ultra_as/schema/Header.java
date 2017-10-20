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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains information on message type, routing, etc.
 * 
 * <p>Header complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageSentDateTime" type="{http://schema.ultra-as.com}MessageSentDateTime"/>
 *         &lt;element name="MessageSequenceNumber" type="{http://schema.ultra-as.com}MessageSequenceNumber"/>
 *         &lt;element name="MessageType" type="{http://schema.ultra-as.com}MessageType"/>
 *         &lt;element name="SourceSystemID" type="{http://schema.ultra-as.com}SourceSystemID"/>
 *         &lt;element name="DestinationSystemID" type="{http://schema.ultra-as.com}DestinationSystemID"/>
 *         &lt;element name="MessageOriginatorID" type="{http://schema.ultra-as.com}MessageOriginatorID" minOccurs="0"/>
 *         &lt;element name="OriginatorDateTime" type="{http://schema.ultra-as.com}OriginatorDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "messageSentDateTime",
    "messageSequenceNumber",
    "messageType",
    "sourceSystemID",
    "destinationSystemID",
    "messageOriginatorID",
    "originatorDateTime"
})
public class Header {

    @XmlElement(name = "MessageSentDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageSentDateTime;
    @XmlElement(name = "MessageSequenceNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int messageSequenceNumber;
    @XmlElement(name = "MessageType", required = true)
    protected String messageType;
    @XmlElement(name = "SourceSystemID", required = true)
    protected String sourceSystemID;
    @XmlElement(name = "DestinationSystemID", required = true)
    protected String destinationSystemID;
    @XmlElement(name = "MessageOriginatorID")
    protected String messageOriginatorID;
    @XmlElement(name = "OriginatorDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originatorDateTime;

    /**
     * 获取messageSentDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageSentDateTime() {
        return messageSentDateTime;
    }

    /**
     * 设置messageSentDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageSentDateTime(XMLGregorianCalendar value) {
        this.messageSentDateTime = value;
    }

    /**
     * 获取messageSequenceNumber属性的值。
     * 
     */
    public int getMessageSequenceNumber() {
        return messageSequenceNumber;
    }

    /**
     * 设置messageSequenceNumber属性的值。
     * 
     */
    public void setMessageSequenceNumber(int value) {
        this.messageSequenceNumber = value;
    }

    /**
     * 获取messageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * 设置messageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * 获取sourceSystemID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemID() {
        return sourceSystemID;
    }

    /**
     * 设置sourceSystemID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemID(String value) {
        this.sourceSystemID = value;
    }

    /**
     * 获取destinationSystemID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationSystemID() {
        return destinationSystemID;
    }

    /**
     * 设置destinationSystemID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationSystemID(String value) {
        this.destinationSystemID = value;
    }

    /**
     * 获取messageOriginatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageOriginatorID() {
        return messageOriginatorID;
    }

    /**
     * 设置messageOriginatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageOriginatorID(String value) {
        this.messageOriginatorID = value;
    }

    /**
     * 获取originatorDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginatorDateTime() {
        return originatorDateTime;
    }

    /**
     * 设置originatorDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginatorDateTime(XMLGregorianCalendar value) {
        this.originatorDateTime = value;
    }

}

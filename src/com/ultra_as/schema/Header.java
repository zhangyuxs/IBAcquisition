//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.01 ʱ�� 09:59:39 PM CST 
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
 * <p>Header complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmessageSentDateTime���Ե�ֵ��
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
     * ����messageSentDateTime���Ե�ֵ��
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
     * ��ȡmessageSequenceNumber���Ե�ֵ��
     * 
     */
    public int getMessageSequenceNumber() {
        return messageSequenceNumber;
    }

    /**
     * ����messageSequenceNumber���Ե�ֵ��
     * 
     */
    public void setMessageSequenceNumber(int value) {
        this.messageSequenceNumber = value;
    }

    /**
     * ��ȡmessageType���Ե�ֵ��
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
     * ����messageType���Ե�ֵ��
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
     * ��ȡsourceSystemID���Ե�ֵ��
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
     * ����sourceSystemID���Ե�ֵ��
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
     * ��ȡdestinationSystemID���Ե�ֵ��
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
     * ����destinationSystemID���Ե�ֵ��
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
     * ��ȡmessageOriginatorID���Ե�ֵ��
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
     * ����messageOriginatorID���Ե�ֵ��
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
     * ��ȡoriginatorDateTime���Ե�ֵ��
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
     * ����originatorDateTime���Ե�ֵ��
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

//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.05.28 ʱ�� 06:30:26 PM CST 
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTimeRequestReceived" type="{http://schema.ultra-as.com}DateTimeRequestReceived" minOccurs="0"/>
 *         &lt;element name="RejectionReason" type="{http://schema.ultra-as.com}RejectionReason" minOccurs="0"/>
 *         &lt;element name="RequestStatus" type="{http://schema.ultra-as.com}RequestStatus"/>
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
    "dateTimeRequestReceived",
    "rejectionReason",
    "requestStatus"
})
@XmlRootElement(name = "BDDSCancellation")
public class BDDSCancellation {

    @XmlElementRef(name = "DateTimeRequestReceived", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateTimeRequestReceived;
    @XmlElementRef(name = "RejectionReason", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rejectionReason;
    @XmlElement(name = "RequestStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RequestStatus requestStatus;

    /**
     * ��ȡdateTimeRequestReceived���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateTimeRequestReceived() {
        return dateTimeRequestReceived;
    }

    /**
     * ����dateTimeRequestReceived���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateTimeRequestReceived(JAXBElement<XMLGregorianCalendar> value) {
        this.dateTimeRequestReceived = value;
    }

    /**
     * ��ȡrejectionReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejectionReason() {
        return rejectionReason;
    }

    /**
     * ����rejectionReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejectionReason(JAXBElement<String> value) {
        this.rejectionReason = value;
    }

    /**
     * ��ȡrequestStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestStatus }
     *     
     */
    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    /**
     * ����requestStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatus }
     *     
     */
    public void setRequestStatus(RequestStatus value) {
        this.requestStatus = value;
    }

}

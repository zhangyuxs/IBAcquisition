//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.01 ʱ�� 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Collection of transfer flight details.
 * 
 * <p>TransferFlight complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TransferFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="TransferFlightBagCount" type="{http://schema.ultra-as.com}TransferFlightBagCount" minOccurs="0"/>
 *         &lt;element name="TransferFlightIdentity" type="{http://schema.ultra-as.com}TransferFlightIdentity" minOccurs="0"/>
 *         &lt;element name="TransferFlightPassengerCount" type="{http://schema.ultra-as.com}TransferFlightPassengerCount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferFlight", propOrder = {
    "transferFlightBagCount",
    "transferFlightIdentity",
    "transferFlightPassengerCount"
})
public class TransferFlight {

    @XmlElementRef(name = "TransferFlightBagCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> transferFlightBagCount;
    @XmlElementRef(name = "TransferFlightIdentity", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferFlightIdentity;
    @XmlElementRef(name = "TransferFlightPassengerCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> transferFlightPassengerCount;

    /**
     * ��ȡtransferFlightBagCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTransferFlightBagCount() {
        return transferFlightBagCount;
    }

    /**
     * ����transferFlightBagCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTransferFlightBagCount(JAXBElement<Integer> value) {
        this.transferFlightBagCount = value;
    }

    /**
     * ��ȡtransferFlightIdentity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferFlightIdentity() {
        return transferFlightIdentity;
    }

    /**
     * ����transferFlightIdentity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferFlightIdentity(JAXBElement<String> value) {
        this.transferFlightIdentity = value;
    }

    /**
     * ��ȡtransferFlightPassengerCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTransferFlightPassengerCount() {
        return transferFlightPassengerCount;
    }

    /**
     * ����transferFlightPassengerCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTransferFlightPassengerCount(JAXBElement<Integer> value) {
        this.transferFlightPassengerCount = value;
    }

}

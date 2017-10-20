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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification details for a related master flight.
 * 
 * <p>MasterFlight complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MasterFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IATAMasterFlightIdentifier" type="{http://schema.ultra-as.com}IATAMasterFlightIdentifier" minOccurs="0"/>
 *         &lt;element name="FlightIdentity" type="{http://schema.ultra-as.com}FlightIdentity"/>
 *         &lt;element name="FlightRepeatCount" type="{http://schema.ultra-as.com}FlightRepeatCount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterFlight", propOrder = {
    "iataMasterFlightIdentifier",
    "flightIdentity",
    "flightRepeatCount"
})
public class MasterFlight {

    @XmlElement(name = "IATAMasterFlightIdentifier")
    protected IATAMasterFlightIdentifier iataMasterFlightIdentifier;
    @XmlElement(name = "FlightIdentity", required = true, nillable = true)
    protected String flightIdentity;
    @XmlElementRef(name = "FlightRepeatCount", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> flightRepeatCount;

    /**
     * ��ȡiataMasterFlightIdentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IATAMasterFlightIdentifier }
     *     
     */
    public IATAMasterFlightIdentifier getIATAMasterFlightIdentifier() {
        return iataMasterFlightIdentifier;
    }

    /**
     * ����iataMasterFlightIdentifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IATAMasterFlightIdentifier }
     *     
     */
    public void setIATAMasterFlightIdentifier(IATAMasterFlightIdentifier value) {
        this.iataMasterFlightIdentifier = value;
    }

    /**
     * ��ȡflightIdentity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightIdentity() {
        return flightIdentity;
    }

    /**
     * ����flightIdentity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightIdentity(String value) {
        this.flightIdentity = value;
    }

    /**
     * ��ȡflightRepeatCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFlightRepeatCount() {
        return flightRepeatCount;
    }

    /**
     * ����flightRepeatCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFlightRepeatCount(JAXBElement<Integer> value) {
        this.flightRepeatCount = value;
    }

}

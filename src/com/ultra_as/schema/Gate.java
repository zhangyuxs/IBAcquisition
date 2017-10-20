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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Full description of a flight's gate data.
 * 
 * <p>Gate complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Gate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GateBoardingStatus" type="{http://schema.ultra-as.com}GateBoardingStatus" minOccurs="0"/>
 *         &lt;element name="GateCloseDateTime" type="{http://schema.ultra-as.com}GateCloseDateTime" minOccurs="0"/>
 *         &lt;element name="GateNumber" type="{http://schema.ultra-as.com}GateNumber"/>
 *         &lt;element name="GateOpenDateTime" type="{http://schema.ultra-as.com}GateOpenDateTime" minOccurs="0"/>
 *         &lt;element name="GateRole" type="{http://schema.ultra-as.com}GateRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gate", propOrder = {
    "gateBoardingStatus",
    "gateCloseDateTime",
    "gateNumber",
    "gateOpenDateTime",
    "gateRole"
})
public class Gate {

    @XmlElementRef(name = "GateBoardingStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GateBoardingStatus> gateBoardingStatus;
    @XmlElementRef(name = "GateCloseDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> gateCloseDateTime;
    @XmlElement(name = "GateNumber", required = true, nillable = true)
    protected String gateNumber;
    @XmlElementRef(name = "GateOpenDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> gateOpenDateTime;
    @XmlElement(name = "GateRole", required = true)
    @XmlSchemaType(name = "string")
    protected GateRole gateRole;

    /**
     * ��ȡgateBoardingStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GateBoardingStatus }{@code >}
     *     
     */
    public JAXBElement<GateBoardingStatus> getGateBoardingStatus() {
        return gateBoardingStatus;
    }

    /**
     * ����gateBoardingStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GateBoardingStatus }{@code >}
     *     
     */
    public void setGateBoardingStatus(JAXBElement<GateBoardingStatus> value) {
        this.gateBoardingStatus = value;
    }

    /**
     * ��ȡgateCloseDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGateCloseDateTime() {
        return gateCloseDateTime;
    }

    /**
     * ����gateCloseDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGateCloseDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.gateCloseDateTime = value;
    }

    /**
     * ��ȡgateNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateNumber() {
        return gateNumber;
    }

    /**
     * ����gateNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateNumber(String value) {
        this.gateNumber = value;
    }

    /**
     * ��ȡgateOpenDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGateOpenDateTime() {
        return gateOpenDateTime;
    }

    /**
     * ����gateOpenDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGateOpenDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.gateOpenDateTime = value;
    }

    /**
     * ��ȡgateRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GateRole }
     *     
     */
    public GateRole getGateRole() {
        return gateRole;
    }

    /**
     * ����gateRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GateRole }
     *     
     */
    public void setGateRole(GateRole value) {
        this.gateRole = value;
    }

}

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
import javax.xml.datatype.Duration;


/**
 * Complete detail of a single irregularity event including numeric and alphabetic codes and duration. Used to provide additional narrative on operational events such as delays and diversions to allow for corrective action to be taken and is not intended as a mechanism for apportioning blame.
 * 
 * <p>IrregularityDetails complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IrregularityDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IrregularityAlphaIATACode" type="{http://schema.ultra-as.com}IrregularityAlphaIATACode" minOccurs="0"/>
 *         &lt;element name="IrregularityDuration" type="{http://schema.ultra-as.com}IrregularityDuration"/>
 *         &lt;element name="IrregularityNumericIATACode" type="{http://schema.ultra-as.com}IrregularityNumericIATACode" minOccurs="0"/>
 *         &lt;element name="IrregularityRole" type="{http://schema.ultra-as.com}IrregularityRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrregularityDetails", propOrder = {
    "irregularityAlphaIATACode",
    "irregularityDuration",
    "irregularityNumericIATACode",
    "irregularityRole"
})
public class IrregularityDetails {

    @XmlElementRef(name = "IrregularityAlphaIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> irregularityAlphaIATACode;
    @XmlElement(name = "IrregularityDuration", required = true, nillable = true)
    protected Duration irregularityDuration;
    @XmlElementRef(name = "IrregularityNumericIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> irregularityNumericIATACode;
    @XmlElement(name = "IrregularityRole", required = true)
    @XmlSchemaType(name = "string")
    protected IrregularityRole irregularityRole;

    /**
     * ��ȡirregularityAlphaIATACode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIrregularityAlphaIATACode() {
        return irregularityAlphaIATACode;
    }

    /**
     * ����irregularityAlphaIATACode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIrregularityAlphaIATACode(JAXBElement<String> value) {
        this.irregularityAlphaIATACode = value;
    }

    /**
     * ��ȡirregularityDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getIrregularityDuration() {
        return irregularityDuration;
    }

    /**
     * ����irregularityDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setIrregularityDuration(Duration value) {
        this.irregularityDuration = value;
    }

    /**
     * ��ȡirregularityNumericIATACode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIrregularityNumericIATACode() {
        return irregularityNumericIATACode;
    }

    /**
     * ����irregularityNumericIATACode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIrregularityNumericIATACode(JAXBElement<String> value) {
        this.irregularityNumericIATACode = value;
    }

    /**
     * ��ȡirregularityRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IrregularityRole }
     *     
     */
    public IrregularityRole getIrregularityRole() {
        return irregularityRole;
    }

    /**
     * ����irregularityRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IrregularityRole }
     *     
     */
    public void setIrregularityRole(IrregularityRole value) {
        this.irregularityRole = value;
    }

}

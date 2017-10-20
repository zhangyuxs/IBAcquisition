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
 * A single piece of supplementary information of a particular type.
 * 
 * <p>InformationRemark complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="InformationRemark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InformationLanguage" type="{http://schema.ultra-as.com}InformationLanguage" minOccurs="0"/>
 *         &lt;element name="InformationText" type="{http://schema.ultra-as.com}InformationText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationRemark", propOrder = {
    "informationLanguage",
    "informationText"
})
public class InformationRemark {

    @XmlElementRef(name = "InformationLanguage", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<InformationLanguage> informationLanguage;
    @XmlElementRef(name = "InformationText", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> informationText;

    /**
     * ��ȡinformationLanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InformationLanguage }{@code >}
     *     
     */
    public JAXBElement<InformationLanguage> getInformationLanguage() {
        return informationLanguage;
    }

    /**
     * ����informationLanguage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InformationLanguage }{@code >}
     *     
     */
    public void setInformationLanguage(JAXBElement<InformationLanguage> value) {
        this.informationLanguage = value;
    }

    /**
     * ��ȡinformationText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInformationText() {
        return informationText;
    }

    /**
     * ����informationText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInformationText(JAXBElement<String> value) {
        this.informationText = value;
    }

}

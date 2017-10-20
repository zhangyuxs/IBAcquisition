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


/**
 * A single piece of supplementary information of a particular type.
 * 
 * <p>SupplementaryInformation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SupplementaryInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplementaryInformationText" type="{http://schema.ultra-as.com}SupplementaryInformationText"/>
 *         &lt;element name="SupplementaryInformationType" type="{http://schema.ultra-as.com}SupplementaryInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryInformation", propOrder = {
    "supplementaryInformationText",
    "supplementaryInformationType"
})
public class SupplementaryInformation {

    @XmlElement(name = "SupplementaryInformationText", required = true, nillable = true)
    protected String supplementaryInformationText;
    @XmlElement(name = "SupplementaryInformationType", required = true)
    @XmlSchemaType(name = "string")
    protected SupplementaryInformationType supplementaryInformationType;

    /**
     * ��ȡsupplementaryInformationText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryInformationText() {
        return supplementaryInformationText;
    }

    /**
     * ����supplementaryInformationText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryInformationText(String value) {
        this.supplementaryInformationText = value;
    }

    /**
     * ��ȡsupplementaryInformationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryInformationType }
     *     
     */
    public SupplementaryInformationType getSupplementaryInformationType() {
        return supplementaryInformationType;
    }

    /**
     * ����supplementaryInformationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryInformationType }
     *     
     */
    public void setSupplementaryInformationType(SupplementaryInformationType value) {
        this.supplementaryInformationType = value;
    }

}

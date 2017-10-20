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
 * A single remark code of a particular type.
 * 
 * <p>Remark complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Remark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemarkCode" type="{http://schema.ultra-as.com}RemarkCode"/>
 *         &lt;element name="RemarkType" type="{http://schema.ultra-as.com}RemarkType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remark", propOrder = {
    "remarkCode",
    "remarkType"
})
public class Remark {

    @XmlElement(name = "RemarkCode", required = true, nillable = true)
    protected String remarkCode;
    @XmlElement(name = "RemarkType", required = true)
    @XmlSchemaType(name = "string")
    protected RemarkType remarkType;

    /**
     * ��ȡremarkCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkCode() {
        return remarkCode;
    }

    /**
     * ����remarkCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkCode(String value) {
        this.remarkCode = value;
    }

    /**
     * ��ȡremarkType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarkType() {
        return remarkType;
    }

    /**
     * ����remarkType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarkType(RemarkType value) {
        this.remarkType = value;
    }

}

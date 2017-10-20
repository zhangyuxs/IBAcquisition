//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.05.28 ʱ�� 06:37:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="RequestType" type="{http://schema.ultra-as.com}RequestType"/>
 *         &lt;element name="ResourceData" type="{http://schema.ultra-as.com}ResourceData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isCompleteRecord" use="required" type="{http://schema.ultra-as.com}IsCompleteRecord" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestType",
    "resourceData"
})
@XmlRootElement(name = "RDDSResourceData")
public class RDDSResourceData {

    @XmlElement(name = "RequestType", required = true)
    @XmlSchemaType(name = "string")
    protected RequestType requestType;
    @XmlElement(name = "ResourceData", required = true)
    protected ResourceData resourceData;
    @XmlAttribute(name = "isCompleteRecord", required = true)
    protected boolean isCompleteRecord;

    /**
     * ��ȡrequestType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * ����requestType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * ��ȡresourceData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceData }
     *     
     */
    public ResourceData getResourceData() {
        return resourceData;
    }

    /**
     * ����resourceData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData }
     *     
     */
    public void setResourceData(ResourceData value) {
        this.resourceData = value;
    }

    /**
     * ��ȡisCompleteRecord���Ե�ֵ��
     * 
     */
    public boolean isIsCompleteRecord() {
        return isCompleteRecord;
    }

    /**
     * ����isCompleteRecord���Ե�ֵ��
     * 
     */
    public void setIsCompleteRecord(boolean value) {
        this.isCompleteRecord = value;
    }

}

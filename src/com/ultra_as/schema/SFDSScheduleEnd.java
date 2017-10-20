//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.05.28 ʱ�� 06:39:24 PM CST 
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
 *         &lt;element name="NumberOfRecords" type="{http://schema.ultra-as.com}NumberOfRecords"/>
 *         &lt;element name="RequestID" type="{http://schema.ultra-as.com}RequestID"/>
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
    "numberOfRecords",
    "requestID"
})
@XmlRootElement(name = "SFDSScheduleEnd")
public class SFDSScheduleEnd {

	@XmlElementRef(name = "NumberOfRecords", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfRecords;
    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "integer")
    protected int requestID;

    /**
     * ��ȡnumberOfRecords���Ե�ֵ��
     * 
     */
    public JAXBElement<Integer> getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * ����numberOfRecords���Ե�ֵ��
     * 
     */
    public void setNumberOfRecords(JAXBElement<Integer> value) {
        this.numberOfRecords = value;
    }


    /**
     * ��ȡrequestID���Ե�ֵ��
     * 
     */
    public int getRequestID() {
        return requestID;
    }

    /**
     * ����requestID���Ե�ֵ��
     * 
     */
    public void setRequestID(int value) {
        this.requestID = value;
    }

}

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
 * Description of an individual agent and the specific handling services they provide for a given flight.
 * 
 * <p>HandlingAgent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HandlingAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HandlingAgentIATACode" type="{http://schema.ultra-as.com}HandlingAgentIATACode"/>
 *         &lt;element name="HandlingAgentService" type="{http://schema.ultra-as.com}HandlingAgentService"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandlingAgent", propOrder = {
    "handlingAgentIATACode",
    "handlingAgentService"
})
public class HandlingAgent {

    @XmlElement(name = "HandlingAgentIATACode", required = true, nillable = true)
    protected String handlingAgentIATACode;
    @XmlElement(name = "HandlingAgentService", required = true)
    @XmlSchemaType(name = "string")
    protected HandlingAgentService handlingAgentService;

    /**
     * ��ȡhandlingAgentIATACode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingAgentIATACode() {
        return handlingAgentIATACode;
    }

    /**
     * ����handlingAgentIATACode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingAgentIATACode(String value) {
        this.handlingAgentIATACode = value;
    }

    /**
     * ��ȡhandlingAgentService���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HandlingAgentService }
     *     
     */
    public HandlingAgentService getHandlingAgentService() {
        return handlingAgentService;
    }

    /**
     * ����handlingAgentService���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingAgentService }
     *     
     */
    public void setHandlingAgentService(HandlingAgentService value) {
        this.handlingAgentService = value;
    }

}

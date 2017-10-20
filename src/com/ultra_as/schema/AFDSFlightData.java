//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.05.28 ʱ�� 06:35:34 PM CST 
//


package com.ultra_as.schema;

import java.io.Serializable;

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
 *         &lt;element name="AmendmentType" type="{http://schema.ultra-as.com}AmendmentType"/>
 *         &lt;element name="FlightIdentification" type="{http://schema.ultra-as.com}FlightIdentification"/>
 *         &lt;element name="FlightData" type="{http://schema.ultra-as.com}FlightData"/>
 *         &lt;element name="FlightFilterData" type="{http://schema.ultra-as.com}FlightFilterData" minOccurs="0"/>
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
    "amendmentType",
    "flightIdentification",
    "flightData",
    "flightFilterData"
})
@XmlRootElement(name = "AFDSFlightData")
public class AFDSFlightData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "AmendmentType", required = true)
    @XmlSchemaType(name = "string")
    protected AmendmentType amendmentType;
    @XmlElement(name = "FlightIdentification", required = true)
    protected FlightIdentification flightIdentification;
    @XmlElement(name = "FlightData", required = true)
    protected FlightData flightData;
    @XmlElement(name = "FlightFilterData")
    protected FlightFilterData flightFilterData;
    @XmlAttribute(name = "isCompleteRecord", required = true)
    protected boolean isCompleteRecord;

    /**
     * ��ȡamendmentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmendmentType }
     *     
     */
    public AmendmentType getAmendmentType() {
        return amendmentType;
    }

    /**
     * ����amendmentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentType }
     *     
     */
    public void setAmendmentType(AmendmentType value) {
        this.amendmentType = value;
    }

    /**
     * ��ȡflightIdentification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentification }
     *     
     */
    public FlightIdentification getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * ����flightIdentification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentification }
     *     
     */
    public void setFlightIdentification(FlightIdentification value) {
        this.flightIdentification = value;
    }

    /**
     * ��ȡflightData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FlightData }
     *     
     */
    public FlightData getFlightData() {
        return flightData;
    }

    /**
     * ����flightData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FlightData }
     *     
     */
    public void setFlightData(FlightData value) {
        this.flightData = value;
    }

    /**
     * ��ȡflightFilterData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FlightFilterData }
     *     
     */
    public FlightFilterData getFlightFilterData() {
        return flightFilterData;
    }

    /**
     * ����flightFilterData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FlightFilterData }
     *     
     */
    public void setFlightFilterData(FlightFilterData value) {
        this.flightFilterData = value;
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

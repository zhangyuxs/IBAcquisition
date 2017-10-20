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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AircraftVisitIdentification complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AircraftVisitIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftVisitSequence" type="{http://schema.ultra-as.com}AircraftVisitSequence"/>
 *         &lt;element name="AircraftRegistration" type="{http://schema.ultra-as.com}AircraftRegistration"/>
 *         &lt;element name="ScheduledDate" type="{http://schema.ultra-as.com}ScheduledDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftVisitIdentification", propOrder = {
    "aircraftVisitSequence",
    "aircraftRegistration",
    "scheduledDate"
})
public class AircraftVisitIdentification {

    @XmlElement(name = "AircraftVisitSequence")
    protected long aircraftVisitSequence;
    @XmlElement(name = "AircraftRegistration", required = true)
    protected String aircraftRegistration;
    @XmlElement(name = "ScheduledDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduledDate;

    /**
     * ��ȡaircraftVisitSequence���Ե�ֵ��
     * 
     */
    public long getAircraftVisitSequence() {
        return aircraftVisitSequence;
    }

    /**
     * ����aircraftVisitSequence���Ե�ֵ��
     * 
     */
    public void setAircraftVisitSequence(long value) {
        this.aircraftVisitSequence = value;
    }

    /**
     * ��ȡaircraftRegistration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    /**
     * ����aircraftRegistration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftRegistration(String value) {
        this.aircraftRegistration = value;
    }

    /**
     * ��ȡscheduledDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDate() {
        return scheduledDate;
    }

    /**
     * ����scheduledDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDate(XMLGregorianCalendar value) {
        this.scheduledDate = value;
    }

}

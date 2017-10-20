//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.05.28 ʱ�� 06:34:01 PM CST 
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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="BasicDataCategory" type="{http://schema.ultra-as.com}BasicDataCategory"/>
 *         &lt;element name="SnapshotFromDateTime" type="{http://schema.ultra-as.com}SnapshotFromDateTime" minOccurs="0"/>
 *         &lt;element name="SubscriptionMode" type="{http://schema.ultra-as.com}SubscriptionMode"/>
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
    "basicDataCategory",
    "snapshotFromDateTime",
    "subscriptionMode"
})
@XmlRootElement(name = "BDDSSubscriptionRequest")
public class BDDSSubscriptionRequest {

    @XmlElement(name = "BasicDataCategory", required = true)
    @XmlSchemaType(name = "string")
    protected BasicDataCategory basicDataCategory;
    @XmlElementRef(name = "SnapshotFromDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> snapshotFromDateTime;
    @XmlElement(name = "SubscriptionMode", required = true)
    @XmlSchemaType(name = "string")
    protected SubscriptionMode subscriptionMode;

    /**
     * ��ȡbasicDataCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BasicDataCategory }
     *     
     */
    public BasicDataCategory getBasicDataCategory() {
        return basicDataCategory;
    }

    /**
     * ����basicDataCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataCategory }
     *     
     */
    public void setBasicDataCategory(BasicDataCategory value) {
        this.basicDataCategory = value;
    }

    /**
     * ��ȡsnapshotFromDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSnapshotFromDateTime() {
        return snapshotFromDateTime;
    }

    /**
     * ����snapshotFromDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSnapshotFromDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.snapshotFromDateTime = value;
    }

    /**
     * ��ȡsubscriptionMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionMode }
     *     
     */
    public SubscriptionMode getSubscriptionMode() {
        return subscriptionMode;
    }

    /**
     * ����subscriptionMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionMode }
     *     
     */
    public void setSubscriptionMode(SubscriptionMode value) {
        this.subscriptionMode = value;
    }

}

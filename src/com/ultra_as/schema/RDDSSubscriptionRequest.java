//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.28 时间 06:38:38 PM CST 
//


package com.ultra_as.schema;

import java.util.ArrayList;
import java.util.List;
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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceDataCategory" type="{http://schema.ultra-as.com}ResourceDataCategory"/>
 *         &lt;element name="SnapshotFromDateTime" type="{http://schema.ultra-as.com}SnapshotFromDateTime" minOccurs="0"/>
 *         &lt;element name="SubscriptionMode" type="{http://schema.ultra-as.com}SubscriptionMode"/>
 *         &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" maxOccurs="unbounded" minOccurs="0"/>
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
    "resourceDataCategory",
    "snapshotFromDateTime",
    "subscriptionMode",
    "terminalCode"
})
@XmlRootElement(name = "RDDSSubscriptionRequest")
public class RDDSSubscriptionRequest {

    @XmlElement(name = "ResourceDataCategory", required = true)
    @XmlSchemaType(name = "string")
    protected ResourceDataCategory resourceDataCategory;
    @XmlElementRef(name = "SnapshotFromDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> snapshotFromDateTime;
    @XmlElement(name = "SubscriptionMode", required = true)
    @XmlSchemaType(name = "string")
    protected SubscriptionMode subscriptionMode;
    @XmlElement(name = "TerminalCode")
    protected List<String> terminalCode;

    /**
     * 获取resourceDataCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataCategory }
     *     
     */
    public ResourceDataCategory getResourceDataCategory() {
        return resourceDataCategory;
    }

    /**
     * 设置resourceDataCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataCategory }
     *     
     */
    public void setResourceDataCategory(ResourceDataCategory value) {
        this.resourceDataCategory = value;
    }

    /**
     * 获取snapshotFromDateTime属性的值。
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
     * 设置snapshotFromDateTime属性的值。
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
     * 获取subscriptionMode属性的值。
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
     * 设置subscriptionMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionMode }
     *     
     */
    public void setSubscriptionMode(SubscriptionMode value) {
        this.subscriptionMode = value;
    }

    /**
     * Gets the value of the terminalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerminalCode() {
        if (terminalCode == null) {
            terminalCode = new ArrayList<String>();
        }
        return this.terminalCode;
    }

}

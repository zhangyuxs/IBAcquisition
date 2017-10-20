//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The details of one vehicle used to service a flight.
 * 
 * <p>VehicleUsage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordIdentification" type="{http://schema.ultra-as.com}RecordIdentification"/>
 *         &lt;element name="VehicleType" type="{http://schema.ultra-as.com}VehicleType"/>
 *         &lt;element name="VehicleID" type="{http://schema.ultra-as.com}VehicleID"/>
 *         &lt;element name="Repeat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubType" type="{http://schema.ultra-as.com}SubType" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://schema.ultra-as.com}Count" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleUsage", propOrder = {
    "recordIdentification",
    "vehicleType",
    "vehicleID",
    "repeat",
    "startTime",
    "endTime",
    "subType",
    "count"
})
public class VehicleUsage {

    @XmlElement(name = "RecordIdentification", required = true)
    protected RecordIdentification recordIdentification;
    @XmlElement(name = "VehicleType", required = true)
    protected String vehicleType;
    @XmlElement(name = "VehicleID", required = true)
    protected String vehicleID;
    @XmlElement(name = "Repeat")
    protected Integer repeat;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElementRef(name = "SubType", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subType;
    @XmlElementRef(name = "Count", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> count;

    /**
     * 获取recordIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordIdentification }
     *     
     */
    public RecordIdentification getRecordIdentification() {
        return recordIdentification;
    }

    /**
     * 设置recordIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordIdentification }
     *     
     */
    public void setRecordIdentification(RecordIdentification value) {
        this.recordIdentification = value;
    }

    /**
     * 获取vehicleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置vehicleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * 获取vehicleID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * 设置vehicleID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleID(String value) {
        this.vehicleID = value;
    }

    /**
     * 获取repeat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepeat() {
        return repeat;
    }

    /**
     * 设置repeat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepeat(Integer value) {
        this.repeat = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * 获取subType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubType() {
        return subType;
    }

    /**
     * 设置subType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubType(JAXBElement<String> value) {
        this.subType = value;
    }

    /**
     * 获取count属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCount(JAXBElement<Integer> value) {
        this.count = value;
    }

}

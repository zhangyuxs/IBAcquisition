//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.01 时间 09:59:39 PM CST 
//


package com.ultra_as.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The details of one VIP on a flight.
 * 
 * <p>VIPData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VIPData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordIdentification" type="{http://schema.ultra-as.com}RecordIdentification"/>
 *         &lt;element name="VIPName" type="{http://schema.ultra-as.com}VIPName"/>
 *         &lt;element name="VIPLevel" type="{http://schema.ultra-as.com}VIPLevel"/>
 *         &lt;element name="Title" type="{http://schema.ultra-as.com}Title" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://schema.ultra-as.com}TelephoneNumber" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://schema.ultra-as.com}Gender" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://schema.ultra-as.com}Description" minOccurs="0"/>
 *         &lt;element name="NumberOfRetinues" type="{http://schema.ultra-as.com}NumberOfRetinues" minOccurs="0"/>
 *         &lt;element name="NumberOfBags" type="{http://schema.ultra-as.com}NumberOfBags" minOccurs="0"/>
 *         &lt;element name="BoardingAirportIATACode" type="{http://schema.ultra-as.com}BoardingAirportIATACode" minOccurs="0"/>
 *         &lt;element name="DepartingAirportIATACode" type="{http://schema.ultra-as.com}BoardingAirportIATACode" minOccurs="0"/>
 *         &lt;element name="VehicleRegistrationNumber" type="{http://schema.ultra-as.com}VehicleRegistrationNumber" minOccurs="0"/>
 *         &lt;element name="RoomUsed" type="{http://schema.ultra-as.com}RoomUsed" minOccurs="0"/>
 *         &lt;element name="HallUsed" type="{http://schema.ultra-as.com}HallUsed" minOccurs="0"/>
 *         &lt;element name="Remark" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VIPData", propOrder = {
    "recordIdentification",
    "vipName",
    "vipLevel",
    "title",
    "telephoneNumber",
    "gender",
    "description",
    "numberOfRetinues",
    "numberOfBags",
    "boardingAirportIATACode",
    "departingAirportIATACode",
    "vehicleRegistrationNumber",
    "roomUsed",
    "hallUsed",
    "remark"
})
public class VIPData {

    @XmlElement(name = "RecordIdentification", required = true)
    protected RecordIdentification recordIdentification;
    @XmlElement(name = "VIPName", required = true)
    protected String vipName;
    @XmlElement(name = "VIPLevel", required = true)
    @XmlSchemaType(name = "string")
    protected VIPLevel vipLevel;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "NumberOfRetinues")
    @XmlSchemaType(name = "integer")
    protected Integer numberOfRetinues;
    @XmlElement(name = "NumberOfBags")
    @XmlSchemaType(name = "integer")
    protected Integer numberOfBags;
    @XmlElement(name = "BoardingAirportIATACode")
    protected String boardingAirportIATACode;
    @XmlElement(name = "DepartingAirportIATACode")
    protected String departingAirportIATACode;
    @XmlElement(name = "VehicleRegistrationNumber")
    protected String vehicleRegistrationNumber;
    @XmlElement(name = "RoomUsed")
    protected String roomUsed;
    @XmlElement(name = "HallUsed")
    protected String hallUsed;
    @XmlElement(name = "Remark")
    protected String remark;

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
     * 获取vipName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPName() {
        return vipName;
    }

    /**
     * 设置vipName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPName(String value) {
        this.vipName = value;
    }

    /**
     * 获取vipLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VIPLevel }
     *     
     */
    public VIPLevel getVIPLevel() {
        return vipLevel;
    }

    /**
     * 设置vipLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VIPLevel }
     *     
     */
    public void setVIPLevel(VIPLevel value) {
        this.vipLevel = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取telephoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * 设置telephoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取numberOfRetinues属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRetinues() {
        return numberOfRetinues;
    }

    /**
     * 设置numberOfRetinues属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRetinues(Integer value) {
        this.numberOfRetinues = value;
    }

    /**
     * 获取numberOfBags属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBags() {
        return numberOfBags;
    }

    /**
     * 设置numberOfBags属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBags(Integer value) {
        this.numberOfBags = value;
    }

    /**
     * 获取boardingAirportIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingAirportIATACode() {
        return boardingAirportIATACode;
    }

    /**
     * 设置boardingAirportIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingAirportIATACode(String value) {
        this.boardingAirportIATACode = value;
    }

    /**
     * 获取departingAirportIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartingAirportIATACode() {
        return departingAirportIATACode;
    }

    /**
     * 设置departingAirportIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartingAirportIATACode(String value) {
        this.departingAirportIATACode = value;
    }

    /**
     * 获取vehicleRegistrationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    /**
     * 设置vehicleRegistrationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegistrationNumber(String value) {
        this.vehicleRegistrationNumber = value;
    }

    /**
     * 获取roomUsed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomUsed() {
        return roomUsed;
    }

    /**
     * 设置roomUsed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomUsed(String value) {
        this.roomUsed = value;
    }

    /**
     * 获取hallUsed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHallUsed() {
        return hallUsed;
    }

    /**
     * 设置hallUsed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHallUsed(String value) {
        this.hallUsed = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}

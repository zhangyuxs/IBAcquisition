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
 * The details of one VIP on a flight.
 * 
 * <p>VIPData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrecordIdentification���Ե�ֵ��
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
     * ����recordIdentification���Ե�ֵ��
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
     * ��ȡvipName���Ե�ֵ��
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
     * ����vipName���Ե�ֵ��
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
     * ��ȡvipLevel���Ե�ֵ��
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
     * ����vipLevel���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡtelephoneNumber���Ե�ֵ��
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
     * ����telephoneNumber���Ե�ֵ��
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
     * ��ȡgender���Ե�ֵ��
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
     * ����gender���Ե�ֵ��
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
     * ��ȡdescription���Ե�ֵ��
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
     * ����description���Ե�ֵ��
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
     * ��ȡnumberOfRetinues���Ե�ֵ��
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
     * ����numberOfRetinues���Ե�ֵ��
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
     * ��ȡnumberOfBags���Ե�ֵ��
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
     * ����numberOfBags���Ե�ֵ��
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
     * ��ȡboardingAirportIATACode���Ե�ֵ��
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
     * ����boardingAirportIATACode���Ե�ֵ��
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
     * ��ȡdepartingAirportIATACode���Ե�ֵ��
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
     * ����departingAirportIATACode���Ե�ֵ��
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
     * ��ȡvehicleRegistrationNumber���Ե�ֵ��
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
     * ����vehicleRegistrationNumber���Ե�ֵ��
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
     * ��ȡroomUsed���Ե�ֵ��
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
     * ����roomUsed���Ե�ֵ��
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
     * ��ȡhallUsed���Ե�ֵ��
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
     * ����hallUsed���Ե�ֵ��
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
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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

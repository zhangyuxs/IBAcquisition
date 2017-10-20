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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The details of one task performed on a flight.
 * 
 * <p>FlightTask complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordIdentification" type="{http://schema.ultra-as.com}RecordIdentification"/>
 *         &lt;element name="TaskType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaskName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Repeat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ParentTask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Handler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlannedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PlannedEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightTask", propOrder = {
    "recordIdentification",
    "taskType",
    "taskName",
    "repeat",
    "parentTask",
    "taskStatus",
    "taskLocation",
    "handler",
    "plannedStartTime",
    "plannedEndTime",
    "estimatedStartTime",
    "estimatedEndTime",
    "actualStartTime",
    "actualEndTime",
    "alertTime"
})
public class FlightTask {

    @XmlElement(name = "RecordIdentification", required = true)
    protected RecordIdentification recordIdentification;
    @XmlElement(name = "TaskType", required = true)
    protected String taskType;
    @XmlElement(name = "TaskName", required = true)
    protected String taskName;
    @XmlElement(name = "Repeat")
    protected Integer repeat;
    @XmlElement(name = "ParentTask")
    protected String parentTask;
    @XmlElement(name = "TaskStatus")
    protected String taskStatus;
    @XmlElement(name = "TaskLocation")
    protected String taskLocation;
    @XmlElement(name = "Handler")
    protected String handler;
    @XmlElement(name = "PlannedStartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedStartTime;
    @XmlElement(name = "PlannedEndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedEndTime;
    @XmlElement(name = "EstimatedStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedStartTime;
    @XmlElement(name = "EstimatedEndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedEndTime;
    @XmlElement(name = "ActualStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartTime;
    @XmlElement(name = "ActualEndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEndTime;
    @XmlElement(name = "AlertTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertTime;

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
     * 获取taskType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * 设置taskType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskType(String value) {
        this.taskType = value;
    }

    /**
     * 获取taskName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 设置taskName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
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
     * 获取parentTask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTask() {
        return parentTask;
    }

    /**
     * 设置parentTask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTask(String value) {
        this.parentTask = value;
    }

    /**
     * 获取taskStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * 设置taskStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatus(String value) {
        this.taskStatus = value;
    }

    /**
     * 获取taskLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskLocation() {
        return taskLocation;
    }

    /**
     * 设置taskLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskLocation(String value) {
        this.taskLocation = value;
    }

    /**
     * 获取handler属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandler() {
        return handler;
    }

    /**
     * 设置handler属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandler(String value) {
        this.handler = value;
    }

    /**
     * 获取plannedStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedStartTime() {
        return plannedStartTime;
    }

    /**
     * 设置plannedStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedStartTime(XMLGregorianCalendar value) {
        this.plannedStartTime = value;
    }

    /**
     * 获取plannedEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedEndTime() {
        return plannedEndTime;
    }

    /**
     * 设置plannedEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedEndTime(XMLGregorianCalendar value) {
        this.plannedEndTime = value;
    }

    /**
     * 获取estimatedStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedStartTime() {
        return estimatedStartTime;
    }

    /**
     * 设置estimatedStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedStartTime(XMLGregorianCalendar value) {
        this.estimatedStartTime = value;
    }

    /**
     * 获取estimatedEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedEndTime() {
        return estimatedEndTime;
    }

    /**
     * 设置estimatedEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedEndTime(XMLGregorianCalendar value) {
        this.estimatedEndTime = value;
    }

    /**
     * 获取actualStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStartTime() {
        return actualStartTime;
    }

    /**
     * 设置actualStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStartTime(XMLGregorianCalendar value) {
        this.actualStartTime = value;
    }

    /**
     * 获取actualEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEndTime() {
        return actualEndTime;
    }

    /**
     * 设置actualEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEndTime(XMLGregorianCalendar value) {
        this.actualEndTime = value;
    }

    /**
     * 获取alertTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertTime() {
        return alertTime;
    }

    /**
     * 设置alertTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertTime(XMLGregorianCalendar value) {
        this.alertTime = value;
    }

}

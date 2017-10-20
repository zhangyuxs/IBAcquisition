//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.28 时间 06:39:35 PM CST 
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
 *         &lt;element name="RequestID" type="{http://schema.ultra-as.com}RequestID"/>
 *         &lt;element name="ScheduleEndDateTime" type="{http://schema.ultra-as.com}ScheduleEndDateTime" minOccurs="0"/>
 *         &lt;element name="ScheduleStartDateTime" type="{http://schema.ultra-as.com}ScheduleStartDateTime" minOccurs="0"/>
 *         &lt;element name="SubscriptionParameters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode" minOccurs="0"/>
 *                   &lt;element name="CarrierIATACode" type="{http://schema.ultra-as.com}CarrierIATACode" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FlightDirection" type="{http://schema.ultra-as.com}FlightDirection" minOccurs="0"/>
 *                   &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FlightShareStatus" type="{http://schema.ultra-as.com}FlightShareStatus" minOccurs="0"/>
 *                   &lt;element name="TerminalCode" type="{http://schema.ultra-as.com}TerminalCode" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "requestID",
    "scheduleEndDateTime",
    "scheduleStartDateTime",
    "subscriptionParameters"
})
@XmlRootElement(name = "SFDSScheduleRequest")
public class SFDSScheduleRequest {

    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "integer")
    protected int requestID;
    @XmlElementRef(name = "ScheduleEndDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduleEndDateTime;
    @XmlElementRef(name = "ScheduleStartDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduleStartDateTime;
    @XmlElement(name = "SubscriptionParameters", required = true, nillable = true)
    protected SFDSScheduleRequest.SubscriptionParameters subscriptionParameters;

    /**
     * 获取requestID属性的值。
     * 
     */
    public int getRequestID() {
        return requestID;
    }

    /**
     * 设置requestID属性的值。
     * 
     */
    public void setRequestID(int value) {
        this.requestID = value;
    }

    /**
     * 获取scheduleEndDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduleEndDateTime() {
        return scheduleEndDateTime;
    }

    /**
     * 设置scheduleEndDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduleEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduleEndDateTime = value;
    }

    /**
     * 获取scheduleStartDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduleStartDateTime() {
        return scheduleStartDateTime;
    }

    /**
     * 设置scheduleStartDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduleStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduleStartDateTime = value;
    }

    /**
     * 获取subscriptionParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SFDSScheduleRequest.SubscriptionParameters }
     *     
     */
    public SFDSScheduleRequest.SubscriptionParameters getSubscriptionParameters() {
        return subscriptionParameters;
    }

    /**
     * 设置subscriptionParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SFDSScheduleRequest.SubscriptionParameters }
     *     
     */
    public void setSubscriptionParameters(SFDSScheduleRequest.SubscriptionParameters value) {
        this.subscriptionParameters = value;
    }


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
     *         &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode" minOccurs="0"/>
     *         &lt;element name="CarrierIATACode" type="{http://schema.ultra-as.com}CarrierIATACode" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FlightDirection" type="{http://schema.ultra-as.com}FlightDirection" minOccurs="0"/>
     *         &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FlightShareStatus" type="{http://schema.ultra-as.com}FlightShareStatus" minOccurs="0"/>
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
        "airportIATACode",
        "carrierIATACode",
        "flightDirection",
        "flightSectorCode",
        "flightServiceTypeIATACode",
        "flightShareStatus",
        "terminalCode"
    })
    public static class SubscriptionParameters {

        @XmlElementRef(name = "AirportIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> airportIATACode;
        @XmlElement(name = "CarrierIATACode", nillable = true)
        protected List<String> carrierIATACode;
        @XmlElementRef(name = "FlightDirection", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightDirection> flightDirection;
        @XmlElement(name = "FlightSectorCode", nillable = true)
        @XmlSchemaType(name = "string")
        protected List<FlightSectorCode> flightSectorCode;
        @XmlElement(name = "FlightServiceTypeIATACode", nillable = true)
        protected List<String> flightServiceTypeIATACode;
        @XmlElementRef(name = "FlightShareStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightShareStatus> flightShareStatus;
        @XmlElement(name = "TerminalCode", nillable = true)
        protected List<String> terminalCode;

        /**
         * 获取airportIATACode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAirportIATACode() {
            return airportIATACode;
        }

        /**
         * 设置airportIATACode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAirportIATACode(JAXBElement<String> value) {
            this.airportIATACode = value;
        }

        /**
         * Gets the value of the carrierIATACode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrierIATACode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrierIATACode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCarrierIATACode() {
            if (carrierIATACode == null) {
                carrierIATACode = new ArrayList<String>();
            }
            return this.carrierIATACode;
        }

        /**
         * 获取flightDirection属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FlightDirection }{@code >}
         *     
         */
        public JAXBElement<FlightDirection> getFlightDirection() {
            return flightDirection;
        }

        /**
         * 设置flightDirection属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FlightDirection }{@code >}
         *     
         */
        public void setFlightDirection(JAXBElement<FlightDirection> value) {
            this.flightDirection = value;
        }

        /**
         * Gets the value of the flightSectorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSectorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSectorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightSectorCode }
         * 
         * 
         */
        public List<FlightSectorCode> getFlightSectorCode() {
            if (flightSectorCode == null) {
                flightSectorCode = new ArrayList<FlightSectorCode>();
            }
            return this.flightSectorCode;
        }

        /**
         * Gets the value of the flightServiceTypeIATACode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightServiceTypeIATACode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightServiceTypeIATACode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightServiceTypeIATACode() {
            if (flightServiceTypeIATACode == null) {
                flightServiceTypeIATACode = new ArrayList<String>();
            }
            return this.flightServiceTypeIATACode;
        }

        /**
         * 获取flightShareStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FlightShareStatus }{@code >}
         *     
         */
        public JAXBElement<FlightShareStatus> getFlightShareStatus() {
            return flightShareStatus;
        }

        /**
         * 设置flightShareStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FlightShareStatus }{@code >}
         *     
         */
        public void setFlightShareStatus(JAXBElement<FlightShareStatus> value) {
            this.flightShareStatus = value;
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

}

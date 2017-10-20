//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.28 时间 06:36:43 PM CST 
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
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="FlightWindow" type="{http://schema.ultra-as.com}FlightWindow"/>
 *             &lt;element name="SnapshotFromDateTime" type="{http://schema.ultra-as.com}SnapshotFromDateTime" minOccurs="0"/>
 *             &lt;element name="SubscriptionMode" type="{http://schema.ultra-as.com}SubscriptionMode"/>
 *           &lt;/sequence>
 *           &lt;element name="SnapshotPeriod">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="SnapshotEndDateTime" type="{http://schema.ultra-as.com}SnapshotEndDateTime"/>
 *                     &lt;element name="SnapshotStartDateTime" type="{http://schema.ultra-as.com}SnapshotStartDateTime"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="SubscriptionParameters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirportIATACode" type="{http://schema.ultra-as.com}LocationIATACode" minOccurs="0"/>
 *                   &lt;element name="CarrierIATACode" type="{http://schema.ultra-as.com}CarrierIATACode" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CarrierICAOCode" type="{http://schema.ultra-as.com}CarrierICAOCode" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FlightDirection" type="{http://schema.ultra-as.com}FlightDirection" minOccurs="0"/>
 *                   &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FlightShareStatus" type="{http://schema.ultra-as.com}FlightShareStatus" minOccurs="0"/>
 *                   &lt;element name="FlightType" type="{http://schema.ultra-as.com}FlightType" minOccurs="0"/>
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
    "flightWindow",
    "snapshotFromDateTime",
    "subscriptionMode",
    "snapshotPeriod",
    "subscriptionParameters"
})
@XmlRootElement(name = "AFDSSubscriptionRequest")
public class AFDSSubscriptionRequest {

    @XmlElement(name = "FlightWindow")
    @XmlSchemaType(name = "string")
    protected FlightWindow flightWindow;
    @XmlElementRef(name = "SnapshotFromDateTime", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> snapshotFromDateTime;
    @XmlElement(name = "SubscriptionMode")
    @XmlSchemaType(name = "string")
    protected SubscriptionMode subscriptionMode;
    @XmlElement(name = "SnapshotPeriod")
    protected AFDSSubscriptionRequest.SnapshotPeriod snapshotPeriod;
    @XmlElement(name = "SubscriptionParameters", required = true)
    protected AFDSSubscriptionRequest.SubscriptionParameters subscriptionParameters;

   
    
    /**
     * 获取flightWindow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightWindow }
     *     
     */
    public FlightWindow getFlightWindow() {
    	
        return flightWindow;
    }

    /**
     * 设置flightWindow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightWindow }
     *     
     */
    public void setFlightWindow(FlightWindow value) {
        this.flightWindow = value;
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
     * 获取snapshotPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AFDSSubscriptionRequest.SnapshotPeriod }
     *     
     */
    public AFDSSubscriptionRequest.SnapshotPeriod getSnapshotPeriod() {
        return snapshotPeriod;
    }

    /**
     * 设置snapshotPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AFDSSubscriptionRequest.SnapshotPeriod }
     *     
     */
    public void setSnapshotPeriod(AFDSSubscriptionRequest.SnapshotPeriod value) {
        this.snapshotPeriod = value;
    }

    /**
     * 获取subscriptionParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AFDSSubscriptionRequest.SubscriptionParameters }
     *     
     */
    public AFDSSubscriptionRequest.SubscriptionParameters getSubscriptionParameters() {
        return subscriptionParameters;
    }

    /**
     * 设置subscriptionParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AFDSSubscriptionRequest.SubscriptionParameters }
     *     
     */
    public void setSubscriptionParameters(AFDSSubscriptionRequest.SubscriptionParameters value) {
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
     *         &lt;element name="SnapshotEndDateTime" type="{http://schema.ultra-as.com}SnapshotEndDateTime"/>
     *         &lt;element name="SnapshotStartDateTime" type="{http://schema.ultra-as.com}SnapshotStartDateTime"/>
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
        "snapshotEndDateTime",
        "snapshotStartDateTime"
    })
    public static class SnapshotPeriod {

        @XmlElement(name = "SnapshotEndDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar snapshotEndDateTime;
        @XmlElement(name = "SnapshotStartDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar snapshotStartDateTime;

        /**
         * 获取snapshotEndDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSnapshotEndDateTime() {
            return snapshotEndDateTime;
        }

        /**
         * 设置snapshotEndDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSnapshotEndDateTime(XMLGregorianCalendar value) {
            this.snapshotEndDateTime = value;
        }

        /**
         * 获取snapshotStartDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSnapshotStartDateTime() {
            return snapshotStartDateTime;
        }

        /**
         * 设置snapshotStartDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSnapshotStartDateTime(XMLGregorianCalendar value) {
            this.snapshotStartDateTime = value;
        }

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
     *         &lt;element name="CarrierICAOCode" type="{http://schema.ultra-as.com}CarrierICAOCode" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FlightDirection" type="{http://schema.ultra-as.com}FlightDirection" minOccurs="0"/>
     *         &lt;element name="FlightNatureCode" type="{http://schema.ultra-as.com}FlightNatureCode" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FlightSectorCode" type="{http://schema.ultra-as.com}FlightSectorCode" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FlightServiceTypeIATACode" type="{http://schema.ultra-as.com}FlightServiceTypeIATACode" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FlightShareStatus" type="{http://schema.ultra-as.com}FlightShareStatus" minOccurs="0"/>
     *         &lt;element name="FlightType" type="{http://schema.ultra-as.com}FlightType" minOccurs="0"/>
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
        "carrierICAOCode",
        "flightDirection",
        "flightNatureCode",
        "flightSectorCode",
        "flightServiceTypeIATACode",
        "flightShareStatus",
        "flightType",
        "terminalCode"
    })
    public static class SubscriptionParameters {

        @XmlElementRef(name = "AirportIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<String> airportIATACode;
        @XmlElement(name = "CarrierIATACode", nillable = true)
        protected List<String> carrierIATACode;
        @XmlElement(name = "CarrierICAOCode", nillable = true)
        protected List<String> carrierICAOCode;
        @XmlElementRef(name = "FlightDirection", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightDirection> flightDirection;
        @XmlElement(name = "FlightNatureCode", nillable = true)
        protected List<String> flightNatureCode;
        @XmlElement(name = "FlightSectorCode", nillable = true)
        @XmlSchemaType(name = "string")
        protected List<FlightSectorCode> flightSectorCode;
        @XmlElement(name = "FlightServiceTypeIATACode", nillable = true)
        protected List<String> flightServiceTypeIATACode;
        @XmlElementRef(name = "FlightShareStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightShareStatus> flightShareStatus;
        @XmlElementRef(name = "FlightType", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
        protected JAXBElement<FlightType> flightType;
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
         * Gets the value of the carrierICAOCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrierICAOCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrierICAOCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCarrierICAOCode() {
            if (carrierICAOCode == null) {
                carrierICAOCode = new ArrayList<String>();
            }
            return this.carrierICAOCode;
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
         * Gets the value of the flightNatureCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightNatureCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightNatureCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightNatureCode() {
            if (flightNatureCode == null) {
                flightNatureCode = new ArrayList<String>();
            }
            return this.flightNatureCode;
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
         * 获取flightType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FlightType }{@code >}
         *     
         */
        public JAXBElement<FlightType> getFlightType() {
            return flightType;
        }

        /**
         * 设置flightType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FlightType }{@code >}
         *     
         */
        public void setFlightType(JAXBElement<FlightType> value) {
            this.flightType = value;
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

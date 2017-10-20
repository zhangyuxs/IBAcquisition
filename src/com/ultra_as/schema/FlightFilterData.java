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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The old and new set of data the IMB requires to identify flight filter changes.
 * 
 * <p>FlightFilterData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightFilterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportIATACode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>LocationIATACode">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CarrierIATACode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>CarrierIATACode">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CarrierICAOCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>CarrierICAOCode">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodeShareStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>CodeShareStatus">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightNatureCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>FlightNatureCode">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightSectorCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>FlightSectorCode">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightServiceTypeIATACode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>FlightServiceTypeIATACode">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>FlightType">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TerminalCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://schema.ultra-as.com>TerminalCode">
 *                 &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "FlightFilterData", propOrder = {
    "airportIATACode",
    "carrierIATACode",
    "carrierICAOCode",
    "codeShareStatus",
    "flightNatureCode",
    "flightSectorCode",
    "flightServiceTypeIATACode",
    "flightType",
    "terminalCode"
})
public class FlightFilterData {

    @XmlElementRef(name = "AirportIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.AirportIATACode> airportIATACode;
    @XmlElementRef(name = "CarrierIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.CarrierIATACode> carrierIATACode;
    @XmlElementRef(name = "CarrierICAOCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.CarrierICAOCode> carrierICAOCode;
    @XmlElementRef(name = "CodeShareStatus", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.CodeShareStatus> codeShareStatus;
    @XmlElementRef(name = "FlightNatureCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.FlightNatureCode> flightNatureCode;
    @XmlElementRef(name = "FlightSectorCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.FlightSectorCode> flightSectorCode;
    @XmlElementRef(name = "FlightServiceTypeIATACode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.FlightServiceTypeIATACode> flightServiceTypeIATACode;
    @XmlElementRef(name = "FlightType", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.FlightType> flightType;
    @XmlElementRef(name = "TerminalCode", namespace = "http://schema.ultra-as.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightFilterData.TerminalCode> terminalCode;

    /**
     * 获取airportIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.AirportIATACode }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.AirportIATACode> getAirportIATACode() {
        return airportIATACode;
    }

    /**
     * 设置airportIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.AirportIATACode }{@code >}
     *     
     */
    public void setAirportIATACode(JAXBElement<FlightFilterData.AirportIATACode> value) {
        this.airportIATACode = value;
    }

    /**
     * 获取carrierIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.CarrierIATACode }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.CarrierIATACode> getCarrierIATACode() {
        return carrierIATACode;
    }

    /**
     * 设置carrierIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.CarrierIATACode }{@code >}
     *     
     */
    public void setCarrierIATACode(JAXBElement<FlightFilterData.CarrierIATACode> value) {
        this.carrierIATACode = value;
    }

    /**
     * 获取carrierICAOCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.CarrierICAOCode }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.CarrierICAOCode> getCarrierICAOCode() {
        return carrierICAOCode;
    }

    /**
     * 设置carrierICAOCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.CarrierICAOCode }{@code >}
     *     
     */
    public void setCarrierICAOCode(JAXBElement<FlightFilterData.CarrierICAOCode> value) {
        this.carrierICAOCode = value;
    }

    /**
     * 获取codeShareStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.CodeShareStatus }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.CodeShareStatus> getCodeShareStatus() {
        return codeShareStatus;
    }

    /**
     * 设置codeShareStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.CodeShareStatus }{@code >}
     *     
     */
    public void setCodeShareStatus(JAXBElement<FlightFilterData.CodeShareStatus> value) {
        this.codeShareStatus = value;
    }

    /**
     * 获取flightNatureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.FlightNatureCode }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.FlightNatureCode> getFlightNatureCode() {
        return flightNatureCode;
    }

    /**
     * 设置flightNatureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.FlightNatureCode }{@code >}
     *     
     */
    public void setFlightNatureCode(JAXBElement<FlightFilterData.FlightNatureCode> value) {
        this.flightNatureCode = value;
    }

    /**
     * 获取flightSectorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.FlightSectorCode }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.FlightSectorCode> getFlightSectorCode() {
        return flightSectorCode;
    }

    /**
     * 设置flightSectorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.FlightSectorCode }{@code >}
     *     
     */
    public void setFlightSectorCode(JAXBElement<FlightFilterData.FlightSectorCode> value) {
        this.flightSectorCode = value;
    }

    /**
     * 获取flightServiceTypeIATACode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.FlightServiceTypeIATACode }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.FlightServiceTypeIATACode> getFlightServiceTypeIATACode() {
        return flightServiceTypeIATACode;
    }

    /**
     * 设置flightServiceTypeIATACode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.FlightServiceTypeIATACode }{@code >}
     *     
     */
    public void setFlightServiceTypeIATACode(JAXBElement<FlightFilterData.FlightServiceTypeIATACode> value) {
        this.flightServiceTypeIATACode = value;
    }

    /**
     * 获取flightType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.FlightType }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.FlightType> getFlightType() {
        return flightType;
    }

    /**
     * 设置flightType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.FlightType }{@code >}
     *     
     */
    public void setFlightType(JAXBElement<FlightFilterData.FlightType> value) {
        this.flightType = value;
    }

    /**
     * 获取terminalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.TerminalCode }{@code >}
     *     
     */
    public JAXBElement<FlightFilterData.TerminalCode> getTerminalCode() {
        return terminalCode;
    }

    /**
     * 设置terminalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightFilterData.TerminalCode }{@code >}
     *     
     */
    public void setTerminalCode(JAXBElement<FlightFilterData.TerminalCode> value) {
        this.terminalCode = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>LocationIATACode">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AirportIATACode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * IATA assigned code for locations such as airports, bus, rail and ferry stations.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>CarrierIATACode">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CarrierIATACode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * IATA code of the flight carrier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>CarrierICAOCode">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CarrierICAOCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * ICAO code of the flight carrier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>CodeShareStatus">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CodeShareStatus {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * Code share status of a flight. For share flights, a value of 'SF' will be set. For master flights, the number of associated shares will be set (i.e. '01' for one share, '02' for two shares, 00 for no shares).
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>FlightNatureCode">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FlightNatureCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * The code defining the nature of the flight. For example, passenger, cargo, training.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>FlightSectorCode">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FlightSectorCode {

        @XmlValue
        protected com.ultra_as.schema.FlightSectorCode value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * The sector within which the flight operates (I-International, D-Domestic, M-Mixed, R-Regional).
         * 
         * @return
         *     possible object is
         *     {@link com.ultra_as.schema.FlightSectorCode }
         *     
         */
        public com.ultra_as.schema.FlightSectorCode getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link com.ultra_as.schema.FlightSectorCode }
         *     
         */
        public void setValue(com.ultra_as.schema.FlightSectorCode value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>FlightServiceTypeIATACode">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FlightServiceTypeIATACode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * IATA assigned code for type of flight service. For example, J = Normal Passenger Service, M = Mail Only.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>FlightType">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FlightType {

        @XmlValue
        protected com.ultra_as.schema.FlightType value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * Selected type code (GA flights or scheduled flights) - used to filter messages.
         * 
         * @return
         *     possible object is
         *     {@link com.ultra_as.schema.FlightType }
         *     
         */
        public com.ultra_as.schema.FlightType getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link com.ultra_as.schema.FlightType }
         *     
         */
        public void setValue(com.ultra_as.schema.FlightType value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://schema.ultra-as.com>TerminalCode">
     *       &lt;attribute name="previousValue" type="{http://schema.ultra-as.com}PreviousValue" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TerminalCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * Terminal identity.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取previousValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * 设置previousValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }

}

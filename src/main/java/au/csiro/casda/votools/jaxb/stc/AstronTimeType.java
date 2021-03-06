//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.12 at 12:39:04 PM EST 
//


package au.csiro.casda.votools.jaxb.stc;

/*
 * #%L
 * CSIRO ASKAP Science Data Archive
 * %%
 * Copyright (C) 2015 Commonwealth Scientific and Industrial Research Organisation (CSIRO) ABN 41 687 119 230.
 * %%
 * Licensed under the CSIRO Open Source License Agreement (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License in the LICENSE file.
 * #L%
 */


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * astronTime is the generalized astronomical time type and consists of one, two, or three elements: optional TimeScale, optional relative time offset, and an absolute time (ISO8601 or a decimal JD or MJD; or it may be an IDREF to one of those three); TimeScale may be omitted only if the element is part of AstroCoords, referring to an AstroCoordSystem that specifies a TimeScale.
 * 
 * <p>Java class for astronTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="astronTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Timescale" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}timeScaleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}TimeOffset" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}AbsoluteTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "astronTimeType", propOrder = {
    "timescale",
    "timeOffset",
    "absoluteTime"
})
public class AstronTimeType {

    @XmlElementRef(name = "Timescale", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeScaleType> timescale;
    @XmlElement(name = "TimeOffset", nillable = true)
    protected TimeOffsetType timeOffset;
    @XmlElementRef(name = "AbsoluteTime", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class)
    protected JAXBElement<?> absoluteTime;

    /**
     * Gets the value of the timescale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeScaleType }{@code >}
     *     
     */
    public JAXBElement<TimeScaleType> getTimescale() {
        return timescale;
    }

    /**
     * Sets the value of the timescale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeScaleType }{@code >}
     *     
     */
    public void setTimescale(JAXBElement<TimeScaleType> value) {
        this.timescale = value;
    }

    /**
     * Gets the value of the timeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOffsetType }
     *     
     */
    public TimeOffsetType getTimeOffset() {
        return timeOffset;
    }

    /**
     * Sets the value of the timeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOffsetType }
     *     
     */
    public void setTimeOffset(TimeOffsetType value) {
        this.timeOffset = value;
    }

    /**
     * Gets the value of the absoluteTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link JdTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsoTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RelocatableOriginType }{@code >}
     *     {@link JAXBElement }{@code <}{@link JdTimeType }{@code >}
     *     
     */
    public JAXBElement<?> getAbsoluteTime() {
        return absoluteTime;
    }

    /**
     * Sets the value of the absoluteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link JdTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsoTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RelocatableOriginType }{@code >}
     *     {@link JAXBElement }{@code <}{@link JdTimeType }{@code >}
     *     
     */
    public void setAbsoluteTime(JAXBElement<?> value) {
        this.absoluteTime = value;
    }

}

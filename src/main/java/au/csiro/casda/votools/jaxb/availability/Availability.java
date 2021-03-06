//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.11 at 03:01:37 PM EST 
//


package au.csiro.casda.votools.jaxb.availability;

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


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Availability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Availability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="downAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="backAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Availability", propOrder = {
    "available",
    "upSince",
    "downAt",
    "backAt",
    "note"
})
// Start inserted code : Updated generated code to include root element - required for availability endpoint
@XmlRootElement
// End inserted code
public class Availability {

    protected boolean available;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upSince;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar downAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar backAt;
    protected List<String> note;

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the upSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpSince() {
        return upSince;
    }

    /**
     * Sets the value of the upSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpSince(XMLGregorianCalendar value) {
        this.upSince = value;
    }

    /**
     * Gets the value of the downAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDownAt() {
        return downAt;
    }

    /**
     * Sets the value of the downAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDownAt(XMLGregorianCalendar value) {
        this.downAt = value;
    }

    /**
     * Gets the value of the backAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBackAt() {
        return backAt;
    }

    /**
     * Sets the value of the backAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBackAt(XMLGregorianCalendar value) {
        this.backAt = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNote() {
        if (note == null) {
            note = new ArrayList<String>();
        }
        return this.note;
    }

}

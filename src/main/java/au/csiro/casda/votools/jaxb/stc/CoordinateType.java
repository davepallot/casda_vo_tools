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


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract coordinate type; a concrete Coordinate consists of a Value, Error, Resolution, Size, and PixSize
 * 
 * <p>Java class for coordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coordinateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}stcBaseType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="frame_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordinateType", propOrder = {
    "name"
})
@XmlSeeAlso({
    StringCoordinateType.class,
    TimeCoordinateType.class,
    PixelVector2CoordinateType.class,
    PixelVector1CoordinateType.class,
    PixelVector3CoordinateType.class,
    Vector3CoordinateType.class,
    Vector2CoordinateType.class,
    OrbitType.class,
    BasicCoordinateType.class,
    AstroCoordsFileType.class
})
public class CoordinateType
    extends StcBaseType
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlAttribute(name = "frame_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object frameId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the frameId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFrameId() {
        return frameId;
    }

    /**
     * Sets the value of the frameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFrameId(Object value) {
        this.frameId = value;
    }

}

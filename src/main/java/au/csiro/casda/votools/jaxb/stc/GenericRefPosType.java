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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for custom positions: specifies reference origin
 * 
 * <p>Java class for genericRefPosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericRefPosType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}referencePositionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}GenCoordinate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericRefPosType", propOrder = {
    "genCoordinate"
})
public class GenericRefPosType
    extends ReferencePositionType
{

    @XmlElementRef(name = "GenCoordinate", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class)
    protected JAXBElement<? extends CoordinateType> genCoordinate;

    /**
     * Gets the value of the genCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ScalarCoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenVector2CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringCoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenVector3CoordinateType }{@code >}
     *     
     */
    public JAXBElement<? extends CoordinateType> getGenCoordinate() {
        return genCoordinate;
    }

    /**
     * Sets the value of the genCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ScalarCoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenVector2CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringCoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenVector3CoordinateType }{@code >}
     *     
     */
    public void setGenCoordinate(JAXBElement<? extends CoordinateType> value) {
        this.genCoordinate = value;
    }

}

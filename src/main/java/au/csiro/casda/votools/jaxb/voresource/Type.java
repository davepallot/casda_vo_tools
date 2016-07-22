//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.11 at 02:55:10 PM EST 
//


package au.csiro.casda.votools.jaxb.voresource;

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


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Archive"/>
 *     &lt;enumeration value="Bibliography"/>
 *     &lt;enumeration value="Catalog"/>
 *     &lt;enumeration value="Journal"/>
 *     &lt;enumeration value="Library"/>
 *     &lt;enumeration value="Simulation"/>
 *     &lt;enumeration value="Survey"/>
 *     &lt;enumeration value="Transformation"/>
 *     &lt;enumeration value="Education"/>
 *     &lt;enumeration value="Outreach"/>
 *     &lt;enumeration value="EPOResource"/>
 *     &lt;enumeration value="Animation"/>
 *     &lt;enumeration value="Artwork"/>
 *     &lt;enumeration value="Background"/>
 *     &lt;enumeration value="BasicData"/>
 *     &lt;enumeration value="Historical"/>
 *     &lt;enumeration value="Photographic"/>
 *     &lt;enumeration value="Press"/>
 *     &lt;enumeration value="Organisation"/>
 *     &lt;enumeration value="Project"/>
 *     &lt;enumeration value="Registry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Type")
@XmlEnum
public enum Type {


    /**
     * 
     *                resource that does not fall into any of the category names
     *                currently defined.
     *              
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     *                Collection of pointed observations
     *              
     * 
     */
    @XmlEnumValue("Archive")
    ARCHIVE("Archive"),

    /**
     * 
     *                Collection of bibliographic reference, abstracts, and 
     *                publications
     *              
     * 
     */
    @XmlEnumValue("Bibliography")
    BIBLIOGRAPHY("Bibliography"),

    /**
     * 
     *                Collection of derived data, primarily in tabular form
     *              
     * 
     */
    @XmlEnumValue("Catalog")
    CATALOG("Catalog"),

    /**
     * 
     *                Collection of scholarly publications under common editorial 
     *                policy
     *              
     * 
     */
    @XmlEnumValue("Journal")
    JOURNAL("Journal"),

    /**
     * 
     *                Collection of published materials (journals, books, etc.)
     *              
     * 
     */
    @XmlEnumValue("Library")
    LIBRARY("Library"),

    /**
     * 
     *                Theoretical simulation or model
     *              
     * 
     */
    @XmlEnumValue("Simulation")
    SIMULATION("Simulation"),

    /**
     * 
     *                Collection of observations covering substantial and
     *                contiguous areas of the sky
     *              
     * 
     */
    @XmlEnumValue("Survey")
    SURVEY("Survey"),

    /**
     * 
     *                A service that transforms data
     *              
     * 
     */
    @XmlEnumValue("Transformation")
    TRANSFORMATION("Transformation"),

    /**
     * 
     *                Collection of materials appropriate for educational use, such
     *                as teaching resources, curricula, etc.
     *              
     * 
     */
    @XmlEnumValue("Education")
    EDUCATION("Education"),

    /**
     * 
     *                Collection of materials appropriate for public outreach, such
     *                as press releases and photo galleries
     *              
     * 
     */
    @XmlEnumValue("Outreach")
    OUTREACH("Outreach"),

    /**
     * 
     *                Collection of materials that may be suitable for EPO
     *                products but which are not in final product form, as in Type 
     *                Outreach or Type Education.  EPOResource would apply,
     *                e.g., to archives with easily accessed preview images or to
     *                surveys with easy-to-use images.
     *              
     * 
     */
    @XmlEnumValue("EPOResource")
    EPO_RESOURCE("EPOResource"),

    /**
     * 
     *                Animation clips of astronomical phenomena
     *              
     * 
     */
    @XmlEnumValue("Animation")
    ANIMATION("Animation"),

    /**
     * 
     *                Artists' renderings of astronomical phenomena or objects
     *              
     * 
     */
    @XmlEnumValue("Artwork")
    ARTWORK("Artwork"),

    /**
     * 
     *                Background information on astronomical phenomena or objects
     *              
     * 
     */
    @XmlEnumValue("Background")
    BACKGROUND("Background"),

    /**
     * 
     *                Compilations of basic astronomical facts about objects,
     *                such as approximate distance or membership in constellation.
     *              
     * 
     */
    @XmlEnumValue("BasicData")
    BASIC_DATA("BasicData"),

    /**
     * 
     *                Historical information about astronomical objects
     *              
     * 
     */
    @XmlEnumValue("Historical")
    HISTORICAL("Historical"),

    /**
     * 
     *                Publication-quality photographs of astronomical objects
     *              
     * 
     */
    @XmlEnumValue("Photographic")
    PHOTOGRAPHIC("Photographic"),

    /**
     * 
     *                Press releases about astronomical objects
     *              
     * 
     */
    @XmlEnumValue("Press")
    PRESS("Press"),

    /**
     * 
     *                An organization that is a publisher or curator of other 
     *                resources.
     *              
     * 
     */
    @XmlEnumValue("Organisation")
    ORGANISATION("Organisation"),

    /**
     * 
     *                A project that is a publisher or curator of other resources
     *              
     * 
     */
    @XmlEnumValue("Project")
    PROJECT("Project"),

    /**
     * 
     *                a query service for which response is a structured
     *                description of resources.
     *              
     * 
     */
    @XmlEnumValue("Registry")
    REGISTRY("Registry");
    private final String value;

    Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type fromValue(String v) {
        for (Type c: Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
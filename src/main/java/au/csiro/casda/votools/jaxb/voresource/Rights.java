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
 * <p>Java class for Rights.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Rights">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="public"/>
 *     &lt;enumeration value="secure"/>
 *     &lt;enumeration value="proprietary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Rights")
@XmlEnum
public enum Rights {


    /**
     * 
     *                   unrestricted, public access is allowed without 
     *                   authentication.
     *                
     * 
     */
    @XmlEnumValue("public")
    PUBLIC("public"),

    /**
     * 
     *                   authenticated, public access is allowed.
     *                
     * 
     */
    @XmlEnumValue("secure")
    SECURE("secure"),

    /**
     * 
     *                   only proprietary access is allowed with authentication.
     *                
     * 
     */
    @XmlEnumValue("proprietary")
    PROPRIETARY("proprietary");
    private final String value;

    Rights(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Rights fromValue(String v) {
        for (Rights c: Rights.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

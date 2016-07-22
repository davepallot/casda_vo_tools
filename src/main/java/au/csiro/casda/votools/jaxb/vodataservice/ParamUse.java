//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.12 at 12:45:57 PM EST 
//


package au.csiro.casda.votools.jaxb.vodataservice;

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
 * <p>Java class for ParamUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParamUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="optional"/>
 *     &lt;enumeration value="ignored"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParamUse")
@XmlEnum
public enum ParamUse {


    /**
     * 
     *                   the parameter is required for the application or
     *                   service to work properly.  
     *                
     * 
     */
    @XmlEnumValue("required")
    REQUIRED("required"),

    /**
     * 
     *                   the parameter is optional but supported by the application or
     *                   service.
     *                
     * 
     */
    @XmlEnumValue("optional")
    OPTIONAL("optional"),

    /**
     * 
     *                   the parameter is not supported and thus is ignored by the 
     *                   application or service.
     *                
     * 
     */
    @XmlEnumValue("ignored")
    IGNORED("ignored");
    private final String value;

    ParamUse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParamUse fromValue(String v) {
        for (ParamUse c: ParamUse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
package au.csiro.casda.votools.availability;

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


import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.HealthEndpoint;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Service;

import au.csiro.casda.votools.VoServiceType;
import au.csiro.casda.votools.jaxb.availability.Availability;

/**
 * Service to generate service availability information
 * 
 * Copyright 2014, CSIRO Australia All rights reserved.
 * 
 */
@Service
public class AvailabilityService
{
    private final SystemStatus systemStatus;

    private final HealthEndpoint healthEndpoint;

    private static Logger logger = LoggerFactory.getLogger(AvailabilityService.class);

    /**
     * @param healthEndpoint
     *            Spring Actuator HealthEndpoint - used here to check application
     * @param systemStatus
     *            contains system upSince
     */
    @Autowired
    public AvailabilityService(HealthEndpoint healthEndpoint, SystemStatus systemStatus)
    {
        this.systemStatus = systemStatus;
        this.healthEndpoint = healthEndpoint;
    }

    /**
     * @param voServiceType
     *            VO Service type required eg TAP, SCS
     * @return Availability to return information to VO clients about the service.
     */
    public Availability getAvailability(VoServiceType voServiceType)
    {
        Availability avail = new Availability();
        Status status = healthEndpoint.invoke().getStatus();
        if (Status.UP.equals(status))
        {
            avail.setAvailable(true);
            avail.getNote().add("");
        }
        else
        {
            avail.setAvailable(false);
            avail.getNote().add("Health check FAILED");
        }
        try
        {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            GregorianCalendar upSinceDate = GregorianCalendar.from(systemStatus.getUpSince());
            XMLGregorianCalendar upSince = datatypeFactory.newXMLGregorianCalendar(upSinceDate);
            avail.setUpSince(upSince);
        }
        catch (DatatypeConfigurationException e)
        {
            logger.error("Exception creating XMLGregorianCalendar for availability", e);
        }
        return avail;
    }

}
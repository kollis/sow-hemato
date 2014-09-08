package com.sow.hemato.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Path("/sample")
public class Sample {

	private static final Logger LOG = LoggerFactory.getLogger(Sample.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() throws Exception {
    	LOG.debug("entered sayHello method of sample service");
    	
        return "sample String from Sample rest service";
    }
}

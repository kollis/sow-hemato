package com.sow.hemato.rest;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sow.hemato.mvc.data.DonorDetails;

@Component
@Path("/registerDonor")
public class RegisterDonor {

    private static final Log LOG = LogFactory.getLog(RegisterDonor.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String registerDonor(DonorDetails donorDetails) throws Exception {
    	LOG.debug("entered registerDonor method of registerDonor service");
    	
    	System.out.println("\n*********donorDetails.getZipcode():" + donorDetails.getZipcode());
    	
        return "sample String from Sample rest service";
    }
}

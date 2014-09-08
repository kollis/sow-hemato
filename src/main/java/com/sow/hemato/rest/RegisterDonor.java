package com.sow.hemato.rest;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sow.hemato.service.DonorDetails;
import com.sow.hemato.service.DonorService;
import com.sow.hemato.service.DonorServiceImpl;

@Component
@Path("/registerDonor")
public class RegisterDonor {

	 private static final Logger LOG = LoggerFactory.getLogger(RegisterDonor.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String registerDonor(DonorDetails donorDetails) throws Exception {
    	LOG.debug("entered registerDonor method of registerDonor service");
    	
    	//System.out.println("\n*********donorDetails.getZipcode():" + donorDetails.getZipcode());
    	
    	DonorService donorService = new DonorServiceImpl();
    	donorService.registerDonor(donorDetails);
    	
        return "sample String from Sample rest service";
    }
}

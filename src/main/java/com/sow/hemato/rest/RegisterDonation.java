package com.sow.hemato.rest;


import javax.annotation.Resource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sow.hemato.service.DonationDetails;
import com.sow.hemato.service.DonationService;

@Component
@Path("/registerDonation")
public class RegisterDonation {
	
	@Resource
	private DonationService donationService;

	private static final Logger LOG = LoggerFactory.getLogger(RegisterDonation.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String registerDonation(DonationDetails donationDetails) throws Exception {
    	LOG.debug("entered registerDonation method of RegisterDonation service");
    	
    	//System.out.println("\n*********donorDetails.getZipcode():" + donorDetails.getZipcode());
    	
    	donationService.registerDonation(donationDetails);
    	
        return "sample String from Sample rest service";
    }
}

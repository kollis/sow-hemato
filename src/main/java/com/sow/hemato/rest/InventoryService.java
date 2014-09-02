package com.sow.hemato.rest;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sow.hemato.mvc.data.InventoryDetail;

@Component
@Path("/inventory")
public class InventoryService {

    private static final Log LOG = LogFactory.getLog(InventoryService.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<InventoryDetail> getInventory() throws Exception {
    	LOG.debug("entered getInventory method of InventoryService");
    	
    	List<InventoryDetail> inventoryDetails = new ArrayList<InventoryDetail>();
    	
    	InventoryDetail inventoryDetail = new InventoryDetail();
    	inventoryDetail.setId("1");
    	inventoryDetail.setGroup("A+");
    	inventoryDetail.setLiters("25");
    	inventoryDetail.setBloodBank("Suraksha");
    	inventoryDetail.setCity("Hyderabad");
    	inventoryDetails.add(inventoryDetail);
    	
    	inventoryDetail = new InventoryDetail();
    	inventoryDetail.setId("2");
    	inventoryDetail.setGroup("B-");
    	inventoryDetail.setLiters("12");
    	inventoryDetail.setBloodBank("Pranadatha");
    	inventoryDetail.setCity("Hyderabad");
    	inventoryDetails.add(inventoryDetail);
    	
    	inventoryDetail = new InventoryDetail();
    	inventoryDetail.setId("3");
    	inventoryDetail.setGroup("O+");
    	inventoryDetail.setLiters("9");
    	inventoryDetail.setBloodBank("NTR");
    	inventoryDetail.setCity("Hyderabad");
    	inventoryDetails.add(inventoryDetail);
    		
        return inventoryDetails;
    }
}

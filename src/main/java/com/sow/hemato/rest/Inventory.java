package com.sow.hemato.rest;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sow.hemato.mvc.data.InventoryDetail;
import com.sow.hemato.service.InventoryService;
import com.sow.hemato.service.InventoryServiceImpl;

@Component
@Path("/inventory")
public class Inventory {
	
	@Resource
	private InventoryService inventoryService;

    private static final Logger LOG = LoggerFactory.getLogger(Inventory.class);
    
    @POST
    public String getInventory() throws Exception {
    	LOG.debug("entered getInventory method of InventoryService");
    	
    	String data = inventoryService.getInventory();
    	
    	System.out.println("\n************data:" + data + ":");
    		
        return data;
    }

   /* @POST
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
    	
    	
    	InventoryService inventoryService = new InventoryServiceImpl();
    	
    	String data = inventoryService.getInventory();
    	
    	System.out.println("\n************data:" + data + ":");
    	
    		
        return inventoryDetails;
    } */
}

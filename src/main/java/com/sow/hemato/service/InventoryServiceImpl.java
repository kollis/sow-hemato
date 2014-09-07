package com.sow.hemato.service;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class InventoryServiceImpl implements InventoryService {

	@Override
	public String getInventory() {
		
		String inventoryDataStr = null;
		StringBuilder inventoryData = new StringBuilder();
		inventoryData.append("[");
		
		try{
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			DB db = mongo.getDB("hematodb");
			DBCollection inventoryCollection = db.getCollection("inventory");
			
			DBCursor cursor = inventoryCollection.find();
			
			while(cursor.hasNext()) {
				inventoryData.append(cursor.next() + ",");
			  // System.out.println(cursor.next());
			}
			
			inventoryData.append("]");
			inventoryDataStr = inventoryData.toString().replaceFirst("(.*),", "$1"); //remove the last ,
					
			cursor.close();			
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
		return inventoryDataStr;
	}

}

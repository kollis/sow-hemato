package com.sow.hemato.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@Service
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
	
	public List<String> getAllBloodBankNames() {
		
		List<String> allBanks = new ArrayList<String>();
	
		try{
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			DB db = mongo.getDB("hematodb");
			DBCollection inventoryCollection = db.getCollection("inventory");
			
			BasicDBObject query = new BasicDBObject(); // because you have no conditions
			BasicDBObject fields = new BasicDBObject("bloodBank",1);
			fields.put("_id", 0);
			
			DBCursor cursor = inventoryCollection.find(query, fields);
			
			while(cursor.hasNext()) {
			  String bankName = (String) cursor.next().get("bloodBank");
			  allBanks.add(bankName);
			  //System.out.println(obj.get("bloodBank"));
			}
		
			cursor.close();			
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
		
		return allBanks;
	}
	

}

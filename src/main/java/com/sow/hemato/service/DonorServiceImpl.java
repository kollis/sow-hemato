package com.sow.hemato.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class DonorServiceImpl implements DonorService {

	@Override
	public void registerDonor(DonorDetails donorDetails) {
		
		try{
			
			Gson gson = new GsonBuilder().create();
			String json = gson.toJson(donorDetails);
			
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			DB db = mongo.getDB("hematodb");
			DBCollection collection = db.getCollection("donors");  
			DBObject dbObject = (DBObject)JSON.parse(json);
			collection.insert(dbObject);
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}

}

package com.sow.hemato.service;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

@Service
public class DonationServiceImpl implements DonationService {

	@Override
	public void registerDonation(DonationDetails donationDetails) {
		
		try{
			
			Gson gson = new GsonBuilder().create();
			String json = gson.toJson(donationDetails);
			
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			DB db = mongo.getDB("hematodb");
			DBCollection collection = db.getCollection("donations");  
			DBObject dbObject = (DBObject)JSON.parse(json);
			collection.insert(dbObject);
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}

}

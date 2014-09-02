package com.sow.hemato.mvc.data;

public class InventoryDetail {
	
	private String id; 
	private String group;
	private String liters;
	private String bloodBank;
	private String city;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getLiters() {
		return liters;
	}
	public void setLiters(String liters) {
		this.liters = liters;
	}
	public String getBloodBank() {
		return bloodBank;
	}
	public void setBloodBank(String bloodBank) {
		this.bloodBank = bloodBank;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

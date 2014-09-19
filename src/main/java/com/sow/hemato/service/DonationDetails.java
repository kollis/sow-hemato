package com.sow.hemato.service;

public class DonationDetails {
	
	private String mobileNumber;
	private String amount;
	private String bloodBank;
	private String donationDate;
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getBloodBank() {
		return bloodBank;
	}
	public void setBloodBank(String bloodBank) {
		this.bloodBank = bloodBank;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}	
}

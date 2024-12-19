package com.vendor.rest_vendor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "cloudinfo")
public class cloudvendor {
	
	
	@Id
	private String VendorID;
	private String Name;
	private String Phone_No;
	private String Address;
	
	// Empty Constructor
	public cloudvendor() {
		
	}
	
	// Constructor for the Cloudvendor class 
	public cloudvendor(String VendorID, String Name , String Phone_No, String Address) {
		this.VendorID = VendorID;
		this.Name = Name;
		this.Phone_No = Phone_No;
		this.Address = Address;
	}


	public String getVendorID() {
		return VendorID;
	}


	public void setVendorID(String vendorID) {
		VendorID = vendorID;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getPhone_No() {
		return Phone_No;
	}


	public void setPhone_No(String phone_No) {
		Phone_No = phone_No;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}
	
}

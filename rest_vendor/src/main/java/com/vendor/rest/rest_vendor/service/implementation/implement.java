package com.vendor.rest.rest_vendor.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vendor.rest.rest_vendor.service.service;
import com.vendor.rest_vendor.model.cloudvendor;
import com.vendor.rest_vendor.repo.cloudVendorRepo;

@Service
public class implement implements service{

	
	// Getting repo in stance 
	@Autowired
	private cloudVendorRepo cloudvendor;
	
	// Constructor for cloudvendor
	public implement(cloudVendorRepo cloudvendor) {
		super();
		this.cloudvendor = cloudvendor;
	}


	@Override
	public String createvendor(cloudvendor vendor) {
		cloudvendor.save(vendor);
		return "Success";
	}

	@Override
	public String updatevendor(cloudvendor vendor) {
		cloudvendor.save(vendor);
		return "Success";
	}

	@Override
	public String deletevendor(String vendorID) {
		cloudvendor.deleteById(vendorID);
		return "Success";
	}

	@Override
	public cloudvendor getdetail(String vendorId) {
		return cloudvendor.findById(vendorId).get();
	}

	@Override
	public List<cloudvendor> getallvendor() {
		return cloudvendor.findAll();
	}

}

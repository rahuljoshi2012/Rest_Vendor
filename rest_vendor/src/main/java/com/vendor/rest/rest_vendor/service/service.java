package com.vendor.rest.rest_vendor.service;

import java.util.List;
import com.vendor.rest_vendor.model.cloudvendor;

public interface service {
	List<cloudvendor> getallvendor();
    String createvendor(cloudvendor vendor);
    String updatevendor(cloudvendor vendor);
    String deletevendor(String vendorID);
    cloudvendor getdetail(String vendorId);
    
}

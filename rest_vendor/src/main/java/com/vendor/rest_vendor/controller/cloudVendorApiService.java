package com.vendor.rest_vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vendor.rest.rest_vendor.service.service;  // No changes here
import com.vendor.rest_vendor.model.cloudvendor;

@RestController
@RequestMapping("/cd")
public class cloudVendorApiService {

	@Autowired
    private final service Service;  

    public cloudVendorApiService(service service) {
        this.Service = service;
    }

    @GetMapping("{VendorID}")
    public cloudvendor cloudVendorGetDetail(@PathVariable("VendorID") String VendorID) {
        return Service.getdetail(VendorID);
    }

    @GetMapping("all")
    public List<cloudvendor> cloudVendorGetall() {
        return Service.getallvendor();
    }

    @PostMapping
    public String createvendor(@RequestBody cloudvendor vendor) {
        System.out.println("POST request received with vendor: " + vendor);
        Service.createvendor(vendor);
        return "Successfully Added Vendor";
    }

    @PutMapping
    public String updatevendor(@RequestBody cloudvendor vendor) {
        Service.updatevendor(vendor);
        return "Successfully Updated Vendor";
    }

    @DeleteMapping("{VendorID}")
    public String deletevendor(@PathVariable("VendorID") String VendorID) {
        Service.deletevendor(VendorID);
        return "Successfully Deleted Vendor";
    }
}

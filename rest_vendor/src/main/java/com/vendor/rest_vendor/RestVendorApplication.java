package com.vendor.rest_vendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vendor.rest", "com.vendor.rest.rest_vendor.service.implementation"})
public class RestVendorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestVendorApplication.class, args);
	}

}
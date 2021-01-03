package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.License;
import com.example.demo.services.LicenseService;

@RestController
@RequestMapping(value = "/v1/{organaizationId}/licenses")
public class LicenseServiceController {

	@Autowired
	private LicenseService licenseService;

	
	 @RequestMapping(value="/tes",method = RequestMethod.GET)
	  //  public List<License> getLicenses( @PathVariable("organaizationId") String organizationId) {
	  public List<License> getLicenses( ) {
		 System.out.println("TESTS" +"dfdf");
		 return Arrays.asList( new License().withLicenseId("yrdy").withLicenseType
				 ("Seat").withOrganaizationId("sfs")
					.withProductName("Teleco"));
	    }
	 
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public License getLicenses(@PathVariable("organaizationId") String organaizationId,
			@PathVariable("licenseId") String licenseId) {
		System.out.println("TESTS" + organaizationId);
		return new License().withLicenseId(licenseId).withLicenseType("Seat").withOrganaizationId(organaizationId)
				.withProductName("Teleco");
	}*/
	/*
	@RequestMapping(value = "{licenseId}", method = RequestMethod.GET)
	public License getLicenses1() {
		System.out.println("TESTS1" );
		return new License().withLicenseId("sds").withLicenseType("Seat").withOrganaizationId
				("ghjg")
				.withProductName("Teleco");
	}*/

	@RequestMapping(value = "{licenseId}", method = RequestMethod.PUT)
	public String updateLicenses(@PathVariable("licenseId") String licenseId) {
		License license= new License().withLicenseId(licenseId).withLicenseType("Seat").withOrganaizationId("dfsfs")
				.withProductName("Teleco");
		
		licenseService.updateLicense(license);
		
		return String.format("This is the put");
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.POST)
	public String saveLicenses(@PathVariable("licenseId") String licenseId) {
		License license= new License().withLicenseId(licenseId).withLicenseType("Seat").withOrganaizationId("dfsfs")
				.withProductName("Teleco");
		
		licenseService.saveLicense(license);
		return String.format("This is the post");
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the Delete");
	}
}

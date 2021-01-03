package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	/*
	 * @RequestMapping(value="/tes",method = RequestMethod.GET) // public
	 * List<License> getLicenses( @PathVariable("organaizationId") String
	 * organizationId) { public List<License> getLicenses( ) {
	 * System.out.println("TESTS" +"dfdf"); return Arrays.asList( new
	 * License().withLicenseId("yrdy").withLicenseType
	 * ("Seat").withOrganaizationId("sfs") .withProductName("Teleco")); }
	 */
	@RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
	public License getLicenses(@PathVariable("organaizationId") String organaizationId,
			@PathVariable("licenseId") String licenseId) {
		System.out.println("TESTS22" + organaizationId);
		licenseService.getLicense(organaizationId, licenseId);
		return new License().withLicenseId(licenseId).withLicenseType("Seat").withOrganaizationId(organaizationId)
				.withProductName("Teleco");
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.PUT)
	public String updateLicenses(@RequestBody License license) {
		licenseService.updateLicense(license);
		return String.format("This is the put");
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String saveLicenses(@RequestBody License license) {
		System.out.println("save method called");
		licenseService.saveLicense(license);
		return String.format("This is the post 1");
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
		licenseService.deleteLicense(licenseId);
		return String.format("This is the Delete");
	}
}

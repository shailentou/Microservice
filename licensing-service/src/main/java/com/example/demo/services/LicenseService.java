package com.example.demo.services;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.ServiceConfig;
import com.example.demo.model.License;
import com.example.demo.repositery.LicenseRepository;

@Service
public class LicenseService {

	@Autowired
	private LicenseRepository licenseRepository; 
	
	@Autowired
	ServiceConfig config;
	
	public License getLicense(String organizationId, String licenseId) {
		License license= licenseRepository.findByorganizationIdAndLicenseId(organizationId, licenseId);
		return license;
	}
	
	public List<License> getLicenseByOrg(String organizationId, String licenseId) {
		List<License> ls= licenseRepository.findByorganizationId(organizationId);
		return ls;
	}
	public void saveLicense(License license) {
		license.withLicenseId(UUID.randomUUID().toString());
		licenseRepository.save(license);
	}
	
	public void updateLicense(License license) {
		licenseRepository.save(license);
	}
	
	public void deleteLicense(String licenseId) {
		License license= licenseRepository.findByLicenseId( licenseId);
		licenseRepository.delete(license);
	}
}

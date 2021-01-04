package com.example.demo.repositery;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.License;

public interface LicenseRepository extends CrudRepository<License,String> {

	public List<License> findByorganizationId(String organizationId);
	
	public License findByorganizationIdAndLicenseId(String organizationId,String licenseId);
	
	public License findByLicenseId(String licenseId);
	}

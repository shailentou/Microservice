package com.example.demo.repositery;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.License;

public interface LicenseRepository extends CrudRepository<License,String> {

	public List<License> findByOrganaizationId(String organaizationId);
	
	public License findByOrganaizationIdAndLicenseId(String organaizationId,String licenseId);
	}

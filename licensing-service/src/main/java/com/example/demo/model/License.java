package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licenses")
public class License {

	@Id
	@Column(name = "license_id", nullable = false)
	private String licenseId;

	@Column(name = "produce_name", nullable = false)
	private String productName;

	@Column(name = "license_type", nullable = false)
	private String licenseType;
	
	@Column(name = "organization_Id", nullable = false)
	private String organaizationId;

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getOrganaizationId() {
		return organaizationId;
	}

	public void setOrganaizationId(String organaizationId) {
		this.organaizationId = organaizationId;
	}

	public License withLicenseId(String id) {
		this.setLicenseId(id);
		return this;
	}

	public License withProductName(String p) {

		this.setProductName(p);
		return this;
	}

	public License withLicenseType(String lt) {
		this.setLicenseType(lt);
		return this;
	}

	public License withOrganaizationId(String id) {
		this.setOrganaizationId(id);
		return this;
	}
}

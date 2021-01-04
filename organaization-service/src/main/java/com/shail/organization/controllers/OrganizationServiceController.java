package com.shail.organization.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shail.organization.model.Organization;
import com.shail.organization.services.OrganizationService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/organizations")
public class OrganizationServiceController {
    @Autowired
    private OrganizationService orgService;


	  @RequestMapping(value="/",method = RequestMethod.GET) 
	  public Optional<Organization> getOrganization() {
		  System.out.println("aaaa");
		  return orgService.getOrg("gfhg");
	  }
	 

	
	  @RequestMapping(value="/{organizationId}",method = RequestMethod.GET) 
	  public Optional<Organization> getOrganization( @PathVariable("organizationId")
	  String organizationId) { return orgService.getOrg(organizationId); }
	 

    @RequestMapping(value="/{organizationId}",method = RequestMethod.PUT)
    public void updateOrganization( @PathVariable("organizationId") String orgId, @RequestBody Organization org) {
        orgService.updateOrg( org );
    }

    @RequestMapping(value="/",method = RequestMethod.POST)
    public void saveOrganization(@RequestBody Organization org) {
      System.out.println("DFSDFS");
    	orgService.saveOrg( org );
    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization( @PathVariable("orgId") String orgId,  @RequestBody Organization org) {
        orgService.deleteOrg( org );
    }
} 

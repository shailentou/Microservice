package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LicensingServiceApplication {

	 
	public static void main(String[] args) {
		SpringApplication.run(LicensingServiceApplication.class, args);
	//	ServiceConfig sc = new ServiceConfig();	
		//sc.getExampleProperty();
	}

}

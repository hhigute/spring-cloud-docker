package com.h3b.investment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h3b.investment.bean.LimitConfiguration;
import com.h3b.investment.config.LimitsServiceConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitsServiceConfiguration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(	configuration.getMaximum(), 
										configuration.getMinimum());
	}
	
	@GetMapping("/limits-fault-tolerance")
	@HystrixCommand(fallbackMethod = "fallbackRetriveConfiguration")
	public LimitConfiguration retrieveConfiguration() {
		throw new RuntimeException("Not available");
	}
	
	public LimitConfiguration fallbackRetriveConfiguration() {
		return new LimitConfiguration(999, 9);
	}
	
	
}

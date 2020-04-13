package com.h3b.investment.fee.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.h3b.investment.fee.bean.CalculateFeeBean;
import com.h3b.investment.fee.service.CalculateFeeService;

@RestController
public class CalculateFeeController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CalculateFeeService calculateFeeService;
	
	@GetMapping("/calculate-iof/day/{day}/amount/{amount}")
	public CalculateFeeBean calculateIofFee(@PathVariable int day, 
											@PathVariable BigDecimal amount) {
		
		CalculateFeeBean calculateFeeBean = calculateFeeService.calculateIofFee(day, amount);
		
		return calculateFeeBean;
		
	}
	
	
	@GetMapping("/calculate-iof-feign/day/{day}/amount/{amount}")
	public CalculateFeeBean calculateIofFeeFeign(@PathVariable int day, 
												@PathVariable BigDecimal amount) {
		
		CalculateFeeBean calculateFeeBean = calculateFeeService.calculateIofFeeFeign(day, amount);
		
		logger.info("{}",calculateFeeBean.toString());
		
		return calculateFeeBean;
		
	}
	
}

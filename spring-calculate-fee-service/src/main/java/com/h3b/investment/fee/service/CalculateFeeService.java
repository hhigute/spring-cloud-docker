package com.h3b.investment.fee.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.h3b.investment.fee.bean.CalculateFeeBean;
import com.h3b.investment.fee.proxy.SpringPreLoadDataServiceProxy;

@Service
public class CalculateFeeService {

	
	@Autowired
	private SpringPreLoadDataServiceProxy proxy;
	

	public CalculateFeeBean calculateIofFee(@PathVariable int day, 
											@PathVariable BigDecimal amount) {
		
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("day", String.valueOf(day));
		
		ResponseEntity<CalculateFeeBean> responseEntity =
		new RestTemplate().getForEntity("http://localhost:8000/api/v1/iof/{day}", CalculateFeeBean.class, uriVariables);
		
		CalculateFeeBean response = responseEntity.getBody();
		
		BigDecimal percentFee = new BigDecimal(response.getPercentFee()/100);
		BigDecimal calculatedFee = amount.multiply(percentFee);
		
		BigDecimal calculatedAmount = amount.subtract(calculatedFee);
		
		return new CalculateFeeBean(day, response.getPercentFee(), amount, calculatedAmount, calculatedFee, response.getPort(), response.getHost());
		
	}
	
	

	public CalculateFeeBean calculateIofFeeFeign(@PathVariable int day, 
												@PathVariable BigDecimal amount) {
		
		CalculateFeeBean response = proxy.getIofByNrDay(day);
		

		
		BigDecimal percentFee = new BigDecimal(response.getPercentFee()/100);
		BigDecimal calculatedFee = amount.multiply(percentFee);
		BigDecimal calculatedAmount = amount.subtract(calculatedFee);
		
		
		return new CalculateFeeBean(day, response.getPercentFee(), amount, calculatedAmount, calculatedFee, response.getPort(), response.getHost());
				
	}
	
	
}

package com.h3b.investment.fee.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.h3b.investment.fee.bean.CalculateFeeBean;
import com.h3b.investment.fee.exception.ResourceNotFoundException;


//@FeignClient(name = "spring-preload-data-service",url = "localhost:8001")
//@FeignClient(name = "spring-preloaded-data-service")
@FeignClient(name = "spring-zuul-api-gateway-server")
@RibbonClient(name = "spring-preloaded-data-service")
public interface SpringPreLoadDataServiceProxy {

	//@GetMapping("/api/v1/iof/{nrDay}")
	@GetMapping("/spring-preloaded-data-service/api/v1/iof/{nrDay}")
	public CalculateFeeBean getIofByNrDay(@PathVariable(value="nrDay") int nrDay);
		

	
}

package com.h3b.investment.preload.controller;

import java.net.UnknownHostException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h3b.investment.preload.dto.IofDto;
import com.h3b.investment.preload.exception.ResourceNotFoundException;
import com.h3b.investment.preload.service.IofService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/v1", produces = {"application/json"})
public class IofController{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IofService iofService;
	
	@GetMapping("/iof")
	@ApiOperation(value="List all IOF fees")
	public List<IofDto> listIofs(){
		return iofService.listIofs();
	}

	@GetMapping("/iof/{nrDay}")
	@ApiOperation(value="Get IOF fee by day")
	public ResponseEntity<IofDto> getIofByNrDay(@PathVariable(value="nrDay") int nrDay) throws ResourceNotFoundException, UnknownHostException {
		IofDto iofDto = iofService.getIofByNrDay(nrDay);


		logger.info("{}",iofDto.toString());
		return ResponseEntity.ok().body(iofDto);
	}
}
package com.h3b.investment.preload.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.google.common.collect.Lists;
import com.h3b.investment.preload.dto.IofDto;
import com.h3b.investment.preload.dto.transformation.ListUtils;
import com.h3b.investment.preload.exception.ResourceNotFoundException;
import com.h3b.investment.preload.model.Iof;
import com.h3b.investment.preload.repository.IofRepository;



@Service
public class IofService {
	
	@Autowired 
	Environment enviroment;

	@Autowired
	private IofRepository iofRepository;
	
	public List<IofDto> listIofs(){
		ListUtils<IofDto> utils = BeanUtils.instantiate(ListUtils.class);
		List<Iof> listIof = iofRepository.findAll();
		List<IofDto> iofInfoList = Lists.newLinkedList();
		
		if(listIof !=null && listIof.size()>0) 
			utils.copyList(listIof, iofInfoList, IofDto.class);	
		
		return iofInfoList;
	}

	public IofDto getIofByNrDay(@PathVariable(value="nrDay") int nrDay) throws ResourceNotFoundException, UnknownHostException{
		IofDto iofDto = new IofDto();
		iofDto.setPort(Integer.parseInt(enviroment.getProperty("local.server.port")));
		iofDto.setHost(InetAddress.getLocalHost().getHostAddress());
		Iof iof = iofRepository.findById(nrDay)
									.orElseGet(
												()->new Iof(nrDay, 0)
									);
									
		
		if(iof != null )
			BeanUtils.copyProperties(iof, iofDto);
		
		return iofDto;
	}
	
}

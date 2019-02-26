package com.pichincha.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pichincha.entity.CiudadEntity;
import com.pichincha.repository.CiudadRepository;

import lombok.Getter;
import lombok.Setter;

@Service
public class CiudadService {

	
	@Resource
	@Setter
	@Getter
    private CiudadRepository ciudadRepository;
	
	public List<CiudadEntity> findAll() {
		return ciudadRepository.findAll();		
	}
}

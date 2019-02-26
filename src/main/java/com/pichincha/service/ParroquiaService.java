package com.pichincha.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pichincha.entity.ParroquiaEntity;
import com.pichincha.repository.ParroquiaRepository;

import lombok.Getter;
import lombok.Setter;

@Service
public class ParroquiaService {

	
	@Resource
	@Setter
	@Getter
    private ParroquiaRepository parroquiaRepository;
	
	public List<ParroquiaEntity> findAll() {
		return parroquiaRepository.findAll();		
	}
}

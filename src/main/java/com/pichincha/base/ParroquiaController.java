package com.pichincha.base;

import com.pichincha.entity.ParroquiaEntity;
import com.pichincha.repository.ParroquiaRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.sql.DataSource;

@SpringBootApplication
@RestController
@RequestMapping("/bpc/catalogo/parroquia")
@CrossOrigin(origins = "*")
public class ParroquiaController {

	@Autowired
	DataSource dataSource;

	@Autowired
	ParroquiaRepository parroquiaRepository;
	

    @PostMapping("/all")
	public List<ParroquiaEntity> getParroquias() throws Exception {
    	return parroquiaRepository.findAll();
    	
    }
}

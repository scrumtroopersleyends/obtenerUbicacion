package com.pichincha.base;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pichincha.entity.CiudadEntity;
import com.pichincha.repository.CiudadRepository;

/**
 * Servicio que gestiona el listado de ciudades
 * @author dbello
 * @date 13/02/2019
 */
@SpringBootApplication
@RestController
@RequestMapping("/bpc/catalogo/ciudad")
@CrossOrigin(origins = "*")
public class CiudadController {

	@Autowired
	DataSource dataSource;

	@Autowired
	CiudadRepository ciudadRepository;

	@PostMapping("/all")
	public List<CiudadEntity> getCiudades() throws Exception {
		return ciudadRepository.findAll();
	}

}

package com.pichincha.base;

import com.pichincha.entity.CiudadEntity;
import com.pichincha.entity.ParroquiaEntity;
import com.pichincha.model.Response;

import lombok.Getter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/parroquia")
public class ParroquiaController {

    public static void main(String[] args) {
        SpringApplication.run(ParroquiaController.class, args);
    }


    @PostMapping("/all")
	public ResponseEntity<List<ParroquiaEntity>> getParroquias() throws Exception {
    	
    	ParroquiaEntity parroquiaEntity1 = new ParroquiaEntity();
    	parroquiaEntity1.setCOD_PROVINCIA("01");
    	parroquiaEntity1.setCOD_CANTON("0101");
    	parroquiaEntity1.setCOD_PARROQUIA("010102");
    	parroquiaEntity1.setNOM_PARROQUIA("CAÑARIBAMBA");
    	parroquiaEntity1.setTIP_PARROQUIA("URBANAS");
    	parroquiaEntity1.setCOD_USU_ALTA("CARGA");
    	parroquiaEntity1.setFEC_ALTA("11/12/2008");
    	parroquiaEntity1.setTIMESTAMP_SIGLO("11/12/08 16:59:06,271848");
    	parroquiaEntity1.setCOD_USU_MODIF("");
    	parroquiaEntity1.setFEC_MODIF("01/01/0001");
    	parroquiaEntity1.setFEC_BAJA("");
    	
    	ParroquiaEntity parroquiaEntity2 = new ParroquiaEntity();
    	parroquiaEntity2.setCOD_PROVINCIA("01");
    	parroquiaEntity2.setCOD_CANTON("0101");
    	parroquiaEntity2.setCOD_PARROQUIA("010103");
    	parroquiaEntity2.setNOM_PARROQUIA("EL BATÁN");
    	parroquiaEntity2.setTIP_PARROQUIA("URBANAS");
    	parroquiaEntity2.setCOD_USU_ALTA("CARGA");
    	parroquiaEntity2.setFEC_ALTA("11/12/2008");
    	parroquiaEntity2.setTIMESTAMP_SIGLO("11/12/08 16:59:06,303622");
    	parroquiaEntity2.setCOD_USU_MODIF("");
    	parroquiaEntity2.setFEC_MODIF("01/01/0001");
    	parroquiaEntity2.setFEC_BAJA("");
    	
		List<ParroquiaEntity> parroquias =new ArrayList<>();
		parroquias.add(parroquiaEntity1);
		parroquias.add(parroquiaEntity2);

		return ResponseEntity.ok(parroquias);
    	
    }
}

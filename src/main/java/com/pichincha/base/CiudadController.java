package com.pichincha.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Servicio que gestiona el lsitado de ciudades
 * @author dbello
 * @date 13/02/2019
 */
import com.pichincha.entity.CiudadEntity;

@SpringBootApplication
@RestController
@RequestMapping("/ciudad")
public class CiudadController {

	@PostMapping("/all")
	public ResponseEntity<List<CiudadEntity>> getCiudades() throws Exception {

		CiudadEntity ciudadEntity1 = new CiudadEntity();
		ciudadEntity1.setINST_NO("003");
		ciudadEntity1.setCITY_CODE("0231");
		ciudadEntity1.setPROVINCE_CODE("13");
		ciudadEntity1.setDESCRIPTION("CALDERON");
		ciudadEntity1.setSTATUS("00");
		ciudadEntity1.setREGION_CODE("0000");
		ciudadEntity1.setUDEV_REGION("N");
		ciudadEntity1.setPUBL_AMOUNT("0.000");
		ciudadEntity1.setCHQ_DELIVERY("");

		CiudadEntity ciudadEntity2 = new CiudadEntity();
		ciudadEntity2.setINST_NO("003");
		ciudadEntity2.setCITY_CODE("0232");
		ciudadEntity2.setPROVINCE_CODE("13");
		ciudadEntity2.setDESCRIPTION("CANUTO");
		ciudadEntity2.setSTATUS("00");
		ciudadEntity2.setREGION_CODE("0000");
		ciudadEntity2.setUDEV_REGION("N");
		ciudadEntity2.setPUBL_AMOUNT("0.000");
		ciudadEntity2.setCHQ_DELIVERY("");

		List<CiudadEntity> ciudades = new ArrayList<>();
		ciudades.add(ciudadEntity1);
		ciudades.add(ciudadEntity2);

		return ResponseEntity.ok(ciudades);
	}

}

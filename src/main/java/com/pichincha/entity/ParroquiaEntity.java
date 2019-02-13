package com.pichincha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ParroquiaEntity {
	
	@Id
	private String COD_PROVINCIA;
	private String COD_CANTON;
	private String COD_PARROQUIA;
	private String NOM_PARROQUIA;
	private String TIP_PARROQUIA;
	private String COD_USU_ALTA;
	private String FEC_ALTA;
	private String TIMESTAMP_SIGLO;
	private String COD_USU_MODIF;
	private String FEC_MODIF;
	private String FEC_BAJA;
	
}

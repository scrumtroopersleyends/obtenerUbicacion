package com.pichincha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "parroquia")
@AllArgsConstructor
public class ParroquiaEntity {

	@Id
	private String id;
	private String cod_provincia;
	private String cod_canton;
	private String cod_parroquia;
	private String nom_parroquia;
	private String tip_parroquia;
	private String cod_usu_alta;
	private String fec_alta;
	private String timestamp_siglo;
	private String cod_usu_modif;
	private String fec_modif;
	private String fec_baja;

	public ParroquiaEntity() {
		super();
	}
}

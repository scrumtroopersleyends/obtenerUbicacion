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
@Table(name="ciudad")
@AllArgsConstructor
public class CiudadEntity {
	
	@Id
	private String id;
	private String inst_no;
	private String city_code;
	private String province_code;
	private String description;
	private String status;
	private String region_code;
	private String udev_region;
	private String publ_amount;
	private String chq_delivery;
	
	public CiudadEntity() {
		super();
	}

}

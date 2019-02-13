package com.pichincha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class CiudadEntity {
	
	@Id
	private String INST_NO;
	private String CITY_CODE;
	private String PROVINCE_CODE;
	private String DESCRIPTION;
	private String STATUS;
	private String REGION_CODE;
	private String UDEV_REGION;
	private String PUBL_AMOUNT;
	private String CHQ_DELIVERY;
	
}

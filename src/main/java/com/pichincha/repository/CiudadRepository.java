package com.pichincha.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pichincha.entity.CiudadEntity;

@Transactional
@Repository
public interface CiudadRepository extends JpaRepository<CiudadEntity, Long> {

	List<CiudadEntity> findAll();
	
}
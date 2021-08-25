package com.trip.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.report.model.AttributesFields;

@Repository
public interface AttributesFieldsRepository extends JpaRepository<AttributesFields, Long>{

}

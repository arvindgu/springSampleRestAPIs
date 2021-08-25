package com.trip.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.report.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
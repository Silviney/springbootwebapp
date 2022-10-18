package com.springbootwebapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springbootwebapp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(
	        nativeQuery = true,
	        value = "SELECT * " +
	                "FROM tbl_employees " +
	        		"ORDER BY name")
	public List<Employee> findAll();
	
}

package com.springbootwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootwebapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

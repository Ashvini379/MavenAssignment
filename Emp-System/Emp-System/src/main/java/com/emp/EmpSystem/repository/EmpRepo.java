package com.emp.EmpSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employee.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}

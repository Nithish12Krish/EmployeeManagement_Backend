package com.example.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.employeemanager.model.Employee;
@Transactional
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id);
	
	Optional<Employee> findEmployeeById(Long id);

}

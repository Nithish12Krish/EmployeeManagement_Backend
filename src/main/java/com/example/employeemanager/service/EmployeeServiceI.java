package com.example.employeemanager.service;

import java.util.List;
import java.util.UUID;

import com.example.employeemanager.exception.UserNotFoundException;
import com.example.employeemanager.model.Employee;
import com.example.employeemanager.repo.EmployeeRepo;

public interface EmployeeServiceI {
		
	Employee addEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	Employee updateEmployee(Employee employee);
	
	Employee findEmployee(Long id);
	
	void deleteEmployee(Long id);

}

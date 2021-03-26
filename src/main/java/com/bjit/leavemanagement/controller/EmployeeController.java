package com.bjit.leavemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjit.leavemanagement.model.Employee;
import com.bjit.leavemanagement.service.EmployeeService;
@CrossOrigin(origins = "*")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/employees")
	public List<Employee> getallStudent() {
		return employeeservice.showallEmployees();
	}
}

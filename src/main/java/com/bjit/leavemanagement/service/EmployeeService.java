package com.bjit.leavemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.leavemanagement.model.Employee;
import com.bjit.leavemanagement.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public List<Employee> showallEmployees() {
		return repo.findAll();
	}

}

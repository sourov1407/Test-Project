package com.bjit.leavemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.leavemanagement.model.Department;
import com.bjit.leavemanagement.repo.DepartmentRepo;

@Service
public class DepartmentService {
 
	@Autowired
	DepartmentRepo repo;
	
	public List<Department> showallDepartments() {
		return repo.findAll();
	}
}

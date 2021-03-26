package com.bjit.leavemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjit.leavemanagement.model.Department;
import com.bjit.leavemanagement.service.DepartmentService;
@CrossOrigin(origins = "*")
@RestController
public class DepartmentController {
	@Autowired
	DepartmentService deptservice;
	
	@GetMapping("/departments")
	public List<Department> getallStudent() {
		return deptservice.showallDepartments();
	}
	
}

package com.bjit.leavemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjit.leavemanagement.model.LeaveType;
import com.bjit.leavemanagement.service.LeaveTypeService;
@CrossOrigin(origins = "*")
@RestController
public class LeaveTypeController {
  @Autowired
  LeaveTypeService leavetypeservice;
  
  @GetMapping("/leavetypes")
  public List<LeaveType> getallStudent() {
		return leavetypeservice.showallLeaveType();
	}
  
}

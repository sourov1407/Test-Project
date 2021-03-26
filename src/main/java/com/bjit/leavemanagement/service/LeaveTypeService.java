package com.bjit.leavemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.leavemanagement.model.LeaveType;
import com.bjit.leavemanagement.repo.LeaveTypeRepo;

@Service
public class LeaveTypeService {
	
	@Autowired
	LeaveTypeRepo repo;
	
	public List<LeaveType> showallLeaveType() {
		return repo.findAll();
	}
	

}

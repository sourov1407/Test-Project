package com.bjit.leavemanagement.service;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.leavemanagement.model.Leave;
import com.bjit.leavemanagement.repo.LeaveRepo;

@Service
public class LeaveService {

	@Autowired
	LeaveRepo repo;
	
	
	public List<Leave> showallLeave() {
		return repo.findAll();
	}
	
	public void deleteLeave(Long id) {
		repo.deleteById(id);
	}
	
	public Leave showLeave(Long id) {
		return repo.findById(id).get();
	}
	
	public Leave addLeave(Leave leave) {
		LocalDate start=leave.getStartDate();
		LocalDate end=leave.getEndDate();
		long daysBetween = DAYS.between(start, end);
		leave.setCountDays(daysBetween+1);
		leave.setStatus("to approve");
		leave.setRequestType("Leave Request");
		leave.setMode("By Employee");
		return repo.save(leave);
	}
	public Leave updateLeave(Long leaveid,Leave leave ) {
		
		Leave lv=repo.findById(leaveid).get();
		lv.setDescription(leave.getDescription());
		lv.setLeavetype(leave.getLeavetype());
		lv.setStatus(leave.getStatus());
		lv.setEmployee(leave.getEmployee());
		lv.setDepartment(leave.getDepartment());
		lv.setStartDate(leave.getStartDate());
		lv.setEndDate(leave.getEndDate());
		lv.setMode(leave.getMode());
		LocalDate start=leave.getStartDate();
		LocalDate end=leave.getEndDate();
		long daysBetween = DAYS.between(start, end);
		lv.setCountDays(daysBetween);
		return repo.save(lv);
		
	}
	
	public Leave updateStatus(Long leaveid) {
		Leave lv=repo.findById(leaveid).get();
//		System.out.println(lv.getStatus()+" "+lv.getLeaveid());
		String st=lv.getStatus();
		if(st.equals("to approve")){
			System.out.println("hello");
		lv.setStatus("approved");
		}
		else lv.setStatus("to approve");
		return repo.save(lv);
	}
	
	
}

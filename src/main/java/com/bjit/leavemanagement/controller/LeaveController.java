package com.bjit.leavemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bjit.leavemanagement.model.Leave;
import com.bjit.leavemanagement.service.LeaveService;

@CrossOrigin(origins = "*")
@RestController
public class LeaveController {

	@Autowired
	LeaveService leaveservice;
	
	@PostMapping("/createleave")
	public Leave save(@RequestBody Leave leave) {
		return leaveservice.addLeave(leave);
	}
	
	
	@PutMapping("/editleave/{leaveid}")
	public Leave update(@PathVariable Long leaveid,@RequestBody Leave leave) {
		Leave lvUpdate = leaveservice.updateLeave(leaveid, leave);
		return lvUpdate;
	}
	
	
	@PutMapping("/status/{leaveid}")
	public Leave statusUpdate(@PathVariable Long leaveid) {
		Leave lvUpdate = leaveservice.updateStatus(leaveid);
		return lvUpdate;
	}
	

	@GetMapping("/leaves")
	public List<Leave> getallLeaves() {
		return leaveservice.showallLeave();
	}
	

	@GetMapping("/leave/{leaveid}")
	public Leave getLeave(@PathVariable(name = "leaveid") Long leaveid) {
		return leaveservice.showLeave(leaveid);
	}
	
	
	@DeleteMapping("/leave/{leaveid}")
	public String delete(@PathVariable(name = "leaveid") Long leaveid) {
		leaveservice.deleteLeave(leaveid);
		return "deleted";
	}
	
	

}

package com.bjit.leavemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.leavemanagement.model.LeaveType;

public interface LeaveTypeRepo  extends JpaRepository<LeaveType, Long>{

}

package com.bjit.leavemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.leavemanagement.model.Leave;

public interface LeaveRepo extends JpaRepository<Leave, Long>{

}

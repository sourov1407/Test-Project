package com.bjit.leavemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.leavemanagement.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long>{

}

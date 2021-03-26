package com.bjit.leavemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.leavemanagement.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}

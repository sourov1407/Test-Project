package com.bjit.leavemanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "leavetype_table")
@Entity
public class LeaveType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leavetype_id;
	private String leaveType;
}

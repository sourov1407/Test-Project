package com.bjit.leavemanagement.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.ToString;
@ToString
@Data
@Entity
@Table(name = "Leave_table")
public class Leave {
	@Id
	@Column(name = "leave_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leaveid;
	private String description;
	private String leavetype;
	private String mode;
	private String employee;
	private String department;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "start_date")
	private LocalDate startDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "end_date")
	private LocalDate endDate;
	private Long countDays;
	private String status;
	private String requestType;
	private String comment;
	
}

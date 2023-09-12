package com.ex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
	
	@Id
	@NonNull
	private Integer empId;
	private String empName;
	private Double empSal;
	
	//@ManyToOne(fetch=FetchType.LAZY)  //It will fetch only parent table details
	@ManyToOne(fetch=FetchType.EAGER)   //It will fetch parent and child table details and by default it will give EAGER
	@JoinColumn(name="didFk")
	private Dept deptOb;

}

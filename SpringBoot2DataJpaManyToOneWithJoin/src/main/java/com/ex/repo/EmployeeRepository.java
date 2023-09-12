package com.ex.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ex.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//@Query("SELECT e.empName,d.deptCode FROM Employee e INNER JOIN e.deptOb as d")
	//@Query("SELECT e.empName,d.deptCode FROM Employee e LEFT OUTER JOIN e.deptOb as d")
	@Query("SELECT e.empName,d.deptCode FROM Employee e RIGHT OUTER JOIN e.deptOb as d")
	//@Query("SELECT e.empName,d.deptCode FROM Employee e FULL OUTER JOIN e.deptOb as d")  //Full outer join not supported
	List <Object[]>getEmpNameandDeptCode();
	
	@Query("SELECT e.empName,d.deptCode FROM Employee e LEFT OUTER JOIN e.deptOb as d WHERE e.empId=:empId")
	Object getEmpNameandDeptCodeById(Integer empId);

}

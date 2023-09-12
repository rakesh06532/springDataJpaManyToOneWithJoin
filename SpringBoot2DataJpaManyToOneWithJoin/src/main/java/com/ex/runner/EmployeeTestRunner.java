package com.ex.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ex.model.Employee;
import com.ex.repo.DeptRepository;
import com.ex.repo.EmployeeRepository;

@Component
@Order(11)
public class EmployeeTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Autowired
	private DeptRepository deptRepo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(55,"A",3.3,null));
		repo.save(new Employee(56,"B",3.9,deptRepo.findByDeptId(10)));
		repo.save(new Employee(57,"C",4.3,null));
		repo.save(new Employee(58,"D",6.2,deptRepo.findByDeptId(11)));

	}

}

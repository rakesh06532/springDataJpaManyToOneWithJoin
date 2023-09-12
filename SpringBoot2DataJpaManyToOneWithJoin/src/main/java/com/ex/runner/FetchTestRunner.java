package com.ex.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ex.model.Employee;
import com.ex.repo.EmployeeRepository;

@Component
@Order(12)
public class FetchTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		//Optional<Employee> opl=repo.findById(55);
		//System.out.println("Okay");
		
		List<Object[]> list=repo.getEmpNameandDeptCode();
		for(Object[] ob:list) {
			System.out.println(ob[0]+"="+ob[1]);
		}
		
		Object[] ob=(Object[])repo.getEmpNameandDeptCodeById(56);
		System.out.println(ob[0]+"-"+ob[1]);

	}

}

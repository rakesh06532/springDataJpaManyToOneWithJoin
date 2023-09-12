package com.ex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.model.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer> {
	
	 Dept findByDeptId(Integer deptId);

}

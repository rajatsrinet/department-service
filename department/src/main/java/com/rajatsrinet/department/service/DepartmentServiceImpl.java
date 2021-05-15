package com.rajatsrinet.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajatsrinet.department.entity.Department;
import com.rajatsrinet.department.reporitory.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
		
	}

	@Override
	public Department findDepartment(Long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id).get();
	}

}

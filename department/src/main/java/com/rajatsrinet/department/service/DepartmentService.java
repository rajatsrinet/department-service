package com.rajatsrinet.department.service;


import com.rajatsrinet.department.entity.Department;


public interface DepartmentService {

	Department saveDepartment(Department department);

	Department findDepartment(Long id);

}

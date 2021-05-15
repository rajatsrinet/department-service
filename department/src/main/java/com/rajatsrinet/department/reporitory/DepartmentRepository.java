package com.rajatsrinet.department.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajatsrinet.department.entity.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long>{

}

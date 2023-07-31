package com.techbytes.empmgmtapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techbytes.empmgmtapi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

package com.employee.EmployeeApplication.EmployeeRepository;

import com.employee.EmployeeApplication.EmployeeInfo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

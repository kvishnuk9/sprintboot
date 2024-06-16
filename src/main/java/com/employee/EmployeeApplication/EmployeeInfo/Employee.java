package com.employee.EmployeeApplication.EmployeeInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employeeId;
    String employeename;
    String employeelocation;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void setEmployeelocation(String employeelocation) {
        this.employeelocation = employeelocation;
    }

    public Employee(int employeeId, String employeename, String employeelocation) {
        this.employeeId = employeeId;
        this.employeename = employeename;
        this.employeelocation = employeelocation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getEmployeelocation() {
        return employeelocation;
    }
}



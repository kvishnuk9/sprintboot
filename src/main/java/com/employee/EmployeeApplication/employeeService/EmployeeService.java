package com.employee.EmployeeApplication.employeeService;

import com.employee.EmployeeApplication.EmployeeInfo.Employee;
import com.employee.EmployeeApplication.EmployeeRepository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class EmployeeService {
    List<Employee> employeelist = new ArrayList<>(Arrays.asList(
                                                new Employee(1,"Vishnu","Chicago"),
                                                new Employee(2,"Satyam","Kadapa")
    ));

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        /*return employeelist;*/
        return employeeRepository.findAll();
    }

    public Employee getAnEmployee(int id){
        return employeelist.stream().filter(e ->(e.getEmployeeId()==id)).findFirst().get();
    }

    public void createEmployee(Employee employee){
       // employeelist.add(employee);
       employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee){
      /*  List<Employee> tempEmployee = new ArrayList<>();
        for (Employee emp : employeelist ){
            if (emp.getEmployeeId()==employee.getEmployeeId()) {
                emp.setEmployeename(employee.getEmployeename());
                emp.setEmployeelocation(employee.getEmployeelocation());
            }
            tempEmployee.add(emp);
        }
        this.employeelist=tempEmployee;*/
        employeeRepository.save(employee);

    }
    public void deleteEmployee(int id){
        /*List<Employee> tempEmployee = new ArrayList<>();
        for (Employee emp: employeelist){
            if(emp.getEmployeeId()==id){
                continue;
            }
            tempEmployee.add(emp);
        }
        this.employeelist=tempEmployee;*/
        employeeRepository.delete(employeeRepository.getById(id));
    }
}


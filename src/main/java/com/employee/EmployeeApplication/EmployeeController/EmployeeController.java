package com.employee.EmployeeApplication.EmployeeController;

import com.employee.EmployeeApplication.EmployeeInfo.Employee;
import com.employee.EmployeeApplication.employeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> employeeList(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/employees/{id}")
    public Employee findAnEmployee(@PathVariable int id){
        return employeeService.getAnEmployee(id);
    }

    @PostMapping(value = "/employees")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }

    @PutMapping(value="/employees/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping(value = "/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}

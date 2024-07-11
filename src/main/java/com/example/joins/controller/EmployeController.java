package com.example.joins.controller;

import com.example.joins.model.Employee;
import com.example.joins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee (@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/findAllEmployee")
    public List<Employee> findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @PostMapping("/saveEmployeeWithAccount")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployeeWithAccount(employee);
    }
}

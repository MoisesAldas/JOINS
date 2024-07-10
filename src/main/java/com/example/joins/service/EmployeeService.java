package com.example.joins.service;

import com.example.joins.controller.EmployeController;
import com.example.joins.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.joins.repository.EmployeRepository;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeRepository employeeRepository;


    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee > findAllEmployee (){
        return employeeRepository.findAll();
    }
}

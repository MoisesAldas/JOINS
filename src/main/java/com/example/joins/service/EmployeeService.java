package com.example.joins.service;


import com.example.joins.model.Employee;
import com.example.joins.repository.AcoountRepository;
import com.example.joins.repository.EmployeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.joins.repository.AcoountRepository;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeRepository employeeRepository;
    @Autowired
    private AcoountRepository accountRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployee (){
        return employeeRepository.findAll();
    }

    @Transactional
    public Employee saveEmployeeWithAccount(Employee employee) {
        if (employee.getAccount() != null) {
            employee.getAccount().setEmployee(employee);
        }
        return employeeRepository.save(employee);
    }
}

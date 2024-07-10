package com.example.joins.repository;

import com.example.joins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.joins.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface EmployeRepository  extends JpaRepository <Employee, Integer> {



}

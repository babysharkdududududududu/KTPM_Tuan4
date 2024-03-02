package com.example.service;


import com.example.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long employeeId);
    void deleteById(Long employeeId);
    Employee updateEmployeeById(Long employeeId, Employee employee);
}

package com.example.testing.service;

import com.example.testing.model.Employee;
import com.example.testing.model.dto.EmployeeResponse;

public interface EmployeeService {

    EmployeeResponse getEmployeeData(long idNumber);

    EmployeeResponse addEmployee(String Name);

    EmployeeResponse updateEmployee(Employee employee);

    String deleteEmployee(Employee employee);
}

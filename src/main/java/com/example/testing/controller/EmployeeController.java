package com.example.testing.controller;

import com.example.testing.model.Employee;
import com.example.testing.service.EmployeeService;
import com.example.testing.service.error.ResponseData;
import com.example.testing.service.error.SuccessResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("getEmployeeData")
    public ResponseData getEmployeeData(@RequestParam long idNumber) {
        return new SuccessResponseData(employeeService.getEmployeeData(idNumber));
    }

    @PostMapping("addEmployee")
    public ResponseData addEmployee(@RequestBody Employee employee) {
        return new SuccessResponseData(employeeService.addEmployee(String.valueOf(employee.getName())));
    }

    @PutMapping("updateEmployee")
    public ResponseData updateEmployee(@RequestBody Employee employee) {
        return new SuccessResponseData(employeeService.updateEmployee(employee));
    }
    @DeleteMapping("deleteEmployee")
    public ResponseData deleteEmployee(@RequestBody Employee employee) {
        String message = employeeService.deleteEmployee(employee);
        return new SuccessResponseData(message);
    }

}

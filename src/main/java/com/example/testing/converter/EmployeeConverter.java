package com.example.testing.converter;

import com.example.testing.model.Employee;
import com.example.testing.model.dto.EmployeeResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter implements Converter<Employee, EmployeeResponse> {

    @Override
    public EmployeeResponse convert(Employee employee) {

        EmployeeResponse employeeResponse = EmployeeResponse.builder().id(employee.getId()).name(employee.getName()).build();

        return employeeResponse;
    }
}

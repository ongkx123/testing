package com.example.testing.service;

import cn.hutool.core.bean.BeanUtil;
import com.example.testing.model.Employee;
import com.example.testing.model.dto.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.testing.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponse getEmployeeData(long idNumber) {

        Employee employee = employeeRepository.findById(idNumber) .orElse(null);

        System.out.println(employee);

        return conversionService.convert(employee, EmployeeResponse.class);
    }

    @Override
    public EmployeeResponse addEmployee(String name) {
        Employee employee =  new Employee();
        employee.setName(name);

        Employee newEmployee = employeeRepository.save(employee);

        return conversionService.convert(newEmployee, EmployeeResponse.class);
    }

    @Override
    public EmployeeResponse updateEmployee(Employee employee) {
        employeeRepository.findById(employee.getId()) .orElse(null);

        Employee employeeForUpdate = new Employee();

        employeeForUpdate.setId(employee.getId());
        employeeForUpdate.setName(employee.getName());

        Employee updatedEmployee =employeeRepository.save(employeeForUpdate);
        return conversionService.convert(updatedEmployee, EmployeeResponse.class);
    }

    @Override
    public String deleteEmployee(Employee employee) {
        Employee employeeForDelete = employeeRepository.findById(employee.getId()) .orElse(null);

        try {
            employeeRepository.delete(employeeForDelete);
        } catch (Exception e) {
            return "Deleted Unsuccessful";
        }

        return "Deleted Successful";
    }
}

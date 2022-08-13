package com.handone2.handsoneDataJPA.service;

import com.handone2.handsoneDataJPA.entity.Employee;
import com.handone2.handsoneDataJPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee findByEmployeeId(Long employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    public List<Employee> findByEmployeeDepartment(String employeeDepartment) {

        return employeeRepository.findByEmployeeDepartment(employeeDepartment);
    }

    public List<Employee> findByEmployeeSalaryBetween(String s1, String s2) {
        return employeeRepository.findByEmployeeSalaryBetween(s1,s2);
    }

    public List<Employee> findByEmployeeSalaryGreaterThanAndEmployeeDepartment(String salary, String department) {
        return employeeRepository.findByEmployeeSalaryGreaterThanAndEmployeeDepartment(salary,department);
    }
}

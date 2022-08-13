package com.handone2.handsoneDataJPA.controller;

import com.handone2.handsoneDataJPA.entity.Employee;
import com.handone2.handsoneDataJPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{id}")
    public Employee findByEmployeeId(@PathVariable("id") Long employeeId){
        return employeeService.findByEmployeeId(employeeId);
    }
    @GetMapping("/dep/{dep}")
    public List<Employee> findByEmployeeDepartment(@PathVariable("dep") String employeeDepartment){
        System.out.println(employeeDepartment);
        return employeeService.findByEmployeeDepartment(employeeDepartment);

    }
    @GetMapping("/salary/{s1}&{s2}")
    public List<Employee> findByEmployeeSalaryBetween(@PathVariable("s1") String S1, @PathVariable("s2") String S2){
        return employeeService.findByEmployeeSalaryBetween(S1, S2);
    }
    @GetMapping("/salary&Department/{salary}&{dep}")
    public List<Employee> findByEmployeeSalaryGreaterThanAndEmployeeDepartment(@PathVariable("salary") String salary, @PathVariable("dep") String department){
        return employeeService.findByEmployeeSalaryGreaterThanAndEmployeeDepartment(salary,department);
    }

}

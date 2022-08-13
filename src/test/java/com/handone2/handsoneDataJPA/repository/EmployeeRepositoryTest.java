package com.handone2.handsoneDataJPA.repository;

import com.handone2.handsoneDataJPA.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void saveStudent(){
        Employee employee1 = Employee.builder()

                .employeeName("Ayush Jain")
                .employeeDepartment("FIS")
                .employeeSalary("60000")
                .employeeJob("IT Trainee")
                .build();
        employeeRepository.save(employee1);
        Employee employee2 = Employee.builder()

                .employeeName("Kushal")
                .employeeDepartment("Admin")
                .employeeSalary("60000")
                .employeeJob("IT Trainee")
                .build();
        employeeRepository.save(employee2);

        Employee employee3 = Employee.builder()

                .employeeName("Somaya")
                .employeeDepartment("FIS")
                .employeeSalary("600000")
                .employeeJob("Manager")
                .build();
        employeeRepository.save(employee3);

        Employee employee4 = Employee.builder()

                .employeeName("Ashish")
                .employeeDepartment("Admin")
                .employeeSalary("600000")
                .employeeJob("Manager")
                .build();
        employeeRepository.save(employee4);

        Employee employee5 = Employee.builder()

                .employeeName("Rishav")
                .employeeDepartment("Admin")
                .employeeSalary("600000")
                .employeeJob("Manager")
                .build();
        employeeRepository.save(employee5);
        Employee employee6 = Employee.builder()

                .employeeName("Devansh")
                .employeeDepartment("Admin")
                .employeeSalary("600000")
                .employeeJob("Manager")
                .build();
        employeeRepository.save(employee6);
    }

    @Test
    public void printListOfAllEmployee(){
        List<Employee> employeeList  = employeeRepository.findAll();
        System.out.println("Employee List =" + employeeList);
    }

    @Test
    public void findByEmployeeDepartment(){
        List<Employee> employees = employeeRepository.findByEmployeeDepartment("FIS");
        System.out.println(employees);
    }

    @Test
    public void findbyemployeeSalarybetween(){
        List<Employee> employees = employeeRepository.findByEmployeeSalaryBetween("25000","60000");
        System.out.println(employees);
    }
    @Test
    public void findByEmployeeSalaryGreaterThanAndEmployeeDepartment(){
        List<Employee> employees = employeeRepository.findByEmployeeSalaryGreaterThanAndEmployeeDepartment("60000","Admin");
        System.out.println(employees);
    }
    @Test
    public void findByEmployeeDepartmentAndEmployeeJob(){
        List<Employee> employees = employeeRepository.findByEmployeeDepartmentAndEmployeeJob("Admin","Manager");
        System.out.println(employees);
    }

}
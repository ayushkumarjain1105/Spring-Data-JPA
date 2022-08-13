package com.handone2.handsoneDataJPA.repository;

import com.handone2.handsoneDataJPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

   public Employee findByEmployeeId(Long employeeId);

   public List<Employee> findByEmployeeDepartment(String employeeDepartment);
   //@Query("select e from Employee e where e.employeeSalary between ?1 and ?2")
   public List<Employee> findByEmployeeSalaryBetween(String e1, String e2);

   public List<Employee> findByEmployeeSalaryGreaterThanAndEmployeeDepartment(String e1, String e2);

   public List<Employee> findByEmployeeDepartmentAndEmployeeJob(String e1, String e2);
}

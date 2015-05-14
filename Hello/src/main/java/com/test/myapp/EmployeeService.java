package com.test.myapp;

import java.util.List;

import com.test.myapp.Employee;
 
public interface EmployeeService {
 
    void saveEmployee(Employee employee);
     
    List<Employee> findAllEmployees(); 
     
    void deleteEmployeeBySsn(String ssn);
}
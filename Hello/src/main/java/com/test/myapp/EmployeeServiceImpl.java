package com.test.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.test.myapp.EmployeeDao;
import com.test.myapp.Employee;
 
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
 
    @Autowired
    private EmployeeDao dao;
     
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }
 
    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }
 
    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);
    }
 
}
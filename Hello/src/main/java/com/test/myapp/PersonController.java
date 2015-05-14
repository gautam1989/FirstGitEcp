package com.test.myapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@RestController
public class PersonController {

	@Autowired
    @Qualifier("employeeService")
    EmployeeService service;
	
	
	@RequestMapping("/employees")
    public List<Employee> greeting(@RequestParam(value="name", defaultValue="World") String name) {
       
		System.out.println("name:"+name);
		return  service.findAllEmployees();
		
		
    }
	
	
	@RequestMapping("/jsontest")
    public Employee jsontest() {
       
		System.out.println(service.findAllEmployees().get(0).getName());
		return  service.findAllEmployees().get(0);
		
		
    }
	
	
	@RequestMapping("/consumeEmp")
	public List<Employee> consume(){
		RestTemplate restTemplate = new RestTemplate();
		Employee[] forNow = restTemplate.getForObject("http://localhost:8080/myapp/employees", Employee[].class);
	    List<Employee>searchList= Arrays.asList(forNow);
        return searchList;
	}
	
}

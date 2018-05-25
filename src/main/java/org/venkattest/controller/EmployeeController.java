package org.venkattest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.venkattest.model.Employee;
import org.venkattest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService EmployeeService;
	
	@RequestMapping("/hello")
	public String myResponse() {
		return "Hello World";
	}

	@RequestMapping("/myApp/util/emp/{Id}")
	public Employee myEmployee(@PathVariable Long Id) {
		return this.EmployeeService.getEmployee(Id);
	}
	
	@PostMapping("/myApp/util/emp")
	public void myEmployee(@RequestBody Employee e) {
		this.EmployeeService.insertEmployee(e);
	}

	@GetMapping("/myApp/util/emps")
	public List<Employee> myEmployee() {
		return this.EmployeeService.getAllEmployees();
	}
}

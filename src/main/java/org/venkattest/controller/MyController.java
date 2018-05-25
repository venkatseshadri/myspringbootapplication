package org.venkattest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.venkattest.model.Employee;
import org.venkattest.service.EmployeeService;

@RestController
public class MyController {
	
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
	
}

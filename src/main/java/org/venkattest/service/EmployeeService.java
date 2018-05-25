package org.venkattest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venkattest.data.EmployeeDTO;
import org.venkattest.data.EmployeeRepository;
import org.venkattest.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository EmployeeRepository;
	
	public Employee getEmployee(Long id) {
		return DTO2o(this.EmployeeRepository.findById(id).get());
	}
	
	public void insertEmployee(Employee e) {

		this.EmployeeRepository.save(o2DTO(e));
	}
	
	public Employee DTO2o(EmployeeDTO e)
	{
		Employee emp = new Employee();
		emp.set_id(e.getId());
		emp.set_firstName(e.getFirstName());
		emp.set_lastName(e.getLastName());
		return emp;
	}
	
	public EmployeeDTO o2DTO(Employee e)
	{
		EmployeeDTO emp = new EmployeeDTO();
		emp.setId(e.get_id());
		emp.setFirstName(e.get_firstName());
		emp.setLastName(e.get_lastName());
		return emp;
	}
}

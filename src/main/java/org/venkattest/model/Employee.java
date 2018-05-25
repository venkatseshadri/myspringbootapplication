package org.venkattest.model;

import org.springframework.stereotype.Component;

@Component
public class Employee extends UtilizationImpl {
	
	public Employee() {
		super(DEFAULT_CAPACITY_HOURS, DEFAULT_CREDITED_HOURS, DEFAULT_START_DATE, DEFAULT_END_DATE);
		this._lastName = DEFAULT_LAST_NAME;
		this._firstName = DEFAULT_FIRST_NAME;
		this._id = DEFAULT_EMPLOYEE_ID;
	}
	
	public Employee(String _lastName, String _firstName, Long _id) {
		super(DEFAULT_CAPACITY_HOURS, DEFAULT_CREDITED_HOURS, DEFAULT_START_DATE, DEFAULT_END_DATE);
		this._lastName = _lastName;
		this._firstName = _firstName;
		this._id = _id;
	}
	
	public void initEmployee(double _creditedHours, double _capacityHours) {
		this._creditedHours = _creditedHours;
		this._capacityHours = _capacityHours;
	}

	
	String _lastName;
	String _firstName;
	
	private Long _id;

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}

	public String get_firstName() {
		return _firstName;
	}

	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	@Override
	public double getUtilization() {
		return _creditedHours/_capacityHours;
	}
	
}

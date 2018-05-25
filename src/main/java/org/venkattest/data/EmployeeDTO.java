package org.venkattest.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeDTO {

	@Column(name="LASTNAME")
	String _lastName;
	@Column(name="FIRSTNAME")
	String _firstName;
	@Id
	@Column(name="EMPID")
	Long _id;
	
	
	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String _lastName) {
		this._lastName = _lastName;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String _firstName) {
		this._firstName = _firstName;
	}

	public Long getId() {
		return _id;
	}

	public void setId(Long _id) {
		this._id = _id;
	}

}

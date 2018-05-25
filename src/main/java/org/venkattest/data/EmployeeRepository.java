package org.venkattest.data;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeDTO, Long> {

}

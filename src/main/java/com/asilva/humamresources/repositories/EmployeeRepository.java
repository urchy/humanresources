package com.asilva.humamresources.repositories;

import com.asilva.humamresources.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

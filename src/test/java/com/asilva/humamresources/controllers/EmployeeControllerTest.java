package com.asilva.humamresources.controllers;

import com.asilva.humamresources.entities.Employee;
import com.asilva.humamresources.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {

    @Mock
    EmployeeRepository employeeRepository;
    EmployeeController employeeController;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        employeeController = new EmployeeController(employeeRepository);
    }

    @Test
    void getAll() {
        List<Employee> list = employeeController.getAll();
        assertEquals(0, list.size());
    }

}
package com.asilva.humamresources.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;
    @BeforeEach
    void setUp() {
        employee = new Employee();
    }

    @Test
    void getName() {
        employee.setName("andre");
        assertEquals("andre", employee.getName());
    }


}
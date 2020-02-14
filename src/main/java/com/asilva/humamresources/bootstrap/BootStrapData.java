package com.asilva.humamresources.bootstrap;

import com.asilva.humamresources.entities.Absence;
import com.asilva.humamresources.entities.Employee;
import com.asilva.humamresources.repositories.AbsenceRepository;
import com.asilva.humamresources.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final AbsenceRepository absenceRepository;

    public BootStrapData(EmployeeRepository employeeRepository, AbsenceRepository absenceRepository) {
        this.employeeRepository = employeeRepository;
        this.absenceRepository = absenceRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Employee employee = new Employee();
        employee.setName("andre");
        employee.setAddress("lisboa");

        Absence absence = new Absence();
        absence.setCause("doença");
        absence.setData(new Date());

        absenceRepository.save(absence);

        employee.getAbsences().add(absence);

        Employee employee2 = new Employee();
        employee2.setName("Bea");
        employee2.setAddress("Azores");

        employeeRepository.save(employee);
        employeeRepository.save(employee2);


        System.out.println("where inserted:");
        System.out.println(employeeRepository.count());
        System.out.println(absenceRepository.count());


    }
}

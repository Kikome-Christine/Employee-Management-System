package com.ems.employeemanagement.ems;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.AUGUST;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return args -> {
            Employee Christine = new Employee(
                    "Kikome Christine",
                    "kikomechristine@gmail.com",
                    "IT",
                    "Developer"


            );
            Employee Drake = new Employee(

                    "musooka drake",
                   "kikomechristine1@gmail.com",
                    "IT",
                    "Developer"


            );
            employeeRepository.saveAll(
                    List.of(Christine, Drake)
            );

        };
    }
}

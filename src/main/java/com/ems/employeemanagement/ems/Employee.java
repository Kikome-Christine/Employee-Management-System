package com.ems.employeemanagement.ems;

import jakarta.persistence.*;

import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "employee_sequence"
    )

    private Long id;

    @Column(name = "FullName")
    private String name;

    @Column(name = "EmployeeEmail")
    private String email;

    @Column(name = "EmployeeDepartment")
    private String department;

    @Column(name = "EmployeePosition")
    private String position;

    public Employee() {
    }

    public Employee(Long id, String name, String email, String department, String position) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.position = position;
    }

    public Employee(String name, String email, String department, String position) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

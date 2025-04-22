package com.ems.employeemanagement.ems;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "employeeId")
    @JsonBackReference
    private Employee employee;

    @Column(unique = true, nullable = false)
    private String address;

    public Email() {
    }

    public Email(String address) {
        this.address = address;
    }



    public Email(Long id, Employee employee, String address) {
        this.id = id;
        this.employee = employee;
        this.address = address;
    }

    public Email(Employee employee, String address) {
        this.employee = employee;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", employee=" + (employee != null ? employee.getName() : "null") +
                ", address='" + address + '\'' +
                '}';
    }
}

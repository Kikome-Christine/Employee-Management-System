package com.ems.employeemanagement.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployee(){
        return employeeRepository.findAll();

    }

    public void getEmployee(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new IllegalStateException("Employee not found for this id :: " + employeeId));
        employeeRepository.findById(employeeId);
    }

    public void addNewEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Long employeeId, String name, String email, String department, String position ) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new IllegalStateException("Employee not found for this id :: " + employeeId));

        employee.setName(name);
        employee.setEmail(email);
        employee.setDepartment(department);
        employee.setPosition(position);
        final Employee updatedEmployee = employeeRepository.save(employee);

    }

    public void deleteEmployee(Long employeeId) {
        if (!employeeRepository.existsById(employeeId)) {
                throw new IllegalStateException("Employee with ID " + employeeId + " does not exist");
            }
            employeeRepository.deleteById(employeeId);


    }
}

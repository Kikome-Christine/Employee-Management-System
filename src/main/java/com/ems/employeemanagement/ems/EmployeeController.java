package com.ems.employeemanagement.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();
    }

    @GetMapping(path = "{employeeId}")
    public void getEmployeeById(@PathVariable("employeeId")Long employeeId){
        employeeService.getEmployee(employeeId);
    }

    @PostMapping
    public void addNewEmployee(@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
    }

    @PutMapping(path = "{employeeId}")
    public void updateEmployee(@PathVariable("employeeId") Long employeeId,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false)String email,
                               @RequestParam(required = false)String department,
                               @RequestParam(required = false)String position){
        employeeService.updateEmployee(employeeId, name, email, department, position);
    }

    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId){
        employeeService.deleteEmployee(employeeId);
    }


}

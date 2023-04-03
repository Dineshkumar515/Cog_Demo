package com.example.demo.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeDAO;

@RestController
public class EmployeeController {
//
	private final EmployeeDAO employeeDAO;
	
	public EmployeeController(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	

	@GetMapping("/getemployees")
    public @NotNull Iterable<Employee> getEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @PostMapping("/addemployees")
    void addEmployee(@RequestBody Employee employee) {
    	employeeDAO.save(employee);
    }
}
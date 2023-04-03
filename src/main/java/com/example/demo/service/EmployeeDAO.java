package com.example.demo.service;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.example.demo.entities.Employee;

@Validated
public interface EmployeeDAO{

	 @NotNull Iterable<Employee> getAllEmployees();

	 Employee getEmployee(@Min(value = 1L, message = "Invalid employee ID.") long id);

	Employee save(Employee employee);

}

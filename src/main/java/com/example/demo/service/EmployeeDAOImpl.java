package com.example.demo.service;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Employee;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EmployeeRepository;


@Service
@Transactional
public  class EmployeeDAOImpl implements EmployeeDAO {

	private EmployeeRepository employeeRepository;

	public EmployeeDAOImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public @NotNull Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException(" Employee not found"));
	}

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
	
}


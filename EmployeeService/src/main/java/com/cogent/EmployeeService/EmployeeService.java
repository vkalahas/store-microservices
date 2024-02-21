package com.cogent.EmployeeService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	
	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int employeeId);
	
	public Employee saveEmployee(Employee emp);
	
	EmployeeDepartmentResponse getEmployeeWithDepartment(int employeeId);
	
}

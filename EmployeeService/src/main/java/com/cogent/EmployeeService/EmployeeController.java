package com.cogent.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empService.getEmployeeById(id);
	}
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return empService.saveEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public EmployeeDepartmentResponse getEmployeeWithDepartment(@PathVariable int employeeId) {
		return empService.getEmployeeWithDepartment(employeeId);
	}

}

package com.cogent.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private RestTemplate restTemplate; // synchronous
	// Angular Observable was non-blocking, asynchronous
	
	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		return empRepo.findById(employeeId).get();
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public EmployeeDepartmentResponse getEmployeeWithDepartment(int employeeId) {
		Employee employee = empRepo.findById(employeeId).get();
		// by host and port number api call
//		String url = "http://localhost:9001/api/departments/" + employee.getDepartmentId();
		String url = "http://Department-Service/api/departments/" + 
		Department department = restTemplate.getForObject(url, Department.class);
		return new EmployeeDepartmentResponse(employee, department);
	}

}

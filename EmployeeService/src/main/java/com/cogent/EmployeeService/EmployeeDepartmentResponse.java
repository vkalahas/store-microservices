package com.cogent.EmployeeService;

public class EmployeeDepartmentResponse {
	
	Employee employee;
	Department department;
	
	public EmployeeDepartmentResponse (Employee employee, Department department) {
		this.employee = employee;
		this.department = department;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}

package com.cogent.DepartmentService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
	public List<Department> getAllDepartments();
	public Department saveDepartment(Department dept);
	public Optional<Department> getDepartmentById(int deptId);
}

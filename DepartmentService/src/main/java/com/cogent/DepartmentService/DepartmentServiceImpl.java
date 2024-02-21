package com.cogent.DepartmentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository deptrepos;

	@Override
	public List<Department> getAllDepartments() {
		return deptrepos.findAll();
	}

	@Override
	public Department saveDepartment(Department dept) {
		return deptrepos.save(dept);
	}

	@Override
	public Optional<Department> getDepartmentById(int deptId) {
		return deptrepos.findById(deptId);
	}

}

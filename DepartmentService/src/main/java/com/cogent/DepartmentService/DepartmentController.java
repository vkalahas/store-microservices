package com.cogent.DepartmentService;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping
	public List<Department> getAllDepartments() {
		return deptService.getAllDepartments();
	}
	
	@GetMapping("/{id}")
	public Optional<Department> getDepartmentById(@PathVariable("id") int id) {
		return deptService.getDepartmentById(id);
	}
	
	@PostMapping
	public Department saveDepartment(@RequestBody Department obj) {
		return deptService.saveDepartment(obj);
	}
	
}

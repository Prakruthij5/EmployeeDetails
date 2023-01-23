package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.entity.Employee;
import com.cg.service.EmployeeService;




@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;


	@PostMapping("/addEmp")
	public String addEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	
	}
	
	@PutMapping("/updateEmployee/{id}/{newEmployee}")
	public List<Employee> updateEmployee(@PathVariable("id") int id,@PathVariable("newEmployee") int salary){
		return employeeService.updateEmployee(id, salary);
		
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public List<Employee> deleteEmployee(@PathVariable ("id") int id){
		return employeeService.deleteEmployee(id);
	}
}

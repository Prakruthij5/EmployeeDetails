package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.exception.EmployeeException;

import com.cg.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository erepository;


	
public String addEmployee(Employee employee){
		
		erepository.save(employee);
		return "employee Added";
		
	}
	
	public List<Employee> getAllEmployee() {
	return erepository.findAll();
	}

	public List<Employee> updateEmployee(int id, int salary) {
	
		if(!erepository.existsById(id)) {
			throw new EmployeeException();
		}
		Employee employee = erepository.findById(id).get();
		employee.setSalary(salary);
		erepository.flush();
		return erepository.findAll();
		
	}
	
	public List<Employee> deleteEmployee(int id){
		if(!erepository.existsById(id)) {
			throw new EmployeeException();
		}
		erepository.deleteById(id);
		return erepository.findAll();
	}

}





//List<Employee> empList=new ArrayList<>();
//
//
//public List<Employee> addEmployee(Employee employee) {
//	empList.add(employee);
//	return empList;
//}
//
//
//public List<Employee> getAll() {
//	
//	return empList;
//}
package com.maven.crudop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maven.crudop.model.Employee;
import com.maven.crudop.repos.Repository;

/* create--c
 * read---r
 * update--u
 * delete--d
 */
@RestController
@RequestMapping("/restapi")
public class EmpController {

	@Autowired
	Repository repo;
	
	// 1. create(insert employee data into database)
	@PostMapping
	public List<Employee> addData(@RequestBody List<Employee> emp) {
		return repo.saveAll(emp);
	}
	
	// 2. read(display employee data)
	@GetMapping
	public List<Employee> getData() {
		return repo.findAll();
	}
	
	// 3 update(update the employee data)
	@PutMapping
	public List<Employee> updateData(@RequestBody List<Employee> emp) {
		return repo.saveAll(emp);
	}
	
	// 4 delete(update the employee data)
	@DeleteMapping("/{id}")
	public String deleteData(@PathVariable("id") String id) {
	    repo.deleteById(id);
	    return "Delete Record Successfully";
	}
	
	// 5 read(read particular employee data)
		@GetMapping("/{id}")
		public Optional<Employee> readData(@PathVariable(value = "id") String id) {
		   return repo.findById(id);
		}
		
	
}

package com.maven.crudop.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.crudop.model.Employee;

public interface Repository extends JpaRepository<Employee , String>{


}

package com.example.springDataMysql.controller;

import com.example.springDataMysql.exception.ResourceNotFoundException;
import com.example.springDataMysql.model.Employee;
import com.example.springDataMysql.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return employeeRepo.findAll();
    }

    @PostMapping
    public  Employee addEmployee(@RequestBody Employee employee)
    {
        return  employeeRepo.save(employee);
    }
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable long id)
    {
        Employee employee=employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee does not exist with "+id));
        return ResponseEntity.ok(employee);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee employeedetails)
    {
        Employee employee=employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee does not exist with "+id));
        employee.setFirstname(employeedetails.getFirstname());
        employee.setLastname(employeedetails.getLastname());
        employee.setEmail(employeedetails.getEmail());
        employeeRepo.save(employee);
        return ResponseEntity.ok(employee);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> updateEmployee(@PathVariable  long id)
    {
        Employee employee=employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee does not exist with "+id));
        employeeRepo.delete(employee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

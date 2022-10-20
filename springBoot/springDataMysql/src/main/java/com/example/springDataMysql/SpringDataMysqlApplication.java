package com.example.springDataMysql;

import com.example.springDataMysql.model.Employee;
import com.example.springDataMysql.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataMysqlApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMysqlApplication.class, args);
	}

}

package org.example.secureapp.employeesystemapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeSystemApiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(EmployeeSystemApiApplication.class, args);
	}

}

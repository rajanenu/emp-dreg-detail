package com.example.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot.employee.service.EmployeeService;

/**
 * This is starting position of the spring boot application
 * 
 * @author sigineni
 *
 */
@SpringBootApplication
public class EmployeeSpringBoot {
	private static final Logger logger = LogManager.getLogger(EmployeeService.class);
	/**
	 * Spring Boot application starts from this method and further it will execute
	 * rest api initiations.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		logger.info("Spring Boot employee starting");
		SpringApplication.run(EmployeeSpringBoot.class, args);
	}

}

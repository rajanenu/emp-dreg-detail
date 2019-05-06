package com.example.springboot.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.springboot.employee.controller.EmployeeController;
import com.example.springboot.employee.vo.EmployeeVO;

/**
 * This is service class where we can get the data from the data base or file
 * system. Currently, I have not used database and just took the global list
 * variable as "employee" and that saves the data temporarily
 * 
 * @author sigineni
 *
 */
@Service
public class EmployeeService {
	
	private static final Logger logger = LogManager.getLogger(EmployeeService.class);
	private List<EmployeeVO> employees = new ArrayList<>();

	/**
	 * This service call is used to fetch the data from the Database or file system,currently this will return as 
	 * empty list,when first request comes.
	 * @return
	 */
	public List<EmployeeVO> getEmployees() {
		logger.info("GET request data from service:" + employees);
		return employees;
	}

	/**
	 * 
	 * @param employee
	 */
	public void addEmployee(EmployeeVO employee) {
		logger.info("POST request data in service: " + employee);
		employees.add(employee);
	}
}

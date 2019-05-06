package com.example.springboot.employee.controller;

import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.employee.service.EmployeeService;
import com.example.springboot.employee.vo.EmployeeVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * This is Rest controller class where service end points for employee will be
 * available
 * 
 * @CrossOrigin:This will be used when we are communicating from another server
 *                   like front end code
 * @author sigineni
 *
 */
@RestController
@CrossOrigin(origins = "*")
@Api(value="Employee Management Application", description="Employee Operations can perform Employee Management application")
public class EmployeeController {
	private static final Logger logger = LogManager.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	/**
	 * This is the GET request to get all the employee details.
	 * 
	 * @return
	 */

	@ApiOperation(value = "View a list of available employees", response = List.class)
	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<EmployeeVO> getEmployees() {
		logger.info("GET request is calling");
		return employeeService.getEmployees().stream().sorted(Comparator.comparing(EmployeeVO::getFirstName))
				.collect(Collectors.toList());
	}

	/**
	 * This is for POST request to register an employee
	 * 
	 * @param employee
	 */

	@ApiOperation(value = "Register new employee ")
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addEmployee(@RequestBody EmployeeVO employee) {
		logger.info("POST request is calling" + employee);
		employeeService.addEmployee(employee);
	}

}

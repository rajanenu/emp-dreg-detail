package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.springboot.employee.controller.EmployeeController;
import com.example.springboot.employee.service.EmployeeService;
import com.example.springboot.employee.vo.EmployeeVO;

/**
 * Test cases for the employee spring boot application
 * 
 * @author sigineni
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeController.class)
@WebMvcTest(value = EmployeeController.class, secure = false)
public class EmployeeSpringBootTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmployeeService empService;

	List<EmployeeVO> list = Arrays.asList(new EmployeeVO("Abhishek", "Bandi", "Male", "07-09-1995", "IT"));

	@Test
	public void retrieveDetailsOfEmployee() throws Exception {
		Mockito.when(empService.getEmployees()).thenReturn(list);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employees").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());
		String expected = "{firstName:Abhishek,lastName:Bandi,gender:Male,dateOfBirth:07-09-1995,department:IT}";
		System.out.println("->" + result.getResponse().getContentAsString());
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);

	}

	@Test
	public void createStudentCourse() throws Exception {
		EmployeeVO mockCourse = new EmployeeVO("Abhishek", "Bandi", "Male", "07-09-1995", "IT");
		Mockito.when(empService.addEmployee(mockCourse));
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/employees/").accept(MediaType.APPLICATION_JSON)
				.content("").contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		Assert.assertEquals(HttpStatus.CREATED.value(), response.getStatus());
		Assert.assertEquals("http://localhost/employees", response.getHeader(HttpHeaders.LOCATION));

	}

}

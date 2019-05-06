package com.example.springboot.employee.vo;

public class EmployeeVO {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private String department;

	/**
	 * Default constructor
	 */
	public EmployeeVO() {

	}

	/**
	 * Constructor with the fields
	 * 
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param dateOfBirth
	 * @param department
	 */

	public EmployeeVO(String firstName, String lastName, String gender, String dateOfBirth, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeVO [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", department=" + department + "]";
	}

}
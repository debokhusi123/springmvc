package com.springmvc.hibernate.bean;
public class EmployeeBean {
	
	private int id;  
	private String employeeName;  
	private float employeeSalary;  
	private String employeeDesignation;
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmployeeName() {
		return employeeName;
	}




	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}




	public float getEmployeeSalary() {
		return employeeSalary;
	}




	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}




	public String getEmployeeDesignation() {
		return employeeDesignation;
	}




	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
}

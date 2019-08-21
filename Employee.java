package com.example.employeeMongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Employee Id, Name, Departments, Reporting Manager, Age, Salary




@Document(collection = "Employees")
public class Employee {

	@Id
	private String id;
	private String Name;
	private String Departments;
	private String Manager;
	private int Age;
	private int Salary;
	
	public Employee(String name, String departments, String manager, int age, int salary) {
		this.Name = name;
		this.Departments = departments;
		this.Manager = manager;
		this.Age = age;
		this.Salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartments() {
		return Departments;
	}

	public void setDepartments(String departments) {
		Departments = departments;
	}

	public String getManager() {
		return Manager;
	}

	public void setManager(String manager) {
		Manager = manager;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
	

}

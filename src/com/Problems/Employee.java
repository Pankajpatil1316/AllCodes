package com.Problems;

public class Employee {
	
	String name;
	
	int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public Employee(String name, int salary, int i) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}

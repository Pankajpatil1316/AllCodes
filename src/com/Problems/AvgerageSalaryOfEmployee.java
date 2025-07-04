package com.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


//find the average salary of employee using stream
public class AvgerageSalaryOfEmployee {

	public static void main(String[] args) {
	
		List<Employee> list = new ArrayList<Employee>();
		for(int i=0; i<10; i++ )
		{
			Employee emp = new Employee("Pankaj" + i , 10_000+i*1000, 126);
			list.add(emp);
		}

		OptionalDouble d = list.stream().mapToDouble(e-> e.getSalary()).average();
		System.out.println(d);

		System.out.println("Average Salary " + list.stream().mapToDouble(Employee::getSalary).average());
		
		
	}
	
	   

}

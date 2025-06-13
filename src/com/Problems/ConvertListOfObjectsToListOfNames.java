package streamapi;

import com.Problems.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfObjectsToListOfNames {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Pankaj", 123425, 123);
		Employee e2 = new Employee("Samiksha", 123345, 121);
		Employee e3 = new Employee("Pawan", 123445, 122);
		Employee e4 = new Employee("Mansi", 123457, 124);
		Employee e5= new Employee("Jon", 123456, 126);
		
		List<Employee> listOFEmployees = new ArrayList<Employee>();
		listOFEmployees.add(e1);listOFEmployees.add(e2);listOFEmployees.add(e3);listOFEmployees.add(e4);listOFEmployees.add(e5);
		
		
		
		
		listOFEmployees.stream().map(emp -> emp.getName()).forEach(name -> System.out.print(" " + name));
		
		
		List<String> names = listOFEmployees.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		
		System.out.println("Names of Employess : " + names);
		
		
	}
}

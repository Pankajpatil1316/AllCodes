package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class MaxSalaryFromAllDepartments {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000.0),
                new Employee("Bob", "IT", 60000.0),
                new Employee("Charlie", "Finance", 55000.0),
                new Employee("David", "IT", 70000.0),
                new Employee("Eva", "HR", 45000.0),
                new Employee("Frank", "Finance", 58000.0)
        );

        // TODO: Write code to find the highest paid employee per department
        // Stream solution to find highest-paid employee per department

        Map<String, Optional<Employee>> finaldata = employees.stream()
                .collect(Collectors.groupingBy((e->e.getDepartment()),
                        Collectors.maxBy(Comparator.comparing(e->e.getSalary()))));
        System.out.println(finaldata);


        // Expected Output format (department -> employee details)
        // HR -> Alice - HR - 50000.0
        // IT -> David - IT - 70000.0
        // Finance -> Frank - Finance - 58000.0
    }

    static class Employee {
        private String name;
        private String department;
        private double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return name + " - " + department + " - " + salary;
        }
    }
}

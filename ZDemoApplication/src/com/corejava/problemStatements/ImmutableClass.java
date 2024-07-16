package com.corejava.problemStatements;

import java.util.Arrays;
import java.util.List;

public class ImmutableClass {

	public static void main(String... strings) {
		List<String> stringList = Arrays.asList("IT", "FINANCE");
		Employee employee = new Employee("Name", stringList);
		employee.getDepartment().add("HR");
		System.out.println(employee.getDepartment());
	}

}

 class Employee {

	private String name;
	private List<String> department;

	public Employee(String name, List<String> department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public List<String> getDepartment() {
		return department;
	}

}

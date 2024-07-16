package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Compare {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee(5, 62, "AAA"), new Employee(1, 52, "BBB"),
				new Employee(7, 15, "AAA"));

		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(5, 62, "AAA"));
		arrayList.add(new Employee(1, 52, "BBB"));
		arrayList.add(new Employee(7, 15, "CC"));

//		CustomComparable c = new CustomComparable();
		employeeList.sort((Employee o1, Employee o2) -> o1.getAge() - o2.getAge());

		Collections.sort(arrayList);

//		employeeList.stream().forEach(action -> System.out.println(action.getAge()));

		System.out.println("Emp List " + employeeList);

		System.out.println("arr list " + arrayList);
		
		
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getName)));
	}

}

class Employee implements Comparable<Employee> {

	private int id;
	private int age;
	private String name;

	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}

}

class CustomComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() > o2.getAge() ? 1 : -1;
	}

}

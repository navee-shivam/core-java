package com.corejava.immutable;

import java.util.ArrayList;

public class ImmutableAccess {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Java");
		stringList.add("Spring");
		Employee emp = new Employee(1, "naveen", stringList);
		System.out.println(emp.getLanguages());
		emp.getLanguages().add("Angular");

		stringList.add("Hibernate");
		System.out.println(emp.getLanguages());
	}

}

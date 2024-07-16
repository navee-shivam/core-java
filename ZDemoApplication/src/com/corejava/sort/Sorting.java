package com.corejava.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<Student> stu = new ArrayList<>();
		stu.add(new Student("Naveen", "Kumar", "SSN"));
		stu.add(new Student("Shivam", "Kumar", "DEM"));
		stu.add(new Student("Naveen", "Frozen", "XXX"));
		stu.add(new Student("Dany", "East", "AAA"));
		stu.add(new Student("Naveen", "Kumar", "AAA"));
		Collections.sort(stu,(Student o1, Student o2) -> {
			int firstName = o1.firstName.compareTo(o2.firstName);
			int lastName = o1.lastName.compareTo(o2.lastName);
			int ssn = o1.ssn.compareTo(o2.ssn);
			return (firstName == 0) ? (lastName == 0) ? ssn : lastName : firstName;
		});
		System.out.println(stu);
	}

}

class Student {

	public String firstName;
	public String lastName;
	public String ssn;

	public Student(String firstName, String lastName, String ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSsn() {
		return ssn;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "] \n";
	}

}

class customComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int firstName = o1.firstName.compareTo(o2.firstName);
		int lastName = o1.lastName.compareTo(o2.lastName);
		int ssn = o1.ssn.compareTo(o2.ssn);
		return (firstName == 0) ? (lastName == 0) ? ssn : lastName : firstName;
	}

}

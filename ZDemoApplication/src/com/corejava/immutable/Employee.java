package com.corejava.immutable;

import java.util.ArrayList;

public final class Employee {
	private final Integer empId;
	private final String name;
	private final ArrayList<String> languages;

	public Employee(Integer empId, String name, ArrayList<String> languages) {
		super();
		this.empId = empId;
		this.name = name;
		ArrayList<String> temp = new ArrayList<>();
		for (int i = 0; i < languages.size(); i++) {
			temp.add(languages.get(i));
		}
		this.languages = temp;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<String> getLanguages() {
		return (ArrayList<String>) languages.clone();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", languages=" + languages + "]";
	}

}

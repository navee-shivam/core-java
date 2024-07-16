package com.interview;

public class EqualsCheck {

	public static void main(String... strings) {
		String name = "Naveen";
		String name1 = new String("Naveen");
		String name2 = name;
		System.out.println(name.equals(name1));
		System.out.println(name == name1);
		System.out.println(name == name2);
	}
}

package com.corejava;

public class Hexaware {

	public static void main(String[] args) {
		method(null);
	}
	
	static void method(Object o) {
		System.out.println("object");
	}
	
	static void method(int o) {
		System.out.println("Integer");
	}
	
	static void method(String o) {
		System.out.println("String");
	}

}

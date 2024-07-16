package com.corejava;

public class Inheritance {

	public static void main(String[] args) {
		Parent p = new Child();
		p.A();
		p.main("aaa");
	}

}

class Parent {
	void A() {
		System.out.println("A");
	}

	public static void main(String... strings) {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void A() {
		System.out.println("B");
	}

	public static void main(String... strings) {
		System.out.println("Child");
	}
}

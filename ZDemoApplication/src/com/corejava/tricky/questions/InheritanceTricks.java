package com.corejava.tricky.questions;

class Parent {
	int x = 10;

	public void display() {
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	int x = 15;

	public void display() {
		System.out.println("Child class");
	}
}

public class InheritanceTricks {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.x);
		p.display();
	}

}

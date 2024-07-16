package com.corejava.tricky.questions;

abstract class AbstactClass {
	public abstract void display();

	public void abstractOwn() {
		System.out.println("OWN impl");
	}
}

class ChildAbstract extends AbstactClass {

	public ChildAbstract() {
		super();
		System.out.println("Child Abstarct");
	}

	@Override
	public void display() {
		System.out.println("child OWN impl");
	}

}

public class AbstractClassImpl {

	public static void main(String[] args) {
		ChildAbstract cb = new ChildAbstract();
		cb.abstractOwn();
		cb.display();
	}

}

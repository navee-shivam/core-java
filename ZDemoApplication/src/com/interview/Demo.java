package com.interview;

class Animal {
	void test() {
		System.out.println("Parent");
	}
}

class Dog extends Animal {
	void test() {
		System.out.println("Child");
	}
}

class Demo {
	public static void main(String[] args) {
		Animal p = new Dog();
		p.test();
		int a[] = {10,20,3,};
		System.out.println(a.length);
	}

}

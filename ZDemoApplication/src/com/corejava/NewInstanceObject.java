package com.corejava;

public class NewInstanceObject {
	String s = "String";

//	NewInstance() {
//		System.out.println("Obj created");
//	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class a = Class.forName("NewInstanceObject");
		System.out.println(a.getClass());
		NewInstanceObject b = (NewInstanceObject) a.newInstance();
		System.out.println(b.s);
	}

}

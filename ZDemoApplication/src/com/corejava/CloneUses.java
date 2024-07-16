package com.corejava;

public class CloneUses implements Cloneable {
	String s = "string";

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public CloneUses() {
		System.out.println("Object created");
	}

	public static void main(String[] args) {
		CloneUses cl = new CloneUses();
		System.out.println("c1 end");

		try {
			CloneUses c2 = (CloneUses) cl.clone();
			System.out.println(c2.s);
		} catch (CloneNotSupportedException e) {
			System.out.println("exe : " + e);
		}

	}

}

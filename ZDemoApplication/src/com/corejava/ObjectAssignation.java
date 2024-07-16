package com.corejava;

public class ObjectAssignation {

	public static void main(String[] args) {
		ObjectAssignation A = new ObjectAssignation();
		ObjectAssignation B = new ObjectAssignation();
		A.nullMake(A);
		B.print(A);
	}

	private void nullMake(ObjectAssignation o) {
		o = null;
		System.out.println(o);
	}

	private void print(ObjectAssignation o) {
		System.out.println(o);
	}

}

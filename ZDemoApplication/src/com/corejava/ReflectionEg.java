package com.corejava;

import java.lang.reflect.*;

public class ReflectionEg {
	private String s;

	ReflectionEg() {
		System.out.println("RefObj : ");
	}

	ReflectionEg(String name) {
		System.out.println("RefObj : " + name);
	}

	public void setName(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		try {
			Constructor<ReflectionEg> Constructorconstructor = ReflectionEg.class.getDeclaredConstructor();
			ReflectionEg r = Constructorconstructor.newInstance();
			r.setName("studytonight");
			System.out.println(r.s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

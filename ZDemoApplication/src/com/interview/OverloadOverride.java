package com.interview;

public class OverloadOverride extends overload {

	public static void main(String[] args) {
		OverloadOverride oo = new OverloadOverride();
		oo.show();
		oo.disp();
	}
	
	public static Integer show() {
		System.out.println("OO");
		return 5;
	}

}

class overload {
	public static Integer show() {
		System.out.println("show()");
		return 1;
	}
	
	public static Long disp() {
		System.out.println("disp()");
		return 5L;
	}
}


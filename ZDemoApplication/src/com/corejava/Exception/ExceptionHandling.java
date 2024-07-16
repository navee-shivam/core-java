package com.corejava.Exception;

public class ExceptionHandling {

	public static void main(String... args) {
//		try {
//			throw new CustomException("custom");
//		} catch (CustomException cus) {
//			System.out.println(cus);
//		}
		try {
			throwsException(0);
		} catch (CustomException e) {
			System.out.println(e.getCause());
		}
	}

	public static void throwsException(Integer i) throws CustomException {
		if (i == 0)
			throw new CustomException("custom");
		else
			System.out.println("No Exception");
	}
}

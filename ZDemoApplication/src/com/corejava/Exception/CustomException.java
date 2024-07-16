package com.corejava.Exception;

import java.io.IOException;

public class CustomException extends RuntimeException {
	private static final long serialVersionUID = 4424258274619141827L;
	private String string;

	public CustomException(String str) {
		string = str;
	}

	@Override
	public String toString() {
		CustomException cus = new CustomException("custom");
		cus.initCause(new IOException("CustomException [string=" + string + "]"));
		return "CustomException [string=" + string + "]";
	}

}

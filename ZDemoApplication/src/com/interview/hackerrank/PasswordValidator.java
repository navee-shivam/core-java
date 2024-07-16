package com.interview.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	public static void main(String[] args) {
		System.out.println(isPasswordValid("qwertyu1i"));

	}

	// min length - 8 max - 31 ( 10 )
	// alphanumeric ( 20 )
	// # $ @ % & _ ( 30 )
	// simultaneous repetation of char ( 40 )

	public static int isPasswordValid(String password) {

        if(!isPatternFind("{8,31}$",password))
            return 10;
        if(!isPatternFind("\\d", password))
            return 20;
        if(isPatternFind("^[a-zA-Z0-9]+$", password))
            return 30;
        if(isPatternFind("([a-zA-Z])\\1", password))
            return 40;
        return 0;
	}

	private static Boolean isPatternFind(String regexPattern, String inputValue) {
		Pattern stringPattern = Pattern.compile(regexPattern);
		Matcher stringMatcher = stringPattern.matcher(inputValue);
		return stringMatcher.find();
	}
	

}

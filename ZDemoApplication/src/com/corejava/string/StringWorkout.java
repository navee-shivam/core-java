package com.corejava.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringWorkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Naveen";
		str.concat("append");
		StringBuffer sbuffer = new StringBuffer("kumar");
		sbuffer.append("welcome");

		System.out.println(str + " : " + sbuffer);

		List<String> listStr = Arrays.asList("london", "paris", "france");
		String stringJoin = String.join("::", listStr);
		System.out.println(stringJoin);

		StringJoiner sj = new StringJoiner("-->").add("add").add("Subtract");
		System.out.println("String joiner : " + sj);

		System.out.println(listStr.stream().map(mapper -> mapper).collect(Collectors.joining("<-->")));

	}

}

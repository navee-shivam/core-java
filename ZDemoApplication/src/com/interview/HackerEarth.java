package com.interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HackerEarth {

	private static int hack;

	public HackerEarth() {
		hack++;
	}

	protected static int hack_method() {
		return hack;
	}

	public static void main(String args[]) {
//		List<String> l = Arrays.asList("P", "J", "p");
//		Map<String, Integer> ll = l.stream().collect(Collectors.toMap(Function.identity(), String::length));
//		System.out.println(ll);

		LinkedList<String> link = new LinkedList<>();
		link.add("SSS");
		link.add("BBBB");
		link.add(1, "aaa");
		link.add("EEE");
		for (String s : link) {
			System.out.println(s);
		}
	}

}
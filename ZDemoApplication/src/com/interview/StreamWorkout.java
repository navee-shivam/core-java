package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWorkout {

	public static void main(String[] args) {
		String[] names = { "Naveen", "Senthil", "Bhai1", "Akash1", "Vimal23", null, "" };
		List<String> ArrayList = Arrays.asList(names);
		makeOperation(ArrayList);
	}

	private static void makeOperation(List<String> arrayList) {
		System.out.println(arrayList.stream()
				.filter(predicate -> (predicate != null) && (!predicate.equals(""))
						&& (predicate.matches("^[a-zA-Z]*$")))
				.map(mapper -> mapper.toUpperCase()).sorted().collect(Collectors.toList()));
	}

}

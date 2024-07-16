package com.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubList {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<String> stringList = Arrays.asList("Naveen", "Mano");

		sublist(intList);
		stringLength(stringList,"Mano");
	}

	private static void stringLength(List<String> stringList,String index) {
//stringList.stream().filter(predicate -> predicate.equalsIgnoreCase(predicate.startsWith('s')))
	}

	private static void sublist(List<Integer> intList) {
		System.out.println(intList.stream().skip(5).collect(Collectors.toList()));
	}

}

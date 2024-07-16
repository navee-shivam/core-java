package com.algorithms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SubStringVowelsFind {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String numberOfString = s.nextLine();
		int i = Integer.parseInt(numberOfString);
		Set<String> listSet = new LinkedHashSet<>();
		Set<String> substringSet = new LinkedHashSet<>();
		while (i > 0) {
			listSet.add(s.nextLine().toLowerCase());
			i--;
		}
		for (String input : listSet) {
			if (isVowelsPresent(input)) {
				substringSet.addAll(subString(input.toLowerCase()));
				System.out.println(getVowelsCount(substringSet));
			} else {
				System.out.println("0");
			}
		}
	}

	private static boolean isVowelsPresent(String input) {
		char[] ch = input.toCharArray();
		for (char c : ch) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				return true;
			}
		}
		return false;
	}

	private static Set<String> subString(String input) {
		Set<String> stringList = new LinkedHashSet<>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				String s = input.substring(i, j);
				if (s.chars().filter(ch -> (ch == 'a' || ch == 'e' || ch == 'i'
						|| ch == 'o' || ch == 'u')).count() > 0)
					stringList.add(s);
			}
		}
		return stringList;
	}

	private static long getVowelsCount(Set<String> returnList) {
//		System.out.println("return List" + returnList);
		long count = 0;
		for (String eachList : returnList) {
			count += eachList.chars().filter(
					ch -> (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
					.count();
		}
		return count;
	}

}

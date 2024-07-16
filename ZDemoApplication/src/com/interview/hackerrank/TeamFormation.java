package com.interview.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeamFormation {

	public static void main(String... args) {
//      List<Integer> skills = Arrays.asList(4, 8, 5, 6);
//      int minPlayers = 1;
//      int minLevel = 5;
//      int maxLevel = 7;

		List<Integer> skills = Arrays.asList(12, 4, 6, 13, 5, 10);
		int minPlayers = 3;
		int minLevel = 4;
		int maxLevel = 10;

		extracted(skills, minPlayers, minLevel, maxLevel);
	}

	private static void extracted(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {
		int matchedCount = skills.stream()
				.filter(skill -> skill >= minLevel && skill <= maxLevel)
				.collect(Collectors.toList()).size();

		int possible = 0;
		for (int count = minPlayers; count <= matchedCount; count++)
			possible += posibilities(matchedCount, count);
		System.out.println(possible);
	}

	public static int posibilities(int length, int size) {
		return factorial(length) / (factorial(size) * (factorial(length - size)));
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int count = 1; count <= n; count++)
			fact *= count;
		return fact;
	}

}

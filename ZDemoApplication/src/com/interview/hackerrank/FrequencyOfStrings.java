package com.interview.hackerrank;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfStrings {

	public static void main(String[] args) {
		List<String> tokenString = Arrays.asList("PR000177", "PR000139", "PR000143", "PR000343", "PR000145", "PR000149",
				"PR000155", "PR000161", "PR000167", "PR000169", "PR000408", "PR000177", "PR000179", "PR000182",
				"PR000183", "PR000187", "PR000190", "PR000343", "PR000407", "PR000408", "PR000417", "PR000419",
				"PR000420", "PR000554");
		printFrequency(tokenString);
	}

	private static void printFrequency(List<String> tokenString) {
		tokenString = tokenString.stream().sorted().collect(Collectors.toList());
		Map<String, Integer> frequencyMap = new LinkedHashMap<>();
		for (int index = 0; index < tokenString.size(); index++) {
			if (frequencyMap.containsKey(tokenString.get(index)))
				frequencyMap.put(tokenString.get(index), frequencyMap.get(tokenString.get(index)) + 1);
			else
				frequencyMap.put(tokenString.get(index), 1);
		}
		for (String key : frequencyMap.keySet()) {
			System.out.println(key + " " + frequencyMap.get(key));
		}
	}
}

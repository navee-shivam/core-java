package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalLogic {

	public static void main(String[] args) {
		System.out.println(sumUnique(Arrays.asList(1,2)));
	}

	private static int sumUnique(List<Integer> intList) {
		if (intList.size() == 1) {
			return intList.get(0);
		}

		int result = 0;
		Map<Integer, Integer> integerMap = new HashMap<>();
		for (Integer value : intList) {
			if (integerMap.containsKey(value))
				integerMap.put(value, integerMap.get(value) + 1);
			else
				integerMap.put(value, 0);
		}

		for (Map.Entry<Integer, Integer> mapInteger : integerMap.entrySet()) {
			if (mapInteger.getValue() == 0) {
				result = result + mapInteger.getKey();
			}
		}

		return result;
	}

}

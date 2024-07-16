package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSum {

	public static int findMaxSum(List<Integer> list) {

		if (list.size() > 2) {
			Integer firstMax = maxNumberInList(list);
			List<Integer> firstMaxRemoveList = list.stream().filter(intList -> intList != firstMax)
					.collect(Collectors.toList());
			Integer secondMax = maxNumberInList(firstMaxRemoveList);
			return firstMax + secondMax;
		} else {
			return list.stream().reduce(0, Integer::sum);
		}
	}

	private static int maxNumberInList(List<Integer> list) {
		return list.stream().reduce(Integer::max).get();
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,5,10,5,5,10,10,10,10);
		System.out.println(findMaxSum(list));
	}

}

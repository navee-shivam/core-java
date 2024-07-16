package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class KthSmallestElement {

	public static void main(String[] args) {
		int k = 4;
		int[] intArr = { 3, 2, 1, 0 };
		System.out.println(getKthElement(intArr, k));
	}

	private static Integer getKthElement(int[] intArr, int k) {
		Set<Integer> setList = Arrays.stream(intArr).boxed().collect(Collectors.toSet());
		List<Integer> list = setList.stream().collect(Collectors.toList());
		return (list.size() > k) ? list.get(k) : null;
	}

}

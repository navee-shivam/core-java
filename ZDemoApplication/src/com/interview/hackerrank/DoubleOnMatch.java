package com.interview.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class DoubleOnMatch {
	public static void main(String... args) {

		List<Long> arr = Arrays.asList(1L, 2L, 4L, 11L, 12L, 8L);
		long num = 2;

		extracted(arr, num);
		doubleSize(arr,num);
	}

	private static void extracted(List<Long> arr, long num) {

//		Collections.sort(arr);
		Long result = num;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == result) {
				result = result * 2;
			}
		}
		System.out.println(result);

	}

	public static void doubleSize(List<Long> arr, long b) {
		AtomicLong result = new AtomicLong(b);
		Collections.sort(arr);

		arr.stream().sorted(Long::compare).forEach(value -> {
			long resultValue = result.get();
			if (value == resultValue) {
				result.set(resultValue * 2);
			}
		});
		System.out.println(result.get());
	}
}

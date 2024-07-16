package com.algorithms;

import java.util.Arrays;

public class SquareSortArray {

	public static void main(String[] args) {
		int[] input = new int[] { -1, -4, 0, 3, 100, 5, -7, 10, 2 };
		sort(input);
	}

	private static void sort(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			int j = i;
			int B = input[i] * input[i];
			while ((j > 0) && (input[j - 1] < B)) {
				input[j] = input[j - 1];
				j--;
			}
			input[j] = B;
			count++;
		}
		for (int i = 0; i < input.length; i++)
			System.out.println(input[i]);
	}

}

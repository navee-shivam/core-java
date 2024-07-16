package com.algorithms;


public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 8, 7, 0 };
		int[] arr2 = { 18, 11, 2, 1 };
		int[] sorted = bubbleSort(ConcatTwoArrays.concatArrays(arr, arr2));
		for (int a : sorted)
			System.out.println(a);
	}

	private static int[] bubbleSort(int[] arr) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return arr;

	}

}

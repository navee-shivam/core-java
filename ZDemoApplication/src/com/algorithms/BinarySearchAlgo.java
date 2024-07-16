package com.algorithms;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		int[] arrayList = { 1, 2, 4, 5, 9, 10 };
		System.out.println(searchIndex(arrayList, 0, arrayList.length,6));
	}

	private static int searchIndex(int[] arrayList, int left, int right, int searchValue) {

		if (right >= 1) {

			int mid = (left + right) / 2;
			if (arrayList[mid] == searchValue)
				return mid + 1;
			if (arrayList[mid] < searchValue)
				return searchIndex(arrayList, mid + 1, right, searchValue);

			return searchIndex(arrayList, left, mid - 1, searchValue);

		}
		return -1;

	}

}

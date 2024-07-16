package com.interview;

import java.util.ArrayList;
import java.util.List;

public class SearchingSorting {

	public static void main(String[] args) {
		int[] arrayList = { 7, 1, 0, 4, 8 };
		arrayList = sort(arrayList);
		searchAndInsert(arrayList, 4);
	}

	private static int[] sort(int[] arrayList) {
//		arrayL
		return new int[] { 0, 1, 4, 7, 8 };
	}

	private static void searchAndInsert(int[] sortedArray, int searchNumber) {
		List arrayList = new ArrayList();
		int searchIndex;
		for (int i = 0; i < sortedArray.length; i++) {
			if (sortedArray[sortedArray.length] > searchNumber) {
				if (searchNumber == sortedArray[i]) {
					searchIndex = i;
				} else {
					arrayList.add(searchNumber);
				}
			} else {
				searchIndex = sortedArray.length + 1;
				break;
			}
			arrayList.add(sortedArray[i]);

		}
	}

}

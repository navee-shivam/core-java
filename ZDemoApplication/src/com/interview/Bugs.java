package com.interview;

public class Bugs {

	public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
		int remaining = 0;
		if (items >= 5) {
			remaining = items - (availableLargePackages * 5);
			if (availableSmallPackages < remaining)
				return -1;
		} else {
			if (availableSmallPackages < items)
				return -1;
			remaining = items - availableSmallPackages;
		}

		return availableLargePackages + remaining;

	}

	public static void main(String[] args) {
		System.out.println(minimalNumberOfPackages(1, 2, 10));
	}

}

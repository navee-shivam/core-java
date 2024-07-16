package com.interview;

public class MovingTotal {
	private static int[] dynamicList = {};

	/**
	 * Adds/appends list of integers at the end of internal list.
	 */
	public void append(int[] list) {

		if (dynamicList.length > 0) {
			for (int listInt : list)
				dynamicList[dynamicList.length + 1] = listInt;
		} else {
			dynamicList = list;
		}
	}

	/**
	 * Returns boolean representing if any three consecutive integers in the
	 * internal list have given total.
	 */
	public boolean contains(int total) {
		System.out.println(total);
		return false;
	}

	public static void main(String[] args) {
		MovingTotal movingTotal = new MovingTotal();

		movingTotal.append(new int[] { 1, 2, 3, 4 });

		System.out.println(movingTotal.contains(6));
		System.out.println(movingTotal.contains(9));
		System.out.println(movingTotal.contains(12));
		System.out.println(movingTotal.contains(7));

		System.out.println(MovingTotal.dynamicList);

		movingTotal.append(new int[] { 5 });

		System.out.println(movingTotal.contains(6));
		System.out.println(movingTotal.contains(9));
		System.out.println(movingTotal.contains(12));
		System.out.println(movingTotal.contains(7));
	}
}

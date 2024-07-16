package com.interview;

public class Epam {

	public static void main(String[] args) {
		int[] a = { 1, 2, 9 };
		System.out.println(doIncrement(a));
	}

	private static int[] doIncrement(int[] a) {
		for (int index = a.length - 1; index >= 0; index--) {
			if (a[index] == 9) {
				a[index] = 0;
			} else {
				a[index] = a[index] + 1;
				break;
			}
		}
		if (a[0] == 9) {
			int[] b = new int[a.length + 1];
			
			return b;
		}
		return a;
	}

}

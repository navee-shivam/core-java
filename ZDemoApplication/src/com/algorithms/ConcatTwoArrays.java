package com.algorithms;
public class ConcatTwoArrays {

	public static void main(String[] args) {
		int[] a = { 6, 0, 4, 2 };
		int[] b = { 9, 1, 7, 8 };

		int[] concat = concatArrays(a, b);
		for (int i : concat)
			System.out.println(i);

	}

	protected static int[] concatArrays(int[] a, int[] b) {
		int[] concat = new int[a.length + b.length];
		int concatIndex = 0;
		concatIndex = doConcateOperation(concat, a, a.length, concatIndex);
		doConcateOperation(concat, b, b.length, concatIndex);
		return concat;
	}

	private static int doConcateOperation(int[] concat, int[] a, int length,
			int concatIndex) {
		int i = 0;
		while (i < length) {
			concat[concatIndex] = a[i];
			i++;
			concatIndex++;
		}
		return concatIndex;

	}

}

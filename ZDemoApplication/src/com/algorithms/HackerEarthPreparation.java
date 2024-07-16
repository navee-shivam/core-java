package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HackerEarthPreparation {

	public static void main(String[] args) {
		// try (Scanner sc = new Scanner(System.in)) {
		// int T = sc.nextInt();
		// String str = "";
		// while (T-- > 0) {
		// str = sc.next();
		// }
		// System.out.println("String : " + str);
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = s.nextLine();
		findMinNumber(str);
		// }
	}

	private static void findMinNumber(String str) {
		if (!str.isEmpty()) {
			String[] eachInt = str.split(" ");
			List<Integer> listInteger = new ArrayList<Integer>();
			for (String s : eachInt) {
				listInteger.add(Integer.parseInt(s));
			}
			Collections.sort(listInteger, (s1, s2) -> s1 - s2);
			System.out.println(listInteger.get(0));
		}
	}
}
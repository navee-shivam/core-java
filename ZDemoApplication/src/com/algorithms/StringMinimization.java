package com.algorithms;

import java.util.*;

public class StringMinimization {

	public static void main(String[] args) {
		 String s = "aabcccabba";
//		String s = "bbaccccaab";
		List<Character> listCharacter = new LinkedList<>();
		String concatReverse = s.substring(s.length() / 2, s.length())
				+ s.substring(0, s.length() / 2);
		char[] charArray = concatReverse.toCharArray();
		for (char ch : charArray) {
			listCharacter.add(ch);
		}
		System.out.println("Before :" + listCharacter);
		System.out.println(doMinimization(listCharacter));

	}

	private static List<Character> doMinimization(List<Character> characterList) {
		if (characterList.size() == 1) {
			return characterList;
		}
		if ((characterList.get(characterList.size() / 2)
				.equals(characterList.get(characterList.size() / 2 + 1)))
				&& (characterList.get(characterList.size() / 2)
						.equals(characterList.get(characterList.size() / 2 - 1)))) {
			int median = characterList.size() / 2 - 1;
			characterList.remove(median);
			characterList.remove(median);
			characterList.remove(median);
		} else {
			return characterList;
		}
		return doMinimization(characterList);
	}
}

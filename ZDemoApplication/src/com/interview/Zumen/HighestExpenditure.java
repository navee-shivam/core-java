package com.interview.Zumen;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HighestExpenditure {

	public static void main(String[] args) {
		ArrayList<Account> list = new ArrayList<Account>();
		list.add(new Account("Frank", 12, 6));
		list.add(new Account("David ", 7, 19));
		list.add(new Account("Karen", 14, 45));

		Collections.sort(list);

		System.out.println("Most valuable account details:");
		System.out.println(list.get(list.size() - 1));

	}

}

interface OnlineAccount {
	int basePrice = 120;
	int regularMoviePrice = 45;
	int exclusiveMoviePrice = 80;
}

class Account implements OnlineAccount, Comparable<Account> {

	int noOfRegularMovies, noOfExclusiveMovies;
	String ownerName;

	// 1) Add a parameterized constructor that initializes the attributes
	// noOfRegularMovies and noOfExclusiveMovies.
	public Account(String ownerName, int noOfRegularMovies, int noOfExclusiveMovies) {
		this.ownerName = ownerName;
		this.noOfRegularMovies = noOfRegularMovies;
		this.noOfExclusiveMovies = noOfExclusiveMovies;
	}

	// 2. This method returns the monthly cost for the account.
	public int monthlyCost() {
		return basePrice + this.noOfRegularMovies * regularMoviePrice + this.noOfExclusiveMovies * exclusiveMoviePrice;
	}

	// 3. Override the compareTo method of the Comparable interface such that two
	// accounts can be compared based on their monthly cost.
	@Override
	public int compareTo(Account account) {
		return this.monthlyCost() - account.monthlyCost();
	}

	// 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
	public String toString() {
		return "Owner is " + this.ownerName + " and monthly cost id " + this.monthlyCost() + " USD.";
	}

}

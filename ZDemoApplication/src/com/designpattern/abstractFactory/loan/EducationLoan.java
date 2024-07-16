package com.designpattern.abstractFactory.loan;

public class EducationLoan extends Loan {

	@Override
	public void getInterestRate(double r) {
		rate = r;
	}

}

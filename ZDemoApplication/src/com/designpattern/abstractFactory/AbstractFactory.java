package com.designpattern.abstractFactory;

import com.designpattern.abstractFactory.Bank.Bank;
import com.designpattern.abstractFactory.loan.Loan;

public abstract class AbstractFactory {

	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);

}

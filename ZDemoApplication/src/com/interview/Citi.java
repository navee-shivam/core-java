package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Citi {

	public static void main(String[] args) throws Exception {
		VariableClass vc = new VariableClass();
		vc.display();
	}

}

class VariableClass {

	int variable = 15;

	public void display() throws Exception {
		VariableClass vc = new VariableClass();
		vc.variable = 25;
		System.out.println(this.variable);
		System.out.println(vc.variable);
		System.out.println(vc.makeFibonoci(8));

	}

	public List<Integer> makeFibonoci(Integer givenNumber) {
		int variable = 10;
		System.out.println("variable " + this.variable);

		this.variable = 35;

		VariableClass variableClass = new VariableClass();
		System.out.println(variableClass.variable);

		List<Integer> fiboList = new ArrayList<>();
		Integer first = 0;
		Integer second = 1;
		Integer lastIndex = 0;

		if (givenNumber < 2) {
			fiboList.add(first);
			fiboList.add(second);
		} else if (givenNumber > 2) {
			fiboList.add(first);
			fiboList.add(second);
			for (int i = 1; lastIndex < givenNumber; i++) {
				fiboList.add(fiboList.get(i) + fiboList.get(i - 1));
				lastIndex = fiboList.get(i + 1);
			}

		} else
			return fiboList;

		return fiboList;
	}

}

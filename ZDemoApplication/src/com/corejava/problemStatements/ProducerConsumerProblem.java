package com.corejava.problemStatements;

public class ProducerConsumerProblem {

	public static void main(String[] args) throws InterruptedException {

		final CommonList commonList = new CommonList();

		Thread producer = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				try {
					commonList.produce(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer1 = new Thread(() -> {
			try {
				commonList.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread consumer2 = new Thread(() -> {
			try {
				commonList.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		producer.start();
		consumer1.start();
		consumer2.start();
		producer.join();

	}

}

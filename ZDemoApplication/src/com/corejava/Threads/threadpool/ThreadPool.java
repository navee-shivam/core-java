package com.corejava.Threads.threadpool;

public class ThreadPool implements Runnable {

	private String msg;

	ThreadPool(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println("Starts : " + msg);
		processSteps();
		System.out.println(" End : " + msg);
	}

	void processSteps() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(" { Error : } " + e);
		}
	}

}

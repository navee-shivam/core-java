package com.corejava.Threads.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolImpl {

	public static void main(String[] args) {
//		Thread t = new Thread(new ThreadPool("Welcome"));
//		t.start();
//		Thread t2 = new Thread(new ThreadPool("Hello"));
//		t2.start();
//		Thread t3 = new Thread(new ThreadPool("Learning"));
//		t3.start();

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 12; i++) {
			Runnable obj = new ThreadPool("" + i);
			executor.execute(obj);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("********All threads are Finished********");

	}

}

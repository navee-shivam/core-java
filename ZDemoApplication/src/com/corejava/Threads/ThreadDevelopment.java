package com.corejava.Threads;

public class ThreadDevelopment {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println(t.getId() + " : " + t.getName() + " : " + t.getPriority() + " : "
				+ t.getThreadGroup().getName() + " : ");
		createThread();
	}

	private static void createThread() {
		ThreadImpl tImpl = new ThreadImpl();
		Thread t = new Thread(tImpl);
		t.setName("My thread");
		t.setPriority(1);
		t.start();
		System.out.println(t.getId() + " : " + t.getName() + " : " + t.getPriority());
	}

}

package com.corejava.problemStatements;

public class DeadLock {

	public static Object obj1 = new Object();
	public static Object obj2 = new Object();

	public static void main(String[] args) {
		new Thread1().start();
		new Thread2().start();
	}

	private static class Thread1 extends Thread {
		public void run() {
			synchronized (obj1) {
				System.out.println("thread-1 lock obj1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread-1 waiting for lock2");
				synchronized (obj2) {
					System.out.println("Thread-1 lock obj2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}

	private static class Thread2 extends Thread {
		public void run() {
			synchronized (obj2) {
				System.out.println("thread-2 lock obj2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread-2 waiting for lock obj1");
				synchronized (obj1) {
					System.out.println("Thread-2 lock obj1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}
	
	
	



}

package com.corejava.problemStatements;

import java.util.LinkedList;

public class CommonList {
	
	LinkedList list = new LinkedList();
	int capacity = 2;

	public void produce(Integer value) throws InterruptedException {
		synchronized (this) {
			while (list.size() == capacity) {
				System.out.println("list is full producer is waiting");
				wait();
			}
			list.add(value);
			System.out.println("producer produces : " + list);
			wait();
			notify();
		}
	}

	public void consume() throws InterruptedException {
		synchronized (this) {
			while (list.size() == 0)
				wait();
			System.out.println("consumer consumes : " + list.removeFirst());
			notify();

			Thread.sleep(100);
		}
	}
}
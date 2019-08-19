package com.learn.thread.basic;

import java.util.concurrent.TimeUnit;

public class Interrupt {

	public static void main(String[] args) {
		Thread td = new CompoundSum();
		td.start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		td.interrupt();
	}

}

class CompoundSum extends Thread {
	public void run() {
		try {
			calculate();
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted");
		}
	}

	void calculate() throws InterruptedException {
		int i = 1;
		while (true) {
			System.out.println(i++);
			if (Thread.currentThread().isInterrupted()) {
				throw new InterruptedException();
			}
		}
	}
}
package com.learn.thread.basic;

import java.lang.Thread.State;

public class ThreadStates {

	public static void main(String[] args) {
		Thread[] t = new Thread[5];
		Thread.State[] tstate = new Thread.State[5];
		for (int i = 1; i <= 5; i++) {
			Thread td = new Thread(new Calculate(i));
			t[i - 1] = td;
			tstate[i - 1] = td.getState();
		}
		for (int i = 0; i < 5; i++) {
			t[i].start();
		}

		boolean finish = false;
		while (!finish) {
			for (int i = 0; i < 5; i++) {
				if (!tstate[i].equals(t[i].getState())) {
					System.out.println("Thread " + t[i].getName() + " changed it state from " + tstate[i] + "  to  "
							+ t[i].getState());
					tstate[i] = t[i].getState();
				}
			}
			finish = true;

			for (int i = 0; i < 5; i++) {
				finish = finish && (t[i].getState() == State.TERMINATED);
			}
		}

	}

}

class Calculate extends Thread {
	int number;

	Calculate(int number) {

		this.number = number;
	}

	public void run() {
		calculate();
	}

	void calculate() {
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName() + "  number" + number + "     " + i * number);
			// i=i*number;
		}
	}
}
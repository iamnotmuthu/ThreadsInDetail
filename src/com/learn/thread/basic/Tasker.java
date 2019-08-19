package com.learn.thread.basic;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tasker {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<2;i++){
			Runnable r=new Task();
			Thread t=new Thread(r);
			t.start();
			TimeUnit.SECONDS.sleep(2);
		}
	}

}


class Task implements Runnable{

	Date startTime;
	@Override
	public void run() {
		startTime=new Date();
		System.out.println("Thread started at "+Thread.currentThread().getName()+startTime);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task completed "+Thread.currentThread().getName()+startTime);
	}
	
}
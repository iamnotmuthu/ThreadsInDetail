package com.learn.thread.basic;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		Thread ot=new OddCounter();
		Thread et=new EvenCounter();
		
		ot.start();
		ot.join();
		
		et.start();
		et.join();
		
System.out.println("main ends");
	}
}

	class OddCounter extends Thread{
		public void run(){
			for(int i=1;i<10;i=i+2){
				System.out.println(Thread.currentThread().getName()+"  "+(i));
			}
		}
	}
	
	class EvenCounter extends Thread{
		public void run(){
			for(int i=0;i<10;i=i+2){
				System.out.println(Thread.currentThread().getName()+"  "+(i));
			}
		}
}

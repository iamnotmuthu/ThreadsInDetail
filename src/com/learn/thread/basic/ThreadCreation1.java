package com.learn.thread.basic;

public class ThreadCreation1 {

	public static void main(String[] args) {
		Thread t2=new Calculator(2);
		t2.start();
		Thread t3=new Calculator(3);
		t3.start();
		System.out.println("Main thread completed");
	}

}

class Calculator extends Thread{
	int number;
	
	Calculator(){}
	
	Calculator(int i){
		this.number=i;
	}
	//thread's default invoking method
	public void run(){
			calculate();
		
	}
	
	//business logic 
	public void calculate(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i*number);
			
		}
	}
}
package com.learn.thread.basic;

public class ThreadCreation2 {

	public static void main(String[] args) {
		
		Runnable cr2=new CalculatorRun(2);
		Runnable cr3=new CalculatorRun(3);
		Thread t2=new Thread(cr2);
		Thread t3=new Thread(cr3);
		t2.start();
		t3.start();
		System.out.println("Main thread completed");
		
		
	}

}


class CalculatorRun implements Runnable{
	int number;
	
	CalculatorRun(){}
	
	CalculatorRun(int i){
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
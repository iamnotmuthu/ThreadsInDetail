1)  Concurrency vs Parrallelism
		Concurrency: Single thread does multiple tasks in single processor.(single thread, multiple taks,not simultaneous)
		Parallelism: Multiple thread work simultaneously in multiple cores.(Multiple thread, multiple task, same time)
		
2)	Creating and Running Thread
		Thread is a java object . 2 ways to create it.
		Extends Thread class  (ThreadCreation1.java)
		Implements Runnable interface. (ThreadCreation2.java)
		
3)  Thread states  -> (ThreadStates.java).
		Thread switches to multiple states. NEW->runnable->running->blocke->Terminated. 

4) Thread Interrupt -> (Interrupt.java)
	A Java process can have multiple threads. Process is complete only when all threads completes. If a thread takes too long to complete it's task, then we may interrupt it, so that it can stop it execution and program completes.
	
5) Joining Thread -> (ThreadJoin.java)
	Current thread shall be put on hold, until specified thread completes its execution.
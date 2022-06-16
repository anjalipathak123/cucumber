package javaassessment;

public class MyThread2 extends Thread{

	public void run()
	{

		currentThread().setName("MyThread1");
		System.out.println("Thread name="+ currentThread().getName() +" Thread priority=" + currentThread().getPriority()+ " hii");
	}
}

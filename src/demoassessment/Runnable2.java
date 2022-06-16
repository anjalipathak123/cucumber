package demoassessment;

public class Runnable2 extends Thread{

	public void run()
	{
		System.out.println("Thread Name="+ Thread.currentThread().getName()+" Thread Priority="+Thread.currentThread().getPriority()+" Hii");
	}
}

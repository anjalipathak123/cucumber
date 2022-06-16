package demoassessment;

public class Runnable1 extends Thread{

	public void run()
	{    
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Name="+ Thread.currentThread().getName()+" Thread Priority="+Thread.currentThread().getPriority()+" Hello");
	}
}

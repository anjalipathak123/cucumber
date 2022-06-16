package demoassessment;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable1 o1=new Runnable1();
		o1.setName("First THread");
		o1.start();
		
		Runnable2 o2=new Runnable2();
		o1.setName("Second THread");
		o2.start();

	}

}

package javaassessment;

public class MainThread  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 obj1=new MyThread1();
		obj1.setPriority(7);
		obj1.start();
		
		MyThread2 obj2=new MyThread2();
		obj2.setPriority(6);
		obj2.start();
		
		
	}

	

}

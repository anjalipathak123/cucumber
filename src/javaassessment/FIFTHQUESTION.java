package javaassessment;

public class FIFTHQUESTION {
	
	static int rem,count=0,rev=0, temp,number=123;
	
	public static void reverse(int a)
	{
		temp=a;
		while(a!=0)
		{
			rem=a%10;
			count++;
			a=a/10;
		}
		a=temp;
		for(int i=0;i<count;i++)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			
		}
		System.out.println("reverse of the number is="+rev);
	}
	
	public static void main(String[] args)
	{
		FIFTHQUESTION.reverse(number);

}
}
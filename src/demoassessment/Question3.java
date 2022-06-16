package demoassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question3 {

	static List<Integer> list=new ArrayList<>();
	static List<Integer> list1=new ArrayList<>();
	static int c=0;
	public static void addData()
	{
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(6);
		list.add(5);
	}
	public static void main(String[] args)
	{
		Question3.addData();
		for(Integer i:list)
		{ c=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				c=1;
					
			}
			if(c==0)
				list1.add(i);
		}
		System.out.println("List of prime numbers:"+list1);
		
		Collections.sort(list1);
		System.out.println(list1);
	}
		
	 
		
}



package demoassessment;

import java.util.ArrayList;
import java.util.List;

public class Squares {
	
	static List list=new ArrayList<>();
	public static void addSquares()
	{
		for(int i=0;i<=10;i++)
		{
			list.add(i*i);
		}
		
		
		if(list.size()>10)
		{
			throw new ListException("List not accepted");
		}
		else
			System.out.println(list);
	}

}

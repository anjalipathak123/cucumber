package demoassessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartWithI {
	
	static List<Integer> list=new ArrayList<>();
	
	public static void addNum()
	{
		list=Arrays.asList(1,4,51,12,14,43);
		
		list.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
	}
	
	public static void main(String[] args)
	{
		StartWithI.addNum();
	}
	

}

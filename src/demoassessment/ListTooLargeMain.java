package demoassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTooLargeMain {

	static List data=new ArrayList<>(Collections.nCopies(100, "anjali"));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(data.size()>50)
		{
			throw new ListTooLarge("List is too large");
		}

	}

}

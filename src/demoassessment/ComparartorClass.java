package demoassessment;

import java.util.Comparator;

public class ComparartorClass implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmail().equals(o2.getEmail()))
		{
			return o1.getId()-o2.getId();
		}
		else 
			return o1.getEmail().compareTo(o2.getEmail());
	}

}

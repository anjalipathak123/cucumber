package demoassessment;

import java.util.ArrayList;
import java.util.List;

public class Departmentss {
	
  String name;
  List<Students> listOfStudnts;
  
  
  
  public  Departmentss(String name, List<Students> listOfStudnts) {
//	super();
	this.name = name;
	this.listOfStudnts = listOfStudnts;
}



public static void main(String[] args)
  {
	  Students o1=new Students(1,"anjali");
	  Students o2=new Students(2,"anju");
	  
	  List list=new ArrayList<>();
	  list.add(o1);
	  list.add(o2);
	  
	  Departmentss d1=new Departmentss();
  }

}

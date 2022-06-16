package demoassessment;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
	static List EmployeeList1=new ArrayList<>();
	static List EmployeeList2=new ArrayList<>();
	
	public static void addData1()
	{
		Employee e1=new Employee(101,"Anjali","anjalip@netlink.com",23455,12500,"trainee",true,22);
		Employee e2=new Employee(104,"ajay","ajayd@netlink.com",45633,12500,"psv",false,32);
		Employee e3=new Employee(102,"vishal","vishald@netlink.com",45633,12500,"trainee",true,34);
		Employee e4=new Employee(103,"priyanshi","priyanship@netlink.com",9876,458888,"vicepresident",false,22);
		Employee e5=new Employee(106,"alok","alokt@netlink.com",23455,12500,"trainee",true,30);
		Employee e6=new Employee(105,"neeraj","neerajm@netlink.com",23455,56000,"hod",false,22);
		Employee e7=new Employee(107,"mudita","muditar@netlink.com",3456,12500,"trainee",true,23);
		Employee e8=new Employee(108,"tushar","tushars@netlink.com",76859,12500,"hgm",false,22);
		Employee e9=new Employee(110,"abhishek","abhisheks@netlink.com",87564,51000,"manager",true,24);
        Employee e10=new Employee(109,"aman","amanc@netlink.com",5374,12500,"trainee",false,34);
        
        EmployeeList1.add(e1);
        EmployeeList1.add(e2);
        EmployeeList1.add(e3);
        EmployeeList1.add(e4);
        EmployeeList1.add(e5);
        EmployeeList2.add(e6);
        EmployeeList2.add(e7);
        EmployeeList2.add(e8);
        EmployeeList2.add(e9);
        EmployeeList2.add(e10);
        
		
		
	}
	
	public static void main(String[] args)
	{
		Question2.addData1();
	}

}

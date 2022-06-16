package demoassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
	
	static List<Employee> listOfEmployees=new ArrayList<>();
	static Employee employee;
	
	public static void addDataToEmployees()
	{
		Employee e1=new Employee(101,"Anjali","anjalip@netlink.com",23455,12500,"trainee",true,22);
		Employee e2=new Employee(104,"ajay","ajayd@netlink.com",45633,12500,"psv",false,32);
		Employee e3=new Employee(102,"vishal","vishald@netlink.com",45633,12500,"trainee",true,34);
		Employee e4=new Employee(103,"anjali","priyanship@netlink.com",9876,458888,"vicepresident",false,22);
		Employee e5=new Employee(106,"alok","alokt@netlink.com",23455,12500,"trainee",true,30);
		Employee e6=new Employee(105,"neeraj","alokt@netlink.com",23455,56000,"hod",false,22);
		Employee e7=new Employee(107,"mudita","muditar@netlink.com",3456,12500,"trainee",true,23);
		Employee e8=new Employee(108,"tushar","tushars@netlink.com",76859,12500,"hgm",false,22);
		Employee e9=new Employee(110,"abhishek","abhisheks@netlink.com",87564,51000,"manager",true,24);
        Employee e10=new Employee(109,"aman","amanc@netlink.com",5374,12500,"trainee",false,34);
        
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
        listOfEmployees.add(e5);
        listOfEmployees.add(e6);
        listOfEmployees.add(e7);
        listOfEmployees.add(e8);
        listOfEmployees.add(e9);
        listOfEmployees.add(e10);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass.addDataToEmployees();
//		List collects=listOfEmployees.stream().filter(i->i.getSalary()>50000).collect(Collectors.toList());
//		List collects1=(List) collects.stream().map(employee->{
//			((Employee) employee).setDesignation("trainer");
//			return employee;
//		}).collect(Collectors.toList());
//		collects1.forEach(s->System.out.println(s));
//		
//		List collects2=listOfEmployees.stream().filter(i->i.getSalary()<50000).collect(Collectors.toList());
//		List collects3=(List) collects2.stream().map(i->{
//			((Employee) i).setDesignation("Trainee");
//			return i;
//		}).collect(Collectors.toList());
//		collects3.stream().forEach(System.out::println);
//
//		List list=listOfEmployees.stream().filter(i->i.getSalary()<50000).collect(Collectors.toList());
//		list.forEach(s->System.out.println("*"));
		
//		List<Employee> list1=listOfEmployees.stream().filter(i->i.getAge()<30).collect(Collectors.toList());
//		list1.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(s->System.out.println(s));
//		
//      Comparator<Employee> comp=(o1,o2)->o1.getName().compareTo(o2.getName());
//		List list2=listOfEmployees.stream().filter(i->i.isStatus()==true).collect(Collectors.toList());
//		list2.stream().sorted((o1,o2)->((Employee) o1).getName().compareTo(((Employee) o2).getName())).forEach(s->System.out.println(s));
	
//		Collections.sort(listOfEmployees,new ComparartorClass());
//		System.out.println(listOfEmployees);
		
		
//		int count=(int) listOfEmployees.stream().filter(i->i.getDesignation().equals("trainee")).count();
//		System.out.println(count);
		
//once gain		
		
//		List collects=listOfEmployees.stream().filter(i->i.getSalary()>50000).collect(Collectors.toList());
//		collects.stream().map(i->{
//			((Employee) i).setDesignation("manager");
//			return i;
//		}).forEach(i->System.out.println(i));;
		
//		List list=listOfEmployees.stream().filter(i->i.getSalary()<50000).collect(Collectors.toList());
//		list.stream().map(i->{
//			((Employee) i).setDesignation("trainee");
//			return i;
//		}).forEach(System.out::println);;
		
//		List list=listOfEmployees.stream().filter(i->i.getAge()<30).collect(Collectors.toList());
//		list.stream().sorted((o1,o2)->((Employee) o1).getName().compareTo(((Employee) o2).getName())).forEach(System.out::println);;

//		listOfEmployees.stream().sorted((o1,o2)->{
//			if(o1.getEmail().equals(o2.getEmail()))
//				return o1.getId()-o2.getId();
//			else
//				return
//						o1.getEmail().compareTo(o2.getEmail());
//		}).forEach(System.out::println);;
//		
//		int result=listOfEmployees.stream().mapToInt(i->i.getAge()).sum();
//       System.out.println(result);
		
		List<String> names=listOfEmployees.stream().map(i->i.getName()).collect(Collectors.toList());
		Set uniqueNames=new HashSet<>(names);
		System.out.println(uniqueNames);
//	    Set set=(Set) uniqueNames.stream().filter(i->((Employee) i).getSalary()>40000).collect(Collectors.toSet());
//		System.out.println(set);
//		
//		List uniqueNameList=new ArrayList<>(uniqueNames);
//		List list1=(List) uniqueNameList.stream().filter(i->((Employee) i).getSalary()>40000).collect(Collectors.toList());
//		list1.stream().sorted(( o1, o2)-> { return ((Employee) o1).getName().compareTo(((Employee) o2).getName()); } ).forEach(System.out::println);
//		
//		listOfEmployees.stream().findFirst().ifPresent(System.out::println);
//		
//		long c=listOfEmployees.stream().count();
//		System.out.println(c);
//		
//		List list2=listOfEmployees.stream().sorted((Employee o1,Employee o2)->{ return o2.getId()-o1.getId();}).collect(Collectors.toList());
//		System.out.println(list2.get(0));
//		
//		Object[] arr=listOfEmployees.toArray();
//		for(Object i:arr)
//		{
//			System.out.println(i);
//		}
//		
		List collect=listOfEmployees.stream().map(Employee ->{
			Employee.getName();
			return Employee;
		}).distinct().collect(Collectors.toList());
		
		List collect1=(List) collect.stream().filter( i->((Employee) i).getSalary()>40000).collect(Collectors.toList());;
        collect1.stream().sorted((o1,o2)->((Employee) o1).getName().compareTo(((Employee) o2).getName())).forEach(System.out::println);
		}
	
	
	
	

}

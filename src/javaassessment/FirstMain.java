package javaassessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstMain {
	
	static List lisOfDevelopers=new ArrayList<>();
	
	static public void addDataToDevelopers()
	{
		Developers d1=new Developers(101,"anjali",12500,"trainee",true,22,"10/01/2000");
		Developers d2=new Developers(102,"anshul",12600,"Manager",true,22,"01/01/2000");
		Developers d3=new Developers(103,"farheen",12500,"trainee",false,23,"02/01/2000");
		Developers d4=new Developers(104,"deeba",12400,"manager",true,24,"10/01/2000");
		Developers d5=new Developers(105,"mahek",12500,"trainer",false,22,"10/01/2000");
		Developers d6=new Developers(106,"imad",12300,"trainee",false,20,"");
		Developers d7=new Developers(107,"devansh",40500,"trainee",false,22,"03/01/2000");
		Developers d8=new Developers(108,"ajay",50000,"trainee",true,21,"04/01/2000");
		Developers d9=new Developers(109,"priyanshi",160500,"trainer",true,22,"10/01/2000");
		Developers d10=new Developers(110,"vishal",60000,"trainee",true,23,"");
		Developers d11=new Developers(111,"mansi",123500,"trainee",true,22,"07/01/2000");
		Developers d12=new Developers(112,"ishika",124500,"trainer",true,30,"10/01/2000");
		Developers d13=new Developers(113,"mudita",12500,"trainee",false,22,"10/01/2000");
		Developers d14=new Developers(114,"deepika",125500,"trainer",true,35,"");
		Developers d15=new Developers(115,"anjali",12500,"trainee",false,22,"08/01/2000");
		Developers d16=new Developers(116,"priyanshi",12500,"trainee",true,30,"10/01/2000");
		Developers d17=new Developers(117,"ajay",12500,"trainee",true,22,"01/01/2000");
		Developers d18=new Developers(118,"vishal",125400,"trainee",false,21,"10/01/2000");
		Developers d19=new Developers(119,"jay",12500,"trainee",true,22,"10/01/2000");
		Developers d20=new Developers(120,"ayushi",12400,"trainee",false,26,"10/01/2000");
		
		lisOfDevelopers.add(d1);
		lisOfDevelopers.add(d2);
		lisOfDevelopers.add(d3);
		lisOfDevelopers.add(d4);
		lisOfDevelopers.add(d5);
		lisOfDevelopers.add(d6);
		lisOfDevelopers.add(d7);
		lisOfDevelopers.add(d8);
		lisOfDevelopers.add(d9);
		lisOfDevelopers.add(d10);
		lisOfDevelopers.add(d12);
		lisOfDevelopers.add(d13);
		lisOfDevelopers.add(d14);
		lisOfDevelopers.add(d15);
		lisOfDevelopers.add(d16);
		lisOfDevelopers.add(d17);
		lisOfDevelopers.add(d18);
		lisOfDevelopers.add(d19);
		lisOfDevelopers.add(d20);
		
	}
	
	static public void addDataToCompany()
	{
		Company c1=new Company(1,"netlink",lisOfDevelopers);
		Company c2=new Company(1,"netlink1",lisOfDevelopers);
		Company c3=new Company(1,"netlink2",lisOfDevelopers);
		Company c4=new Company(1,"netlink3",lisOfDevelopers);
		Company c5=new Company(1,"netlink4",lisOfDevelopers);
		Company c6=new Company(1,"5netlink",lisOfDevelopers);
		Company c7=new Company(1,"6netlink",lisOfDevelopers);
		Company c8=new Company(1,"7netlink",lisOfDevelopers);
		Company c9=new Company(1,"8netlink",lisOfDevelopers);
		Company c10=new Company(1,"9netlink",lisOfDevelopers);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstMain.addDataToDevelopers();
		FirstMain.addDataToCompany();
		
	//	--1ST SCENARIO 
		
//		List list1=(List) lisOfDevelopers.stream().filter(i->((Developers) i).getSalary()>50000).collect(Collectors.toList());	
//		list1.stream().map(i-> { ((Developers) i).setDesignation("Senior software engineer");
//		return i;
//		}).forEach(System.out::println);
		
//		List list2=(List) lisOfDevelopers.stream().filter(i->((Developers) i).getSalary()>100000).collect(Collectors.toList());
//		list2.stream().map(i->{
//			((Developers) i).setDesignation("Manager");
//			return i;
//		}).forEach(System.out::println);
		
//	List list3=	(List) lisOfDevelopers.stream().filter(i->((Developers) i).getDesignation().equals("Manager")).collect(Collectors.toList());
//    list3.stream().map(i->{((Developers) i).setDesignation("*"); return i; }).forEach(System.out::println);
		
		
		//SECOND 
		
//		long count=lisOfDevelopers.stream().map(i->{ ((Developers) i).getDesignation().equals("trainee"); return i;}).count();
//		System.out.println(count);
//	 lisOfDevelopers.stream().sorted(( o1, o2)-> { return ((Developers) o1).getName().compareTo(((Developers) o2).getName()); }).forEach(System.out::println);
//	
//	long count= lisOfDevelopers.stream().filter(i->((Developers) i).getDesignation().equals("trainer")).count();
//	 System.out.println(count);
		
//		lisOfDevelopers.stream().sorted((o1,o2)->{
//		if(((Developers) o1).getName().equals(((Developers) o2).getName()))
//				return ((Developers) o1).getId()-((Developers) o2).getId();
//		else
//			return ((Developers) o1).getName().compareTo(((Developers) o2).getName());
//	}).forEach(System.out::println);
		
//		long count=long count=lisOfDevelopers.stream().filter(i->((Developers) i).getStatus()==true).count();
//		System.out.println(count);.stream().filter(i->((Developers) i).getStatus()==true).count();
////		System.out.println(count);
		
		//SECOND QUESTION
		
//		List list5=(List) lisOfDevelopers.stream().filter(i->((Developers) i).getAge()==22).collect(Collectors.toList());	
//		list5.stream().sorted((o1,o2)->{return ((Developers) o1).getName().compareTo(((Developers) o2).getName());}).forEach(System.out::println);
//		
//		lisOfDevelopers.stream().filter(i->((Developers) i).getDob().equals("")).forEach(System.out::println);
//		
		lisOfDevelopers.stream().sorted(( o1, o2)->{return ((Developers) o1).getDob().compareTo(((Developers) o2).getDob());}).forEach(System.out::println);;
		
	}
}

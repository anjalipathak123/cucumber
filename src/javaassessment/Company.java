package javaassessment;

import java.util.List;

public class Company {
	
	private int id; 

	private String name; 

	List< Developers> listOfDevelopers;

	public Company(int id, String name, List<Developers> listOfDevelopers) {
		super();
		this.id = id;
		this.name = name;
		this.listOfDevelopers = listOfDevelopers;
	} 
	
	

}

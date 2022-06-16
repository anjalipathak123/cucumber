package javaassessment;

import java.util.Date;

public class Developers {
	
	 private int id; 

	  private String name; 

	  private int salary; 

	  private String designation; 

	  private Boolean status; 

	  private int age; 

	  private String dob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Developers [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", status=" + status + ", age=" + age + ", dob=" + dob + "]";
	}

	public Developers(int id, String name, int salary, String designation, Boolean status, int age, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.status = status;
		this.age = age;
		this.dob = dob;
	} 
	  
	  

}

package com.sunbeam.ass6;

public abstract class Employee {
	int impid;
	String firstName;
	String lastName;
	public int getImpid() {
		return impid;
	}
	public void setImpid(int impid) {
		this.impid = impid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee(int impid, String firstName, String lastName) {
	
		this.impid = impid;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public abstract void calculateSal();
	
	
	

}

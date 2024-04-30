package com.sunbeam.ass6;

public class Salaried extends Employee {
	final int weeklySalary;

	public int getWeeklySalary() {
		return weeklySalary;
	}

	public Salaried(int impid, String firstName, String lastName, int weeklySalary) {
		super(impid, firstName, lastName);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public void calculateSal() {
		double totalSal = weeklySalary;
		System.out.println(totalSal);
	}
	
	

}

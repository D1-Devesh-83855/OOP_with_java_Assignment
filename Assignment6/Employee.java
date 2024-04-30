package com.sunbeam.app;

public abstract class Employee {
    protected String name;
    protected double earnings;

    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
		return name;
	}
  
    public abstract void calculateEarnings();

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Earnings: $" + earnings);
    }
}

package com.sunbeam.ass6;

public class base_salary_Comm extends commissioned {
	int baseSalary;
	public base_salary_Comm(int impid, String firstName, String lastName, int sales,int baseSalary) {
		super(impid, firstName, lastName, sales);
		this.baseSalary = baseSalary;
	
	}
	public void calculateSal() {
		double toalSal =(commisionRate*grossSales)+baseSalary;
		System.out.println(toalSal);
		
			}
	

	

}

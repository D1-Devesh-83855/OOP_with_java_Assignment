package com.sunbeam.ass6;

public class commissioned extends Employee {
	int grossSales;
	float commisionRate;
	public commissioned(int impid, String firstName, String lastName,int sales) {
		super(impid, firstName, lastName);
		this.grossSales = sales;

	}
	public int getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}
	@Override
	public void calculateSal() {
	
		double toalSal = commisionRate*grossSales;
		System.out.println(toalSal);
		
	}

	
	

}

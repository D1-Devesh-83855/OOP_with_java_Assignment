package com.sunbeam.ass6;

public class HourlySalary  extends Employee{
	int wagePerHrs;
	int hrs;
	double totalSal;
	public HourlySalary(int impid, String firstName, String lastName,int wageHrs) {
		super(impid, firstName, lastName);
		this.wagePerHrs = wageHrs;
		// TODO Auto-generated constructor stub
	}
	public int getWageHrs() {
		return wagePerHrs;
	}
	public void setWageHrs(int wageHrs) {
		this.wagePerHrs = wageHrs;
	}
	@Override
	public void calculateSal() {
		if(hrs<=40) {
			totalSal = wagePerHrs*hrs;
			System.out.println(totalSal);
			
		}else if(hrs>40) {
			float overTime = 40-hrs;
			totalSal = (wagePerHrs*40 )+(1.5*wagePerHrs*overTime);
			System.out.println(totalSal);

		}

		
	}
	


	

}

package com.sunbeam.ass6;

import java.util.Scanner;

public class Program {
	Scanner sc = new Scanner(System.in);
	public void menu() {
		int choice = 0;
		
		do {
			System.out.println("Enter your Choice: -");
			
			System.out.println("0 Exit");
			System.out.println("1 Calculation For Salaried (Weekly)Employee");
			System.out.println("1 Calculation For Salaried (Hourly)Employee");
			System.out.println("1 Calculation For Commisioned (On Sales)Employee");
			System.out.println("1 Calculation For Base-Salaried (Commisioned)Employee");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				
				
				break;

			default:
				break;
			}
			
		}while(choice ==0);
	}

}

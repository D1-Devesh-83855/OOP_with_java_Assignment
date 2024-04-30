package com.sunbeam.app;

import java.util.Scanner;

public class ProgramTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		String name ;
		double salary , comm , sales ;
		int hrs;
		
		System.out.println("Enter Size of employee array");
		n = sc.nextInt();
		int count = 0;
		Employee [] arr = new Employee[n];
		int choice = 0;
		do {
			System.out.println("enter choice");
			System.out.println("press 0 for exit");
			System.out.println("press 1 for salaried employee");
			System.out.println("press 2 for hourely employee");
			System.out.println("press 3 for commissioned employee");
			System.out.println("press 4 for baseSalaried employee");
			System.out.println("press 5 for display employees");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("exited.....");
				break;
			case 1:
				System.out.println("enter name");
				name = sc.next();
				System.out.println("enter salary");
				salary = sc.nextDouble();
				arr[count++] = new SalariedEmployee(name, salary);
				break;
			case 2:
				System.out.println("enter name");
				name = sc.next();
				System.out.println("enter wages");
				salary = sc.nextDouble();
				System.out.println("enter hrs");
				hrs = sc.nextInt();
				arr[count++] = new HourlyEmployee(name ,salary, hrs );
				break;
			case 3:
				System.out.println("enter name");
				name = sc.next();
				System.out.println("enter sales");
				salary = sc.nextDouble();
				System.out.println("enter commission");
				comm = sc.nextDouble();
				arr[count++] = new CommissionEmployee(name, salary,comm);
				break;
			case 4:
				System.out.println("enter name");
				name = sc.next();
				System.out.println("enter salary");
				salary = sc.nextDouble();
				System.out.println("enter commission");
				comm = sc.nextDouble();
				System.out.println("enter sales");
				sales = sc.nextDouble();
				arr[count++] = new BaseSalariedCommissionemployee(name, sales , comm , salary);
				break;
			case 5:
				for(int i =0  ; i <count ; i++) {
					arr[i].calculateEarnings();
					arr[i].displayDetails();
				}
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}while(choice != 0);
		
		sc.close();
	}
	
	
}

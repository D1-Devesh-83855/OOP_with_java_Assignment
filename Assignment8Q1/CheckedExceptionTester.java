package com.sunbeam.Tester;

import java.util.Scanner;

import com.sunbeam.StringClass.LengthChecker;

public class CheckedExceptionTester {

	public static void main(String[] args) {
		boolean flag = false;
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		LengthChecker lc = new LengthChecker();
		while(!flag)
		{
			System.out.println("Enter your choice");
			System.out.println("0.Exit");
			System.out.println("1.Continue");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 0:
				System.out.println("Exiting code...Thank You");
				flag = true;
				break;
				
			case 1:
				String str = null;
				try {
					System.out.println("Enter string");
					str = sc.nextLine();
					lc.setStr(str);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("String length : "+str.length());
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
			}
	
		}
	}
}

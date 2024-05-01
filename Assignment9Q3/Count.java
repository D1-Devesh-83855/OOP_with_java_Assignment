package com.assignment9.q1;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class Count {
	
	static int count = 0;
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String s1;
		System.out.println("Enter the String");
		s1 = sc.nextLine();
		String[] arr = s1.split(" ");
		for(String ele : arr) {
//			System.out.println(ele);
		count++;
		}
		System.out.println(count);
		
	}
	  
	  
	
	
}

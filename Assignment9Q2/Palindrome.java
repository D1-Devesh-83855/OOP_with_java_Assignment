package com.assignment9.q1;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word :");
		String s1 = sc.next();
		
		StringBuffer sb1 = new StringBuffer(s1);
	     sb1.reverse();
	     if(s1.equals(sb1.toString())) {
	    	 System.out.println("Enterd word is Palindrome");
	    	 System.out.println(s1 +"="+ sb1);
	    	 
	     }else {
	    	 System.out.println(s1+"!="+sb1);
	    	 System.out.println("String is not palindrome");
	     }
		
	}
	
}

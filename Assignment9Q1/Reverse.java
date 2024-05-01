package com.assignment9.q1;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word :");
		String s1 = sc.nextLine();
		
		StringBuffer sb1 = new StringBuffer(s1);
		System.out.println(sb1.reverse());
		
		
	}

}

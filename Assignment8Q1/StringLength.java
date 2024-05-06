package com.sunbeam.Tester;

import java.util.Scanner;

import com.sunbeam.Exceptions.ExceptionLineTooLong;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string;
		
		System.out.println("Enter the string to calculate length..");
		string = sc.nextLine();
		try {
		if(string.length()>80)
		{
			throw new ExceptionLineTooLong("String length should be up to 80 characters");
		}
		}catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		System.out.println("String length = "+string.length());
		
	}

}

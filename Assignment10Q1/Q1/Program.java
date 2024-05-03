package com.sunbeam.Q1;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		Student [] s = {
				new Student(1,"dev",135),
				new Student(2,"devesh",185),
				new Student(3,"devil",13),
				new Student(4,"daddy",835),
				new Student(5,"Diggy",935),
		};
		System.out.println("================================================Before Sort");
		for(Student arr: s)
			System.out.println(arr);
		Arrays.sort(s);
		System.out.println("=====================================After Sort on the basis of Salary ");
		for(Student arr: s)
			System.out.println(arr);
	}
	

}

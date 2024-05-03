package com.sunbeam.Q2;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		Product []p = {
				new Product(1,"i20","car"),
				new Product(2,"honda","bike"),
				new Product(3,"jetAirways","Flight"),
				new Product(4,"Swiggy","Delivery"),
				new Product(5,"Artherities","Bone"),
				new Product(6,"Havels","Fan"),
				new Product(7,"philips","Bu;b"),
				new Product(8,"x300","SUV"),
				new Product(9,"Thar","Jeep"),
		};
		System.out.println("==============Before Sorting================");
		for(Product arr : p)
			System.out.println(arr);
		
		Arrays.sort(p);
		
		System.out.println("==============After Sorting================");
		for(Product arr : p)
			System.out.println(arr);
		
	}
}

package com.app.tester;

import java.util.Scanner;

import com.app.shape.Circle;

public class CircleTester {

	public static void main(String[] args) {

		boolean flag = false;
		int choice = 0;

		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		while (!flag) {
			System.out.println("Enter your choice");
			System.out.println("0.Exit");
			System.out.println("1.Enter diameter of circle to check for negative.");
			System.out.println("2.Display diameter and center of circle");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 0:
				System.out.println("Exiting code...Thank You");
				flag = true;
				break;

			case 1:
				try {
					c1.setMyDiameter(sc.nextDouble());
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
				break;

			case 2:
				System.out.println("Details of circle.");
				c1.display();
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		}
	}

}

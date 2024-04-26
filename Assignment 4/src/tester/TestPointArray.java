package tester;
import java.util.Scanner;

import com.sunbeam.geometry.Point2D;

public class TestPointArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of points to Plot:-");
		int noOfPoints = sc.nextInt();
		Point2D[] point = new Point2D[noOfPoints];
		for(int i=0;i<noOfPoints;i++) {
			System.out.println("Enter x axis for point"+i+" :");
			int x = sc.nextInt();
			System.out.println("Enter y axis for point"+i+" :");
			int y = sc.nextInt();
			point[i] = new Point2D(x,y);
		}
		int exitCounter = 0;
		do {
			System.out.println("1.Display Details of a specific point on specific Index");
			System.out.println("2.Display x,y co-ordinates of all points");
			System.out.println("3.Enter 2 indicesfor the points we will validate the indices");
			System.out.println("Enter your choice");
			int key = sc.nextInt();
			switch(key) {
			case 1:
				System.out.println("Enter index of point you want info about:-");
				int index = sc.nextInt();
				if(index<point.length) {
					System.out.println("Details of the point at index "+index+" :"+point[index].getDetails());
				}else {
					System.out.println("Indexx is out of length");
				}
				break;
			case 2:
				System.out.println("Details of Every points");
				for(Point2D element :point) {
					System.out.println(element.getDetails());
					
				}
				break;
			case 3:
				System.out.println("Enter Details of indexes of 2 Points you want to calculate");
				System.out.println("Enter index of Point 1");
				int index1 = sc.nextInt() ;
				System.out.println("Enter index of Point 2");
				int index2 = sc.nextInt() ;
				if(index1 < point.length && index2 < point.length) {
					if(point[index1].isEqual(point[index2], null)) {
						System.out.println("Both Points are Equal");
					}else {
						System.out.println("Distance between Points is "+ point[index1].calculateDistance(point[index2], null));
					}
				}else {
					System.out.println("Point indexes are out of range");
				}
				break;
			case 4:
				System.out.println("Exiting the Program");
				exitCounter = 1;
				break;
			default:
				break;
			}
		}while(exitCounter ==0);
		
		
		
		
	}

}

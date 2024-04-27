package com.subeam.test;

import java.util.Scanner;

import com.subeam.assignment5.Apple;
import com.subeam.assignment5.Fruite;
import com.subeam.assignment5.Mango;
import com.subeam.assignment5.Orange;

public class FruiteBasket {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int counter = 0;
         int choice = 0;
         int index;
         
		System.out.println("Please Enter The Basket Size: ");
		Scanner sc = new Scanner(System.in);
		
		Fruite[] Basket = new Fruite[sc.nextInt()];
		
		do {
			System.out.println("--------------------------------------------------------");
			System.out.println("0. Exit ");
			System.out.println("1. Add Mango ");
			System.out.println("2. Add Orange ");
			System.out.println("3. Add Apple ");
			System.out.println("4. Display Names Of all Fruits in Basket");
			System.out.println("5. Display name, color, weight of all fresh fruits");
			System.out.println("6. Mark fruit as stale ");
			System.out.println("7. Display tastes of all not fresh(stale)");
			System.out.println("8. Mark all sour fruits stale");
			System.out.println("--------------------------------------------------------");
			System.out.println("Enter Your choice: ");
			choice = sc.nextInt();
		    
		    switch(choice) {
		    case 0:
		    	System.out.println("Exited from the application ");
		    	break;
		    case 1: 
		    	Basket [counter++] = new Mango("Yellow", 5, "Alphanso");
		    	System.out.println("Mango Added");
		    	
		    break;
		    
		    case 2:
		    	Basket[counter++] = new Orange("orange", 4, "orange");
		    	System.out.println("Orange Added");
		    break;
		    
		    case 3:
		    	Basket[counter++] = new Apple("Red", 5, "apple");
		    	System.out.println("Apple Added");
		    	break;
		    case 4:
		    	for(Fruite fruit:Basket) {
		    		if(fruit != null) {
		    			System.out.println(fruit.getName());
		    		}
		    	}
		    	break;
		    case 5:
		    	for(Fruite fruit : Basket) {
		    		if(fruit != null) {
		    			System.out.println(fruit.toString());
		    			fruit.isFresh();
		    		}
		    	}
		    	break;
		    case 6:
		       System.out.println("Enter index: ");
		       index = sc.nextInt();
		       if(index < 0 || index > Basket.length) {
		    	   System.out.println(" Error : Invalid Index");
		       }
		       else {
		    	   Basket[index].setFresh(false); 
		    	   System.out.println("stale fruit set done");
		       }
		       break;
		    case 7:
		    	for(Fruite fruit : Basket) {
		    		if(fruit.isFresh()== false) {
		    			System.out.println( fruit.getName()+":  "+fruit.taste());
		    		}
		    	}
		    	break;
		    case 8:
		    	for(Fruite fruit : Basket) {
		    		if(fruit.taste().equals("sour")){
                      fruit.setFresh(false);
                      System.out.println(fruit.getName()+ " is set as stale");
                      
		    		}
		    	}
		    	break;
		    }
		  
		}while(choice != 0);
	
		sc.close();
	}

}

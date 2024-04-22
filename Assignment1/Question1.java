import java.util.Scanner;

public class Question1{
public static void main(String[] args) {
	double num1;
	double num2;
	double avg;
	
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter number 1 in double format :-");
	if(sc.hasNextDouble()) {
		num1 = sc.nextDouble();
	}else {
		System.out.println("Please enter Valid value");
		return;
		}
	System.out.println("Enter number 2 in double format :-");
	if(sc.hasNextDouble()) {
		num2 = sc.nextDouble();
	}else {
		System.out.println("Please Enter Correct Values")
		;
		return;
	}
	
	avg = (num1+num2)/2;
	System.out.println("The avg of "+num1 +"and"+num2 +"is :"+avg);
	
	
	
}


}

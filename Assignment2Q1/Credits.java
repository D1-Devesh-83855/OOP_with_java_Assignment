
import java.util.Scanner;

public class Credits {
	public static void main(String args[]) {
		int accountNo;
		int remainingBalance;
		int totalItemsCharged;
		int totalAllCredits;
		int allowedCredit = 0 ;
		int newBalance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Allowed credit limit this month.");
		allowedCredit= sc.nextInt();
		System.out.println("Enter your Account No.");
		accountNo = sc.nextInt();
		System.out.println("Enter your Total items Charged this month.");
		totalItemsCharged = sc.nextInt();
		System.out.println("Enter your Total All credit applied t this month.");
		totalAllCredits = sc.nextInt();
		System.out.println("Enter your Pending Balance in rs");
		remainingBalance = sc.nextInt();
		newBalance = remainingBalance +totalItemsCharged-totalAllCredits;
		if(newBalance>allowedCredit) {
			System.out.println("You exceede your credit limit");
			System.out.println("Yor New Balance is "+newBalance);
			
		}else {
			System.out.println("Your new balance is "+newBalance);
		}
		

		
		
	}

}
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		int choice =0;
		int price =0;
		int quantity=0;
		int total =0;
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 0 for exit");
			System.out.println("Ente 1 to ADD Dosa");
			System.out.println("Ente 2 to ADD Samosa");
			System.out.println("Ente 3 to ADD Idli");
			System.out.println("Enter 4 to Generate Bill");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			if(choice !=4&&choice!=0) {
				System.out.println("Enter quantity");
				quantity =sc.nextInt();
			}
			switch (choice) {
			case 0:
				break;
			case 1:
				price = 456 * quantity;
				
				break;
			case 2:
				price = 100 * quantity;
				
				break;

			case 3:
				price = 300* quantity;
				
				break;


			default:
				System.out.println("Enter Correct Choice:");
				break;
			}
				total +=price;
			
			
			
			
			
		}while(choice !=0 && choice != 4);
		if(choice ==4) {
//			total = total+price;
			System.out.println("Total bill is of "+total);
			return;
		}
		
	
		
		
		
		
	}
	
}

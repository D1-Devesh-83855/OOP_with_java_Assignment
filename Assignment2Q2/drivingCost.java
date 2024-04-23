import java.util.Scanner;

public class drivingCost {

	public static void main(String[] args) {
		int totalMiles;
		int fuelCostPerGallon;
		int avg ;
		int parkingFees;
		int tollsPerDay;
		int totalCost;
		int fuelAmount;
		int drivingCost;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total miles Covered");
		totalMiles = sc.nextInt();
		System.out.println("Enter Average of car");
		avg = sc.nextInt();

		System.out.println("Enter fuel price per gallon");
		fuelCostPerGallon = sc.nextInt();
		System.out.println("Enter parking fees");
		parkingFees = sc.nextInt();
		System.out.println("Ente Tolls per Day fees");
		tollsPerDay = sc.nextInt();
		fuelAmount = totalMiles/avg;
		drivingCost = fuelAmount*fuelCostPerGallon;
		totalCost = tollsPerDay+parkingFees+drivingCost;
		System.out.println("Cost per day if he drives with car :" +totalCost);
		
		

	}

}

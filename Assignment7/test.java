package com.sunbeam;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cricketer team[] = new Cricketer[11];
		for(int i=0;i<11;i++)
		{
			System.out.println("Add new player " + (i+1) + ":");
			System.out.println("Id :");
			int id = sc.nextInt();
			System.out.println("Name :");
			String Name = sc.next();
			System.out.println("Age :");
			int age = sc.nextInt();
			System.out.println("No.of matches played : ");
			int matchesPlayed = sc.nextInt();
			System.out.println("Runs :");
			int runs = sc.nextInt();
			System.out.println("Wickets :");
			int wickets = sc.nextInt();
			team[i] = new Cricketer(id,Name,age,matchesPlayed,runs,wickets);
		}
		int choice;
		do
		{
			System.out.println("0.Exit");
			System.out.println("1.Total runs of all players");
			System.out.println("2.Wickets taken by all players");
			System.out.println("3.Total matches played");
			System.out.println("4.Display all cricketers with their names and number of matches played individually");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank you!!");
				break;
			case 1 :
				int totalRuns = 0;
				for(Cricketer Player : team)
				{
					totalRuns = totalRuns+ Player.getRuns();
				}
				System.out.println("Total runs of all players :" +totalRuns);
				break;
			case 2 :
				int totalWickets = 0;
				for(Cricketer Player : team)
				{
					totalWickets = totalWickets + Player.getWickets();
				}
				System.out.println("Total Wickets taken by all players :" +totalWickets);
				break;
			case 3:
				int totalMatchesPlayed = 0;
				for(Cricketer Player : team)
				{
					totalMatchesPlayed = totalMatchesPlayed + Player.getMatchesPlayed();
				}
				System.out.println("Toatl matches played :" +totalMatchesPlayed);
				break;
			case 4 :
				System.out.println("Cricketers:");
                for (Cricketer Player : team)
                {
                    System.out.println(Player.getName() + ": " + Player.getMatchesPlayed() + " matches played");
                }
                break;
            default :
            	System.out.println("Invalid choice!");
                	
			}
		}
		while(choice!=0);

}
}

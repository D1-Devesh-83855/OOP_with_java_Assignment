package com.sunbeam;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler 
{
	int runs;
	int wickets;
	public Cricketer()
	{
		
	}
	public Cricketer(int id,String Name,int age,int matchesPlayed,int runs,int wickets)
	{
		super(id,Name,age,matchesPlayed);
		this.runs = runs;
		this.wickets = wickets;
	}
	
	@Override
	public int getWickets() {
		return wickets;
	}
	@Override
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs)
	{
		this.runs = runs;
	}
	public void setWickets(int wickets)
	{
		this.wickets = wickets;
	}
	public void accept(Scanner sc)
	{
		System.out.print("Enter runs :");
		runs = sc.nextInt();
		System.out.print("Enter wickets :");
		wickets = sc.nextInt();
	}
}

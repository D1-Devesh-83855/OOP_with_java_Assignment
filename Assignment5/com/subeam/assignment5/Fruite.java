package com.subeam.assignment5;

public class Fruite {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public Fruite(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		
	}
	public Fruite(){
		color = "";
		weight = 0.0;
		name = "";
		isFresh = true;
		
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fruite[color= "+ color +", weight= "+ weight +", name ="+name+",isFresh="+isFresh+"]"	;
		}
	public String taste() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

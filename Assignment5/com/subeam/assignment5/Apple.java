package com.subeam.assignment5;

public class Apple extends Fruite {
	public Apple() {
		super();
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	public String taste() {
		return "Sweet n sour";
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + ", taste()="
				+ taste() + ", getColor()=" + getColor() + ", getWeight()=" + getWeight() + ", getName()=" + getName()
				+ ", isFresh()=" + isFresh() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}

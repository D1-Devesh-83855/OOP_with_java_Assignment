package com.app.shape;

public class Circle {

	private double myDiameter;
	private Point2D center;
	
	public Circle() {
		center = new Point2D(0, 0);
		myDiameter = 100;
	}
	
	public void setMyDiameter(double diameter)
	{
		if(diameter < 0)
			throw new NegativeDiameterException("Diameter cannot be negative");
		
		myDiameter = diameter;
	}
	
	public void display()
	{
		System.out.println("Center : "+center.getDetails());
		System.out.println("Diameter : "+myDiameter);
	}
	
}

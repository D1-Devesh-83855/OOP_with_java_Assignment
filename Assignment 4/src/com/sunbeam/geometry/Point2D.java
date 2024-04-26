package com.sunbeam.geometry;

import  java.math.*;

public class Point2D {
	private int x;
	private int y;
	

	public Point2D(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public Point2D(double x2, double y2) {

		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		String s = "("+this.x+","+this.y+")";//boxing
		return s;
	}
	
	public static Boolean isEqual(Point2D p1,Point2D p2) {
		if(p1.x ==p2.x && p1.y == p2.y) {
			return true;
			}
		else {
			return false;
		}				
	}
	public static double calculateDistance(Point2D p1, Point2D p2) {
		double distance;
		distance = Math.sqrt((p2.x-p1.x)+(p2.y-p1.y));
		return distance;
		
	}
	

}

package com.app.shape;

public class Point2D {

	private int x_coordinate;
	private int y_coordinate;

	public Point2D(int x_coordinate, int y_coordinate) {
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
	}

	public int getX_coordinate() {
		return x_coordinate;
	}

	public void setX_coordinate(int x_coordinate) {
		this.x_coordinate = x_coordinate;
	}

	public int getY_coordinate() {
		return y_coordinate;
	}

	public void setY_coordinate(int y_coordinate) {
		this.y_coordinate = y_coordinate;
	}

	public String getDetails() {
		return "X co-ordinate : " + getX_coordinate() + ", Y co-ordinate : " + getY_coordinate();
	}

	public static boolean isEqual(Point2D p1, Point2D p2) {
		if (p1.getX_coordinate() == p2.getX_coordinate() && p1.getY_coordinate() == p2.getY_coordinate()) {
			return true;
		}

		return false;

	}

	public static double calculateDistance(Point2D p1, Point2D p2) {
		double distance = Math.sqrt(Math.pow((p2.getX_coordinate() - p1.getX_coordinate()), 2)
				+ (Math.pow((p2.getY_coordinate() - p1.getY_coordinate()), 2)));

		return Math.round(distance);
	}

}

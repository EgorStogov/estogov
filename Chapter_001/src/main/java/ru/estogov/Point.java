package ru.estogov;

public class Point {
	public double x;
	public double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point point) {
	//calculate distance between two points
		double sqr = 2;
		double length = Math.sqrt(Math.pow(this.x - point.x, sqr) + Math.pow(this.y - point.y, sqr));
		return length;
	}	
}
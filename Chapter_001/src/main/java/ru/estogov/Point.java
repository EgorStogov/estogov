package ru.estogov;

/**
* Class Point решение задачи части 001 урок 3.
* @author Egor Stogov
* @since 24.11.16
* @version 1.0
*/

public class Point {
/**
* First coordinate.
*/
	private double x;
/**
* Second coordinate.
*/
	private double y;

/**
* Конструктор с параметрами типа double.
* @param x - первая координата
* @param y - вторая координата
*/

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

/**
* Метод вычисления расстояния между двумя точками.
* @param point - точка, к которой строится прямая
* @return some value
*/

	public double distanceTo(Point point) {
		double sqr = 2;
		double length = Math.sqrt(Math.pow(this.x - point.x, sqr) + Math.pow(this.y - point.y, sqr));
		return length;
	}
}
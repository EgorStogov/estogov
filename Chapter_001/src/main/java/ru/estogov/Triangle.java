package ru.estogov;

/**
* Class Triangle решение задачи части 001 урок 3.
* @author Egor Stogov
* @since 24.11.16
* @version 1.0
*/

public class Triangle {
/**
* Первая точка.
*/
	private Point a;
/**
* Вторая точка.
*/
	private Point b;
/**
* Третья точка.
*/
	private Point c;

/**
* Конструктор с параметрами типа Point.
* @param a - первая точка
* @param b - вторая точка
* @param c - вторая точка
*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
/**
* Метод вычисления площади треугольника.
* @return some value
*/
	public double area() {
		double ab = a.distanceTo(b);
		double bc = b.distanceTo(c);
		double ac = a.distanceTo(c);
		double s = 0;
		if ((ab + bc > ac) && (bc + ac > ab) && (ab + ac > bc)) {
			double p = (ab + ac + bc) / 2;
			s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
		}
		return s;
	}
}
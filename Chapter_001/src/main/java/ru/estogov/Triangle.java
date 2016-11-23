package ru.estogov;

public class Triangle {
	public Point a;
	public Point b;
	public Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area() {
	//calculate the triangle area
		double AB = a.distenceTo(b);
		double BC = b.distenceTo(c);
		double AC = a.distenceTo(c);
		if (AB + BC > AC)&&(BC + AC > AB)&&(AB + AC > BC) {
			double p = (AB + AC + BC) / 2;
			double S = Math.sqrt(p * (p - AB) * (p - BC) * (p-AC));
		};
		return S;
	}
}
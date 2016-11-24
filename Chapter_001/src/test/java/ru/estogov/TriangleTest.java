package ru.estogov;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
*Test.
*@author Egor Stogov (egst@rambler.ru)
*@version 1
*@since 24.11.2016
*/
public class TriangleTest {
/**
* Triangle test.
*/
	@Test
	public void whenGivePointsThenGetArea() {
		final double x1 = 0;
		final double x2 = 0;
		final double y1 = 5;
		final double y2 = 5;
		final double z1 = 1;
		final double z2 = 6;
		final double area = 12.5;
		final double q = 0.01;
		Point x = new Point(x1, x2);
		Point y = new Point(y1, y2);
		Point z = new Point(z1, z2);
		Triangle triangle = new Triangle(x, y, z);
		double s = triangle.area();
		assertThat(s, closeTo(area, q));
	}
/**
* Triangle test.
*/
	@Test
	public void whenOneCoordinateIsConstantThenError() {
		final double x1 = 0;
		final double x2 = 0;
		final double y1 = 0;
		final double y2 = 5;
		final double z1 = 0;
		final double z2 = 6;
		final double q = 0;
		Point x = new Point(x1, x2);
		Point y = new Point(y1, y2);
		Point z = new Point(z1, z2);
		Triangle triangle = new Triangle(x, y, z);
		double s = triangle.area();
		assertThat(s, is(q));
	}
}
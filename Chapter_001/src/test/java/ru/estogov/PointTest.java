package ru.estogov;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
*Test.
*@author Egor Stogov (egst@rambler.ru)
*@version 1
*@since 24.11.2016
*/
public class PointTest {
/**
* Point test.
*/
	@Test
	public void whenADistanceToBThenAB() {
		final double x1 = 3;
		final double x2 = -1;
		final double y1 = 6;
		final double y2 = 3;
		final double ab = 5;
		final double q = 1;
		Point a = new Point(x1, x2);
		Point b = new Point(y1, y2);
		double s = a.distanceTo(b);
		assertThat(s, closeTo(ab, q));
	}
}
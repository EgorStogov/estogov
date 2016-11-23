package ru.estogov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class PointTest {
	public void whenADistanceToBThenAB() {
	Point A = new Point(0 , 1);
	Point B = new Point(1 , 2);
	double AB = A.distanceTo(B);
	//дописать assertThat, javadoc-и и все в принципе
	//
	}
}
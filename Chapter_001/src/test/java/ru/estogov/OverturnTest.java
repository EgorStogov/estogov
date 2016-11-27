package ru.estogov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* @author Egor Stogov (egst@rambler.ru)
* @since 26.11.2016
* @version 1
*/

public class OverturnTest {
/**
* Test.
*/
	@Test
	public void whenGiveArrayThenGetOverturnedArray() {
		Overturn overturn = new Overturn();
		final int a = 1;
		final int b = 2;
		final int c = 3;
		int[][] values = new int[][] {{a, a, a}, {b, b, b}, {c, c, c}};
		int[][] test = new int[][] {{a, b, c}, {a, b, c}, {a, b, c}};
		assertThat(overturn.overturn(values), is(test));
	}
}
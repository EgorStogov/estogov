package ru.estogov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test.
*@author Egor Stogov (egst@rambler.ru)
*@version 1
*@since 24.11.2016
*/
public class MaxTest {
/**
* Max test.
*/
	@Test
	public void whenFirstLargerThenGetFirstNumber() {
		final int first = 2016;
		final int second = 1861;
		Max max = new Max();
		assertThat(max.max(first, second), is(first));
	}
/**
* Max test.
*/
	@Test
	public void whenFirstLessThenGetSecondNumber() {
		final int first = 988;
		final int second = 1961;
		Max max = new Max();
		assertThat(max.max(first, second), is(second));
	}
}
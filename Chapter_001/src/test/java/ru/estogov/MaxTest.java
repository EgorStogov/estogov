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
* Max test first > second.
*/
	@Test
	public void whenFirstLargerThenGetFirstNumber() {
		final int first = 2016;
		final int second = 1861;
		Max max = new Max();
		assertThat(max.max(first, second), is(first));
	}
/**
* Max test first < second.
*/
	@Test
	public void whenFirstLessThenGetSecondNumber() {
		final int first = 988;
		final int second = 1961;
		Max max = new Max();
		assertThat(max.max(first, second), is(second));
	}
/**
* Max test first == second.
*/
    @Test
    public void whenTwoValuesEqualToEachOtherThenReturnValue() {
		final int first = 3;
		final int second = 3;
		final int res = 3;
        Max max = new Max();
		final int result = max.max(first, second);
		assertThat(result, is(res));
    }
/**
* Max test first > second > third.
*/
	@Test
	public void whenFirstIsTheLargestThenGetFirstNumber() {
		final int first = 2016;
		final int second = 1961;
		final int third = 1672;
		Max max = new Max();
		assertThat(max.max(first, second, third), is(first));
	}
/**
* Max test first < second < third.
*/
	@Test
	public void whenSecondIsTheLargestThenGetSecondNumber() {
		final int first = 2016;
		final int second = 2017;
		final int third = 1672;
		Max max = new Max();
		assertThat(max.max(first, second, third), is(second));
	}
/**
* Max test  second < first < third.
*/
	@Test
	public void whenThirdIsTheLargestThenGetThirdNumber() {
		final int first = 2016;
		final int second = 1961;
		final int third = 3000;
		Max max = new Max();
		assertThat(max.max(first, second, third), is(third));
	}
/**
* Max test  second == first == third.
*/
	@Test
	public void whenEveryNumberEqualsEveryNumberThenGetNumber() {
		final int first = 3000;
		final int second = 3000;
		final int third = 3000;
		Max max = new Max();
		final int res = 3000;
		assertThat(max.max(first, second, third), is(res));
	}
}
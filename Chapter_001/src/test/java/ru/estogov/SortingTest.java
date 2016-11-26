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

public class SortingTest {
/**
* Test 4321.
*/
	@Test
	public void whenWrongOrderThenRightOrder() {
		Sorting sort = new Sorting();
		final int a = 3;
		final int b = 5;
		final int c = 1;
		final int d = 2;
		final int e = 4;
		int[] test = new int[] {c, d, a, e, b};
		assertThat(sort.bubble(a, b, c, d, e), is(test));
	}
}
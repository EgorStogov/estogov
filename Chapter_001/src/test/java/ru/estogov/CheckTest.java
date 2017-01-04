package ru.estogov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* @author Egor Stogov (egst@rambler.ru)
* @since 04.01.2017
* @version 1
*/

public class  CheckTest {
/**
* Test.
*/
	@Test
	public void whenItIsThenTrue() {
		Check check = new Check();
		final int a = 1;
		final int b = 2;
		final int c = 3;
		final int d = 4;
		int[] mass = new int[] {a, b, c, d};
		assertThat(check.checkSorting(mass), is(true));
	}
/**
* Test.
*/
	@Test
	public void whenItIsNotThenFalse() {
		Check check = new Check();
		final int a = 1;
		final int b = 2;
		final int c = 3;
		final int d = 4;
		int[] mass = new int[] {a, d, c, b};
		assertThat(check.checkSorting(mass), is(false));
	}
}
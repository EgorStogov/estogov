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

public class TurnTest {
/**
* Test 4321.
*/
	@Test
	public void whenABCDThenDCBA() {
		Turn turn = new Turn();
		final int a = 1;
		final int b = 2;
		final int c = 3;
		final int d = 4;
		int[] test = new int[] {d, c, b, a};
		assertThat(turn.back(a, b, c, d), is(test));
	}
}
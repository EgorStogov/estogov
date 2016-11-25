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
public class CounterTest {
/**
* Counter test start < finish.
*/
	@Test
	public void whenStartLessFinish() {
		Counter counter = new Counter();
		final int start = -2;
		final int finish = 4;
		final int sum = 4;
		assertThat(counter.add(start, finish), is(sum));
	}
/**
* Counter test start > finish.
*/
	public void whenStartLargerFinish() {
		Counter counter = new Counter();
		final int start = 14;
		final int finish = 2;
		final int sum = 56;
		assertThat(counter.add(start, finish), is(sum));
	}
}
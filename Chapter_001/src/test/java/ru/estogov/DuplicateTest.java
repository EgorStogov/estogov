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

public class DuplicateTest {
/**
* Test.
*/
	@Test
	public void whenGiveStringThenGetStringWithoutReiteration() {
		Duplicate duplicate = new Duplicate();
		String[] words = new String[] {"1", "2", "2", "1"};
		String[] test = new String[] {"1", "2"};
		assertThat(duplicate.delete(words), is(test));
	}
}
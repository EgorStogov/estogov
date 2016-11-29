package ru.estogov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* @author Egor Stogov (egst@rambler.ru)
* @since 29.11.2016
* @version 1
*/

public class SubStringTest {
/**
* Test is it a substring or not.
*/
	@Test
	public void whenItIsThenTrue() {
		SubString someWords = new SubString();
		String origin = "I love this Courses so much";
		String sub = "I love this Courses";
		assertThat(someWords.contains(origin, sub), is(true));
	}
/**
* Test is it a substring or not.
*/
	@Test
	public void whenItIsNotThenFalse() {
		SubString someWords = new SubString();
		String origin = "I love this Courses so much";
		String sub = "I do not love this Courses";
		assertThat(someWords.contains(origin, sub), is(false));
	}
}
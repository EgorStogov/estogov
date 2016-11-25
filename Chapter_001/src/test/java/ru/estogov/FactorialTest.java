package ru.estogov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* @author Egor Stogov (egst@rambler.ru)
* @version 1
* @since 25.11.2016
*/
public class FactorialTest {
/**
* Factorial test 5! = 120.
*/
	@Test
	public void whenGiveValueThenGetResult() {
		final int number = 5;
		final int result = 120;
		Factorial factorial = new Factorial();
		assertThat(factorial.factorial(number), is(result));
	}
}
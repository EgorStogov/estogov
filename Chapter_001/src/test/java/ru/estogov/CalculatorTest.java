package ru.estogov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *@author Egor Stogov (egst@rambler.ru)
 *@version 1
 *@since 16.11.2016
  */

  public class CalculatorTest {

	/**
	* Первое число.
	*/
	private final double a = -5.00;

	/**
	* Второе число.
	*/
	private final double b = 6.50;

	/**
	* Ноль.
	*/
	private final double c = 0;

	/**
	 *Add test.
	 */

	@Test
	public void whenAddOneToAnotherOneThenPrintTheirSum() {
		Calculator calc = new Calculator();
		calc.add(this.a, this.b);
		double result = calc.getResult();
		final double res = 1.50;
		assertThat(result, is(res));
	}

	/**
	 *Cubtract test.
	 */

	@Test
	public void whenSubtractOneFromAnotherOneThenPrintTheirDifference() {
		Calculator calc = new Calculator();
		calc.subtract(this.a, this.b);
		double result = calc.getResult();
		final double res = -11.50;
		assertThat(result, is(res));
	}

	/**
	 *Multiply test.
	 */

	@Test
	public void whenMultiplyOneToAnotherOneThenPrintTheirProduct() {
		Calculator calc = new Calculator();
		calc.multiply(this.a, this.b);
		double result = calc.getResult();
		final double res = -32.50;
		assertThat(result, is(res));
	}

	/**
	 *Div test.
	 */

	@Test
	public void whenDivideOneByAnotherOneThenPrintTheirQuotient() {
		Calculator calc = new Calculator();
		calc.div(this.b, this.a);
		double result = calc.getResult();
		final double res = -1.30;
		assertThat(result, is(res));
	}

	/**
	 *Div test with zero.
	 */

	@Test
	public void whenDivideOneByZeroThenPrintError() {
		Calculator calc = new Calculator();
		calc.div(this.a, this.c);
		double result = calc.getResult();
		assertThat(result, is("You can not divide by zero"));
	}
  }
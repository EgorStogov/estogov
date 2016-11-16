package ru.estogov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculateTest{
	
	@Test
	public void whenSetStopThenReturnThreeStops(){
		Calculate calc = new Calculate();
		String result = calc.echo("stop");
		assertThat(result, is("stop stop stop"));
	}

	@Test
	public void whenSetNullInEchoThenReturnTwoSpaces(){
		Calculate calc = new Calculate();
		String result = calc.echo("");
		assertThat(result, is("  "));


	}

}
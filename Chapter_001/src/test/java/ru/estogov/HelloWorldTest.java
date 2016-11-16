package ru.estogov;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *Test
 *@author Egor Stogov (egst@rambler.ru)
 *@version 1
 *@since 16.11.2016
  */

public class HelloWorldTest{
	/**
	 *Test add.
	 */
	@Test
	
	public void whenAddOneToOneThenTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(), is("Hello World!"));
    }
}
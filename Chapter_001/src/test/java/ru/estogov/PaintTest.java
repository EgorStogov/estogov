package ru.estogov;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
* Test.
* @author Egor Stogov (egst@rambler.ru)
* @version 1
* @since 25.11.2016
*/
public class PaintTest {
/**
* Paint test h = 3.
*/
	@Test
	public void whenHeightEqualsFiveThenGetLargePyramid() {
		Paint paint = new Paint();
		final int h = 3;
		StringBuilder builder = new StringBuilder();
		builder.append("   ^");
		builder.append("  ^ ^");
		builder.append(" ^   ^");
		String builderTest = builder.toString();
		assertThat(paint.pyramid(h), is(builderTest));
	}
}

package ru.estogov;

/**
* class Paint решение задачи части 001 урок 4.
* @author Egor Stogov (egst@rambler.ru)
* @since 25.11.2016
* @version 1
*/
public class Paint {
/**
* Метод построения пирамиды.
* @param h - высота пирамиды
* @return some value
*/
	public String pyramid(int h) {
		StringBuilder builder = new StringBuilder();
		final int three = 3;
		for (int i = 1; i <= h; i++) {
			for (int j = i; j <= h; j++) {
				builder.append(" ");
				if (j == h) {
					builder.append("^");
				}
			}
			if (i != 1) {
				for (int k = 1; k <= i * 2 - three; k++) {
					builder.append(" ");
					if (k == i * 2 - three) {
						builder.append("^");
					}
				}
			}
		}
		String result = builder.toString();
		return result;
	}
}
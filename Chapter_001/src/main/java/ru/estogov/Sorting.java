package ru.estogov;

/**
* Class Sorting решение задачи части 001 урока 5.
* @author Egor Stogov (egst@rambler.ru)
* @since 26.11.2016
* @version 1
*/

public class Sorting {
/**
* Метод пузырька.
* @param values - массив
* @return some value
*/
	public int[] bubble(int[] values) {
		int x;
		for (int i = 0; i <= values.length - 1; i++) {
			for (int j = 0; j <= values.length - i - 2; j++) {
				if (values[j] > values[j + 1]) {
					x = values[j];
					values[j] = values[j + 1];
					values[j + 1] = x;
				}
			}
		}
		return values;
	}
}
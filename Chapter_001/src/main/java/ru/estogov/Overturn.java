package ru.estogov;

/**
* Class Overturn решение задачи части 001 урока 5.
* @author Egor Stogov (egst@rambler.ru)
* @since 26.11.2016
* @version 1
*/

public class Overturn {
/**
* Метод поворота массива.
* @param values - массив
* @return some value
*/
	public int[][] overturn(int[][] values) {
		final int three = 3;
		int[][] newValues = new int[three][three];
		for (int i = 0; i <= values.length - 1; i++) {
			for (int j = 0; j <= values.length - 1; j++) {
				newValues[j][i] = values[i][j];
			}
		}
	return newValues;
	}
}
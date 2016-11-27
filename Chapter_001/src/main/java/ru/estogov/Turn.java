package ru.estogov;

/**
* Class Turn решение задачи части 001 урока 5.
* @author Egor Stogov (egst@rambler.ru)
* @since 26.11.2016
* @version 1
*/

public class Turn {
/**
* Метод по переворачиванию массива.
* @param mass - массив
* @return some value
*/
	public int[] back(int[] mass) {
		final int four = 4;
		final int three = 3;
		int x;
		for (int i = 0; i <= mass.length / 2 - 1; i++) {
			x = mass[i];
			mass[i] = mass[mass.length - i - 1];
			mass[mass.length - i - 1] = x;
		}
		return mass;
	}
}
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
* @param a - первое число
* @param b - второе число
* @param c - третье число
* @param d - четвертое число
* @return some value
*/
	public int[] back(int a, int b, int c, int d) {
		final int four = 4;
		final int three = 3;
		int[] mass = new int[four];
		int x;
		mass[0] = a;
		mass[1] = b;
		mass[2] = c;
		mass[three] = d;
		for (int i = 0; i <= mass.length / 2 - 1; i++) {
			x = mass[i];
			mass[i] = mass[mass.length - i - 1];
			mass[mass.length - i - 1] = x;
		}
		return mass;
	}
}
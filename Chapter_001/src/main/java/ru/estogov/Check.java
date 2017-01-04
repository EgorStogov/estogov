package ru.estogov;

/**
* class SubString решение задания после собеседования части 001.
* @author Egor Stogov (egst@rambler.ru)
* @since 04.01.2017
* @version 1
*/

public class Check {
/**
* Метод, проверяющий отсортирован ли массив.
* @param value - массив
* @return some value
*/
	public boolean checkSorting(int[] value) {
		int a = value[0];
		boolean isIt = false;
		for (int b : value) {
			if (a <= b) {
				a = b;
			} else {
				break;
			}
		}
		if (a == value[value.length - 1]) {
			isIt = true;
		}
		return (isIt);
	}
}
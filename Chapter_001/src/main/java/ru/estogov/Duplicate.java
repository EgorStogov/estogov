package ru.estogov;

import java.util.Arrays;

/**
* Class Duplicate решение задачи части 001 урока 5.
* @author Egor Stogov (egst@rambler.ru)
* @since 26.11.2016
* @version 1
*/

public class Duplicate {
/**
* Метод удаления повторений в массиве.
* @param phrase - массив строк
* @return some value
*/
	public String[] delete(String[] phrase) {
		String x;
		int k = 1;
		for (int i = 0; i <= phrase.length - k; i++) {
			for (int j = 0; j <= phrase.length - k; j++) {
				if (phrase[i].equals(phrase[j]) && (i != j)) {
					x = phrase[phrase.length - 1];
					phrase[phrase.length - k] = null;
					phrase[j] = x;
					k++;
					j--;
				}
			}
		}
	return Arrays.copyOf(phrase, phrase.length - k + 1);
	}
}
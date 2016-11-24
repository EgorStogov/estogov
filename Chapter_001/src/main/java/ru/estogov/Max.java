package ru.estogov;

/**
* Class Max решение задачи части 001 урок 3.
* @author Egor Stogov
* @since 24.11.16
* @version 1.0
*/

public class Max {
/**
* Метод нахождения наибольшего числа из двух данных.
* @param first - первое число
* @param second - второе число
* @return some value
*/
	public int max(int first, int second) {
		int name = first > second ? first : second;
		return name;
	}
}
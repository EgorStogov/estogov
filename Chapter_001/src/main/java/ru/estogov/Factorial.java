package ru.estogov;

/**
* Class Factorial решение задачи части 001 урок 4.
* @author Egor Stogov
* @since 25.11.2016
* @version 1
*/
public class Factorial {
/**
* Метод нахождения фаториала данного числа.
* @param number - данное число
* @return some value
*/
	public int factorial(int number) {
		int result = 1;
		int i = 1;
		do {
			result = result * i;
			i++;
		}  while (i <= number);
	return result;
	}
}
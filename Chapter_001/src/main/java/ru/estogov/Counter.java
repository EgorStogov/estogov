package ru.estogov;

/**
* Class Counter решение задачи части 001 урок 4.
* @author Egor Stogov
* @since 25.11.16
* @version 1.0
*/
public class Counter {
/**
* Метод, считающий сумму четных чисел от start до finish.
*@param start - первое число
*@param finish - второе число
*@return some value
*/
	public int add(int start, int finish) {
		int sum = 0;
		if (start < finish) {
			for (int i = start; i <= finish; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
				}
			}
		} else {
			for (int i = start; i <= finish; i--) {
				if (i % 2 == 0) {
					sum = sum + i;
				}
			}
		}
		return sum;
	}
}
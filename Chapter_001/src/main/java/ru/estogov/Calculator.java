package ru.estogov;

/**
* Class Calculator решение задачи части 001 урок 2.
* @author Egor Stogov
* @since 20.11.16
* @version 1.0
*/

public class Calculator {

/**
* Результат математической операции.
*/

	private double result;

/**
 * getResult.
 * @return some value.
 */

	public double getResult() {
		return this.result;
	}

/**
* Метод для сложения двух чисел.
* @param first - первое слагаемое
* @param second - второе слагаемое
*/

	public void add(double first, double second) {
		this.result = first + second;
		System.out.println(first + " + " + second + " = " + this.result);
	}

/**
* Метод для вычисления разности двух чисел.
* @param first - уменьшаемое
* @param second - вычитаемое
*/

	public void subtract(double first, double second) {
		this.result = first - second;
		System.out.println(first + " - " + second + " = " + this.result);
	}

/**
* Метод для умножения двух чисел.
* @param first - первый множитель
* @param second - второй множитель
*/

	public void multiply(double first, double second) {
		this.result = first * second;
		System.out.println(first + " * " + second + " = " + this.result);
	}

/**
* Метод для вычисления частного двух чисел.
* @param first - делимое
* @param second - делитель
*/

	public void div(double first, double second) {
		if (second != 0) {
			this.result = first / second;
			System.out.println(first + " / " + second + " = " + this.result);
		} else {
			System.out.println("You can not divide by zero");
		}
	}
}
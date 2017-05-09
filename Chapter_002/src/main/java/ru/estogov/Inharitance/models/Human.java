package ru.estogov.Inharitance.models;

/**
* Class Human решение задачи части 002 урок 3.
* @author Egor Stogov
* @since 08.05.17
* @version 1.0
*/

public class Human {
/**
* Имя человека.
*/
	private String name;
/**
* Дефолтный конструктор.
*/
	public Human() {
	}
/**
* Конструктор.
* @param name - имя
*/
	public Human(String name) {
		this.name = name;
	}
/**
* Сеттер.
* @param name - имя
*/
	public void setName(String name) {
		this.name = name;
   }
}
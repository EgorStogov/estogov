package ru.estogov.Inharitance.models;

/**
* Class Profession решение задачи части 002 урок 3.
* @author Egor Stogov
* @since 08.05.17
* @version 1.0
*/

public class Profession extends Human {
/**
* Образование человека.
*/
	private String knowledge;
/**
* Зарплата.
*/
	private int salary;
/**
* Наличие счастья.
*/
	private boolean happiness;
/**
* Дефолтный конструктор.
*/
	public Profession() {
	}
/**
* Конструктор параметризированный.
* @param person - имя человека
* @param knowledge - образование
* @param salary - зарплата
* @param happiness - счастье
*/

	public Profession(String person, String knowledge, int salary, boolean happiness) {
		setName(person);
		this.knowledge = knowledge;
		this.salary = salary;
		this.happiness = happiness;
	}
/**
* Метод для получения зарплаты.
* @return salary
*/
	public int getSalary() {
		return this.salary;
	}
/**
* Метод для ухода в отпуск.
* @param days - количество отпускных дней
* @return some days
*/
	public int vacation(int days) {
		return days;
	}
/**
* Сеттер.
* @param knowledge - образование
*/
	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
   }
/**
* Сеттер.
* @param salary - зарплата
*/
	public void setSalary(int salary) {
		this.salary = salary;
   }
/**
* Сеттер.
* @param happiness - счастье
*/
	public void setHappiness(boolean happiness) {
		this.happiness = happiness;
   }
}
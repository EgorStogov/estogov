package ru.estogov.Inharitance.models;

/**
* Class Engineer решение задачи части 002 урок 3.
* @author Egor Stogov
* @since 08.05.17
* @version 1.0
*/

public class Engineer extends Profession {
/**
* Наличие пытливого ума.
*/
	private boolean inquiringMind;
/**
* Производственный опыт.
*/
	private int expirience;
/**
* Физическая сила человека.
*/
	private int strength;
/**
* Конструктор параметризированный.
* @param person - имя человека
* @param knowledge - образование
* @param salary - зарплата
* @param happiness - счастье
* @param inquiringMind - Наличие пытливого ума
* @param expirience - Производственный опыт
* @param strength - Физическая сила человека
*/
	public Engineer(String person, String knowledge, int salary, boolean happiness, boolean inquiringMind, int expirience, int strength) {
		setName(person);
		setKnowledge(knowledge);
		setSalary(salary);
		setHappiness(happiness);
		this.inquiringMind = inquiringMind;
		this.expirience = expirience;
		this.strength = strength;
	}
/**
* Метод для мыслительного процесса.
* @param hours - количество часов раздумий
* @return идея
*/
	public String think(int hours) {
		String think = "Eureka!";
		return think;
	}
/**
* Метод для разработки проекта.
* @param resource - количество ресурсов
*/
	public void design(int resource) {
	}
/**
* Метод для ремонта.
* @param problem - постановка проблемы
* @return решение проблемы
*/
	public String repair(String problem) {
		String solution = "repair";
		return solution;
	}
}
package ru.estogov.Inharitance.models;

/**
* Class Teacher решение задачи части 002 урок 3.
* @author Egor Stogov
* @since 08.05.17
* @version 1.0
*/

public class Teacher extends Profession {
/**
* Наличие нежного сердца.
*/
	private boolean tenderHeart;
/**
* Количество красных ручек.
*/
	private int redPen;
/**
* Запас терпения.
*/
	private int patience;
/**
* Наличие чувства юмора.
*/
	private boolean humor;
/**
* Конструктор параметризированный.
* @param person - имя человека
* @param knowledge - образование
* @param salary - зарплата
* @param happiness - счастье
* @param tenderHeart - Наличие нежного сердца
* @param redPen - Количество красных ручек
* @param patience - Запас терпения
*/
	public Teacher(String person, String knowledge, int salary, boolean happiness, boolean tenderHeart, int redPen, int patience) {
		setName(person);
		setKnowledge(knowledge);
		setSalary(salary);
		setHappiness(happiness);
		this.tenderHeart = tenderHeart;
		this.redPen = redPen;
		this.patience = patience;
	}
/**
* Метод для преподавания урока.
* @param lesson - тема урока
* @return тема урока
*/
	public String teach(String lesson) {
		return lesson;
	}
/**
* Метод для проверки домашей работы.
* @param exerciseBook - количество тетрадей
*/
	public void check(int exerciseBook) {

	}
/**
* Метод для совета ученику.
* @param problem - суть проблемы
* @return решение проблемы
*/
	public String giveAdvice(String problem) {
		String solution = "Don't worry! Be happy!";
		return solution;
	}
/**
* Метод для задания на дом.
* @param lesson - тема урока
* @return номер задания
*/
	public int giveHomework(String lesson) {
		return (1);
	}
}
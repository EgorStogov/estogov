package ru.estogov.Inharitance.models;

/**
* Class Doctor решение задачи части 002 урок 3.
* @author Egor Stogov
* @since 08.05.17
* @version 1.0
*/

public class Doctor extends Profession {
/**
* Наличие доброго сердца.
*/
	private boolean kindHeart;
/**
* Количество лекарств.
*/
	private int drug;
/**
* Количество белых халатов.
*/
	private int whiteGown;
/**
* Конструктор параметризированный.
* @param person - имя человека
* @param knowledge - образование
* @param salary - зарплата
* @param happiness - счастье
* @param kindHeart - Наличие доброго сердца
* @param drug - Количество лекарств
* @param whiteGown - Количество белых халатов
*/
	public Doctor(String person, String knowledge, int salary, boolean happiness, boolean kindHeart, int drug, int whiteGown) {
		setName(person);
		setKnowledge(knowledge);
		setSalary(salary);
		setHappiness(happiness);
		this.kindHeart = kindHeart;
		this.drug = drug;
		this.whiteGown = whiteGown;
	}
/**
* Метод для медицинского осмотра пациента.
* @param patient - имя пациента
* @return имя пациента, прошедшего осмотр
*/
	public Human checkup(Human patient) {
		return patient;
	}
/**
* Метод для постановки диагноза.
* @param name - название диагноза
* @return поставленный диагноз
*/
	public String disease(String name) {
		return name;
	}
/**
* Метод для лечения пациента.
* @param drug - наименование лекарственного средства
* @return прописанное лекарство
*/
	public String cure(String drug) {
		return drug;
	}
}
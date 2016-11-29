package ru.estogov;

/**
* class SubString решение тестового задания части 001.
* @author Egor Stogov (egst@rambler.ru)
* @since 29.11.2016
* @version 1
*/

public class SubString {
/**
* Метод, проверяющий является ли строка sub подстрокой origin.
* @param origin - строка
* @param sub - потенциальная подстрока
* @return some value
*/
	public boolean contains(String origin, String sub) {
		char[] originArray = origin.toCharArray();
		char[] subArray = sub.toCharArray();
		boolean isIt = false;
		for (int i = 0; i <= origin.length() - 1; i++) {
			if (originArray[i] == subArray[0]) {
				for (int j = 1; j <= sub.length(); j++) {
					if (originArray[i + j] == subArray[j]) {
						if (j == sub.length() - 1) {
							isIt = true;
							break;
						}
						continue;
					} else {
						break;
					}
				}
			}
			if (isIt) {
				break;
			}
		}
		return isIt;
	}
}
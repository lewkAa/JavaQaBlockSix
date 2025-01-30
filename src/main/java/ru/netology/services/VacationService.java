package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;  // счетчик месяцев на отдых
        int money = 0; // счетчик денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                System.out.println("Месяц " + month + ". Денег:" + money + " Буду отдыхать. Заработал: " + income + " Потратил: " + -expenses + ", затем еще " + (int) Math.ceil(2.0 * (money - expenses) / 3));
                count++;
                money -= expenses;
                money /= 3;
            } else {
                System.out.println("Месяц " + month + ". Денег:" + money +  " Буду работать. Заработал: " + income + " Потратил: " + -expenses);
                money += income;
                money -= expenses;

            }

        }

        return count;
    }
}


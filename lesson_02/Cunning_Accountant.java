package lesson_02.homework_02;

public class Cunning_Accountant {
    public static void main(String[] args) {
        // Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?

        int capital = 5;
        int cash_1 = 5 / 2;

        int cash_2 = capital - cash_1;

        System.out.println(cash_1);
        System.out.println(cash_2);
    }
}

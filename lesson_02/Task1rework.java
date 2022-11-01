package lesson_02.homework;

public class Task1rework {
    public static void main(String[] args) {
        // Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?

        float capital = 5;
        float cash_1 = capital / 2;

        float cash_2 = capital - cash_1;

        System.out.println(cash_1);
        System.out.println(cash_2);
    }
}

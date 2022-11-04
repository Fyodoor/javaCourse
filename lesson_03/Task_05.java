package lesson_03.homework;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        System.out.println("Введите число месяца");
        System.out.println("Подсказка: от 1 до 12 включительно");

        Scanner scanner = new Scanner(System.in);

        int month_number = scanner.nextInt();

        switch (month_number) {

            case (1) :
                System.out.println("Зима");
                break;
            case (2) :
                System.out.println("Зима");
                break;
            case (3) :
                System.out.println("Весна");
                break;
            case (4) :
                System.out.println("Весна");
                break;
            case (5) :
                System.out.println("Весна");
                break;
            case (6) :
                System.out.println("Лето");
                break;
            case (7) :
                System.out.println("Лето");
                break;
            case (8) :
                System.out.println("Лето");
                break;
            case (9) :
                System.out.println("Осень");
                break;
            case (10) :
                System.out.println("Осень");
                break;
            case (11) :
                System.out.println("Осень");
                break;
            case (12) :
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого месяца");
                break;
        }
    }
}

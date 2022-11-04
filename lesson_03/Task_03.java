package lesson_03.homework;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Введите год:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("количество дней в этом году: 366");
        } else if (year % 100 == 0) {
            System.out.println("количество дней в этом году: 365");
        } else if (year % 4 == 0) {
            System.out.println("количество дней в этом году: 366");
        } else {
            System.out.println("количество дней в этом году: 365");
        }
    }
}

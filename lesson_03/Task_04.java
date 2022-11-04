package lesson_03.homework;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Соизвольте ввести число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(number + 1);
        } else {
            System.out.println(0);
        }
    }
}

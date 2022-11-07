package lesson_03.homework;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if ((first < second && first > third) || (first < third && first > second)) {
            System.out.println(first);
        } else if ((second < first && second > third) || (second < third && second > first)) {
            System.out.println(second);
        } else if ((third < first && third > second) || (third < second && third > first)) {
            System.out.println(third);
        } else {
            System.out.println(first);
        }
    }
}

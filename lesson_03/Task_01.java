package lesson_03.homework;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Введите стороны треугольника: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( (a + b > c) && (b + c > a) && (a + c > b) ) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}

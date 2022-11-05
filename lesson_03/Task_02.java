package lesson_03.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Введите время:");
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        t = t % 5;

        if (t >= 0 && t <= 3) {
            System.out.println("Зелёный");
        } else if (t >= 3 && t < 4) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }
}

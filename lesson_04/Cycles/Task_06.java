package lesson_03.homework;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введиет дату рождения(день, месяц, год)");
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}

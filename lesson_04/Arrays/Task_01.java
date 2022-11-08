package lesson_04.homework;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array_str = new String[10];
        System.out.println("Введите восемь строк");

        for (int i = 0; i < 8; i++) {
            String a = scanner.nextLine();
            array_str [i] = a;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(array_str[i] + " ");
        }
        System.out.println();
    }
}

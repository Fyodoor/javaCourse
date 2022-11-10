package lesson_04.homeworkArrays;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num = new int[10];
        System.out.println("Введите 10 чисел");

        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            num [i] = n;
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(num[i]);
        }

    }
}

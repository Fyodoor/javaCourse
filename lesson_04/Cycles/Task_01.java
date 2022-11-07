package lesson_03.homework;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число:");
        int m = scanner.nextInt();
        System.out.println("введите второе число:");
        int n = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m*n);
            }
            System.out.println();
        }

    }
}

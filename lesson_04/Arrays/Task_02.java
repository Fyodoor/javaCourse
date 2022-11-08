package lesson_04.homework;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        int max = numbers[0];

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            numbers [i] = num;
        }
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        System.out.println(max);
    }
}

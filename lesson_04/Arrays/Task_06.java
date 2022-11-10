package lesson_04.homeworkArrays;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[20];
        int max = numbers[0];
        int min = numbers[0] + 1;

        for (int i = 0; i < 20; i++) {
            int num = scanner.nextInt();
            numbers [i] = num;
        }
        for (int i = 0; i < 20; i++) {
            if (numbers[i] > max) max = numbers[i];
        }

        for (int i = 0; i < 20; i++) {
            if (numbers[i] < min) min = numbers[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}

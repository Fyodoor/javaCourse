package lesson_03.homework;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            sum += number;
            if (number == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}

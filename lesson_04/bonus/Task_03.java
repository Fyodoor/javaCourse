package lesson_05.homework;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array1 = new String[10];

        for (int i = 0; i < 8; i++) {
            array1[i] = scanner.nextLine();
        }

        for (int i = 9; i > 0; i--) {
            System.out.println(array1[i]);
        }
    }
}

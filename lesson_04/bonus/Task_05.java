package lesson_05.homework;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = new String[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i + 1]) {
                array [i] = null;
            }
        }

        for (String s : array) {
            System.out.println(s);
        }
    }
}

package lesson_05.homework;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] lines = new String[5];
        int max = 0;


        for (int i = 0; i < lines.length; i++) {
            lines [i] = scanner.nextLine();
        }

        // найти самую длинную

        for (String l : lines) {
            if (l.length() > max) {
                max = l.length();
            }
        }

        // найти самую короткую
        int min = lines[0].length();

        for (String l : lines) {
            if (l.length() < min) {
                min = l.length();
            }
        }

        for (String mx : lines) {
            if (mx.length() == max) {
                System.out.println(mx);
            }
        }

        for (String mn : lines) {
            if (mn.length() == min) {
                System.out.println(mn);
            }
        }
    }
}

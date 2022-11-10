package lesson_04.homeworkArrays;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrayStr = new String[10];
        int [] arrayInt = new int[10];

        for (int i = 0; i < arrayStr.length; i++) {
            String str = scanner.nextLine();
            arrayStr [i] = str;
            arrayInt [i] = str.length();
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}

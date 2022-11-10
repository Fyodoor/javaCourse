package lesson_04.homeworkArrays;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[20];
        for (int i = 0; i < 20; i++) {
            int num = scanner.nextInt();
            array [i] = num;
        }

        for (int i = 0; i < array.length-1; i++) {
            int min = array[i];
            int pos = i;

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    pos = j;
                    min = array[j];
                }

            }
            int t = array[i];
            array[i] = array[pos];
            array[pos] = t;
        }

        for (int i = 19; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

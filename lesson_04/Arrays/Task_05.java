package lesson_04.homeworkArrays;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr1 = new int[10];
        int [] arr2 = new int[5];
        int [] arr3 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            int num = scanner.nextInt();
            arr1[i] = num;
        }

        for (int i = 0; i < arr1.length/2; i++) {
            arr2 [i] = arr1[i];
        }

        for (int i = arr1.length/2; i < arr1.length; i++) {
            arr3[i - arr1.length/2] = arr1[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}

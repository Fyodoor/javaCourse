package lesson_09.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_7 {

    public static void printList(ArrayList<Integer> list) {
        System.out.println("Список: ");
        for (Integer c : list) {
            System.out.println(c);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> initial = new ArrayList<>();
        ArrayList<Integer> zeroAfterDivisionByThree = new ArrayList<>();
        ArrayList<Integer> zeroAfterDivisionByTwo = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int numbers = scanner.nextInt();
            initial.add(numbers);
        }

        for (int c : initial) {
            if (c % 3 == 0) {
                zeroAfterDivisionByThree.add(c);
            }
            if (c % 2 == 0) {
                zeroAfterDivisionByTwo.add(c);
            }
            if (c % 2 != 0 && c % 3 != 0) {
                otherNumbers.add(c);
            }
        }

//        for (int b : zeroAfterDivisionByThree) {
//            System.out.print(b + " ");
//        }
//
//        System.out.println();
//
//        for (int d : zeroAfterDivisionByTwo) {
//            System.out.print(d + " ");
//        }
//
//        System.out.println();
//
//        for (int v : otherNumbers) {
//            System.out.print(v + " ");
//        }

        printList(zeroAfterDivisionByThree);
        printList(zeroAfterDivisionByTwo);
        printList(otherNumbers);


    }
}

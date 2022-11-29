package lesson_05.homework;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = new String[25];

        for (int i = 0; i < strings.length; i++) {
            String text = scanner.nextLine();
            strings[i] = text;
            if (text.isEmpty()) {
                break;
            }
        }

        // конвертирует строки в верхний регистр.

        for (String up: strings) {
            if (up != null) {
                System.out.println(up.toUpperCase());
            }
        }

        // Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.

        for (String rate : strings) {
           if ( rate != null) {
               if (rate.length() % 2  == 0) {
                   System.out.println(rate + rate);
               } else {
                   System.out.println(rate + rate +rate);
               }
           }
        }
        System.out.println();
    }
}

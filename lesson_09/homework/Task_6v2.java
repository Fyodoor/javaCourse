package lesson_09.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_6v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listBasic = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String str = scanner.nextLine();
            listBasic.add(str);
        }

        // Нахождение самой длинной строки

        int max = 0;

        for (String item : listBasic) {
            if (item.length() > max) {
                max = item.length();
            }
        }

        // Нахождение самой короткой строки


        int min = listBasic.get(0).length();


        for (String value : listBasic) {
            if (value.length() < min) {
                min = value.length();
            }
        }

        // Вывод строки которая нашлась первой

        for (String s : listBasic) {
            if (s.length() == max) {
                System.out.println(s);
                break;

            } else if (s.length() == min) {
                System.out.println(s);
                break;

            }
        }

    }
}
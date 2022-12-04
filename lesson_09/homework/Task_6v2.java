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

        for (int i = 0; i < listBasic.size(); i++) {
            if (listBasic.get(i).length() > max) {
                max = listBasic.get(i).length();
            }
        }

        // Нахождение самой короткой строки


        int min = listBasic.get(0).length();


        for (int i = 0; i < listBasic.size(); i++) {
            if (listBasic.get(i).length() > min) {
                min = listBasic.get(i).length();
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
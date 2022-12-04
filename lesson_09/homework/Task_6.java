package lesson_09.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listBasic = new ArrayList<>();
        ArrayList<String> listMaximum = new ArrayList<>(); // массив для самых длинных строк
        ArrayList<String> listMinimum = new ArrayList<>(); // массив для самых коротких строк

        for (int i = 0; i < 10; i++) {
            String str = scanner.nextLine();
            listBasic.add(str);
        }

        // Нахождение самой длинной строки и добавление её в список listMaximum

        int max = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < listBasic.size(); i++) {
            if (listBasic.get(i).length() > max) {
                max = listBasic.get(i).length();
            }
        }

        for (String mx : listBasic) {
            if (mx.length() == max) {
                listMaximum.add(mx);
            }
        }

        long end = System.currentTimeMillis();

        // Нахождение самой короткой строки и добавление её в список listMinimum

        int min = listBasic.get(0).length();

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < listBasic.size(); i++) {
            if (listBasic.get(i).length() < min) {
                min = listBasic.get(i).length();
            }
        }

        for (String mn : listBasic) {
            if (mn.length() == min) {
                listMinimum.add(mn);
            }
        }

        long end1 = System.currentTimeMillis();

        // Вывод строки которая нашлась  раньше всего

        if ((end - start) > (end1 - start1)) {
            System.out.println(listMinimum.get(0));
        } else {
            System.out.println(listMaximum.get(0));
        }

//        else if ((end - start) < (end1 - start1)) {
//            System.out.println(listMaximum.get(0));
//        }
//        else {
//            System.out.println("Короткая и длинная строки находятся одновременно");
//        }

        for (int i = 0; i < listBasic.size(); i++) {
            if (listBasic.get(i).length() == max) {
                System.out.println(listBasic.get(i));
                break;
            } else if (listBasic.get(i).length() == min) {
                System.out.println(listBasic.get(i));
                break;
            }
        }
    }
}

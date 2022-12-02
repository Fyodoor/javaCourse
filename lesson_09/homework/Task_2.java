package lesson_09.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            arrayList.add(str);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > max) {
                max = arrayList.get(i).length();
            }
        }

        for (String mx : arrayList) {
            if (mx.length() == max) {
                arrayList2.add(mx);
            }
        }

        for (String c : arrayList2) {
            System.out.println(c);
        }

    }
}

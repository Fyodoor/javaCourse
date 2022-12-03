package lesson_09.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            array.add(str);
        }

        for (int i = 0; i < 13; i++) {
            String last = array.get(array.size() - 1);
            array.remove(array.size() - 1);
            array.add(0, last);
        }

        for (String c : array) {
            System.out.println(c);
        }
    }
}

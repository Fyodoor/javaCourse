package lesson_09.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < 10 ; i++) {
            String str = scanner.nextLine();
            list.add(0, str);
        }

        for (String l : list) {
            System.out.println(l);
        }
    }
}

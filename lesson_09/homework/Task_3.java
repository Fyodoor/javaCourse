package lesson_09.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String words = scanner.nextLine();
            list.add(words);
        }

        int min = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }

        for (String m : list){
            if ( m.length() == min) {
                System.out.println(m);
            }
        }

    }
}

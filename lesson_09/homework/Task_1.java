package lesson_09.homework;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Дмитрий");
        name.add("Наталья");
        name.add("Евгения");
        name.add("Владислав");
        name.add("Григорий");

        // Размер
        System.out.println(name.size());

        for (String n : name) {
            System.out.println(n);
        }
    }
}

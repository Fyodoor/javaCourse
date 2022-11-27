package lesson_09;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestSpeed {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long end =System.currentTimeMillis();

        System.out.println("Добавление в ArrayList заняло " + (end - start));


        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        System.out.println("Добавление в LinkedList заняло " + (end - start));




        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.remove(i);
        }

        long end1 =System.currentTimeMillis();

        System.out.println("Удаление в ArrayList заняло " + (end1 - start1));


        for (int i = 0; i < 1000000; i++) {
            linkedList.remove(i);
        }
        System.out.println("Удаление в LinkedList заняло " + (end1 - start1));




//        while ( a > 0) {
//            System.out.println("Обратный отсчет. Осталось " + a);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            a--;
//        }

        System.out.println();
    }
}

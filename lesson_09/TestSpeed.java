package lesson_09;

import java.util.*;

public class TestSpeed {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>(10);
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(i);
//        }
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("Добавление в ArrayList заняло " + (end - start));
//
//
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 100000; i++) {
//            linkedList.add(i);
//        }
//        System.out.println("Добавление в LinkedList заняло " + (end - start));
//
//
//
//
//        long start1 = System.currentTimeMillis();
//
//        for (int i = 0; i < 100000; i++) {
//            arrayList.remove(i);
//        }
//
//        long end1 =System.currentTimeMillis();
//
//        System.out.println("Удаление в ArrayList заняло " + (end1 - start1));
//
//
//        for (int i = 0; i < 100000; i++) {
//            linkedList.remove(i);
//        }
//        System.out.println("Удаление в LinkedList заняло " + (end1 - start1));




//        while ( a > 0) {
//            System.out.println("Обратный отсчет. Осталось " + a);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            a--;
//        }


        HashSet<String> strings = new HashSet<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("CCC");
        strings.add("EEE");
        strings.add(null);


        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
        strings1.add("AAA");
        strings1.add("BBB");
        strings1.add("CCC");
        strings1.add("CCC");
        strings1.add("EEE");
        strings1.add(null);

        for (Iterator<String> iter = strings1.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }

        System.out.println();
    }
}

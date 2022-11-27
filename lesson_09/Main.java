package lesson_09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[7];
        int a = 0;
        Integer b = 10;

        // 1. Создание коллекции и добавдение в нее элементов
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        // 2. метод add()  -   c указанием индекса

        list.add(2,88);


        // 3. метод set() - затирает значение по определенному индексу

        list.set(3,99);

        // 4. метод size() - возвращает размер  коллекции
        System.out.println(list.size());

        // 5. метод get() - брать объекты нашей коллекции
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " , ");
        }

        System.out.println();

        for (Integer c : list) {
            System.out.print(c + ",");
        }

        System.out.println();

        // 6. метод toArray() - преобразование коллекции в массив
        Object [] objects = list.toArray();

        for (Object o : objects) {
            System.out.print(o + ",");
        }

        System.out.println();

        // 7. метод contains() -  содержит ли коллекция определенный элемент
        System.out.println("В коллекции содержится чисо 101 - " + list.contains(101));
        System.out.println("В коллекции содержится чисо 88 - " + list.contains(88));

        // 8. метод addAll() - добавить все элементы в новую коллекцию из старой
        ArrayList<Integer> copyList =  new ArrayList<>();
        copyList.addAll(list);

        // 9. метод remove() - удаление элемента коллекции по определенному индексу
        System.out.println("До вызова метода remove() по индексу 0 " + list);
        list.remove(0);
        System.out.println("После вызова метода remove() по индексу 0 " + list);

        // 10. метод indexOf() возвращает индекс элемента коллекции
        System.out.println("Индекс элемента 88 - " + list.indexOf(88));

        // 11. метод sort() - сортировка
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(11);
//        list1.add(99);
//        list1.add(77);
//        list1.add(55);
//        list1.add(22);
//

        // 12. метод isEmpty() - проверка пустой лист или нет
        System.out.println(list.isEmpty());

        // 13. метод clean() - удаление всех элементов коллекции

        list.clear();

        System.out.println(list);

        System.out.println();
    }
}

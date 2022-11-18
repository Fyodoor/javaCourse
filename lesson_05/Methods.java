package lesson_05;

import lesson_3.Util3;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /**
         Методы-
         Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы. Методы лучше разбивать по смыслам на разные классы (файлы), не должны быть все методы собраны в одном классе;
         Формула создания метода-
         1- модификатор доступа - это одно из 4-х видов слов,
         указывается перед методом или классом:
         public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случоев используется);
         protected - внутри пакета и его наследникам, то есть дочерним классам,
         расположенных в других пакетах в данном проекте;
         ---------- будет доступен только внутри текущего пакета (текущей папки);
         private - только внутри текущего класса (файла);
         -Статичность - два варианта: может быть указан признак статичности, либо нет:
         - не static, если метод будет вызываться у переменной text.split(" ");, то он не должен быть static; static - если метод будет вызываться у тuпа String.copyValue0f(char[] data);
         -Возвращаемый тип или слово void если метод ни чего не возвращает:
         public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
         public static String - если возвращает строку;
         public static ****** - прочие варианты возвращаемых типов; public static void - если ни чего не возвращает, а просто выполняется, например, печать на консоль;
         4 - Название метода: поясняющее его суть, с моленькай буквы;
         5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа
         6 - тело метода (то что должно происходить, когда метод вызовут);
         public static void         printMassiveToConsole(int[][] mass)
         Модификаторы доступа метода      Сигнатура метода

         * */
//        Util util = new Util();
//        util.print();
//
//        Util.print1();
//
//        int summa = util.getSumma(2,2);
//        System.out.println(summa);


        Contact vasya = new Contact("Вася", "111111", "sdad@kkas.com");
        Contact vitalik = new Contact("Виталий", "222222", "sdad@kkas.com");
        Contact olga = new Contact("Ольга", "3333333", "sdad@kkas.com");
        Contact katya = new Contact("Екатерина", "444444", "sdad@kkas.com");
        Contact viktor = new Contact("Виктор", "5555555", "sdad@kkas.com");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(vasya);
        phoneBook.addContact(vitalik);
        phoneBook.addContact(olga);
        phoneBook.addContact(katya);
        phoneBook.addContact(viktor);

        Scanner scanner =  new Scanner(System.in);

        // ПЕРЕИМЕНОВКА
        System.out.println("Введите имя для, которое хотите заменить");
        String original = scanner.nextLine();
        System.out.println("Введите имя на которое хотите заменить");
        String renamed = scanner.nextLine();

        // УДАЛЕНИЕ
        System.out.println("Введите имя контакта который хотите удалить");
        String deleteName = scanner.nextLine();

        // ПОИСК КОНТАКТА
        System.out.println("Введите имя контакта который хотите найти");
        String findName = scanner.nextLine();

        phoneBook.renameContact(original, renamed);
        phoneBook.deleteContact(deleteName);
        phoneBook.findContact(findName);


        System.out.println();
    }
}

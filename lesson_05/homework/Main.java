package lesson_5.homework;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conntacti artur = new Conntacti("Артур", "+40 303 21" );
        Conntacti bogdan = new Conntacti("Богдан", "+40 303 22" );
        Conntacti vlad = new Conntacti("Владислав", "+40 303 23" );
        Conntacti gena = new Conntacti("Генадий", "+40 303 24" );
        Conntacti dima = new Conntacti("Дмитрий", "+40 303 25" );

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addCont(artur);
        phoneBook.addCont(bogdan);
        phoneBook.addCont(vlad);
        phoneBook.addCont(gena);
        phoneBook.addCont(dima);

        phoneBook.viewAllCont();

        phoneBook.search();
    }
}

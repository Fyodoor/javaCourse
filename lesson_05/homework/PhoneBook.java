package lesson_5.homework;

import java.util.Scanner;

public class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    private Conntacti[] conntactis = new Conntacti[5];

    public void addCont (Conntacti conntacti) {
        for (int i = 0; i < conntactis.length; i++) {
            if (conntactis[i] == null) {
                conntactis[i] = conntacti;
                break;
            }

        }
    }

    public void viewAllCont () {
        for (int i = 0; i < conntactis.length; i++) {
            System.out.println(conntactis[i].getName() + " " + conntactis[i].getNumber());
        }
    }

    public String search( String[] conntactis, String name) {

        for (int i = 0; i < conntactis.length; i++) {
            if (conntactis[i] == name) {
                return i;
            }
        }
        return -1;

    }



}

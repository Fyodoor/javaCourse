package lesson_12.additional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Util {
    public static void oldFindByName(List<Specialist> list, String name) {
        for (Specialist s: list) {
            if (s.getName().startsWith(name)) {
                System.out.println(s);
            }
        }
    }

//    public static List<Specialist> newFindByName(List<Specialist> list, String name) {
//        return list.stream().filter(x -> x.getName().startsWith("Vas")).collect(Collectors.toList());
//    }


    public static List<Specialist> newFindByName(List<Specialist> list, String name) {
        return  list.stream().filter(x -> x.getName()
                .startsWith(name))
                .collect(Collectors.toList());
    }

    public  static List<Specialist> oldSortByName(List<Specialist> list) {
        int a = 0;
        for(Specialist s: list) {
            if (s.getName().length() > a) {
                Specialist specialist = s;
                list.remove(s);
                list.add(0, specialist);
                a = s.getName().length();
            }
        }
        return list;
    }

    public static List<Specialist> newSortByName(List<Specialist> list) {
        return list.stream()
                .sorted(Comparator.comparing(specialist -> specialist.getName())) //(Specialist::getName)
                .collect(Collectors.toList());
    }

    public static Specialist findSpecialistWithMaxSalary(List<Specialist> list) {
        return list.stream()
                .max(Comparator.comparing(Specialist::getSalary))
                .orElse(null);
    }

    public static Map<Specialty, List<Specialist>> groupingBySpecialty(List<Specialist> list) {
        return list.stream()
                .collect(Collectors.groupingBy(s -> s.getSpecialty()));
    }


    public static  boolean matchAllSpecialistsAreDevops(List<Specialist> list) {
        return list.stream()
                .allMatch(specialist -> specialist.getSpecialty().equals(Specialty.DEVOPS));
    }


}

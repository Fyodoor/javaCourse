package lesson_12.additional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Specialist specialist1 = new Specialist("Vasiliy", 10000, Specialty.DEVELOPERS);
        Specialist specialist2 = new Specialist("Viktor", 23000, Specialty.DEVOPS);
        Specialist specialist3 = new Specialist("Alexandr", 100000, Specialty.PROJECT_MANAGER);
        Specialist specialist4 = new Specialist("Igor", 12000, Specialty.DEVELOPERS);
        Specialist specialist5 = new Specialist("Nikolay", 50000, Specialty.DEVELOPERS);
        Specialist specialist6 = new Specialist("John", 5000, Specialty.DEVOPS);

        List<Specialist> specs = new ArrayList<>();
        specs.add(specialist1);
        specs.add(specialist2);
        specs.add(specialist3);
        specs.add(specialist4);
        specs.add(specialist5);
        specs.add(specialist6);

//        specs.forEach(specialist -> System.out.println(specialist));

//        Util.oldFindByName(specs, "Vas");
//        Util.newFindByName(specs, "Nik").forEach(x -> System.out.println(x));
//        Util.oldSortByName(specs).forEach(x -> System.out.println(x));
//        Util.newSortByName(specs).forEach(x -> System.out.println(x));

//        Map<Specialty, List<Specialist>> map = Util.groupingBySpecialty(specs);
//
//        System.out.println(Util.findSpecialistWithMaxSalary(specs));

        System.out.println(Util.matchAllSpecialistsAreDevops(specs));


    }
}

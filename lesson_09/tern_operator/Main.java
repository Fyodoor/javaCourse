package lesson_09.tern_operator;

public class Main {
    public static void main(String[] args) {
        People people = new People("Вася", 17);

//        if (people.getAge() < 16) {
//            System.out.println("Нет, " + people.getName() + ", ты не можешь пройти!");
//        } else {
//            System.out.println("Да, " + people.getName() + ", проходи!");
//        }

        String answer = people.getAge() < 16 ? "Нет, " + people.getName() + ", ты не можешь пройти!" : "Да, " + people.getName() + ", проходи!" ;

        System.out.println(answer);
    }
}

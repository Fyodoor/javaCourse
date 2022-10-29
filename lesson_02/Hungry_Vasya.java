package lesson_02.homework_02;

public class Hungry_Vasya {
    public static void main(String[] args) {
        //Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        //насколько быстрее голодный Вася съедает один банан?

        int one_banana_hv = 9 / 3; // время на один банан, когда Вася голодный
        int one_banana_hs = 15 / 3; // время на один банан, когда Вася сытый
        int res = one_banana_hs - one_banana_hv; // насколько быстрее голодный Вася съедает один банан
        System.out.println("На " + res + " минуты быстрее голодный Вася съедает один банан!");
    }
}

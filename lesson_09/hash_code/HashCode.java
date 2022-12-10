package lesson_09.hash_code;

import java.util.HashSet;
import java.util.TreeSet;

public class HashCode {
    public static void main(String[] args) {
        /**
         * Блок теории 3 HashCode
         * Ключевое слова Hash - означает каличие в коллекции механизма хэширования
         * Представьте что вы коллекционер монет и у Вас уже есть коллекция монет из 19 000 штук.
         * Вом предложили новую монету, кок быстро проверить есть ли ток я же у вос или нет, ведь
         в коллекции все монеты должны быть уникальный. Можно быстро проверить по страном,
         по номиналу, по диаметру, год выпуска.
         * То есть нужны характеристики которые есть у каждой монеты. * И характеристика должна быть
         объективно определяемой, например цвет не пойдет.
         * Совокупность хароктеристик может дать числовой код, который и покажет номер ячейки.
         * При этом у двух разных монеток могут быть разные хэшкоды, но у монет будут еще отличия,
         которые не вошли * в хэшкод, например цвет. Поэтому после отроботки методо .hashcode должен
         отроботать метод .equals u * окончательно сравнить монеты и вернуть boolean означающий есть
         такая монета в коллекции или нет.
         * */

        Coin coin1 = new Coin(10, 20.5, "Russia", 1994);
        Coin coin2 = new Coin(10, 20.5, "Russia", 1994);
        Coin coin3 = new Coin(5, 19.5, "Brazil", 1991);
        Coin coin4 = new Coin(2, 18.7, "Portugal", 1995);
        Coin coin5 = new Coin(1, 20.3, "Belarus", 1989);

        TreeSet<Coin> coinCollection = new TreeSet<>();

        coinCollection.add(coin1);
        coinCollection.add(coin2);
        coinCollection.add(coin3);
        coinCollection.add(coin4);
        coinCollection.add(coin5);


        for (Coin c : coinCollection) {  // hashcode
            System.out.println(c);
        }
    }
}

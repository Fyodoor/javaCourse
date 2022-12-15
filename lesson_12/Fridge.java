package lesson_12;

import java.util.HashMap;

public class Fridge {
    //fields
    private HashMap<String , Integer> products = new HashMap<>();



    //constructor

    //methods
    public void putProducts(String product, Integer value) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + value);
        } else {
            products.put(product, value);
        }
    }

    public void getProducts(String product, Integer value) {
        //если продукта в холодильнике нет
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта" + product + " нет");
            return;
        }
        //если продкта не хватает
        if(products.get(product) < value) {
            System.out.println("Не хватает " +(value - products.get(product) +
                    ", вы взяли " + products.get(product) + " " + product));
            return;
        }
        //если продукта большк, чем берем
        if (products.get(product) > value) {
            System.out.println("Осталось еще " + (products.get(product) - value) + " " + product);
            products.remove(product);
            return;
        }
        //если продукта ровно столько сколько нужно
        if (products.get(product) == value) {
            System.out.println("Все продукты забрали");
            products.remove(product);
            return;
        }
    }
}

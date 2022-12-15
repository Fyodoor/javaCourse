package lesson_12;

public class Main2 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.putProducts("Яблоко", 2);
        fridge.putProducts("Яблоко", 1);
        fridge.putProducts("Груша", 3);
        fridge.putProducts("Банан", 3);
        fridge.putProducts("Апельсин", 2);
        fridge.putProducts("Киви", 4);
        fridge.putProducts("Груша", 10);

        fridge.getProducts("Яблоко", 5);
        fridge.getProducts("Молоко", 1);
        fridge.getProducts("Груша", 5);
        fridge.getProducts("Апельсин", 2);

        fridge.getProducts("Груша", 10);
    }
}

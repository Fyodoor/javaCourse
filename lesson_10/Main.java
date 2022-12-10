package lesson_10;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Exception и как он работает");
        int a = 10;
        int b = 0;
//        System.out.println(a / b);
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(0);

        System.out.println("2. Exception - null - как он работает");
//        String text = null;
//        System.out.println(text.length());
//        NullPointerException nullPointerException = new NullPointerException();
//        nullPointerException.printStackTrace();
//        System.out.println(nullPointerException.getMessage());
//        System.exit(0);

        System.out.println("3. Обход Exception с помощью if/else ");
        String password = null;
        if (password != null) {
            System.out.println(password.length());
        }
        System.out.println("Программа продолжилась");

        System.out.println("4. Обход Exception с помощью try - catch");

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace(); //throw new RuntimeException();
        }
        System.out.println("Программа продолжилась");

        System.out.println("5. Обход Exception с помощью try - catch - finally");



        System.out.println("Программа продолжилась");


    }
}

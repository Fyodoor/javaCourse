import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Введите номер месяца от 1 до 12");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if ((a >= 1 && a < 3) || a == 12) {
		    System.out.println("Зима");
		    } else if (a >= 3 && a < 6) {
		        System.out.println("Весна");
		        } else if ( a >= 6 && a < 9) {
		            System.out.println("Лето");
		            } else if ( a >= 9 && a < 12) {
		            System.out.println("Осень");
		            } else {
		                System.out.println("Нет такого месяца");
		                }
	}
}
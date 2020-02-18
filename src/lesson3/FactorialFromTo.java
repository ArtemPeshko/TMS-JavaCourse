package lesson3;
/* Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию). */
import java.util.Scanner;

public class FactorialFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("До какого числа считать факториал?");
        int toNum = scanner.nextInt();
        System.out.println(factorial(toNum));
    }

    public static int factorial(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("От какого числа считать факториал?");
        int from = scanner.nextInt();
        int result = 1;
        for (int i = from; i <= n; ++i) result *= i;
        return result;
    }
}



package lesson3;

/* Найдите сумму первых n целых чисел, которые делятся на 3.*/

import java.util.Scanner;

public class DividedByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумму сколька n чисел делящихся на 3 надо найти?");
        int n = scanner.nextInt();
        int k = 1;
        int sum = 0;
        int i;
        for (i = 1; k <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
                k++;
            }
        }
        System.out.println("Сумма первых " + n + " чисел, которые делятся на три = " +sum);
    }
}

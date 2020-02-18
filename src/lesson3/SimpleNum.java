package lesson3;
/* Имеется целое число, определить является ли это число простым, т.е.
       делится без остатка только на 1 и себя.*/

import java.util.Scanner;

public class SimpleNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        int number = scanner.nextInt();
        boolean isComposite = false;
        for (int i = 2; Math.pow(i, 2)<= number; i++) {
            if (number % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("Число " + number + " - составное");
        } else {
            System.out.println("Число " + number + " - простое");
        }
    }
}
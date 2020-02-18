package lesson2;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
       /* В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
        Например, "это однозначное положительное число". Достаточно будет определить, является личисло однозначным,
        "двухзначным или трехзначным и более.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        long someNum = scanner.nextLong();
        if (someNum > 0) {
            long num = (long) Math.log10(someNum) + 1;
            System.out.println("Вы ввели " + num + " значное положительное число");
        } else if (someNum < 0) {
            long num = (long) Math.ceil(Math.log10(Math.abs(someNum) + 0.5));
            System.out.println("Вы ввели " + num + " значное отрицательное число");
        } else {
            System.out.println("Вы ввели ноль");
        }
    }
}
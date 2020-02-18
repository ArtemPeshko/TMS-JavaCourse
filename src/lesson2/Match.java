package lesson2;

import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        /*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        различны?*/

        System.out.println("Введите любое четырехзначное число:");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int someNum = scanner.nextInt();
                if (someNum > 1000 && someNum < 9999) {
                    int firstNum = someNum / 1000;
                    int secondNum = someNum / 100 % 10;
                    int thirdNum = someNum % 100 / 10;
                    int fourthNum = someNum % 10;
                    if (firstNum == secondNum && secondNum == thirdNum && thirdNum == fourthNum) {
                        System.out.println("В цифре " + someNum + " все числа равны.");
                    } else {
                        System.out.println("В цифре " + someNum + " не все числа равны.");
                    }
                    break;
                } else {
                    System.out.println("Введите число в диапазоне от 1000 до 9999.");
                }
            } catch (Exception e) {
                System.out.println("Извините, но можно использовать только цифры");
            }
        }
    }
}

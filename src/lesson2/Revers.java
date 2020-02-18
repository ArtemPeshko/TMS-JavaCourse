package lesson2;

import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {

        /* Определить число, полученное выписыванием в обратном порядке цифр
        любого 4-х значного натурального числа n. */
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите любое четырехзначное число:");
            String someNum = scanner.nextLine();
            if (isOnlyDigits(someNum) && someNum.length() == 4) {
                System.out.println("Число которое вы ввели: " + someNum);
                String reverse = new StringBuffer(someNum).reverse().toString();
                System.out.println("Ваше число наоборот: " + reverse);
                break;
            } else {
                System.out.println("Вы ввели недопустимое значение. Введите число от 1000 до 9999");
            }
        }
    }

    private static boolean isOnlyDigits(String str) {
        return str.matches("[\\d]+");
    }
}

package lesson3;
/*Создайте число. Определите, является ли число трехзначным. Определите, является
    ли его последняя цифра семеркой. Определите, является ли число четным.*/

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {

        System.out.println("Введите любое число");
        Scanner scanner = new Scanner(System.in);
        String stringOfNum = scanner.nextLine();

        if (stringOfNum.length() == 3) {
            System.out.println("Число " + stringOfNum + " трехзначное");
        }

        if (stringOfNum.charAt(stringOfNum.length() - 1) == '7') {
            System.out.println("Последняя цифра 7");
        }

        int stringToInteger = Integer.parseInt(stringOfNum);
        if (stringToInteger % 2 == 0) {
            System.out.println("Число четное");
        }
    }
}

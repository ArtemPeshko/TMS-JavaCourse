package lesson2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        /*Дано целое число. Если оно является положительным, то прибавить к нему 1.
        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на10.
        Вывести полученное число*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int someNum = scanner.nextInt();
        if (someNum > 0) {
            System.out.println(someNum + 1);
        } else if (someNum < 0) {
            System.out.println(someNum - 2);
        } else {
            someNum = 10;
            System.out.println(someNum);
        }
    }
}
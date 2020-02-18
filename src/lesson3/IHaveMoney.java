package lesson3;
/* Имеется целове число (задать с помощью Random rand = new Random(); int x =
        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
        нему слово «рублей» в правильном падеже. */

import java.util.Random;

import static java.lang.Math.abs;

public class IHaveMoney {
    public static void main(String[] args) {
        Random random = new Random();
        int money = random.nextInt(10000);
        System.out.println(choosePluralMerge(money, "рубль", "рубля", "рублей"));
    }


    public static String choosePluralMerge(int number, String caseOne, String caseTwo, String caseFive) {

        String string = Long.toString(number) + " ";
        number = abs(number);

        if (number % 10 == 1 && number % 100 != 11) {
            string += caseOne;
        } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
            string += caseTwo;
        } else {
            string += caseFive;
        }

        return string;
    }
}

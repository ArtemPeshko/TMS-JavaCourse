package lesson3;
/*Вычислить: 1+2+4+8+...+256*/

import java.util.stream.IntStream;

public class FindSum {
    public static void main(String[] args) {
        int count = (int) IntStream.iterate(1, i -> i <= 256, i -> i * 2).count();
        int result = (int) Math.pow(2, count) - 1;
        System.out.println("Сумма чисел 1, 2, 4, 6, 8.....256: " + result);
    }
}
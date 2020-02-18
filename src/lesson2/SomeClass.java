package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SomeClass {
    public static void main(String[] args) {
        /*4) Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.
          5) Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.
          6) Даны 2 числа. Вывести большее из них*/

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите число " + i);
            nums.add(scanner.nextInt());
        }
        int plusNum = 0;
        int minusNum = 0;
        for (int value : nums) {
            if (value > 0) {
                plusNum++;
            }
            if (value < 0) {
                minusNum++;
            }
        }
        System.out.println("Вы ввели числа " + nums + " и здесь:");
        System.out.println(plusNum + " положительных числа(ел).");
        System.out.println(minusNum + " отрицательных числа(ел).");
        System.out.println("Самое большое число: " + Collections.max(nums));
    }
}
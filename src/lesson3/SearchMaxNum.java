package lesson3;
/* Создать последовательность случайных чисел, найти и вывести наибольшее
       из них.*/

import java.util.Arrays;

public class SearchMaxNum {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 150));
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Наибольшее число в этом массиве  = " + getMax(array));
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
}

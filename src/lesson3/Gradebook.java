package lesson3;
/* Создать массив оценок произвольной длины, вывести максимальную и
          минимальную оценку, её (их) номера.*/

import java.util.Arrays;

public class Gradebook {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 15));
        }
        int maxValue = array[0];
        int minValue = array[0];
        int min = array[0];
        int max = array[0];
        int indexForMax = 0;
        int indexForMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue){
                minValue = array[i];
            }
            int score = array[i];
            if (max < score) {
                max= score;
                indexForMax = i;
            }
            if (score < min) {
                min = score;
                indexForMin = i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Максимальная оценка  - " + maxValue + " под номером " + indexForMax);
        System.out.println("Минимальная оценка  - " + minValue + " под номером " + indexForMin);
    }
}
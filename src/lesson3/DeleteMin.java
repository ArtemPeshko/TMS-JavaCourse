package lesson3;

import java.util.Arrays;

public class DeleteMin {
    public static void main(String[] args) {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
        }
        for (int item : array) {
            System.out.print(item + " ");
        }

        System.out.println("\n Без минимальных значений: \n" + Arrays.toString(deleteMinValue(array)));
    }


    public static int[] deleteMinValue(int[] array) {

        int count = 0;
        int min = Integer.MAX_VALUE;

        for (int d : array) {
            if (d < min) {
                count = 1;
                min = d;
            }
            else if (d == min) {
                count++;
            }
        }

        int i = 0;
        int[] res = new int[array.length - count];
        for (int d : array) {
            if (d > min) {
                res[i++] = d;
            }
        }

        return res;
    }
}

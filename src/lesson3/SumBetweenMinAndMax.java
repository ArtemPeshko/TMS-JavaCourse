package lesson3;
/*  Определите сумму элементов одномерного массива, расположенных между
          минимальным и максимальным значениями.*/

public class SumBetweenMinAndMax {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\nСумма эелементов между минимальным и максимальным значением = " + getSumBetweenMinAndMax(array));
    }

    public static int getSumBetweenMinAndMax(int[] array) {
        int minValue = 0;
        int maxValue = 0;
        int result = 0;
        for (int i = 1; i < array.length; i++) {
            minValue = array[i] < array[minValue] ? i : minValue;
            maxValue = array[i] > array[maxValue] ? i : maxValue;
        }
        for (int i = Math.min(minValue, maxValue); i <= (Math.max(minValue, maxValue)); i++)
            result += array[i];
        return result;
    }
}

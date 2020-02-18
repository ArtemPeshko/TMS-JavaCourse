package lesson3;
/* Создать массив, заполнить его случайными элементами, распечатать,
       перевернуть, и снова распечатать (при переворачивании нежелательно создавать
       еще один массив).*/

public class ReversArray {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
        }

        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println(" ");
        int n = array.length;

        for (int i = 0; i < n/2; i++) {
            int temp = array[n-i-1];
            array[n-i-1] = array[i];
            array[i] = temp;
        }

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

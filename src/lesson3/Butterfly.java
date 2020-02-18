package lesson3;
/* Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
       таким образом:*/
import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введие размер массива");
        int lng = scanner.nextInt();
        int[][] arr = new int[lng][lng];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i)))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }

        for (int i = arr.length - 1; i >= arr.length / 2 + 1; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println(" ");
        }
    }
}
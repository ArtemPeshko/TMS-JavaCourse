package lesson3;
/*Bonus*/

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введие размер массива");
        int lng = scanner.nextInt();
        int[][] tbl = new int[lng][lng];
        int x = 0;
        int y = lng - 1;
        int ctr = 1;

        while (ctr <= lng * lng) {
            for (int i = 0; i < tbl.length; i++) {
                if (tbl[x][i] == 0) {
                    tbl[x][i] = ctr++;
                }
            }

            for (int i = 0; i < tbl.length; i++) {
                if (tbl[i][y] == 0) {
                    tbl[i][y] = ctr++;
                }
            }

            for (int i = tbl.length - 1; i >= 0; i--) {
                if (tbl[y][i] == 0) {
                    tbl[y][i] = ctr++;
                }
            }

            for (int i = tbl.length - 1; i >= 0; i--) {
                if (tbl[i][x] == 0) {
                    tbl[i][x] = ctr++;
                }
            }

            x++;
            y--;
        }

        for (int[] ints : tbl) {
            for (int j = 0; j < tbl.length; j++) {
                System.out.printf("%3d ", ints[j]);
            }
            System.out.println(" ");
        }
    }
}

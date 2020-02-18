package lesson3;

/* Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
       полностью закрыть круглой картонкой радиусом r. */

import java.util.Scanner;

public class CircleOnTheRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону 'a' прямоугольника:");
        int sideA = scanner.nextInt();
        System.out.println("Введите сторону 'b' прямоугольника:");
        int sideB = scanner.nextInt();
        System.out.println("Введите радиус круглой картонки");
        int circleRadius = scanner.nextInt();
        if (circleRadius * circleRadius >= (sideA * sideA + sideB * sideB) / 4) {
            System.out.println("Картонка радиусом " + circleRadius + "cm перекрывает прямоугольник со стороной 'a'=" + sideA + "cm и стороной 'b'=" + sideB + "cm");
        } else {
            System.out.println("Картонка радиусом " + circleRadius + "cm не перекрывает прямоугольник со стороной 'a'=" + sideA + "cm и стороной 'b'=" + sideB + "cm");
        }
    }
}
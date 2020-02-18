package lesson2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
       /* Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
        Определить существует ли такой треугольник. Дано: a, b, c – стороны предполагаемого треугольника.
        Требуется сравнить длину каждогоотрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок окажется больше суммы двух
        других, то треугольника с такими сторонами несуществует.*/

       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите первую сторону треугольника");
       double firstSide = scanner.nextDouble();
       System.out.println("Введите вторую сторону треугольника");
       double secondSide = scanner.nextDouble();
       System.out.println("Введите третью сторону треугольника");
       double thirdSide = scanner.nextDouble();

       if (firstSide > secondSide+thirdSide || secondSide > firstSide+thirdSide || thirdSide > firstSide+secondSide){
           System.out.println("Такой треугольник существует");
       } else {
           System.out.println("Такого треугольника не существет");
       }
    }
}

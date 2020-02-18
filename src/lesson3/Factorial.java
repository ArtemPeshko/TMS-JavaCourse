package lesson3;

/* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
      произведение, т.е. факториал числа.*/

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Факториал: " + factorial((int) (Math.random() * 13)));
    }

    public static int factorial(int n) {
        System.out.print(n + " ");
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
}

package lesson2;

public class TimePrinter {
    public static void main(String[] args) {
     /*   Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
        А) минут + секунд,
        В) часов + минут + секунд,
        С) дней + часов + минут + секунд,
        D) недель + дней + часов + минут + секунд.
    */
        int s = 999999;
        int seconds = s % 60;
        int m = (s - seconds) / 60;
        int minutes = m % 60;
        int h = (m - minutes) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int days = d % 7;
        int weeks = (d - days) / 7;

        //A
        System.out.println("В " + s + ": " + m + " минут " + seconds + " секунд.");
        //B
        System.out.println("В " + s + ": " + h + " часов " + minutes + " минут " + seconds + " секунд.");
        //C
        System.out.println("В " + s + ": " + d + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд.");
        //D
        System.out.println("В " + s + ": " + weeks + " недель " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд.");
    }
}

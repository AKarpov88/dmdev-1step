package com.dmdev.cs.lesson18;

/**
 * Задание 1
 *
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 *
 * Протестировать функцию в main.
 */

public class HomeTask1 {

    public static void main(String[] args) {
        int minutes = 55;
        getQuarter(minutes);
    }

    public static void getQuarter(int minutes) {
        if (0 <= minutes && minutes <= 15) {
            System.out.println(minutes + " - первая четверть часа");
        } else if (16 <= minutes && minutes <= 30) {
            System.out.println(minutes + " - вторая четверть часа");
        } else if (31 <= minutes && minutes <= 45) {
            System.out.println(minutes + " - третья четверть часа");
        } else if (46 <= minutes && minutes <= 59) {
            System.out.println(minutes + " - четвертая четверть часа");
        } else {
            System.out.println(minutes + " - неверное число");
        }
    }
}

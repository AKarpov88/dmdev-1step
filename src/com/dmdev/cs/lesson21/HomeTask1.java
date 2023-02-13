package com.dmdev.cs.lesson21;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class HomeTask1 {

    public static void main(String[] args) {
        int number = 529501347;

        evenDigits(number);
        oddDigits(number);
    }

    private static void evenDigits(int value) {
        int digit;
        int counter = 0;
        for (int number = value; number > 0; number /= 10) {
            digit = number % 10;
            if (digit % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static void oddDigits(int value) {
        int digit;
        int counter = 0;
        for (int number = value; number > 0; number /= 10) {
            digit = number % 10;
            if (digit % 2 != 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

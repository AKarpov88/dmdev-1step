package com.dmdev.cs.lesson21;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 *
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class HomeTask2 {

    public static void main(String[] args) {
        int value = 7500524;
        System.out.println(reverseValue(value));
    }

    private static int reverseValue(int value) {
        int degree = amountOfDigits(value) - 1;
        int newValue = 0;
        for (int i = value; i != 0; i /= 10) {
            newValue += (i % 10) * Math.pow(10, degree);  // Math.pow(число, степень)
            degree--;
        }
        return newValue;
    }

    private static int amountOfDigits(int value) {
        int counter = 0;
        for (int i = value; i != 0; i /= 10) {
            counter++;
        }
        return counter;
    }
}

package com.dmdev.cs.lesson26;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class HomeTask2 {

    public static void main(String[] args) {
        char[] charArray = {'T', '4', 'd', '+', '2', 'K', 'r', 's', 'a', '0', 'B'};
        int[] values = charToInt(charArray);
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
        aboveAverage(values);
    }

    private static void aboveAverage(int[] values) {
        double averageValue = averageValue(values);
        for (int value : values) {
            if (value > averageValue) {
                System.out.print(value + " ");
            }
        }
    }

    private static double averageValue(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / (double) values.length;
    }

    private static int[] charToInt(char[] charArray) {
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];
        }
        return intArray;
    }
}

package com.dmdev.cs.lesson26;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 *
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */
public class HomeTask1 {

    public static void main(String[] args) {
        int[] values = {4, -5, 10, 0, -48, 2, 9, -1, -3, 80, 17, -30};
        for (int value : positiveArray(values)) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int value : multiplicationByLength(positiveArray(values))) {
            System.out.print(value + " ");
        }
    }

    private static int[] multiplicationByLength(int[] positiveArray) {
        for (int i = 0; i < positiveArray.length; i++) {
            positiveArray[i] *= positiveArray.length;
        }
        return positiveArray;
    }

    private static int[] positiveArray(int[] values) {
        int[] positiveArray = new int[positiveValuesLength(values)];
        int positiveIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                positiveArray[positiveIndex] = values[i];
                positiveIndex++;
            }
        }
        return positiveArray;
    }

    private static int positiveValuesLength(int[] values) {
        int positiveValuesLength = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                positiveValuesLength++;
            }
        }
        return positiveValuesLength;
    }
}

package com.dmdev.cs.lesson26;

/**
 * Дан одномерный массив целых чисел.
 *
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами,
 * только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 *
 * Пример:
 *
 *                                          [-4, -18]
 *
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 *
 *                                          [1, 9, 3]
 */
public class HomeTask3 {

    public static void main(String[] args) {
        int[] values = {3, 4, -8, 15, 0, -1, 70, 0, 5, -40};
        int[][] doubleArray = doubleArray(values);
        printDoubleArray(doubleArray);
    }

    private static void printDoubleArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] doubleArray(int[] values) {
        int[][] doubleArray = new int[3][];

        int positiveNumbers = 0;
        for (int value : values) {
            if (value > 0) {
                positiveNumbers++;
            }
        }
        int[] positiveArray = new int[positiveNumbers];
        int positiveIndex = 0;
        for (int value : values) {
            if (value > 0) {
                positiveArray[positiveIndex] = value;
                positiveIndex++;
            }
        }

        int zero = 0;
        for (int value : values) {
            if (value == 0) {
                zero++;
            }
        }
        int[] zeroArray = new int[zero];
        int zeroIndex = 0;
        for (int value : values) {
            if (value == 0) {
                zeroArray[zeroIndex] = value;
                zeroIndex++;
            }
        }

        int negativeNumbers = 0;
        for (int value : values) {
            if (value < 0) {
                negativeNumbers++;
            }
        }
        int[] negativeArray = new int[negativeNumbers];
        int negativeIndex = 0;
        for (int value : values) {
            if (value < 0) {
                negativeArray[negativeIndex] = value;
                negativeIndex++;
            }
        }

        doubleArray[0] = positiveArray;
        doubleArray[1] = zeroArray;
        doubleArray[2] = negativeArray;

        return doubleArray;
    }
}

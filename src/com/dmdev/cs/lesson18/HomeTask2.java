package com.dmdev.cs.lesson18;

/**
 * Даны 3 переменные:
 *
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 *
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 *
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class HomeTask2 {

    public static void main(String[] args) {
        double operand1 = 57.8;
        double operand2 = 34.4;
        char operation = '*';

        if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
            System.out.println("Результат операции: " + getMathResult(operand1, operand2, operation));
        } else {
            System.out.println("Введено неверное значение операции: " + operation);
        }
    }

    public static double getMathResult(double operand1, double operand2, char operation) {

        return switch(operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            case '%' -> operand1 % operand2;
            default -> 0; // Решение "на всякий случай"
        };
    }
}

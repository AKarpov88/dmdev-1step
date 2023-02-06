package com.dmdev.cs.lesson18;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 *
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class HomeTask3 {

    public static void main(String[] args) {
        int a1 = 30;
        int b1 = 11;

        int a2 = 54;
        int b2 = 8;

        double s1 = getTriangleSquare(a1, b1);
        double s2 = getTriangleSquare(a2, b2);

        comparison(s1, s2);
    }

    public static double getTriangleSquare(int a, int b) {
        return (a * b) / 2;
    }

    public static void comparison(double s1, double s2) {
        if (s1 > s2) {
            System.out.println("S1 > S2");
        } else if (s1 < s2) {
            System.out.println("S1 < S2");
        } else {
            System.out.println("S1 = S2");
        }
    }
}
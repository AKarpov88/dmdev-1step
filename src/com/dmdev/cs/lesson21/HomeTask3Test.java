package com.dmdev.cs.lesson21;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 *
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 *
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class HomeTask3Test {

    public static void main(String[] args) {
        int months = 38; // 3 года и 2 месяца

        System.out.println("Счет Вани: " + vanyaAccount(months));
        System.out.println("Счет брокера: " + brokerAccount(months));
    }

    private static double vanyaAccount(int months) {
        double sum = 0;
        double salary = 600;
        double expenses = 300;
        double transferPercent = 0.1;

        for (int i = 1; i <= months; i++) {
            if (months % 6 == 0) {
                salary += 400;
            }
            sum += salary * (1 - transferPercent) - expenses;
        }
        return sum;
    }

    private static double brokerAccount(int months) {
        double sum = 0;
        double profitPercent = 0.02;
        double transferPercent = 0.1;

        for (int i = 1; i <= months; i++) {
            sum *= (1 + profitPercent);
            sum += thisMonthSalary(i) * transferPercent;
        }

        return sum;
    }

    private static double thisMonthSalary(int months) {
        return 600 + 400 * (months / 6);
    }
}

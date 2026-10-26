package task2;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();

        double count = 0;
        for (int i = 1; i <= n; i++) {
            count += Math.pow((-1), i - 1) * Math.pow(x, i) / i;
        }
        System.out.println(count);
        System.out.println(Math.log(1 + x));
    }
}


// Задание: Дано вещественное число X (|X| < 1) и целое число N (> 0).
// Найти значение выражения: ln(X + 1) ~ X - X^2/2 + X^3/3 - ... + (-1)^(N-1) * X^N/N.

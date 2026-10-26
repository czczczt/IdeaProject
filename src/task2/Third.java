package task2;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();
        double a1 = 1;
        double a2 = 2;
        double a3 = (a1 + 2 * a2) / 3;

        int count = 3;
        while (Math.abs(a3 - a2) >= e) {
            a1 = a2;
            a2 = a3;
            a3 = (a1 + 2 * a2) / 3;
            count += 1;

        }
        System.out.println(count);
        System.out.println(a2);
        System.out.println(a3);
    }
}


// Задание: Дано вещественное число ε > 0. Последовательность определяется:
// A1 = 1, A2 = 2, AK = (A(K-2) + 2*A(K-1)) / 3, K = 3, 4, ...
// Найти первый номер K, для которого |AK - A(K-1)| < ε, и вывести K, A(K-1) и AK.

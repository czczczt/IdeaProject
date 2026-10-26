package task2;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double count = 0;
        for (int i = 1; i <= x; i++) {
            count += 1/ Math.sqrt(i);
        }
        System.out.println(count);
    }
}



// Дано целое N. Посчитать сумму ряда (вещественное число): y = 1/√1 + 1/√2 + 1/√3 + ... + 1/√N.
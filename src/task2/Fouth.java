package task2;

import java.util.Scanner;

public class Fouth {
    public static double func(double i) {
        System.out.println(i);
        System.out.println((int)i);
        double x = Math.round((i - (int) i) * 1000000.0) / 1000000.0;;
        System.out.println(x);
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        func(x);
    }
}

// Описать метод, принимающий вещественное число, печатающий само число, его целую и дробную части, а также возвращающий дробную часть.


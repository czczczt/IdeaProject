package task2;

import java.util.Scanner;

public class D {
    public static double func(double x) {
        double y = Math.round((x - (int) x) * 1000000.0) / 1000000.0; // double - int = double
        System.out.println(x);
        System.out.println((int) x);
        System.out.println(y);
        return y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        func(x);
    }
}

// Описать метод, принимающий вещественное число, печатающий само число, его целую и дробную части, а также возвращающий дробную часть.


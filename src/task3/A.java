package task3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                ans += arr[i / 2] + " ";
            } else {
                ans += arr[arr.length - 1 - i / 2] + " ";
            }
        }
        System.out.println(ans);
    }
}

//Вывести элементы массива в порядке A1, AN, A2, AN−1, A3, AN−2, … .
// Поддерживайте левую и правую границы массива.
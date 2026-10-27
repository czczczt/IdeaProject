package task3;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String text = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                text += arr[i / 2] + " ";
            } else {
                text += arr[arr.length - 1 - i / 2] + " ";
            }
        }
        System.out.println(text);
    }
}

//Вывести элементы массива в порядке A1, AN, A2, AN−1, A3, AN−2, … .
// Поддерживайте левую и правую границы массива.
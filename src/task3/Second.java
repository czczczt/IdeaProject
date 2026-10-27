package task3;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 1, 1, 1, 6, 6, 7, 7, 4};
        String text = "";
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    c++;
                }
            }
            if (c > max) {
                max = c;
            }
        }

        System.out.println(max);
    }
}



//Найти максимальное количество одинаковых элементов целочисленного массива размера N.
// Для каждого значения подсчитайте число вхождений и сохраните максимум.

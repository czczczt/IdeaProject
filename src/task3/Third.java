package task3;

public class Third {
    public static int[] func(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < c.length; k++) {
            if (j >= b.length || (i < a.length && a[i] <= b[j])) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 7, 8};
        int[] b = {300, 2, 4, 4, 1, 5};
        int[] c = func(a, b);

        for (int i = 0; i < text.length; i++) { // www bbb ccc ddd
            System.out.print(text[i] + " ");
        }
    }
}

//Даны отсортированные по возрастанию массивы A и B размера N.
// Объединить их в отсортированный массив C размера 2N. Реализовать отдельным статическим методом.
// Используйте алгоритм слияния с тремя индексами.
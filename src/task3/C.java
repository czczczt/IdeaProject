package task3;

public class C {
    static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0; // a
        int j = 0; // b
        int k = 0; // c
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 11};
        int[] b = {2, 3, 6, 8};
        int[] c = merge(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

//Даны отсортированные по возрастанию массивы A и B размера N.
// Объединить их в отсортированный массив C размера 2N. Реализовать отдельным статическим методом.
// Используйте алгоритм слияния с тремя индексами.
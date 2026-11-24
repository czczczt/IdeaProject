package task3;

public class A {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int right = arr.length - 1;
        for (int left = 0; left <= right; left++) {
            System.out.print(arr[left] + " ");
            if (left < right) {
                System.out.print(arr[right] + " ");
                right--;
            }
        }
    }
}

//Вывести элементы массива в порядке A1, AN, A2, AN−1, A3, AN−2, … .
// Поддерживайте левую и правую границы массива.
package task3;

public class D {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = 10 * (i + 1);
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Сформировать матрицу M×N, у которой все элементы i-й строки равны 10i, i = 1, …, M.
// В Java значение строки i равно 10 * (i + 1).
package SecondWork;

import java.util.Random;

/*  Дан двумерный массив A, размером (nn) (или квадратная матрица A).
Найти количество положительных элементов её главной диагонали. Затем умножить
побочную диагональ на найденное количество */

public class SecondWork2_4 {
    public static void main(String[] args) {

        int[][] matrix = new int[5][5];
        int bound = 19;
        int positiveCounter = 0;
        int len = matrix.length;
        Random random = new Random();
        System.out.println("Матрица:");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int element = -9 + random.nextInt(bound);
                matrix[i][j] = element;
                System.out.print(matrix[i][j] + " ");
                if (i == j && element > 0) {
                    positiveCounter++;
                }
            }
            System.out.println("");
        }
        System.out.println("Количество положительных элементов главной диагонали - " + positiveCounter);
        System.out.println("Изменённая матрица:");

        for (int i = 0; i < len; i++) {
            matrix[i][len - 1 - i] *= positiveCounter;
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

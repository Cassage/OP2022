package SecondWork;

import java.util.Random;

/*  Определить матрицу (двумерный массив) и ее заполнить случайными значениями.
    Построить вектор В, которой возвращает – номер максимального значения в i-й строке;*/

public class SecondWork2_3 {

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];
        int[] vectorB = new int[5];
        int bound = 19;
        Random random = new Random();
        System.out.println("Матрица:");
        for (int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < matrix.length; j++) {
                int element = -9 + random.nextInt(bound);
                matrix[i][j] = element;
                if (element > max) {
                    max = element;
                    maxIndex = j;
                }
            }
            vectorB[i] = maxIndex;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Индекс максимального элемента строки с индексом " + i + " - " + vectorB[i]);
        }

    }

}

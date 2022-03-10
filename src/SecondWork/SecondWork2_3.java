package SecondWork;

import java.util.Random;

public class SecondWork2_3 {

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];
        int[] vectorB = new int[5];
        int bound = 19;
        Random random = new Random();
        System.out.println("Матрица:");
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                int element = -9 + random.nextInt(bound);
                matrix[j][i] = element;
                if (element < min) {
                    min = element;
                }
            }
            vectorB[i] = min;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Минимальный элемент столбца с индексом " + i + " - " + vectorB[i]);
        }

    }

}

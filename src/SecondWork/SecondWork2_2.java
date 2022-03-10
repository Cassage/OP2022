package SecondWork;


import java.util.Random;

public class SecondWork2_2 {

    static void sort(float[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minPos = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            float saveValue = array[minPos];
            array[minPos] = array[i];
            array[i] = saveValue;
        }
    }

    public static void main(String[] args) {
        int[] arrayB = new int[10];
        float[] arrayC = new float[arrayB.length];
        int counter = 0;
        int bound = 19;
        Random random = new Random();

        System.out.print("Массив B: ");

        for (int i = 0; i < arrayB.length; i++) {
            int element = -9 + random.nextInt(bound);
            arrayB[i] = element;
            System.out.print(arrayB[i]);
            System.out.print(" ");
            if (arrayB[i] > 0) {
                arrayC[counter] = arrayB[i];
                counter++;
            }
        }

        System.out.println("");
        System.out.print("Массив С: ");

        float[] resultArrayC = new float[counter];
        for (int i = 0; i < resultArrayC.length; i++) {
            resultArrayC[i] = arrayC[i] / 5;
            System.out.print(resultArrayC[i]);
            System.out.print(" ");
        }


        System.out.println("");
        System.out.print("Отсортированный массив С: ");
        sort(resultArrayC);

        for (int i = 0; i < resultArrayC.length; i++) {
            System.out.print(resultArrayC[i]);
            System.out.print(" ");
        }


    }

}

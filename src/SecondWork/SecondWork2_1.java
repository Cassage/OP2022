package SecondWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*  Определить одномерный массив и заполнить его случайными значениями.
Определить дополнительный массив разрешенных значений. Составить
массив из элементов исходного массива, имеющих неразрешенные значения. Вывести
результативный массив на экран; */

public class SecondWork2_1 {


    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        int[] allowedArray = new int[5];
        List<Integer> resultArray = new ArrayList<>();
        int bound = 9;

        System.out.print("Разрешённые значения: ");
        for (int j = 0; j < allowedArray.length; j++) {
            allowedArray[j] = random.nextInt(bound);
            System.out.print(allowedArray[j]);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.print("Элементы базового массива с запрещёнными значениями: ");
        for (int i = 0; i < array.length; i++) {
            int element = random.nextInt(bound);
            int missCount = 0;
            array[i] = element;
            for(int k = 0;k < allowedArray.length;k++){
                if(allowedArray[k] != element){
                    missCount++;
                    if(missCount == allowedArray.length){
                        resultArray.add(element);
                        System.out.print(element);
                        System.out.print(" ");
                    }
                }
            }
        }

        System.out.println("");
        System.out.print("Базовый массив: ");

        for(int m = 0; m < array.length; m++){
            System.out.print(array[m]);
            System.out.print(" ");
        }


    }

}

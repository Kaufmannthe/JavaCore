package by.TMSTasks.lesson5_Arrays;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[21];
        Random random = new Random();
        System.out.println("Значения массива:   ");
        for (int i = 0; i <= 20; i++) {
            array[i] = random.nextInt(1,100);
            System.out.print(array[i]);
            if (array[i] % 2 == 1){
                System.out.print(array[i] + " ");
            }

        }
    }
}

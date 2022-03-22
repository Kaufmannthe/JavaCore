package by.TMSTasks.lesson5_Arrays;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[21];
        Random random = new Random();
        System.out.println("Значения массива:");
        for (int i = 0; i <= 20; i++) {
            array[i] = random.nextInt(1, 100);
            if (i % 2 == 1){
                array[i] = 0;
                System.out.print(array[i] + " ");
            }else {
                System.out.print(array[i] + " ");
            }

        }

    }

}

package by.TMSTasks.lesson5_Arrays;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
            int[] array = new int[16];
        Random random = new Random();
        System.out.println("Значения массива:");
        for (int i = 0; i <= 15; i++) {
            array[i] = random.nextInt(1,100);
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }

        }

    }
}

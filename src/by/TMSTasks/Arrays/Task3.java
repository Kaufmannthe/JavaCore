package by.TMSTasks.Arrays;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
            int[] array = new int[15];
            int count = 0;
        Random random = new Random();
        System.out.println("Значения массива:");
        for (int i = 0; i <= 14; i++) {
            array[i] = random.nextInt(1, 100);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("\n");
        System.out.println("Колличество чётных чисел: " + count);
    }
}

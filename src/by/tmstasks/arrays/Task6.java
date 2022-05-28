package by.tmstasks.arrays;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random r = new Random();
        System.out.println("Значения массива: ");
        for (int i = 0; i < 4; i++) {
            array[i] = r.nextInt(0, 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if (array[0] <= array[1]){
            if (array[1] <= array[2]){
                if (array[2] <= array[3]){
                    System.out.println("Числа стоят в строго возрастающей последовательности");
                }
            }
        }

    }
}

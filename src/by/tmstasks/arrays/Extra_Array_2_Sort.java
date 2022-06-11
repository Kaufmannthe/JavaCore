package by.tmstasks.arrays;

import java.util.Random;
import java.util.Scanner;

public class Extra_Array_2_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите число больше 3: ");
        int value = s.nextInt();
        int[] array = new int[value];
        int count1 = array.length;

        for (int i = 0; i < count1; i++) {
            for (int j = 1; j < count1 - 1; j++) {
                if (array[j - 1] > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = array[j - 1];
                }

            }

        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
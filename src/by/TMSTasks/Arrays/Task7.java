package by.TMSTasks.Arrays;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[12];
        int maxvalue = 0;
        int index = 0;
        System.out.println("Значения массива: ");
        for (int i = 0; i < 12; i++) {
            array[i] = r.nextInt(0, 15);
            System.out.print(array[i] + " ");
            if (array[i] > maxvalue) {
                maxvalue = array[i];
                index = i;
            }
        }
        System.out.println();
        System.out.print("Максимальный элемент массива: " + maxvalue + "\n" + "Индекс последнего его вхождения в массив: " + index);
    }
}

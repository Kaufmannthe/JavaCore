package by.tmstasks.arrays;


/*Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
        массива должен равняться отношению элемента из первого массива с i-ым
        индексом к элементу из второго массива с i-ым индексом. Вывести все три
        массива на экран (каждый на отдельной строке), затем вывести количество
        целых элементов в третьем массиве.*/

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array_1 = new int[10];
        int[] array_2 = new int[10];
        int[] array_3 = new  int[10];
        int count = 0;

        System.out.println("Значения первого массива: ");
        for (int i = 0; i < array_1.length; i++) {
        array_1[i] = r.nextInt(0,9);
            System.out.print(array_1[i] + " ");
    }
        System.out.println();
        System.out.println("Значения второго массива: ");
        for (int i = 0; i < array_2.length; i++) {
            array_2[i] = r.nextInt(0,9);
            System.out.print(array_2[i] + " ");
        }
        System.out.println();
        System.out.println("Значения третьего массива: ");
        for (int i = 0; i < array_3.length; i++) {
            array_3[i] = array_3[i] + (array_1[i] + array_2[i]);
            System.out.print(array_3[i] + " ");
        }
        for (int i = 0; i < array_3.length; i++){
            count++;
        }
        System.out.println();
        System.out.println("Количество целых элементов в третьем массиве: " + count);
    }
}

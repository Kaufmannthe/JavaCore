package by.TMSTasks.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Extra_Array_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите число больше 3: ");
        int value = s.nextInt();
        int[] array = new int[value];

        int p1 = 1;
        int p2 = 0;
        int count = 0; //Переменные для 2-ого пункта.

        System.out.println("Введите число С (пункт 3)");
        int c = s.nextInt();
        int p3 = 0;
        int count2 = 0; //Переменные для 3-ого пункта.

        int count3 = 0; //Переменные для 4-ого пункта

        if (value < 3) {
            System.out.println("Введите, пожалуйста, число более 3.");
        } else if (value > 3) {
            System.out.println("\n" + "Значения массива равны:");
            for (int i = 0; i < value; i++) {
                array[i] = r.nextInt(1, value);
                System.out.print(array[i] + " ");
            }
//---------------------------------------- 1.
            System.out.println();
            for (int i = 0; i < value; i++) {
                if (array[i] % 3 == 0) {
                    p1 = p1 * array[i]; //1. Найти произведение элементов, кратных 3.
                }
            }
            System.out.println("Произведение чисел кратных 3: " + p1 + " ");
//-----------------------------------------2.
            System.out.println();
            for (int i = 1; i < value; ) {
                p2 = (p2 + array[i]);
                i = i + 2;
                count++;  //2.Найти среднее арифметическое элементов с нечетными номерами.

            }
            System.out.print("Средне арифметическое всех элементов с нечетными номерами: " + p2 / count + " ");
//------------------------------------------3.
            System.out.println();
            for (int i = 0; i < value; i++) {
                if (array[i] > c) {
                    p3 = p3 + array[i];
                    count2++; //3) Найти средне арифметическое элементов массива, превосходящих некоторо число С.
                }
            }
                System.out.println("Cредне арифметическое элементов массива, превосходящих некоторое число С: " + p3 / count2);
//------------------------------------------- 4.
            int count1 = array.length;
            for (int i = 0; i < count1; i++) {
                for (int j = 1; j < count1 - 1 ; j++) {
                    if (array[j-1] > array[j]){
                        array[j - 1] = array[j];
                        array[j] = array[j-1];
                    }

                }

            }
            System.out.print("Наименьшее значение массива: " + array[0]);
        }
    }
}
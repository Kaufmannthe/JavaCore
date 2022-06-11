package by.tmstasks.arrays;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] firstArray = new int[5];
        int count_1 = 0;
        int count_2 = 0;
        int[] secondArray = new int[5];
        System.out.print("Значения первого массива: ");
        for (int i = 0; i < 5; i++) {
            firstArray[i] = r.nextInt(0, 15);
            System.out.print(firstArray[i] + " " );
            count_1 = count_1 + firstArray[i];
        }
        System.out.println();
        System.out.print("Значения второго массива: ");
        for (int i = 0; i < 5; i++) {
            secondArray[i] = r.nextInt(0,15);
            System.out.print(secondArray[i] + " ");
            count_2 = count_2 + secondArray[i];
        }
        count_1 = count_1/5;
        count_2 = count_2/5;
        System.out.println();
        if (count_1 > count_2){
            System.out.println("Наибольшее среднее арифметическое первого массива: " + count_1);
        }if (count_2 > count_1){
            System.out.println("Наибольшее среднее арифметическое второго массива: " + count_2);
        }else if (count_1 == count_2){
            System.out.println("Среднее арифметическое обоих массивов равное: " + count_1 );
        }
    }
}

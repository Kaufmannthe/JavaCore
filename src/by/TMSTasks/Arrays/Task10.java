package by.TMSTasks.Arrays;


import java.util.Random;
import java.util.Scanner;

/*Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
        переменную n. Если пользователь ввёл не подходящее число, то программа
        должна выдать соответствующее сообщение. Создать массив из n случайных
        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
        только из чётных элементов первого массива, если они там есть, и вывести его
        на экран.*/

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите число более 3: ");
        int value = s.nextInt();
        int[] array = new int[value];
        int[] array_2 = new int[value];
        if (value < 3){
            System.out.print("Указано неверное значение. Прошу ввести число более 3.");
        }else if (value > 3){
            System.out.print("Значения массива равны: ");
            for (int i = 0; i < value; i++) {
                array[i] = r.nextInt(0, value);
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.print("Значения второго массива: ");
            for (int i = 0; i <value ; i++) {
                if (array[i] % 2 == 0 & array[i] != 0){
                    array_2[i] = array_2[i] + array[i];
                    System.out.print(array_2[i] + " ");
                }
            }

        }
    }
}

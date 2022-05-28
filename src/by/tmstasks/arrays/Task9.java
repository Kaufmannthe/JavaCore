package by.tmstasks.arrays;


import java.util.Random;
import java.util.Scanner;

/**Пользователь должен указать с клавиатуры положительное число, а
        программа должна создать массив указанного размера из случайных целых
        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
        определить и сообщить пользователю о том, сумма какой половины массива
        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
        пользователь введёт неподходящее число, то выдать соответствующее
        сообщение*/

public class Task9 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int summ_1 = 0;
        int summ_2 = 0;
        System.out.print("Укажите положительно число для создания массива: ");
        int arrayValue = s.nextInt();
        int[] array = new int[arrayValue];


    if (arrayValue <= 0){
        System.out.println("Необходимо указать положительное число. Попробуйте ещё раз.");
    }if (arrayValue > 0){
            System.out.println("Значения массива равны: ");
        for (int i = 0; i < array.length ; i++) {
            array[i] = r.nextInt(1,15);
            System.out.print(array[i] + " ");
        }
            System.out.println();
            for (int i = arrayValue/2; i < arrayValue; i++) {
                summ_1 = summ_1 + array[i];
            }
                for (int j = 0 ; j < arrayValue/2 ; j++) {
                    summ_2 = summ_2 + array[j];
                }

            System.out.println();
            System.out.print("Значение суммы левой части массива: " + summ_2 +
                    "\n"
                    + "Значение суммы правой части массива " + summ_1 + "\n");
            if (summ_2 > summ_1){
                System.out.println("Левая часть массива больше, чем правая");
            }else if (summ_1 > summ_2){
                System.out.println("Правая часть массива больше, чем левая");
            }
    }
    }
}

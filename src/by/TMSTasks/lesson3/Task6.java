package by.TMSTasks.lesson3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int value1 = v.nextInt();
        System.out.print("Введите второй число: ");
        int value2 = v.nextInt();
        int maxValue = value1 > value2 ? value1 : value2;
        System.out.print("Наибольшее число из " + value1 + " и " + value2 + " является: " + maxValue);
    }
}

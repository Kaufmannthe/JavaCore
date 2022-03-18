package by.TMSTasks.lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstN = n.nextInt();
        System.out.print("Введите второе число: ");
        int secondN = n.nextInt();
        System.out.print("Введите третье число: ");
        int thirdN = n.nextInt();
        if (firstN > 0 & secondN > 0 & thirdN > 0) {
            System.out.println("Введено чисел - 3. Из них положительные - 3");
        }

        if (firstN > 0 & secondN > 0 & thirdN < 0 || firstN > 0 & thirdN > 0 & secondN < 0 || secondN > 0 & thirdN > 0 & firstN < 0) {
            System.out.println("Введено чисел - 3. Из них положительные - 2. Отрицательные - 1");
        }

        if (firstN > 0 & secondN < 0 & thirdN < 0 || firstN < 0 & secondN > 0 & thirdN < 0 || firstN < 0 & secondN < 0 & thirdN > 0) {
            System.out.println("Введено чисел - 3. Из них положительные - 1. Отрицательные - 2");
        }

    }
}

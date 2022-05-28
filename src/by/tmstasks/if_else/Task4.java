package by.tmstasks.if_else;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstN = a.nextInt();
        System.out.print("Введите второе число: ");
        int secondN = a.nextInt();
        System.out.print("Введите третье число: ");
        int thirdN = a.nextInt();
        if (firstN > 0 & secondN > 0 & thirdN > 0) {
            System.out.println("Введено чисел - 3. Из них положительные - 3");
        }

        if (firstN > 0 & secondN > 0 & thirdN < 0 || firstN > 0 & thirdN > 0 & secondN < 0 || secondN > 0 & thirdN > 0 & firstN < 0) {
            System.out.println("Введено чисел - 3. Из них положительные - 2");
        }

        if (firstN > 0 & secondN < 0 & thirdN < 0 || firstN < 0 & secondN > 0 & thirdN < 0 || firstN < 0 & secondN < 0 & thirdN > 0) {
            System.out.println("Введено чисел - 3. Из них положительные - 1");
        }

    }
}

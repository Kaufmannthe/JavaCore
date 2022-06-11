package by.tmstasks.if_else;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = s.nextInt();
        if (number < 0) {
            System.out.print("Наше целое число: ");
            System.out.print(number - 2);
        }

        if (number > 0) {
            ++number;
            System.out.print("Наше целое число: " + number);
        }

        if (number == 0) {
            System.out.print("Наше целое число: 10");
        }

    }
}

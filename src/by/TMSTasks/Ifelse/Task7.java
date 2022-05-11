package by.TMSTasks.Ifelse;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Введите количество программистов от 1 до 100: ");
        int value = x.nextInt();
        if (value % 10 == 1 & value != 11) {
            System.out.print(value + " Программист");
        }

        if (value < 5 | value % 10 != 1 & value % 10 <= 4 & value != 10) {
            System.out.print(value + " Программиста");
        }

        if (value % 10 > 4 | value < 20 & value >= 5) {
            System.out.print(value + " Программистов");
        }

        if (value >= 100) {
            System.out.println("Перезапустите программу и укажите число в диапазоне от 1 до 100");
        }

    }
}

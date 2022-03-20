package by.TMSTasks.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a, b;
        int result = 0;
        Scanner x = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = x.nextInt();
        System.out.print("Введите второе число: ");
        b = x.nextInt();
        for (int count = 0; count != b; count++){
            result = result + (a + b)/2;

        }
        System.out.println("Значение умножения является: " + result);
    }
}

package by.TMSTasks.lesson3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите сторону а: ");
        int a = s.nextInt();
        System.out.print("Введите сторону b: ");
        int b = s.nextInt();
        System.out.print("Введите сторону c: ");
        int c = s.nextInt();
        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("Данный треугольник существует");
        } else {
            System.out.println("Данный треугольник не существует");
        }

    }
}

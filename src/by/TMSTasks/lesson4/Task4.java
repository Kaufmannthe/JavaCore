package by.TMSTasks.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первый множитель: ");
        int a = x.nextInt();
        System.out.print("Введите второй множитель: ");
        int b = x.nextInt();
        int summ = 0; int result = 0; int count = 0;
        for (int i = 0; i != b; i++){
            result = result + a;
        }
        if (a == 0){
            System.out.println("Деление на ноль невозможно");
        }if (a > 0){
            System.out.println("Результат умножения равен: " + result);
        }
        }
    }

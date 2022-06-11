package by.tmstasks.if_else;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = s.nextInt();
        String valueType;
        if (value > 0) {
            valueType = value + ": положительное число";
        } else {
            valueType = value + ": отрицателное число";
        }

        int count = 0;

        for(int i = value; i != 0; ++count) {
            i /= 10;
        }

        switch(count) {
            case 1:
                System.out.println(valueType + ", однозначное");
                break;
            case 2:
                System.out.println(valueType + ", двузначное");
                break;
            case 3:
                System.out.println(valueType + ", трёхзначное");
                break;
            default:
                System.out.println(value + " ноль");
        }

    }
}

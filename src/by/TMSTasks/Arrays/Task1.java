package by.TMSTasks.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new  int[20];
        System.out.println("Значения массива в строку");
        for (int i = 0; i < array.length;){
            array[i] = i + 2;
            System.out.print(array[i] + " ");
            i = i + 2;
        }
        System.out.println();
        System.out.println("Значения массива в столбик");
        for (int i = 0; i < array.length;){
            array[i] = i + 2;
            System.out.println(array[i]);
            i= i + 2;
        }
    }

}
package by.TMSTasks.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[50];
        System.out.println("Значения массива в правильном порядке");
        for (int i = 0,o = 0; i < 50; o++ ){
        if(o % 2 == 1) {
            array[i] = o;
            System.out.print(array[i] + " ");
            i += 1;
        }
        }
            System.out.println("\n");
            System.out.println("Значение массива в обратном порядке");
            int[] arrayDecr = new int[100];
            for (int a = 99, s = 0; s < 100; s++){
                if(s % 2 == 1){
                    arrayDecr[s] = a;
                    System.out.print(arrayDecr[s] + " ");
                    a -=2;
                }
            }
    }
}

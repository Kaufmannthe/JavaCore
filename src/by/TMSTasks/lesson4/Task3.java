package by.TMSTasks.lesson4;

public class Task3 {
    public static void main(String[] args) {
    int summ = 0;
    int count = 1;
    while (count <=256){
        summ = summ + count;
        count = count + count;
    }
        System.out.println("Сумма чисел равна: " + summ);
    }
}
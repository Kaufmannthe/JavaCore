package by.TMSTasks.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int hours = 24;
        int count = 0;
        int ameba = 1;
        for (int i = 0; i != hours/3;i++){
          ameba = ameba + 2;
          count += 3;
        }
        System.out.println("Через " + count + " часа общая сумма амёб будет " + ameba + " штук");
    }
}

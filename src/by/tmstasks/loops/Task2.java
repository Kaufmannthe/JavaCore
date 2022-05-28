package by.tmstasks.loops;

public class Task2 {
    public static void main(String[] args) {
        int hours = 21;
        int count = 0;
        int ameba = 3;
        System.out.println("Через 3 часа общая сумма амеб будет 3 особи");
        for (int i = 0; i != hours/3;i++){ //По условию сказано, сколько их будет через 3,6,9 т.д. Соответственно каждые 3 часа

          ameba = ameba * 2;
          count += 3;
            System.out.println("Через " + count + " часа общая сумма амёб будет " + ameba + " особей");

        }

    }
}

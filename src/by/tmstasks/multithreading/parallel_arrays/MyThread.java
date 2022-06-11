package by.tmstasks.multithreading.parallel_arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class MyThread {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the maximum value of the array:");
        int value = scanner.nextInt();

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            int randomInt = random.nextInt(0, value);
            arrayList.add(randomInt);
            System.out.print(arrayList.get(i) + " ");
        }

        Thread threadMin = new Thread(minValue(arrayList), "Thread 1");
        Thread threadMax = new Thread(maxValue(arrayList), "Thread 2");
        threadMin.start();
        threadMax.start();
    }

    public static Runnable minValue(ArrayList<Integer> min) {

        Runnable runnable = () -> {
            int a = min.stream().min(Comparator.naturalOrder()).get();
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\nMinimal value of the array is: " + a);
        };
        return runnable;
    }

    public static Runnable maxValue(ArrayList<Integer> max) {
        Runnable runnable = () -> {
            int a = max.stream().max(Comparator.naturalOrder()).get();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Maximum value of the array is: " + a);
        };
        return runnable;
    }
}
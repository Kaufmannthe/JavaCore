package by.tmstasks.multithreading.save_as_thread;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList1.add(random.nextInt(0, 10));
            arrayList2.add(random.nextInt(0, 10));
            arrayList3.add(random.nextInt(0, 10));
        }

        Thread thread1 = new Thread(new SaveAsThread(arrayList1), "Thread 1");
        Thread thread2 = new Thread(new SaveAsThread(arrayList2), "Thread 2");
        Thread thread3 = new Thread(new SaveAsThread(arrayList3), "Thread 3");

        System.out.print("Threads: ");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

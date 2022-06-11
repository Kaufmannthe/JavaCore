package by.tmstasks.multithreading.runnable_thread.runnable_lambda;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable thread = () -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i <= 100; i++) {
                if (i % 10 == 0) {
                    System.out.println(i);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The Thread is interrupted.");
            }
            System.out.println("The Thread work is ended");
            long end = System.currentTimeMillis();
            System.out.println("Total time: " + ((end - start) / 1000) + " second('s) \n");
        };


        Runnable thread2 = () -> {
            System.out.println("Try/catch bridge");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
            }
            System.out.println();
        };


        Thread thread_1 = new Thread(thread, "Thread 1");
        Thread thread_2 = new Thread(thread, "Thread 2");
        Thread thread_3 = new Thread(thread, "Thread 3");
        Thread thread1 = new Thread(thread2, "Thread 4");

        System.out.println(thread_1.getName() + " starts");
        thread_1.start();
        thread_1.join();
        System.out.println("Первый поток " + thread_1.isAlive() + "\n");

        System.out.println(thread_2.getName() + " starts");
        thread_2.start();
        thread_2.join();
        System.out.println("Второй поток " + thread_2.isAlive() + "\n");

        thread1.start();
        thread1.join();
        System.out.println("Третий поток " + thread1.isAlive() + "\n");

        System.out.println(thread_2.getName() + " starts");
        thread_3.start();
        thread_3.join();
        System.out.println("Четвертый поток " + thread_3.isAlive() + "\n");
        Thread thread4 = Thread.currentThread();
        System.out.println("Поток мейн " +thread4.isAlive());

    }
}

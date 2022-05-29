package by.tmstasks.multithreading.synchronized_task;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "Thread1");
        Thread thread2 = new Thread(myThread, "Thread2");
        Thread thread3 = new Thread(myThread, "Thread3");
        myThread.resource.stringBuilder = new StringBuilder("a");

        System.out.println(thread1.getName() + " start");
        thread1.start();
        thread1.join();
        System.out.println(thread2.getName() + " start");
        thread2.start();
        thread2.join();
        System.out.println(thread3.getName() + " start");
        thread3.start();

    }
}
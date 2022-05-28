package by.tmstasks.multithreading.runnable_thread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new NewThread(),"Thread 1");
        Thread thread2 = new Thread(new NewThread(),"Thread 2");
        Thread thread3 = new Thread(new NewThread(),"Thread 3");

        System.out.println(thread1.getName() + " starts");
        thread1.start();
        thread1.join();

        System.out.println(thread2.getName() + " starts");
        thread2.start();
        thread2.join();

        System.out.println(thread3.getName() + " starts");
        thread3.start();
    }
}

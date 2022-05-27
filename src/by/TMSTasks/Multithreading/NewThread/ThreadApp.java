package by.TMSTasks.Multithreading.NewThread;

public class ThreadApp {
    public static void main(String[] args) throws InterruptedException {
        NewThread thread = new NewThread("Thread 1");
        thread.start();
        thread.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
    }
}

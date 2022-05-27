package by.TMSTasks.Multithreading.NewThread;

public class ThreadApp {
    public static void main(String[] args) throws InterruptedException {
        NewThread thread = new NewThread("Thread 1");
        thread.start();
        thread.join();
    }
}

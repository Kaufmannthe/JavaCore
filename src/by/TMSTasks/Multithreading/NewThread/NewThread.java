package by.TMSTasks.Multithreading.NewThread;

public class NewThread extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println("help");
        }
        new NewThread("Thread").start();
    }

    public NewThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ". Thread test");
        }
    }
}

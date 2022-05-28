package by.tmstasks.multithreading.runnable_thread;

public class NewThread implements Runnable{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("The Thread is interrupted.");
        }
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0){
                System.out.println(i);
            }
        }

        System.out.println("The Thread work is ended");
        long end = System.currentTimeMillis();
        System.out.println("Total time: " + ((end - start)/1000) +" second('s) \n");
    }
}

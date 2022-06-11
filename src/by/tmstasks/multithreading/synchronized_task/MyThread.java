package by.tmstasks.multithreading.synchronized_task;

public class MyThread extends Thread {

    CommonResource resource = new CommonResource();

    public MyThread() {

    }

    @Override
    public synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(resource.stringBuilder);
        }
        resource.stringBuilder.append("a");
        System.out.println("Result of append is: " + resource.stringBuilder + "\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

    }
}

class CommonResource {
    StringBuilder stringBuilder = new StringBuilder("a");
}


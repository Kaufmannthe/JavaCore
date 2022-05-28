package by.tmstasks.multithreading;

public class ThreadTest extends Thread{

    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        thread.setName("TestName");     //Set name of thread
        thread.setPriority(1);          //Set priority of thread
        thread.sleep(3000);     //Freezing thread for 3 seconds
        System.out.println(thread.getPriority());
        System.out.println(thread.getName());
        System.out.println(thread.isAlive());

    }
}

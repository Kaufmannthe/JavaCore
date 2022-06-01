package by.tmstasks.multithreading.restaurant;

public class Sanitary implements Runnable {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Sanitary(int count) {
        this.count = count;
    }

    VisitorCount visitorCount = new VisitorCount();

    @Override
    public synchronized void run() {
            System.out.println("Ресторан обслужил 100 клиентов и закрывается на сандень.");
        notify();
    }
}

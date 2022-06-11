package by.tmstasks.multithreading.restaurant;

public class CollectionService implements Runnable {
    int a;
    private int count = 50;
    private final int collect = 1000;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCollect() {
        return collect;
    }


    @Override
    public void run() {
        synchronized (this) {
                System.out.println("Приехала инкассация");
                notify();
        }
    }
}


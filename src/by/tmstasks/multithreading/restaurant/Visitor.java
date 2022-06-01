package by.tmstasks.multithreading.restaurant;

import java.util.Random;
public class Visitor implements Runnable {
    Restaurant restaurant;

    public Visitor(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            try {
                restaurant.releaseTable();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class VisitorCount{
    int count = 0;
}
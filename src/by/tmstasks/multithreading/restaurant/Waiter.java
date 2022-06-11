package by.tmstasks.multithreading.restaurant;


import java.util.Random;

public class Waiter implements Runnable {
    Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            restaurant.clearTable();
        }
    }
}

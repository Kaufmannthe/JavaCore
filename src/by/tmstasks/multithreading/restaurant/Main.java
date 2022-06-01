package by.tmstasks.multithreading.restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(2);

        for (int i = 0; i < 100; i++) {
            Thread visitor = new Thread(new Visitor(restaurant), "Visitor ");
            visitor.start();
            Thread waiter = new Thread(new Waiter(restaurant), "Waiter ");
            waiter.start();
        }




    }
}

class Money {
    int money = 0;
}
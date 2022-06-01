package by.tmstasks.multithreading.restaurant;

public class Restaurant {
    private int reservedTables;
    private final int tables = 10;


    public Restaurant(int reservedTables) {
        this.reservedTables = reservedTables;
    }

    Money money = new Money();

    VisitorCount visitorCount = new VisitorCount();
    public void clearTable() {
        int count = 1;
        synchronized (this) {
            while (reservedTables < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            synchronized (VisitorCount.class) {
                visitorCount.count = visitorCount.count + 1;
                System.out.println("Ресторан обслужил клиентов: " + visitorCount.count);
                if (visitorCount.count == 100){
                    Thread sanitary = new Thread(new Sanitary(count));
                    sanitary.start();
                    try {
                        Thread.sleep(10000);
                        visitorCount.count = 0;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }


            reservedTables--;
            System.out.println("Официант очистил стол. Количество: "
                    + (tables - reservedTables));

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notify();
        }

    }

    CollectionService collectionService = new CollectionService();
    public void releaseTable() throws InterruptedException {
        synchronized (this) {
            while (reservedTables == tables) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            reservedTables++;

            synchronized (Money.class) {
                money.money = money.money + 50;
                System.out.println("Выручка: " + money.money);

                if (money.money == collectionService.getCollect()){
                    Thread collection = new Thread(collectionService, "Collection Service");
                    collection.start();
                    Thread.sleep(5000);
                    money.money = 0;
                }

            }

            System.out.println("Официант разместил посетителя. Количество: "
                    + (tables - reservedTables));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notify();
        }
    }
}


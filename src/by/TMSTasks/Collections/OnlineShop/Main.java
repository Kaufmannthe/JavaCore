package by.TMSTasks.Collections.OnlineShop;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OnlineShop onlineShop = new OnlineShop();
        Product product = new Product(4, "Пирог",10.99);
        Product product1 = new Product(1, "Яблоко",15.99);
        Product product3 = new Product(2, "Пиво",6.66);
        Product product2 = new Product(3, "Чипсы",11.99);

        onlineShop.addProduct(product);
        onlineShop.addProduct(product1);
        onlineShop.addProduct(product2);
        onlineShop.addProduct(product3);

        onlineShop.mainMenu();

    }
}

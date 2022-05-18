package by.TMSTasks.Collections.OnlineShop;

import java.io.Serializable;
import java.util.Comparator;

public class Product implements Comparable<Product>, Serializable {
    private int productID;
    private String productName;
    private double productPrice;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Product(int productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {
    }


    public static Comparator<Product> CompareByPrice = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return (int) (o1.getProductPrice() - o2.getProductPrice());
        }
    };

    public static Comparator<Product> CompareByID = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return (o1.getProductID() - o2.getProductID());
        }
    };

    @Override
    public int compareTo(Product o) {
        return o.getProductID() - this.getProductID();
    }
}

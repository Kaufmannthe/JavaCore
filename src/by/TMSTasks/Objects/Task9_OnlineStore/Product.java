package by.TMSTasks.Objects.Task9_OnlineStore;

public class Product {
    private String productName;
    private double productPrice;
    private double productScore;

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getProductScore() {
        return productScore;
    }


    public Product(String productName, double productPrice, double productScore) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productScore = productScore;
    }

    public void productInfo(){
        System.out.println(getProductName() + ", стоимость товара: " + getProductPrice() +
                " р., рейтинг: " + getProductScore() + "/5");
    }
}

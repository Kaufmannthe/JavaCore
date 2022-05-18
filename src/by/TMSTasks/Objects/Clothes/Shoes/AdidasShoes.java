package by.TMSTasks.Objects.Clothes.Shoes;

public class AdidasShoes implements Shoes{
    private int price;

    public AdidasShoes(int price) {
        this.price = price;
    }


    @Override
    public void putOn() {
        System.out.println("Человек надел кроссовки Adidas.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял кроссовки Adidas.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

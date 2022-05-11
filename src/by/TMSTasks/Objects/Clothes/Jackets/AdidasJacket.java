package by.TMSTasks.Objects.Clothes.Jackets;

public class AdidasJacket implements Jacket{
    private int price;

    public AdidasJacket(int price) {
        this.price = price;
    }


    @Override
    public void putOn() {
        System.out.println("Человек надел куртку Adidas.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял куртку Adidas.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

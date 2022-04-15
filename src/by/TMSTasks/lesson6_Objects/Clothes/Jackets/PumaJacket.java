package by.TMSTasks.lesson6_Objects.Clothes.Jackets;

public class PumaJacket implements Jacket{
    private int price;

    public PumaJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Человек надел куртку Puma.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял куртку Puma.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

package by.TMSTasks.lesson6_Objects.Clothes.Pants;

public class PumaPants implements Pants{
    private int price;

    public PumaPants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Человек надел штаны Puma.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял штаны Puma.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

package by.TMSTasks.lesson6_Objects.Clothes.Pants;

public class NikePants implements Pants{
    private int price;

    public NikePants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Человек надел штаны Nike.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял штаны Nike.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

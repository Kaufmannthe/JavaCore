package by.TMSTasks.lesson6_Objects.Clothes.Jackets;

public class NikeJacket implements Jacket{
    private int price;

    public NikeJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Человек надел куртку Nike.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял куртку Nike.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

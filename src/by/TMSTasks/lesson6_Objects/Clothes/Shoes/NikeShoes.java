package by.TMSTasks.lesson6_Objects.Clothes.Shoes;

public class NikeShoes implements Shoes {
    private int price;

    public NikeShoes(int price) {
        this.price = price;
    }


    @Override
    public void putOn() {
        System.out.println("Человек надел кроссовки Nike.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял кроссовки Nike.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

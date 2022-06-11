package by.tmstasks.objects.clothes.Shoes;

public class PumaShoes implements Shoes{
    private int price;

    public PumaShoes(int price) {
        this.price = price;
    }


    @Override
    public void putOn() {
        System.out.println("Человек надел кроссовки Puma.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял кроссовки Puma.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

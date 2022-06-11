package by.tmstasks.objects.clothes.Pants;

public class AdidasPants implements Pants{
    private int price;

    public AdidasPants(int price) {
        this.price = price;
    }


    @Override
    public void putOn() {
        System.out.println("Человек надел штаны Adidas.");
    }

    @Override
    public void takeOff() {
        System.out.println("Человек снял штаны Adidas.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

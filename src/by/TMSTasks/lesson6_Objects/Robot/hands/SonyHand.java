package by.TMSTasks.lesson6_Objects.Robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand() {
    }

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Робот поднял руку Sony.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

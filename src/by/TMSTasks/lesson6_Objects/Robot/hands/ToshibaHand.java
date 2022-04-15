package by.TMSTasks.lesson6_Objects.Robot.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand() {
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Робот поднял руку Toshiba.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

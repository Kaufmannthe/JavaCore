package by.TMSTasks.lesson6_Objects.Robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg() {
    }

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Робот двинул ногой Sony.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

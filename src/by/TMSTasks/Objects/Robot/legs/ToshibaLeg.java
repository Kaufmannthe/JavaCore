package by.TMSTasks.Objects.Robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg() {
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Робот двинул ногой Toshiba.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

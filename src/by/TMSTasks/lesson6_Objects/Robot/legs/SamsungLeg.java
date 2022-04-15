package by.TMSTasks.lesson6_Objects.Robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg() {
    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Робот двинул ногой Samsung.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

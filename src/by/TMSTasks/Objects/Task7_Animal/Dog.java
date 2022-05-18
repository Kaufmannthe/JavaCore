package by.TMSTasks.Objects.Task7_Animal;

public class Dog extends Animal{
    String master;

    public Dog(String food, String location, String master) {
        super(food, location);
        this.master = master;
    }

    @Override
    public String makeNoise() {

        return "лает";
    }

    @Override
    public void eat() {
        System.out.println(" грызет " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(" спит");

    }
}

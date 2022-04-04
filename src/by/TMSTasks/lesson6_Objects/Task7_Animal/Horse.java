package by.TMSTasks.lesson6_Objects.Task7_Animal;

public class Horse extends Animal{
    int hairLength;

    public Horse(String food, String location, int hairLength) {
        super(food, location);
        this.hairLength = hairLength;
    }

    @Override
    public String makeNoise() {
        return "ржет ";
    }

    @Override
    public void eat() {
        System.out.println(" ест траву " +getFood());
    }

    @Override
    public void sleep() {
        System.out.println(" спит");
    }
}
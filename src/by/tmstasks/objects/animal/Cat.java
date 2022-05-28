package by.tmstasks.objects.animal;

public class Cat extends Animal{
    String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public String makeNoise() {
        return "мяукает ";
    }

    @Override
    public void eat() {
        System.out.println(" ест " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(" спит");
    }
}

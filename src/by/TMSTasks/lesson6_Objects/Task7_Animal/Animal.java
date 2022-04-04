package by.TMSTasks.lesson6_Objects.Task7_Animal;

public abstract class Animal {
    private String food;
    private String location;


    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public abstract String makeNoise();
    public abstract void eat();
    public abstract void sleep();
}

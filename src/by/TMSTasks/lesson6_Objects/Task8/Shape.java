package by.TMSTasks.lesson6_Objects.Task8;

public abstract class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void draw();
}

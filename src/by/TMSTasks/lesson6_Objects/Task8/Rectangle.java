package by.TMSTasks.lesson6_Objects.Task8;

public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, int a, int b){
        super(color);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    void draw() {
        System.out.println("Rectangle " + a + " " + b + "" + " " + this.getColor());
    }
}

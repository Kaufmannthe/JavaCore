package by.TMSTasks.lesson6_Objects.Task8;

public class ShapeApp {
    public static void main(String[] args) {

    Shape circle1 = new Circle("Red" , 1 ,2);
    Shape circle2 = new Circle("White", 3,4);
    Shape rect1 = new Rectangle("Green", 5,6);
    Shape rect2 = new Rectangle("Black", 7,8);

    Shape [] shapes = {circle1,circle2,rect1,rect2};

    for(Shape shape : shapes){
    shape.draw();
    }
    }
}
